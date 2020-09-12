package Git;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GIT {
	
	
	@Test(priority = 0, description = "Obtain JiraID from Text File", groups = "GIT")
	@Parameters({ "PathToFileID" })
	public static String JiraIDObtainFromTextFile(String PathToFileID) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(PathToFileID));
		String jiraID = null;
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				// sb.append("\n");
				line = br.readLine();
			}
			System.out.println("JiraIDObtainFromTextFile Method: " + sb.toString());
			jiraID = sb.toString();

		} finally {
			br.close();
		}
		return jiraID;
	}
			
	// Initialize folder & Add File & Create Commit WITH Issue ID
	@Test(priority = 1, description = "Initialize folder & Add File & Create Commit WITH Issue ID", groups = "GIT")
	@Parameters({ "Path", "PathToFileID" })
	public static void initAddFileCommitIssueID(String Path, String PathToFileID) throws IOException, InterruptedException {
		
		String jiraID = JiraIDObtainFromTextFile(PathToFileID);
		
		System.out.println("Begin init+AddFile+CommitIssueID");
		Path directory = Paths.get(Path);
		//Creates a directory by creating all nonexistent parent directories first.
		Files.createDirectories(directory);
		System.out.println("Directory Created");
		gitInit(directory);
		System.out.println("Directory Initialized");
		Files.write(directory.resolve("GCR_AUTO_FILE.txt"), new byte[0]);
		System.out.println("File Written to Folder");
		gitStage(directory);
		System.out.println("Stage files for Commit");
		System.out.println("Value of line is: " + jiraID);
		gitCommit(directory, " "+jiraID+" Add GCR_AUTO_FILE.txt");
		System.out.println("Files Committed");
	}

	// Clone Repository, Add File, & Push
	@Test(priority = 2, description = "Clone, Add File, Commit Message & Push", groups = "GIT")
	@Parameters({ "CloneSSH", "Path", "PathToFileID" })
	public static void cloneAddFileCommitPush(String CloneSSH, String Path, String PathToFileID) throws IOException, InterruptedException {
		String jiraID = JiraIDObtainFromTextFile(PathToFileID);
		
		//Next Steps: Figure out SSH Clone and add test to file to push
		
		Path directory = Paths.get(Path);
		//Creates a directory by creating all nonexistent parent directories first.
		Files.createDirectories(directory);
		gitClone(directory, CloneSSH);
		Files.write(directory.resolve("GCR_NEW_FILE.txt"), new byte[0]);
		gitStage(directory);
		//Commit message with injected Issue ID (Need to code to not use Static Parameter)
		gitCommit(directory, "" + jiraID + " Add GCR_NEW_FILE.txt");
		gitPush(directory);
	}

	public static void gitInit(Path directory) throws IOException, InterruptedException {
		runCommand(directory, "git", "init");
	}

	public static void gitStage(Path directory) throws IOException, InterruptedException {
		runCommand(directory, "git", "add", "-A");
	}

	public static void gitCommit(Path directory, String message) throws IOException, InterruptedException {
		runCommand(directory, "git", "commit", "-m", message);
	}

	public static void gitPush(Path directory) throws IOException, InterruptedException {
		runCommand(directory, "git", "push");
	}

	public static void gitClone(Path directory, String originUrl) throws IOException, InterruptedException {
		runCommand(directory.getParent(), "git", "clone", originUrl, directory.getFileName().toString());
	}

	public static void runCommand(Path directory, String... command) throws IOException, InterruptedException {
		Objects.requireNonNull(directory, "directory");
		if (!Files.exists(directory)) {
			throw new RuntimeException("can't run command in non-existing directory '" + directory + "'");
		}
		ProcessBuilder pb = new ProcessBuilder()
				.command(command)
				.directory(directory.toFile());
		Process p = pb.start();
		StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");
		StreamGobbler outputGobbler = new StreamGobbler(p.getInputStream(), "OUTPUT");
		outputGobbler.start();
		errorGobbler.start();
		int exit = p.waitFor();
		errorGobbler.join();
		outputGobbler.join();
		if (exit != 0) {
			throw new AssertionError(String.format("runCommand returned %d", exit));
		}
	}

	private static class StreamGobbler extends Thread {

		private final InputStream is;
		private final String type;

		private StreamGobbler(InputStream is, String type) {
			this.is = is;
			this.type = type;
		}

		@Override
		public void run() {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(is));) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(type + "> " + line);
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
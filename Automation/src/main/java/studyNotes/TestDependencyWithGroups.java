import org.testng.annotations.Test;
public class TestDependencyWithGroups {
	//https://www.youtube.com/watch?v=_0kSbiOOnO4
	@Test(groups="smoke")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups="sanity")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups="smoke")
	public void test3() {
		System.out.println(5/0); //this will FAIL, so Main won't run
	}
	
	@Test(groups="regression")
	public void test4() {
		System.out.println("test4");
	}
	//dependsOnGroups - runs group/s first before
	@Test(dependsOnGroups={"smoke", "sanity"}, alwaysRun = true) //alwaysRun will FORCE it to run even with failure above
	public void test0() {
		System.out.println("Main Test");
	}

}

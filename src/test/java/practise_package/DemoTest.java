package practise_package;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups="smoke")
	public void demoTest()
	{
		System.out.println("this method is DemoTest==>> smoke test");
	}
	
	@Test(groups="regression")
	public void demoTest1()
	{
		System.out.println("this method is DemoTest1==>>Regression Test");
	}
	@Test(groups="regression")
	public void practiseTest3()
	{
		System.out.println("this method is PractiseTest3 new new again updated as tl==>> Regression Test");
	}
}

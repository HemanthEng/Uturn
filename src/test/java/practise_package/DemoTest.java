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
	public void demoTest2()
	{
		System.out.println("this method is DemoTest2==>> Regression Test");
	}
	@Test(groups="regression")
	public void demoTest3()
	{
		System.out.println("this method is DemoTest2==>> Regression Test");
	}
}

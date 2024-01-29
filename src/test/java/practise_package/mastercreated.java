package practise_package;

import org.testng.annotations.Test;

public class mastercreated {
	@Test(groups="smoke")
	public void masterTest()
	{
		System.out.println("this method is masterTest==>> smoke test");
	}
	@Test(groups="smoke")
	public void masterTest1()
	{
		System.out.println("this method is masterTest1==>> smoke test");
	}
	@Test(groups="smoke")
	public void masterTest2()
	{
		System.out.println("this method is masterTest1 to check jenkins ==>> smoke test");
	}
}

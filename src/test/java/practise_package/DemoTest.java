package practise_package;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups="smoke")
	public void demoTest()
	{
		System.out.println("this method is DemoTest==>> smoke test");
	}
	@Test(groups="smoke")
	public void hmsTest()
	{
		System.out.println("this method is HMSTest==>> smoke test");
	}

}

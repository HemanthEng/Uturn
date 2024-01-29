package practise_package;

import org.testng.annotations.Test;

public class Practise_test {

	@Test(groups="smoke")
	public void practiseTest()
	{
		System.out.println("this method is PractiseTest==>> smoke test");
	}

	@Test(groups="smoke")
	public void practiseTest2()
	{
		System.out.println("this method is PractiseTest2 test for jenkins ==>> Regression Test");
	}

}

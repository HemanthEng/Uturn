package practise_package;

import org.testng.annotations.Test;

public class Practise_test {

	@Test(groups="smoke")
	public void practiseTest()
	{
		System.out.println("this method is PractiseTest==>> smoke test");
	}
	
	@Test(groups="regression")
	public void practiseTest1()
	{
		System.out.println("this method is PractiseTest1==>>Regression Test");
	}
	@Test(groups="regression")
	public void practiseTest2()
	{
		System.out.println("this method is PractiseTest2==>> Regression Test");
	}
	@Test(groups="regression")
	public void practiseTest3()
	{
		System.out.println("this method is PractiseTest2==>> Regression Test");
	}
}

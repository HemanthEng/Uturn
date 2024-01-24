package practise_package;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups="smoke")
	public void sampleTest()
	{
		System.out.println("this method is sampleTest ==>> smoke test");
	}
	
	@Test(groups="regression")
	public void sampleTest1()
	{
		System.out.println("this method is sampleTest1==>> Regression Test");
	}
	@Test(groups="regression")
	public void sampleTest2()
	{
		System.out.println("this method is sampleTest2==>> Regression Test");
	}
}

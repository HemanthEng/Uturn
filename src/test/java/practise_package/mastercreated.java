package practise_package;

import org.testng.annotations.Test;

public class mastercreated {
	@Test(groups="smoke")
	public void masterTest(String br)
	{
		String BROWSER = System.getProperty("browser");
		String Env = System.getProperty("Env");
		System.out.println(BROWSER);
		System.out.println(Env);
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

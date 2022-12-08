package Test_script;

import org.testng.annotations.Test;

public class Fblogin1 extends GenericScriptOfFB{
	
	@Test
	public void execution() throws InterruptedException
	{
		FbloginScriptPom fb = new FbloginScriptPom(driver);
		Thread.sleep(3000);
		fb.firstname("selva");
		Thread.sleep(2000);
		fb.lastname("kumar");
		Thread.sleep(2000);
		fb.mobilenumber("979579565");
		Thread.sleep(2000);
		fb.password("yahooo");
		Thread.sleep(2000);
		fb.signup();
	}
	

}

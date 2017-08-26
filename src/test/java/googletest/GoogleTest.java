package googletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void gitTest() throws IOException {
		// TODO Auto-generated method stub

		WebDriver wd= new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/?gfe_rd=cr&ei=rIWZWZOLKpDy8Ae5o4_YCg&gws_rd=ssl");
		File f =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("C:\\SeleniumWork\\gitTest\\screenshot\\screenshot.jpg"));
	    wd.quit();
	}
	
}

package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileAttachment {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("input_resumeParser")).click();
		Process p= Runtime.getRuntime().exec("C:\\Users\\User.DESKTOP-8RVSP1L.000\\Downloads\\attach.exe C:\\Users\\User.DESKTOP-8RVSP1L.000\\Downloads\\hi.pdf");
		p.waitFor();
		
		
		
	}

}

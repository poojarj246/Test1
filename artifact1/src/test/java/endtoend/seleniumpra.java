package endtoend;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumpra {
	public static void main(String[] args) throws IOException {
	WebDriver driver =new ChromeDriver();
    
    
    
	//TakesScreenshot ts= driver(TakesScreenshot);
	WebElement ele = driver.findElement(By.id(""));
	String datetime = LocalDateTime.now().toString().replace(':', '-');
	File temp = ele.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screnshots/"+datetime+"image.png");
	FileUtils.copyFile(temp, dest);


	
	
	
	
	
	
	}



}

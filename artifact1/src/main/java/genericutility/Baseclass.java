package genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
public WebDriver driver;
  Datautility datautiltity=new Datautility();
//WebdriverUtiltity webdutitlity=new WebdriverUtiltity();
  @BeforeMethod
  public void confibeforeMethod() throws IOException {
	String browsername = datautiltity.readdatafromproperty("browsername");
	if(browsername.equals("chrome")) {
		driver=new ChromeDriver();
		
	}
	else if(browsername.equals("edge")) {
}
	driver.manage().window().maximize();
	driver.get(datautiltity.readdatafromproperty("url"));
  }
  @AfterMethod
  public void confiafterMethod() {
	  //driver.manage().window().minimize();
  }
  
}

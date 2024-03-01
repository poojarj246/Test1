package endtoend;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.pomrepository.Actitimehomepage;
import com.actitime.pomrepository.Actitimeloginpage;

import genericutility.Baseclass;
import genericutility.Datautility;
import genericutility.WebdriverUtiltity;

public class Testcase12 extends Baseclass {
@Test
public void endtoendtestcase() throws IOException, InterruptedException {
WebdriverUtiltity utility=new WebdriverUtiltity();
Datautility utility1=new Datautility();

Actitimehomepage homepage = new  Actitimehomepage(driver);
Actitimeloginpage loginpage = new Actitimeloginpage(driver);
loginpage.getUsernametextfield().sendKeys(utility1.readdatafromproperty("username"));
loginpage.getPasswordtextfield().sendKeys(utility1.readdatafromproperty("password"));
loginpage.loginbutton1().click();
Thread.sleep(5000);
homepage.getUsers().click();
Thread.sleep(5000);
homepage.getDepartments().click();
Thread.sleep(5000);
homepage.getQualitycontrol().click();
Thread.sleep(5000);
homepage.getCheckbox().click();
Thread.sleep(5000);
homepage.getClosebutton().click();

homepage.getLogout().click();

}

}

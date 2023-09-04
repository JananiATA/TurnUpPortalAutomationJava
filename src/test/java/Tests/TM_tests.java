package Tests;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.TimeAndMaterialPage;
import Utilities.Commondriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TM_tests extends Commondriver
    {
        @BeforeTest
        public void SetupTest()
        {
            driver = new ChromeDriver();

            //login page object initialization and Definition
            LoginPage loginPageObj = new LoginPage();
            loginPageObj.LoginActions(driver);

            //Home page object initialization and definition
            Homepage homePageObj = new Homepage();
            homePageObj.GoToTimeAndMaterialPage(driver);
        }
        @Test
        public void CreateTimeTest()
        {
            TimeAndMaterialPage tmPageObj = new TimeAndMaterialPage();
            tmPageObj.CreateTimeRecord(driver);
        }
        @Test
        public void EditTimeTest()
        {
            TimeAndMaterialPage tmPageObj = new TimeAndMaterialPage();
            tmPageObj.EditTimeRecord(driver, "desc");
        }
        @Test
        public void DeleteTimeTest()
        {
            TimeAndMaterialPage tmPageObj = new TimeAndMaterialPage();
            tmPageObj.DeleteTimeRecord(driver);
        }
        @AfterTest
        public void CloseTest()
        {
            driver.quit();
        }
            
    }


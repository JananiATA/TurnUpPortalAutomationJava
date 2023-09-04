package Pages;

import Utilities.wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage
    {
        public void GoToTimeAndMaterialPage(WebDriver driver)
        {
            //Go to Time and Material page

            WebElement administrationDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/a/span"));
            administrationDropdown.click();

            wait.waittobeclickable(driver, "xpath", "/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a", 7);
            //select the Time and materials option

            WebElement tmOption = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a"));
            tmOption.click();

            //Thread.sleep(2000);

        }

        public void GoToEmployeesPage(WebDriver driver)
        {
            //Go To Employees Page

            WebElement administrationDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/a/span"));
            administrationDropdown.click();

            wait.waittobeclickable(driver, "xpath", "/html/body/div[3]/div/div/ul/li[5]/ul/li[2]/a", 5);

            WebElement employeesOption = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[2]/a"));
            employeesOption.click();
        }
    }


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//@Listeners (ITestListener.class)

public class HRM {

    public static WebDriver driver;
    static  String BaseURL = "https://opensource-demo.orangehrmlive.com/";
    static JavascriptExecutor js;

    @BeforeTest
    public  static void WebSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\SQA\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get((BaseURL));
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }

    @Test(priority = 0)
    public static void OrangeHRMLogin() throws Exception {

        //MyScreenRecorder1.startRecording("");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).click();
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).click();
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Dashboard"));

        //MyScreenRecorder1.stopRecording();
    }

    /*@Test(priority = 0)
    public static void Dashboard() throws Exception {
        //MyScreenRecorder.startRecording("");

        driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
        //driver.findElement(By.xpath("//b[contains(text(),'Dashboaghjghjgh]")).click();
        Thread.sleep(1000);
        //Scrolling Test
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(450,0)", "");
        Thread.sleep(3000);

        //MyScreenRecorder.stopRecording();
    }*/

    /*@Test(priority = )
    public static void AssignLeave() throws Exception {

        driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Leave"));

    }*/

    /*@Test(priority = )
    public static void Leave() throws Exception {

        driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
        Thread.sleep(1000);

    }*/

    /*@Test(priority = )
    public static void AssignLeave() throws Exception {

        driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Leave"));

    }*/

    @Test(priority = 1)
    public static void Admin() throws Exception {

        driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Admin"));

    }

    /*@Test(priority = )
    public static void AdminUser() throws Exception {

        driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("User Management"));

    }*/

    /*@Test(priority = )
    public static void User() throws Exception {

        driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("User"));

    }*/

    @Test(priority = 2)
    public static void Job() throws Exception {

        driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Job"));
    }

    @Test(priority = 3)
    public static void PayGrades() throws Exception {

        driver.findElement(By.xpath("//a[@id='menu_admin_viewPayGrades']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Pay Grades"));
    }

    @Test(priority = 4)
    public static void EmploymentStatus() throws Exception {
        driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@id='menu_admin_employmentStatus']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Employment Status"));
    }

    @Test(priority = 5)
    public static void JobCat() throws Exception {
        driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@id='menu_admin_jobCategory']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Job Categories"));
    }

    @Test(priority = 6)
    public static void WorkShifts() throws Exception {
        driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@id='menu_admin_workShift']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Work Shifts"));
    }

    @AfterTest
    public static void TestClosure(){

        driver.quit();
    }

}

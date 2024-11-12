package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("calculator");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        Thread.sleep(2000);
        String str=driver.getCurrentUrl();
        if(str.contains("calculator")){
            System.out.println("it is in calculator page");
        }
        else{
            System.out.println("somthing went wrong");
        }
        // System.out.println("end Test case: testCase02");
        String ans=driver.findElement(By.xpath("//*[@id='cwos']")).getText();
        if(ans.equals("0")){
            System.out.println("verified sucsessfully");
        }
        else{
            System.out.println("verification failed");
        }
        Thread.sleep(2000);
    }
    public  void testCase02() throws InterruptedException{
        System.out.println("Start Test case: testCase02");
        // driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='rk7bOd']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        Thread.sleep(1000);
        String ans1=driver.findElement(By.xpath("//*[@id='cwos']")).getText();
        Thread.sleep(1000);
        if(ans1.equals("12")){
            System.out.println("verified sucsessfully 12");
        }
        else{
            System.out.println("verification failed");
        }
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='T7PMFe']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        Thread.sleep(1000);
        String ans2=driver.findElement(By.xpath("//*[@id='cwos']")).getText();
        Thread.sleep(1000);
        if(ans2.equals("7")){
            System.out.println("verified sucsessfully 7");
        }
        else{
            System.out.println("verification failed");
        }
    }
    public  void testCase03() throws InterruptedException{
        System.out.println("Start Test case: testCase03");
        // driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        Thread.sleep(1000);
        String ans2=driver.findElement(By.xpath("//*[@id='cwos']")).getText();
        Thread.sleep(1000);
        if(ans2.equals("30")){
            System.out.println("verified sucsessfully 7");
        }
        else{
            System.out.println("verification failed");
        }
        driver.findElement(By.xpath("//div[@jsname='SLn8gc']")).click();
        String ans=driver.findElement(By.xpath("//*[@id='cwos']")).getText();
        if(ans.equals("0")){
            System.out.println("verified sucsessfully");
        }
        else{
            System.out.println("verification failed");
        }
    }
    public  void testCase04() throws InterruptedException{
        System.out.println("Start Test case: testCase04");
        // driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        Thread.sleep(1000);
        String ans=driver.findElement(By.xpath("//*[@id='cwos']")).getText();
        if(ans.equals("4")){
            System.out.println("verified sucsessfully");
        }
        else{
            System.out.println("verification failed");
        }
    }

}

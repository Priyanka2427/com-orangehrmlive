package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-2 - ProjectName : com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 */
public class Com_OrangeHrmLive {

    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {

        // Step 1 : Set up the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Step 2 : Open the URL into Browser
        driver.get(baseUrl);

        //Maximise the Browser
        driver.manage().window().maximize();

        //we give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Step 3 : Print the title of the page.
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        // Step 4 : Print the Current Url
        System.out.println("The current Url: " + driver.getCurrentUrl());

        //Step 5 : Print the page source
        System.out.println(driver.getPageSource());

        // Step 6 : Click on ‘Forgot your password?’ link.
        WebElement forgotPass = driver.findElement(By.cssSelector(".orangehrm-login-forgot-header"));
        forgotPass.click();

        // Step 7 : Print the current url.
        System.out.println("The current Url: " + driver.getCurrentUrl());

        // Step 8 : Navigate back to the login page.
        driver.navigate().back();

        // Step 9 : Referesh the page
        driver.navigate().refresh();

        //  Step 10 : Enter the email to email field.
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        // Step 11 : Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // Step 12 : Click on login Button
        WebElement loginButton = driver.findElement(By.cssSelector(".orangehrm-login-button"));
        loginButton.click();

        //  Step 13 : Close the browser
         driver.quit();
    }

}




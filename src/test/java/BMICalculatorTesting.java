import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BMICalculatorTesting {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void upperValueOfCategoryStarvation(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 43.35
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Starvation"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("43.35");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Starvation", "Necessary message didn't match");
    }
    @Test
    public void lowerValueOfCategoryUnderweight(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 43.37
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Underweight"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("43.37");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Underweight", "Necessary message didn't match");
    }
    @Test
    public void upperValueOfCategoryUnderweight(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 53.47
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Underweight"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("53.47");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Underweight", "Necessary message didn't match");
    }
    @Test
    public void lowerValueOfCategoryNormal(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 53.48
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Normal"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("53.48");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Normal", "Necessary message didn't match");
    }
    @Test
    public void upperValueOfCategoryNormal(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 72.25
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Normal"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("72.25");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Normal", "Necessary message didn't match");
    }
    @Test
    public void lowerValueOfCategoryOverweight(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 72.27
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Overweight"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("72.27");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Overweight", "Necessary message didn't match");
    }
    @Test
    public void upperValueOfCategoryOverweight(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 86.7
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Overweight"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("86.7");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Overweight", "Necessary message didn't match");
    }
    @Test
    public void lowerValueOfCategoryObese(){
        /*
        1. Открыть бразуер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес в килограммах, например 86.72
        4. В поле Height ввести рост в сантиметрах, например 170
        5. Нажать кнопку Calculate
        6. Проверить, что появляется сообщение "Your category is Obese"
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("86.72");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Obese", "Necessary message didn't match");
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}

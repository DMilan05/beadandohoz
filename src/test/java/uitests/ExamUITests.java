package uitests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamUITests {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080"); // Az alkalmazás helyi URL-je
    }

    @Test
    public void testCreateExam() {
        WebElement examNameInput = driver.findElement(By.id("examName"));
        WebElement createButton = driver.findElement(By.id("createExam"));

        examNameInput.sendKeys("Matematika Vizsga");
        createButton.click();

        WebElement resultText = driver.findElement(By.id("result"));
        assertEquals("Exam Matematika Vizsga created successfully", resultText.getText());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

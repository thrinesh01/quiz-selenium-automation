package quiz.automation;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class QuizTest {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

// 1. Open quiz
        driver.get("file:///C:/Users/hp/OneDrive/Desktop/DynamicQuizApp/quiz/index.html");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());

// 2. Select Category
        wait.until(ExpectedConditions.elementToBeClickable(By.id("category")))
                .sendKeys("Math");

// 3. Select Difficulty
        driver.findElement(By.id("difficulty")).sendKeys("Easy");

// 4. Start Quiz
        driver.findElement(By.xpath("//button[text()='Start Quiz']")).click();

// 5. Answer all questions dynamically
        while (true) {
            try {
                // wait for options
                List<WebElement> options = wait.until(
                        ExpectedConditions.visibilityOfAllElementsLocatedBy(
                                By.cssSelector("#options button"))
                );

                // click first option
                options.get(0).click();
                Thread.sleep(500);

            } catch (Exception e) {
                break; // no more questions
            }
        }

// 6. WAIT FOR RESULT SCREEN
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-screen")));

// 7. Read Result
        String resultText = driver.findElement(By.id("score")).getText();
        System.out.println("Result:\n" + resultText);

        driver.quit();

    }
}

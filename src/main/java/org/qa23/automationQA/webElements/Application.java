package automationQA.webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        String[] checkedTitle = new String[] {
                "Бурдж-Халифа",
                "Абрадж аль-Бейт",
                "Тайбэй таун",
                "Шанхайский всемирный финансовый центр"
        };
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("Users/xcx1805/work/comparus/homeTasks/src/main/java/org/qa23/automationQA/webElements/automation-practice-table.html");

        List<WebElement> allLinksInTable= webDriver.findElements(By.tagName("a"));
        for (int i = 0; i < allLinksInTable.size(); i++) {
            allLinksInTable.get(i).click();
            Thread.sleep(2000);
            String currentUrl = webDriver.getCurrentUrl();
            String title = webDriver.getTitle();
            if (allLinksInTable.size() == checkedTitle.length) {
                if (checkedTitle[i].equals(title)) {
                    System.out.println("Test is completed! Title equals");
                } else {
                    System.out.println(String.format("Test is failed! Title not equals Expected value [%s], Actual value [%s]", checkedTitle[i],title));
                }
            }
        }

    }
}

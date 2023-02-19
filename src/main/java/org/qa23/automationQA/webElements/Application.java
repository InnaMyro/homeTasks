package automationQA.webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        webDriver.get("E:\\INNA\\homeTasks_html\\src\\main\\java\\org\\qa23\\automationQA\\webElements\\automation-practice-table.html");

        List<WebElement> allLinksInTable= webDriver.findElements(By.tagName("a"));
        List<String> allhref = new ArrayList<>();
        for (int i = 0; i < allLinksInTable.size(); i++) {
            allhref.add(allLinksInTable.get(i).getAttribute("href"));
        }
        for (int i = 0; i < allhref.size(); i++) {
            webDriver.navigate().to(allhref.get(i));
            Thread.sleep(1000);
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

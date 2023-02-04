package automationQA.webDrive;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) {
        String[] urls = new String[] {
                "https://itstep.dp.ua/about-academy/",
                "https://itstep.dp.ua/ru/contacts",
                "https://itstep.dp.ua/ru/events",
                "https://itstep.dp.ua/ru/qa_course"
        };
        String[] title = new String[] {
                "Об Академии",
                "Контакты",
                "Мероприятия",
                "IT-курс «QA Engineer» | Курс тестировщика ПО в Днепре | Академия ШАГ"
        };
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        for (int i = 0; i < urls.length; i++) {
            webDriver.navigate().to(urls[i]);

            String currentUrl = webDriver.getCurrentUrl();
            String currentTitle = webDriver.getTitle();
            if  (currentUrl != null) {
                if (currentUrl.equals(urls[i]) && title[i].equals(currentTitle)) {
                    System.out.println("Test is ok");
                    System.out.println("Title and URL correctly");
                } else {
                    System.out.println("Test is fail");
                    System.out.println("Title or URL not correctly");
                    System.out.println("Correctly Title is " + currentTitle);
                }
            }
        }
        webDriver.quit();
    }
}

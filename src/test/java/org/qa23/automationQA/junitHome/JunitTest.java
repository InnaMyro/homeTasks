package org.qa23.automationQA.junitHome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {

    private static WebDriver webDriver;
    private static WebDriverManager chromedriver;

    @BeforeAll
    public static void getUp() {
        chromedriver = WebDriverManager.chromedriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        webDriver = new ChromeDriver(options);
        chromedriver.setup();
    }

    @AfterAll
    public static void quit() {
        webDriver.quit();
    }

    @Test
    void checkTitleOnFirstPage() {
        webDriver.get("https://itstep.dp.ua/about-academy/");
        String title = webDriver.getTitle();
        assertNotNull(title);
        assertEquals("ᐅ Про Академію", title);
    }

    @Test
    void checkTitleOnSecondPage() {
        webDriver.get("https://itstep.dp.ua/ru/contacts");
        String title = webDriver.getTitle();
        assertNotNull(title);
        assertEquals("ᐅ Контакты", title);
    }

    @Test
    void checkTitleOnThirdPage() {
        webDriver.get("https://itstep.dp.ua/ru/events");
        String title = webDriver.getTitle();
        assertNotNull(title);
        assertEquals("ᐅ Мероприятия", title);
    }

    @Test
    void checkTitleOnFourthPage() {
        webDriver.get("https://itstep.dp.ua/ru/qa_course");
        String title = webDriver.getTitle();
        assertNotNull(title);
        assertEquals("Курсы QA тестировщиков в Днепре | Обучение QA тестированию ПО с нуля", title);
    }


}
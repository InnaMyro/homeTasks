package org.qa23.automationQA.exam;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Exam {

    private static final String url = "https://shop.demoqa.com/shop";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager  chromedriver = WebDriverManager.chromedriver();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();
        chromedriver.setup();
        openOrder(webDriver);
        selectOrdering(webDriver);
        clickToShoes(webDriver);
        checkAllItemsOnPage(webDriver);
        checkH1(webDriver);
        search(webDriver);
        webDriver.quit();
    }


    private static void openOrder(WebDriver webDriver) {
        Actions actions = new Actions(webDriver);
        actions.click(webDriver.findElement(By.className("woocommerce-ordering"))).perform();
    }

    private static void selectOrdering(WebDriver webDriver) {
        Select order = new Select(webDriver.findElement(By.className("orderby")));
        order.selectByValue("popularity");
    }
    private static void clickToShoes(WebDriver webDriver) {
        Actions actions = new Actions(webDriver);
        List<WebElement> linkTopCategory = webDriver.findElements(By.cssSelector("#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1301.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.last.instock.shipping-taxable.purchasable.product-type-variable > div > span.posted_in > a"));
        WebElement shoes = linkTopCategory
                .stream()
                .filter(el -> el.getText().equalsIgnoreCase("Shoes"))
                .findFirst().orElseThrow(() -> new NotFoundException());
        actions.click(shoes).perform();
    }

    private static void checkAllItemsOnPage(WebDriver webDriver) throws InterruptedException{
        List<WebElement> shoeses = new WebDriverWait(webDriver, Duration.ofSeconds(100)).until(webDriver1 -> webDriver1.findElements(By.className("noo-product-item")));
        boolean allShoes = true;
        for (WebElement shoes:shoeses) {
            if (!shoes.findElement(By.className("posted_in")).getText().equalsIgnoreCase("Shoes")) {
                allShoes = false;
            }
        }
        if (allShoes) {
            System.out.println("ALL SHOES. COMPLETED");
        } else {
            System.out.println("NOT ALL SHOES. FAILED");
        }
        for (WebElement shoes:shoeses) {
            WebElement element = shoes.findElement(By.cssSelector("h3 > a"));
            if (element.getText().equalsIgnoreCase("ROSE GOLD SIMPLE STRAP PLATFORM SANDALS")) {
                Actions actions = new Actions(webDriver);
                actions.click(element).perform();
            }
        }
    }
    private static void checkH1(WebDriver webDriver) {
        WebElement h1 = new WebDriverWait(webDriver, Duration.ofSeconds(100)).until(webDriver1 -> webDriver1.findElement(By.tagName("h1")));
        if (h1.getText().equals("ROSE GOLD SIMPLE STRAP PLATFORM SANDALS")) {
            System.out.println("CHECK H1 TEST COMPLETED");
        } else {
            System.out.println("CHECK H1 TEST FAILED");
        }
    }

    private static void search(WebDriver webDriver) {
        webDriver.get(url);
        String oldPrice = "₹60.00";
        String newPrice = "₹55.00";
        WebElement search = new WebDriverWait(webDriver, Duration.ofSeconds(100)).until(webDriver1 -> webDriver1.findElement(By.className("noo-search")));
        Actions actions = new Actions(webDriver);
        actions.click(search).perform();
        WebElement searchInput = webDriver.findElements(By.tagName("input"))
                .stream()
                .filter(el -> el.getAttribute("type").equals("search"))
                .findFirst()
                .orElseThrow(() -> new NotFoundException());
        searchInput.sendKeys("Sun Glasses");
        webDriver.findElement(By.cssSelector("#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > button")).submit();

        List<WebElement> shoeses = new WebDriverWait(webDriver, Duration.ofSeconds(100)).until(webDriver1 -> webDriver1.findElements(By.className("noo-product-item")));
        boolean allShoes = true;
        for (WebElement shoes:shoeses) {
            if (!shoes.findElement(By.className("posted_in")).getText().equalsIgnoreCase("Sun Glasses")) {
                allShoes = false;
            }
        }
        if (allShoes) {
            System.out.println("ALL Sun Glasses. COMPLETED");
        } else {
            System.out.println("NOT ALL Sun Glasses. FAILED");
        }
        for (WebElement shoes:shoeses) {
            WebElement element = shoes.findElement(By.cssSelector("h3 > a"));
            if (element.getText().equalsIgnoreCase("QUAY AUSTRALIA X JLO REINA WHITE SUNGLASSES")) {
                actions.click(element).perform();
            }
        }
        WebElement oldPricePage = new WebDriverWait(webDriver, Duration.ofSeconds(100)).until(webDriver1 -> webDriver1.findElement(By.cssSelector("#product-1323 > div.single-product-content > div.summary.entry-summary > p > del > span > bdi")));
        WebElement newPricePage = new WebDriverWait(webDriver, Duration.ofSeconds(100)).until(webDriver1 -> webDriver1.findElement(By.cssSelector("#product-1323 > div.single-product-content > div.summary.entry-summary > p > ins")));
        if (Objects.nonNull(oldPricePage) && Objects.nonNull(newPricePage)) {
            if (oldPricePage.getText().equalsIgnoreCase(oldPrice)) {
                System.out.println("OLD PRICE EQUAL. COMPELETED");
            }
            if (newPricePage.getText().equalsIgnoreCase(newPrice)) {
                System.out.println("NEW PRICE EQUAL. COMPLETED");

            }
        }
    }
}

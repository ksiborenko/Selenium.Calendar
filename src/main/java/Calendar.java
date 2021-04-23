import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Calendar {

    private WebDriver driver;

    public Calendar(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("https://www.path2usa.com/travel-companions");
        this.driver.findElement(By.id("ez-accept-all")).click();
        this.driver.findElement(By.xpath("//input[@id='travel_date']")).click();
        String check = "";
        do {
            this.driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
            check = this.driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
        } while (!check.equals("April 2023"));
        List<WebElement> days = this.driver.findElements(By.cssSelector("[class='datepicker-days'] [class='day']"));
        for (int x = 0; x < days.size(); x++) {
            if (days.get(x).getText().contains("10")) {
                days.get(x).click();
                break;
            }
        }
    }
}

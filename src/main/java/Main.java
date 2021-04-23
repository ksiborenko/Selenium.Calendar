import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    private WebDriver driver;
    private Calendar calendar;

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        this.driver = new EdgeDriver();
        this.calendar = new Calendar(this.driver);
    }

    @Test
    public void test() {
        this.calendar.test();
    }
}

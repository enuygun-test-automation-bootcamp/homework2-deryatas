
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.nio.file.Path;
import java.nio.file.Paths;


public class OpenBrowser {

    public static  void main(String[] args){
        System.out.println("world");

        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();


        // chromedriver'ın erişim şekli
        System.out.println(absolutePath);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DERYA TAŞ\\Desktop\\Yeni klasör (3)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //örnek websitesi
        String url = "https://demoqa.com/webtables";
        driver.get(url);
        //searchBox kısmına erişim kodu ve kod çalıştığında direkt olarak searchbox üzerinde fare imleci beliriyor.
        WebElement searchBtn = driver.findElement(By.xpath("//*[@id = \"searchBox\"]"));
        searchBtn.click();

        System.out.println("test");




    }
}

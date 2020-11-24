package ru.company;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        //окно на полный экран
        driver.manage().window().maximize();
        //задержка
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //ссылка
        driver.get(ConfProperties.getProperty("loginpage")); }

    @Test
    public void loginTest() {
        //ввод логина
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //нажатие кнопки входа
        loginPage.clickLoginBtn();
        //ввод пароля
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        //нажатие кнопки входа
        loginPage.clickLoginBtn(); }

    @AfterClass
    public static void tearDown() {
        profilePage.entryMenu();
        profilePage.userLogout();
        driver.quit(); } }
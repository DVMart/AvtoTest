package ru.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@class, 'mail-ComposeButton js-main-action-compose')]")
    private WebElement newMsg;

    @FindBy(xpath = "//*[contains(@class, 'composeYabbles')]")
    private WebElement inputAddress;

    @FindBy(xpath = "//*[contains(@class, 'composeTextField ComposeSubject-TextField')]")
    private WebElement inputSubj;

    @FindBy(xpath = "//*[contains(@class, 'cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder')]")
    private WebElement inputText;

    @FindBy(xpath = "//*[contains(@class, 'control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action')]")
    private WebElement send;

    public void newMsg() {
        newMsg.click(); }

    public void inputAddress(String adrs) {
        inputAddress.sendKeys(adrs); }

    public void inputSubj(String subj) {
        inputSubj.sendKeys(subj); }

    public void inputText(String msg) {
        inputText.sendKeys(msg); }

    public void send() {
        send.click(); }

}
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailLoginPageAuth {

        public WebDriver driver;
        public MailLoginPageAuth(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
//Title
//    @FindBy(xpath = "//h3[contains(@data-test-id, 'header-text')]")
//    public WebElement getFrameTitle;
//    public void getFrameTitleText() {
//        String soutTitle = getFrameTitle.getText();
//        System.out.println(soutTitle);
//    }

    @FindBy(xpath = "//div[@id='login-content']")
    public WebElement getFrameTitle;
    public WebElement getFrameTitleText(WebElement soutTitle) {
        soutTitle = getFrameTitle;
        System.out.println(soutTitle);
        getFrameTitle = soutTitle;
        return soutTitle;
    }

    //SupposedFrame
    @FindBy(xpath = "//iframe[@class='iframe-0-2-16']")
    public WebElement modPop;
    public void swithToThisCqweqwsdfsddsgf(WebElement modPop) {
        this.modPop = modPop;
    }

    @FindBy(xpath = "//input[contains(@name, 'username')]")
    private WebElement authEnterMailFields;
    public void enterLoginFields() {
        authEnterMailFields.sendKeys(ConfProperties.getProperty("loginMailRu"));
    }

    @FindBy(xpath = "//button[contains(@data-test-id, 'next-button')]")
    private WebElement enterPswrdButton;
    public void clickToNavigatePasswordEnterFields() {
        enterPswrdButton.click();
    }

    @FindBy(xpath = "//input[@name= 'password']")
    private WebElement passerdEnterFields;
    public void enterMailPassword() {
        passerdEnterFields.sendKeys(ConfProperties.getProperty("passwrdMailRu"));
    }

    @FindBy(xpath = "//span[text()= 'Sign in']")
    private WebElement signInMailRuButton;
    public void clickSignInMailRu() {
        signInMailRuButton.click();
    }

    @FindBy(xpath = "//span[contains(text(), 'break-dance')]")
    private WebElement neededMassageWithCodeFromMailBox;
    public void goToMessageWithSecretCode() {
        neededMassageWithCodeFromMailBox.click();
    }

    @FindBy(xpath = "//td[@style= 'padding: 0 30px 30px;']/descendant::b[2]")
    private WebElement getCodeFromMailRuMassage;
    public String getSecretCodeFromMessage() {
        return getCodeFromMailRuMassage.getText();
    }

//    public String secretCode = getCodeFromMailRuMassage.getText();

}

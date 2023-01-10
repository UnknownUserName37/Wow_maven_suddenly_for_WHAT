package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPageInsideBoxMailRu {

    public WebDriver driver;
    public AuthPageInsideBoxMailRu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public AuthPageInsideBoxMailRu(String secretCode) {
        secretCode = this.secretCode;
    }


    @FindBy(xpath = "//span[contains(@class, 'sp__normal')]")
    private WebElement neededMassageWithCodeFromMailBox;
    public void goToMessageWithSecretCode() throws InterruptedException {
        Thread.sleep(5000);
        neededMassageWithCodeFromMailBox.click();
    }

    @FindBy(xpath = "//tr/td[contains(@style, 'padding')]/descendant::td/p[3]/b")
    private WebElement getCodeFromMailRuMassage;
    public String secretCode;
    public String getSecretCodeFromMessage() {
        return secretCode = getCodeFromMailRuMassage.getText().intern();
    }
}
package homeTask12DataproviderAbstractClass;

import org.openqa.selenium.WebDriver;

/**
 * Created by ASUS PC on 08.11.2016.
 */
public abstract class AbstractLogin {
    public AbstractLogin(WebDriver driver){
        this.driver = driver;
    }
    public WebDriver driver;

    abstract void putEmail(String email);
    abstract void putPassword(String password);
    abstract void clickLoginButton();
    abstract void login(String email, String password);
}

package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class AuthorizationPage {

    @FindBy(css = "button[class=\"Button2 Button2_size_m Button2_view_action Button2_weight_500 Button_Vd8eu21iIVyRdyjGPVfYF PSHeader-NoLoginButton\"]")
    private SelenideElement loginButton;

    @FindBy(css = "input[id=\"passp-field-login\"]")
    private SelenideElement loginField;

    @FindBy(css = "button[data-t=\"button:action:passp:sign-in\"]")
    private SelenideElement enterPasswordButton;

    @FindBy(css = "input[data-t=\"field:input-passwd\"]")
    private SelenideElement passwordField;

    @FindBy(css = "button[data-t=\"button:action:passp:sign-in\"]")
    private SelenideElement submitButton;
}

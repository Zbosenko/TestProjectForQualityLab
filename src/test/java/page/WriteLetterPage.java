package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class WriteLetterPage {

    @FindBy(css = "div[title=\"Кому\"]")
    private SelenideElement messageRecipientField;

    @FindBy(css = "div[aria-label=\"Напишите что-нибудь\"]")
    private SelenideElement messageTextArea;

    @FindBy(css = "button[class=\"Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l\"]")
    private SelenideElement sendButton;
}

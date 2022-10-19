package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainYandexMailPage {

    @FindBy(css = "a[aria-describedby=\"tooltip-0-1\"]")
    private SelenideElement writeMessageButton;
}

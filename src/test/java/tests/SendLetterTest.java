package tests;

import base.BaseTest;
import flow.AuthorizationFlow;
import org.testng.annotations.Test;

public class SendLetterTest extends BaseTest {

    String login = "testing451@Yandex.ru";
    String password = "fdkjsbkgulhi1";
    String letterText = "Заполнение body письма";
    String recipient = "Zbosenko@gmail.com";


    @Test
    void sendLetter() {
        new AuthorizationFlow()
                .clickLoginButton()
                .fillLoginField(login)
                .clickEnterPasswordButton()
                .fillPasswordField(password)
                .clickSubmitButton()
                .goToMainPageFlow()
                .clickWriteMessageButton()
                .goToWriteLetterFlow()
                .fillMessageRecipientField(recipient)
                .fillMessageTextArea(letterText)
                .clickSendButton();
    }
}

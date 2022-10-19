package flow;

import page.WriteLetterPage;

import static com.codeborne.selenide.Selenide.page;

public class WriteLetterFlow {

    public WriteLetterFlow fillMessageRecipientField(String recipient) {
        page(WriteLetterPage.class).getMessageRecipientField().sendKeys(recipient);
        return this;
    }

    public WriteLetterFlow fillMessageTextArea(String message) {
        page(WriteLetterPage.class).getMessageTextArea().sendKeys(message);
        return this;
    }

    public WriteLetterFlow clickSendButton() {
        page(WriteLetterPage.class).getSendButton().click();
        return this;
    }
}

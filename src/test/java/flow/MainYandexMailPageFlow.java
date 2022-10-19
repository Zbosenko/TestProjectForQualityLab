package flow;

import page.MainYandexMailPage;

import static com.codeborne.selenide.Selenide.page;

public class MainYandexMailPageFlow {


    public MainYandexMailPageFlow clickWriteMessageButton() {
        page(MainYandexMailPage.class).getWriteMessageButton().click();
        return this;
    }

    public WriteLetterFlow goToWriteLetterFlow() {
        return new WriteLetterFlow();
    }
}

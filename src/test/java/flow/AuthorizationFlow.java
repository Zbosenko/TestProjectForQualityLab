package flow;

import page.AuthorizationPage;

import static com.codeborne.selenide.Selenide.page;

public class AuthorizationFlow {

    public AuthorizationFlow clickLoginButton() {
        page(AuthorizationPage.class).getLoginButton().click();
        return this;
    }

    public AuthorizationFlow fillLoginField(String login) {
        page(AuthorizationPage.class).getLoginField().sendKeys(login);
        return this;
    }

    public AuthorizationFlow clickEnterPasswordButton() {
        page(AuthorizationPage.class).getEnterPasswordButton().click();
        return this;
    }

    public AuthorizationFlow fillPasswordField(String password) {
        page(AuthorizationPage.class).getPasswordField().sendKeys(password);
        return this;
    }

    public AuthorizationFlow clickSubmitButton() {
        page(AuthorizationPage.class).getSubmitButton().click();
        return this;
    }

    public MainYandexMailPageFlow goToMainPageFlow() {
        return new MainYandexMailPageFlow();
    }
}

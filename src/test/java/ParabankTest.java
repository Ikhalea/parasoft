import org.example.*;
import org.junit.Test;

public class ParabankTest extends BaseSetup {
    @Test
    public void testRegisterAndLogin() {
    HomePage homePage = new HomePage(driver);
        homePage.clickRegister();

    RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.register("John", "sam", "123 Main St", "Anytown", "NY", "12345", "123-456-7890", "123-45-6789", "johndoe", "password");

    LoginPage loginPage = new LoginPage(driver);

    // Negative Login Test
        loginPage.login("wrongUser", "wrongPass");
        loginPage.assertLoginError();

    // Positive Login Test
        loginPage.login("johndoe", "password");

    AccountPage accountPage = new AccountPage(driver);
        accountPage.openNewAccount();

    TransferFundsPage transferFundsPage = new TransferFundsPage(driver);
        transferFundsPage.transferFunds("500");

    RequestLoanPage requestLoanPage = new RequestLoanPage(driver);
        requestLoanPage.requestLoan("1000", "100");

    LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();
}

}

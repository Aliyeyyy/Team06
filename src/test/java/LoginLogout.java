import Team06.pages.HomePage;
import org.testng.annotations.Test;

public class LoginLogout {


    HomePage hp = new HomePage();



    @Test()
    public void registerCustomer() {
        hp.registerCustomer();

    }

    @Test()
    public void loginCustomer() throws InterruptedException {
        hp.loginCustomer();
        Thread.sleep(3000);
        hp.logoutCustomer();


    }

    @Test
    public void registerSeller(){

        hp.registerSeller();
    }

    @Test
    public void loginSeller() throws InterruptedException {
        hp.loginSeller();
        Thread.sleep(3000);
        hp.logoutSeller();
    }
}

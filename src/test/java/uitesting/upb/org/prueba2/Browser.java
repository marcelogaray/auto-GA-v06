package uitesting.upb.org.prueba2;

import org.openqa.selenium.WebDriver;

/**
 * @autor Marcelo Garay
 */
public class Browser {
    private WebDriver webDriver;
    public Browser(WebDriver webDriver, String url) {
        this.webDriver = webDriver;
        this.webDriver.get(url);

        procesar();
    }

    private void procesar() {
        try {
            Thread.sleep(6000);
        }catch (Exception e){
            System.out.println("args = [" + e.fillInStackTrace() + "]");
        }

        webDriver.quit();
    }

//    public void openPage(String url){
//        this.webDriver.get(url);
//    }

}

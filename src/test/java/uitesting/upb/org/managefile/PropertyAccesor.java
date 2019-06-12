package uitesting.upb.org.managefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @autor Marcelo Garay
 */
public class PropertyAccesor {
    private static PropertyAccesor propertyAccesor;
    private Properties prop;

    private PropertyAccesor() {
        try (InputStream input = new FileInputStream("gradle.properties")) {
            prop = new Properties();
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyAccesor getInstance(){
        if(propertyAccesor == null){
            propertyAccesor = new PropertyAccesor();
        }
        return propertyAccesor;
    }

    public String getBaseURL(){
        return prop.getProperty("url");
    }

    public String getUsername(){
        return prop.getProperty("username");
    }

    public String getPassword(){
        return prop.getProperty("password");
    }

    public String getBrowser() {
        return prop.getProperty("Browser");
    }

    public static void main(String[] args) {
        System.out.println(PropertyAccesor.getInstance().getBaseURL());
        System.out.println(PropertyAccesor.getInstance().getUsername());
        System.out.println(PropertyAccesor.getInstance().getPassword());
    }

}

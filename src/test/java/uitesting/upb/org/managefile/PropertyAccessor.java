package uitesting.upb.org.managefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @autor Marcelo Garay
 */
public class PropertyAccessor {

    private static PropertyAccessor propertyAccessor;
    private Properties prop;

    private PropertyAccessor() {
        try (InputStream input = new FileInputStream("gradle.properties")) {
            prop = new Properties();
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyAccessor getInstance(){
        if(propertyAccessor == null){
            propertyAccessor = new PropertyAccessor();
        }
        return propertyAccessor;
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
        System.out.println(PropertyAccessor.getInstance().getBaseURL());
        System.out.println(PropertyAccessor.getInstance().getUsername());
        System.out.println(PropertyAccessor.getInstance().getPassword());
    }

}

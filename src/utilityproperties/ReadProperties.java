package utilityproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        InputStream readFile = null;

        try {
            readFile = new FileInputStream("config.properties");

            properties.load(readFile);
            System.out.println(properties.getProperty("Username"));
            System.out.println(properties.getProperty("DBPass"));

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            if(readFile != null)
                readFile.close();
        }
    }
}

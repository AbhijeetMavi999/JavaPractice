package utilityproperties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        OutputStream writeFile = null;

        try {
            writeFile = new FileOutputStream("config.properties");
            properties.setProperty("DBServer", "ins01.kui02.abhijeet");
            properties.setProperty("DBName", "db_abhijeet");
            properties.setProperty("DBPass", "password123");
            properties.setProperty("Username", "root");

            properties.store(writeFile, null);
            System.out.println("Create properties file successfully!");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            // closing the file connection
            if(writeFile != null)
                writeFile.close();
        }
    }
}

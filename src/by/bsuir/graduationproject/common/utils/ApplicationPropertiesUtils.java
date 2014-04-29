package by.bsuir.graduationproject.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author l.zverugo Date: 29.04.14 Time: 14:57.
 */
public final class ApplicationPropertiesUtils {
    private static final Properties APPLICATION_PROPERTIES = new Properties();

    static {
        try {
            InputStream inputStream = new FileInputStream(CommonKeys.APPLICATION_PROPERTIES_PATH);
            APPLICATION_PROPERTIES.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ApplicationPropertiesUtils() {
    }

    public static String getStringProperty(String key) {
        return (String) APPLICATION_PROPERTIES.get(key);
    }
}

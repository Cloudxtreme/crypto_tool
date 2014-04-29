package by.bsuir.graduationproject.common.language;

import by.bsuir.graduationproject.common.utils.CommonKeys;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:59.
 */
public final class LanguageTools {
    private LanguageTools() {
    }

    private static final Properties LANGUAGE_PROPERTIES;

    static {
        LANGUAGE_PROPERTIES = new Properties();
        try {
            InputStream fileInputStream = new FileInputStream(CommonKeys.APPLICATION_PROPERTIES_PATH);
            InputStreamReader reader = new InputStreamReader(fileInputStream, CommonKeys.UTF_8);
            LANGUAGE_PROPERTIES.load(reader);
            String locale = (String) LANGUAGE_PROPERTIES.get(CommonKeys.CURRENT_LOCALE);
            fileInputStream = new FileInputStream(
                    CommonKeys.LANGUAGE_PROPERTIES_PATH.replace(CommonKeys.LOCALE_PLACEHOLDER, locale));
            reader = new InputStreamReader(fileInputStream, CommonKeys.UTF_8);
            LANGUAGE_PROPERTIES.load(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String translate(String key) {
        return (String) LANGUAGE_PROPERTIES.get(key);
    }
}

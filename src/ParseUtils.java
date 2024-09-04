import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseUtils {
    public static int intTryParse(String value, int fallback) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static float floatTryParse(String value, float fallback) {
        try {
            return Float.parseFloat(value);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static double doubleTryParse(String value, double fallback) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static long longTryParse(String value, long fallback) {
        try {
            return Long.parseLong(value);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static boolean booleanTryParse(String value, boolean fallback) {
        try {
            return Boolean.parseBoolean(value);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static short shortTryParse(String value, short fallback) {
        try {
            return Short.parseShort(value);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static byte byteTryParse(String value, byte fallback) {
        try {
            return Byte.parseByte(value);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static char charTryParse(String value, char fallback) {
        try {
            return value.charAt(0);
        } catch (Exception e) {
            return fallback;
        }
    }

    public static Date dateTryParse(String value, Date fallback, String dateFormat) {
        try {
            SimpleDateFormat parser = new SimpleDateFormat(dateFormat);
            return parser.parse(value);
        } catch (Exception e) {
            return fallback;
        }
    }
}
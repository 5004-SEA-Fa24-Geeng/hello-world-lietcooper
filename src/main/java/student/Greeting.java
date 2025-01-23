package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private final int localityID;
    private final String localityName;
    private final String asciiGreeting;
    private final String unicodeGreeting;
    private final String formatStr;

    /**
     * This constructor creates default greeting "Hello, {name}!"
     * @param localityID, id of the locality
     * @param localityName, name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * This constructor creates a greeting with ascii and Unicode characters
     * assuming the language is already using ascii letters only.
     * @param localityID, id of the locality
     * @param localityName, name of the locality
     * @param greeting, greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * This constructor creates a greeting with ascii and Unicode characters.
     * @param localityID, id of the locality
     * @param localityName, name of the locality
     * @param asciiGreeting, greeting using ascii characters
     * @param unicodeGreeting, greeting using Unicode characters
     * @param formatStr, format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Return the locality id number
     * @return the int value of locality id number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     *
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     *
     * @return the greeting using ascii characters
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     *
     * @return the greeting using Unicode characters
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     *
     * @return the format string with greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting);
    }

    /**
     *
     * @param asciiOnly, if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the string
     */
    public String getFormatStr(boolean asciiOnly) {
        return asciiOnly? String.format(formatStr, asciiGreeting) : String.format(formatStr, unicodeGreeting);
    }

    /**
     *
     * @return the full greeting details as a String. Primarily for debugging purposes.
     */
    public String toString() {
        return  String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}

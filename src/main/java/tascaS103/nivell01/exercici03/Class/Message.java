package tascaS103.nivell01.exercici03.Class;

public class Message {
    public static final String U_WELCOME = """
            *======================================*
            *  🇷🇴🇨🇭🇸🇪🇬🇧🇮🇹LET'S START 🇮🇪🇪🇸🇸🇰🇩🇰🇩🇪  *
            *======================================*
            """;
    public static final String U_ENTER_NAME = "ENTER YOUR NAME:";
    public static final String U_HELLO_NAME = "HELLO %s!\n";
    public static final String U_GUESS_CAPITAL = "Can you guess the capital city?";
    public static final String U_COUNTRY_NUMBERS = "Country %d: ";
    public static final String U_CORRECT = "CORRECT!";
    public static final String U_INCORRECT = "INCORRECT";
    public static final String U_SCORE = "Score: %d\n";
    public static final String U_FINAL = """
            *=======================================*
            *  🇷🇴🇨🇭🇸🇪🇬🇧🇮🇹YOUR SCORE IS 🇮🇪🇪🇸🇸🇰🇩🇰🇩🇪 *
            *                  %d                   *
            *=======================================*
            """;
    public static final String U_GAME_SAVE = "GAME SAVED SUCCESSFULLY";
    public static final String U_EXIT_PROMPT = """
         Play (p)       Quit (q)
*=======================================*
""";
    public static final String U_GOODBYE = "GOODBYE!";

    public static final String E_FILE_NOT_FOUND = "File not found";
    public static final String E_FAILED_READING = "Failed reading file";
    public static final String E_FORMAT_ERROR = "Wrong format";
    public static final String E_STRING_WITH_NUM = "Words must not include numbers";
    public static final String E_IO_EXCEPTION = "Error writing file";
}

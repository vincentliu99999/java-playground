import java.time.format.DateTimeFormatter;

public class DateFormatter {
  public static void main(String[] args) {
    static final DateTimeFormatter MEDIUM_DATE_FORMATTER = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
  }
}

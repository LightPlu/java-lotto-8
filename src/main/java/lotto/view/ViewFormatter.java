package lotto.view;

public class ViewFormatter {

    public static String LottoResultFormat(DigitsMatch message, int value) {
        return String.format(message.toString(), value);
    }

    public static String earningRateFormat(String message, float value) {
        return String.format(message, value);
    }
}

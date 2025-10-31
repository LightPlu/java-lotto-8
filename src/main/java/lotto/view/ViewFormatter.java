package lotto.view;

public class ViewFormatter {

    public static String LottoResultFormat(DigitsMatch message, int value) {
        return String.format(message.getMessage(), value);
    }

    public static String earningRateFormat(DigitsMatch message, float value) {
        return String.format(message.getMessage(), value);
    }
}

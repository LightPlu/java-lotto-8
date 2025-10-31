package lotto.view;

public class UserInputView {

    private static final String PRICE_INPUT_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String WINNING_NUMBERS_INPUT_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_NUMBER_INPUT_MESSAGE = "보너스 번호를 입력해 주세요.";

    public void printPriceMessage() {
        System.out.println(PRICE_INPUT_MESSAGE);
    }

    public void printWinningNumbersMessage() {
        System.out.println(WINNING_NUMBERS_INPUT_MESSAGE);
    }

    public void printBonusNumbersMessage() {
        System.out.println(BONUS_NUMBER_INPUT_MESSAGE);
    }
}

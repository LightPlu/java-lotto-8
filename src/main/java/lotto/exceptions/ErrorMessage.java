package lotto.exceptions;

public enum ErrorMessage {
    LOTTO_NUMBER_OUT_OF_BOUNDS("[ERROR] 로또 번호 범위 내의 숫자(1~45)를 입력해주세요."),
    WINNING_NUMBER_DUPLICATE_BONUS_NUMBER("[ERROR] 로또 당첨 번호와 보너스 번호가 동일합니다."),
    CASH_IS_NOT_DIVISIBLE("[ERROR] 구입 금액을 1,000원 단위로 입력해주세요."),
    CASH_IS_NOT_POSITIVE("[ERROR] 구입 금액을 0원보다 크게 입력해주세요.");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package lotto.view;

import static lotto.view.DigitsMatch.EARNING_RATE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class UserOutputView {

    private static final String WINNING_STATICS_MESSAGE = "당첨 통계";
    private static final String BAR = "---";

    public void printTotalStatics(List<Integer> winningStats, float earningRate) {
        printWinningStaticsMessage();
        List<DigitsMatch> messages = Arrays.asList(DigitsMatch.values());

        IntStream.range(0, winningStats.size())
                .forEach(i ->
                    System.out.println(
                            ViewFormatter.LottoResultFormat(messages.get(i), winningStats.get(i))
                    ));

        System.out.println(ViewFormatter.earningRateFormat(EARNING_RATE, earningRate));
    }

    private void printWinningStaticsMessage() {
        System.out.println(WINNING_STATICS_MESSAGE);
        System.out.println(BAR);
    }

}

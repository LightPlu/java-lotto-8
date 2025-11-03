package lotto.controller;

import java.util.List;
import lotto.service.LottoServiceImpl;
import lotto.view.UserInputView;
import lotto.view.UserOutputView;

public class LottoController {

    UserOutputView userOutputView = new UserOutputView();
    UserInputView userInputView = new UserInputView();
    LottoServiceImpl lottoService = new LottoServiceImpl();

    public void run() {
        try {
            int price = userInputView.printPriceMessage();
            int count = lottoService.buyLottoAndSave(price);

            userOutputView.printLottoCountMessage(count);
            String lottoHistory = lottoService.printLottoPurchaseHistory();
            userOutputView.printLottoHistory(lottoHistory);

            List<Integer> winningNumbers = userInputView.printWinningNumbersMessage();

            int bonusNumber = userInputView.printBonusNumbersMessage();

            double earningRate = lottoService.compareLottoAndAggregate(price, winningNumbers, bonusNumber);

            List<Integer> winningStats = lottoService.printLottoResultStatistics(winningNumbers, bonusNumber);

            userOutputView.printTotalStatics(winningStats, earningRate);
        } catch (IllegalArgumentException e) {
            throw e; // 예외를 Application 까지 전파
        }
    }
}

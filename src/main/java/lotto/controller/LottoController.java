package lotto.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import lotto.domain.entity.Lotto;
import lotto.domain.entity.LottoResult;
import lotto.service.LottoServiceImpl;
import lotto.view.UserInputView;
import lotto.view.UserOutputView;

public class LottoController {

    UserOutputView userOutputView = new UserOutputView();
    UserInputView userInputView = new UserInputView();
    LottoServiceImpl lottoService = new LottoServiceImpl();

    public void run() {
        userInputView.printPriceMessage();
        String priceInput = Console.readLine();
        int price = 0;
        try{
            price = Integer.parseInt(priceInput);
        } catch(Exception e){
            System.out.println("[ERROR] 숫자가 아닌 값이 입력되었습니다.");
            return;  // 예외를 던지지 않고 프로그램 종료
        }

        int count = lottoService.buyLottoAndSave(price);

        userOutputView.printLottoCountMessage(count);
        List<Lotto> lottos = lottoService.getSavedLottos();
        lottos.forEach(lotto -> System.out.println(lotto.getNumbers()));

        userInputView.printWinningNumbersMessage();
        String winningNumbersInput = Console.readLine();
        List<Integer> winningNumbers = Arrays.stream(winningNumbersInput.split(","))
                .map(Integer::parseInt)
                .toList();

        userInputView.printBonusNumbersMessage();
        String bonusNumbersInput = Console.readLine();
        int bonusNumber = Integer.parseInt(bonusNumbersInput);

        // 당첨 결과 및 수익률 계산 (한 번에 처리)
        double earningRate = lottoService.compareLottoAndAggregate(price, winningNumbers, bonusNumber);
        
        // 통계 출력용 데이터 추출 (다시 비교)
        LottoResult results = lottoService.compareLotto(winningNumbers, bonusNumber);
        List<Integer> winningStats = results.getResultValuesOrdered();
        
        userOutputView.printTotalStatics(winningStats, earningRate);
        
    }
}

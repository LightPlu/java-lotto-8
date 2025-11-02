package lotto.domain.service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import lotto.domain.entity.Lotto;
import lotto.domain.entity.LottoResult;
import lotto.domain.vo.CountResult;
import lotto.domain.vo.Rank;
import lotto.domain.vo.WinningLottoNumbers;

public class LottoCompareService {

    public CountResult compareNumber(Lotto lotto, WinningLottoNumbers winningLottoNumbers) {
        List<Integer> lottoNumbers = lotto.getSortedNumbers();
        List<Integer> winningNumbers = winningLottoNumbers.getWinningNumbers();
        int bonusNumber = winningLottoNumbers.getBonusNumber();

        int numberMatchCount = (int) lottoNumbers.stream()
                .filter(winningNumbers::contains)
                .count();

        if (lottoNumbers.contains(bonusNumber)) {
            return new CountResult(numberMatchCount, true);
        }

        return new CountResult(numberMatchCount, false);
    }
}

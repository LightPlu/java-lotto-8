package lotto.domain.entity;

import java.util.Map;
import lotto.domain.vo.Rank;

public class LottoResult {
    private final Map<Rank, Integer> results;

    public LottoResult(Map<Rank, Integer> results) {
        this.results = results;
    }

    public Map<Rank, Integer> getResults() {
        return results;
    }

}

package lotto.utils;

import static lotto.exceptions.ErrorMessage.INPUT_VALUE_IS_INVALID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeConverter {

    public int priceTypeConvert(String input) {
        int price = 0;
        try {
            price = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(INPUT_VALUE_IS_INVALID.getMessage());
            throw new IllegalArgumentException(INPUT_VALUE_IS_INVALID.getMessage());
        }
        return price;
    }

    public List<Integer> winningNumberTypeConvert(String input) {
        List<Integer> winningNumbers = new ArrayList<>();
        try {
            winningNumbers = Arrays.stream(input.split(","))
                    .map(Integer::parseInt)
                    .toList();
        } catch (NumberFormatException e) {
            System.out.println(INPUT_VALUE_IS_INVALID.getMessage());
            throw new IllegalArgumentException(INPUT_VALUE_IS_INVALID.getMessage());
        }
        return winningNumbers;
    }

    public int bonusNumberTypeConvert(String input) {
        int bonusNumber = 0;
        try {
            bonusNumber = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(INPUT_VALUE_IS_INVALID.getMessage());
            throw new IllegalArgumentException(INPUT_VALUE_IS_INVALID.getMessage());
        }
        return bonusNumber;
    }
}

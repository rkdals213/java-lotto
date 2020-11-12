package step2.view;

import step2.domain.lotto.WinningNumbers;

import java.util.Scanner;

public class LottoInputView implements InputView {
    private static final String QUESTION_USE_MONEY = "구입금액을 입력해 주세요.";
    private static final String QUESTION_LAST_WEEK_WINNING_NUMBER = "지난 주 당첨 번호를 입력해 주세요.";


    @Override
    public int getUseAmount(Scanner scanner) {
        System.out.println(QUESTION_USE_MONEY);
        int insertedMoney = scanner.nextInt();
        scanner.nextLine();
        return insertedMoney;
    }

    @Override
    public WinningNumbers getWinningNumber(Scanner scanner) {

        System.out.println(QUESTION_LAST_WEEK_WINNING_NUMBER);
        String insertedWinningNumber = scanner.nextLine();
        return WinningNumbers.of(insertedWinningNumber);
    }
}

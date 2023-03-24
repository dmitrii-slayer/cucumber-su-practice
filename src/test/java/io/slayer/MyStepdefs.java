package io.slayer;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import org.junit.Assert;

import java.math.BigDecimal;

public class MyStepdefs {

    private static BigDecimal cash = new BigDecimal(120_000);

    @Дано("на счете пользователя имеется {int} рублей")
    public void userHasThisAmountOfMoney(int money) {
        Assert.assertEquals(0, cash.compareTo(new BigDecimal(money)));
    }

    @Когда("пользователь снимает со счета {int} рублей")
    public void userWithdrawsThisAmountOfMoney(int money) {
        cash = cash.subtract(new BigDecimal(money));
    }
}

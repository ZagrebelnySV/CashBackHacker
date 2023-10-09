package ru.netology.cashBack;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testAmountOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void testAmountNineHundredAndNinetyNine() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void testAmountOneThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testAmountOneThousandOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}
package ru.netology.cashBack;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testAmountOne() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void testAmountNineHundredAndNinetyNine() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testAmountOneThousand() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAmountOneThousandOne() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }
}
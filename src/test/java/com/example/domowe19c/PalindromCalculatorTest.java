package com.example.domowe19c;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PalindromCalculatorTest {

    @Test
    public void palindromTestFalse() {
        //given
        PalindromCalculator pc = new PalindromCalculator();
        int testNo = 1524;
        //when
        boolean result = pc.palindromTest(testNo);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void palindromTestTrue() {
        //given
        PalindromCalculator pc = new PalindromCalculator();
        int testNo = 15288251;
        //when
        boolean result = pc.palindromTest(testNo);
        //then
        Assert.assertTrue(result);
    }



    @Test
    public void showPalindromMaxFor3digits() {
        //given
        PalindromCalculator pc = new PalindromCalculator();
        //when
        int result = pc.maxValCalculator();
        //then
        Assert.assertThat(result, CoreMatchers.is(906609));
    }
}

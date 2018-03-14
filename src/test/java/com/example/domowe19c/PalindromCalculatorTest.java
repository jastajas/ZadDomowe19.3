package com.example.domowe19c;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

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
    public void palindromTestSortCollectionMin() {
//given
        PalindromDatabase pd = new PalindromDatabase();
        pd.getPalindromsDB().add(new Palindrom(64, 16, 4));
        pd.getPalindromsDB().add(new Palindrom(8, 2, 4));
        pd.getPalindromsDB().add(new Palindrom(33, 3, 11));
        pd.getPalindromsDB().add(new Palindrom(84, 21, 4));
        pd.getPalindromsDB().add(new Palindrom(56, 7, 8));

//when
        Collections.sort(pd.getPalindromsDB());
        int result = pd.getPalindromsDB().get(0).getPalindromNo();
//then
        Assert.assertThat(result, CoreMatchers.is(8));
    }

    @Test
    public void palindromTestSortCollectionMax() {
//given
        PalindromDatabase pd = new PalindromDatabase();
        pd.getPalindromsDB().add(new Palindrom(64, 16, 4));
        pd.getPalindromsDB().add(new Palindrom(8, 2, 4));
        pd.getPalindromsDB().add(new Palindrom(33, 3, 11));
        pd.getPalindromsDB().add(new Palindrom(84, 21, 4));
        pd.getPalindromsDB().add(new Palindrom(56, 7, 8));

//when
        Collections.sort(pd.getPalindromsDB());
        int result = pd.getPalindromsDB().get(4).getPalindromNo();
//then
        Assert.assertThat(result, CoreMatchers.is(84));
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

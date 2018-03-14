package com.example.domowe19c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromCalculator {

    PalindromDatabase pd;

    public PalindromCalculator() {
        pd = new PalindromDatabase();
    }

    public int maxValCalculator() {

        int result = 0;

        int num1 = 999;

        while (num1 >= 100) {
            int num2 = 999;
            while (num2 >= 100) {

                result = num1 * num2;

                if (palindromTest(result)) {
                    pd.getPalindromsDB().add(new Palindrom(result, num1, num2));
                }

                num2--;
            }
            num1--;

        }

        Collections.sort(pd.getPalindromsDB());

        return pd.getPalindromsDB().get(pd.getPalindromsDB().size() - 1).getPalindromNo();


    }

    public boolean palindromTest(int number) {

        List<Integer> testNo = new ArrayList<>();

        while (number >= 10) {
            testNo.add(number % 10);
            number /= 10;
        }
        testNo.add(number);


        boolean palindromTrue = true;
        int j = testNo.size() - 1;

        for (int i = 0; i < testNo.size(); i++) {

            if (testNo.get(i) != testNo.get(j)) {
                palindromTrue = false;
                break;
            }
            j--;

        }
        return palindromTrue;
    }

}





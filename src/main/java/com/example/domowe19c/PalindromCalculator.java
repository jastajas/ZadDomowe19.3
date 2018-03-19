package com.example.domowe19c;

import java.util.ArrayList;
import java.util.List;

public class PalindromCalculator {


    public int maxValCalculator() {

        int result = 0;

        int num1 = 999;

        int maxVal = 0;

        while (num1 >= 100) {
            int num2 = 999;
            while (num2 >= 100) {

                result = num1 * num2;

                if (palindromTest(result)) {
                    if (result > maxVal)
                        maxVal = result;
                }

                num2--;
            }
            num1--;

        }


        return maxVal;


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





package com.gnb.androidtesting;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
//        assertEquals(9, 2 + 2);
    }

    @Test
    public void getData_isCorrect() throws Exception {
        ArrayList<String> testStrings = new ArrayList<String>();
        testStrings.add("نعت الفنانة اللبنانية [مادلين مطر](person::1100356) والدتها التي رحلت عن عالمنا مساء الجمعة الماضية 00000897897");
        testStrings.add("Second [second test](second::2222222) Third in second [3rd second](third::333333) hhhhhhhh");
        testStrings.add("[انغام](artist::9999) [اصالة](artist::999) [هشام](talented::999999)");
        testStrings.add("This string is empty of regex");
        testStrings.add("");
        testStrings.add(null);

        for (String testCase : testStrings) {
            ArrayList<String[]> data = Regex.getData(testCase);
            for (String[] arr : data) {
              assertEquals(arr.length, 3);
            }
        }

    }
}
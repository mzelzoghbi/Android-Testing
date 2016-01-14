package com.gnb.androidtesting;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mohamedzakaria on 1/14/16.
 */
public class Regex {
    public static ArrayList<String[]> getData(String input) {
        ArrayList<String[]> strings = new ArrayList<String[]>();
        System.out.println("---------------");

        Pattern pattern = Pattern.compile("\\[(.*?)\\][(]([a-z]+)::([0-9]+)[)]");
        if (input != null) {

            Matcher m = pattern.matcher(input);
            while (m.find()) {
                String[] dataObject = new String[3];
                for (int i = 1; i < m.groupCount() + 1; i++) {
                    dataObject[i - 1] = m.group(i);
                    System.out.println(m.group(i));
                }
                strings.add(dataObject);
            }
        }

        return strings;
    }
}

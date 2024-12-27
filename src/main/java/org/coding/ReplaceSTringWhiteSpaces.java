package org.coding;

public class ReplaceSTringWhiteSpaces {
    public static void main(String[] args) {
        String st = " ajjjj ";
        st = st.replaceAll("\\s","");
        System.out.println(st);


        String st1 = "ak jjs";
        char ch='_';
        st1 = st1.replace(' ',ch);
        System.out.println(st1);
    }
}

package br.junit.main;

import br.junit.commons.Theorems;

/**
 * Created by allan on 02/09/16.
 */
public class MainApp {
    private static Theorems theorems;

    public static void main(String[] args) {
        theorems = new Theorems();
        System.out.println("PythagoreanTheorem: " + theorems.getPythagoreanTheorem(30, 50, null));
        System.out.println("\n");
        System.out.println("EuclidsTheorem: " + theorems.getEuclidsTheorem(15, 10));
        System.out.println("\n");
        System.out.println("Delta :" + theorems.getBhaskaraTheorem(3, -7, 4)
                + "\nX1 :" + theorems.getBhaskaraTheoremX1(theorems.getBhaskaraTheorem(3, -7, 4), 3, -7)
                + "\nX2 :" + theorems.getBhaskaraTheoremX2(theorems.getBhaskaraTheorem(3, -7, 4), 3, -7)
        );
    }
}

package br.junit.commons;

/**
 * Created by allan on 05/09/16.
 */
public class Theorems {

    private Double hypotenuse;
    private Integer greatestCommonDivisor;
    private Double delta;
    private Double x1;
    private Double x2;

    public Integer getPythagoreanTheorem(Integer sideA, Integer sideB, Integer sideC) {
        try {
            if (sideA == null) {
                hypotenuse = ((Math.pow(sideB, 2)) + (Math.pow(sideC, 2)));
            } else if (sideB == null) {
                hypotenuse = ((Math.pow(sideA, 2)) - (Math.pow(sideC, 2)));
            } else if (sideC == null) {
                hypotenuse = ((Math.pow(sideB, 2)) - (Math.pow(sideA, 2)));
            } else {
                throw new IllegalArgumentException("Somente um elemento pode estar nulo");
            }
            hypotenuse = Math.sqrt(hypotenuse);
        } catch (IllegalArgumentException iaex) {
            iaex.getStackTrace();
        }
        return hypotenuse.intValue();
    }

    public Integer getEuclidsTheorem(Integer dividendo, Integer divisor) {
        if (dividendo < divisor) {
            throw new IllegalArgumentException("O dividendo tem de ser maior do que divisor");
        }
        greatestCommonDivisor = dividendo % divisor;

        if (greatestCommonDivisor == 0) {
            return divisor;
        } else {
            return getEuclidsTheorem(divisor, greatestCommonDivisor);
        }
    }

    public Integer getBhaskaraTheorem(Integer a, Integer b, Integer c) {
        delta = Math.pow(b, 2) - (4 * a * c);
        return delta.intValue();
    }

    public Integer getBhaskaraTheoremX1(Integer delta, Integer a, Integer b) {
        x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        return x1.intValue();
    }

    public Integer getBhaskaraTheoremX2(Integer delta, Integer a, Integer b) {
        x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        return x2.intValue();
    }
}

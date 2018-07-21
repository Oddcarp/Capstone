package hello;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

    private final long id;
    private final String userFormula;
    private String strResult;

    public Calculator(long id,String userFormula) {
        this.id = id;
        this.userFormula = userFormula;

        for (int j = 0; j <userFormula.length(); j++ ) {
            char curChar = userFormula.charAt(j);
            if (curChar == '(') {
                userFormula = parenExtract(j,userFormula);
            }

        }

        strResult = String.format("%.4f", massCalculator(userFormula));
        System.out.println("");
        System.out.println("Molecular Weight: " + strResult);



    }

    public long getId() {
        return id;
    }

    public String getMolecularMassTotal() {
        return strResult;
    }



    public static double massCalculator(String x) {

        HashMap<String, Double> hmap = new HashMap<String, Double>();
        hmap.put("H", 1.0080);
        hmap.put("He", 4.0026);
        hmap.put("Li", 6.9675);
        hmap.put("Be", 9.0122);
        hmap.put("B", 10.8135);
        hmap.put("C", 12.0106);
        hmap.put("N", 14.0069);
        hmap.put("O", 15.9994);
        hmap.put("F", 18.9984);
        hmap.put("Ne", 20.1797);
        hmap.put("Na", 22.9898);
        hmap.put("Mg", 24.3055);
        hmap.put("Al", 26.9815);
        hmap.put("Si", 28.0850);
        hmap.put("P", 30.9738);
        hmap.put("S", 32.0675);
        hmap.put("Cl", 35.4515);
        hmap.put("Ar", 39.9480);
        hmap.put("K", 39.0983);
        hmap.put("Ca", 40.0780);
        hmap.put("Sc", 44.9559);
        hmap.put("Ti", 47.8670);
        hmap.put("V", 50.9415);
        hmap.put("Cr", 51.9961);
        hmap.put("Mn", 54.9380);
        hmap.put("Fe", 55.8450);
        hmap.put("Co", 58.9332);
        hmap.put("Ni", 58.6934);
        hmap.put("Cu", 63.5460);
        hmap.put("Zn", 65.3800);
        hmap.put("Ga", 69.7230);
        hmap.put("Ge", 72.6300);
        hmap.put("As", 74.9216);
        hmap.put("Se", 78.9710);
        hmap.put("Br", 79.9040);
        hmap.put("Kr", 83.7980);
        hmap.put("Rb", 85.4678);
        hmap.put("Sr", 87.6200);
        hmap.put("Y", 88.9058);
        hmap.put("Zr", 91.2240);
        hmap.put("Nb", 92.9064);
        hmap.put("Mo", 95.9500);
        hmap.put("Tc", 98.0000);
        hmap.put("Ru", 101.0700);
        hmap.put("Rh", 102.9055);
        hmap.put("Pd", 106.4200);
        hmap.put("Ag", 107.8682);
        hmap.put("Cd", 112.4140);
        hmap.put("In", 114.8180);
        hmap.put("Sn", 118.7100);
        hmap.put("Sb", 121.7600);
        hmap.put("Te", 127.6000);
        hmap.put("I", 126.9045);
        hmap.put("Xe", 131.2930);
        hmap.put("Cs", 132.9055);
        hmap.put("Ba", 137.3270);
        hmap.put("La", 138.9055);
        hmap.put("Ce", 140.1160);
        hmap.put("Pr", 140.9077);
        hmap.put("Nd", 144.2420);
        hmap.put("Pm", 145.0000);
        hmap.put("Sm", 150.3600);
        hmap.put("Eu", 151.9640);
        hmap.put("Gd", 157.2500);
        hmap.put("Tb", 158.9254);
        hmap.put("Dy", 162.5000);
        hmap.put("Ho", 164.9303);
        hmap.put("Er", 167.2590);
        hmap.put("Tm", 168.9342);
        hmap.put("Yb", 173.0540);
        hmap.put("Lu", 174.9668);
        hmap.put("Hf", 178.4900);
        hmap.put("Ta", 180.9479);
        hmap.put("W", 183.8400);
        hmap.put("Re", 186.2070);
        hmap.put("Os", 190.2300);
        hmap.put("Ir", 192.2170);
        hmap.put("Pt", 195.0840);
        hmap.put("Au", 196.9666);
        hmap.put("Hg", 200.5920);
        hmap.put("Tl", 204.3835);
        hmap.put("Pb", 207.2000);
        hmap.put("Bi", 208.9804);
        hmap.put("Po", 209.0000);
        hmap.put("At", 210.0000);
        hmap.put("Rn", 222.0000);
        hmap.put("Fr", 223.0000);
        hmap.put("Ra", 226.0000);
        hmap.put("Ac", 227.0000);
        hmap.put("Th", 232.0377);
        hmap.put("Pa", 231.0359);
        hmap.put("U", 238.0289);
        hmap.put("Np", 237.0000);
        hmap.put("Pu", 244.0000);
        hmap.put("Am", 243.0000);
        hmap.put("Cm", 247.0000);
        hmap.put("Bk", 247.0000);
        hmap.put("Cf", 251.0000);
        hmap.put("Es", 252.0000);
        hmap.put("Fm", 257.0000);
        hmap.put("Md", 258.0000);
        hmap.put("No", 259.0000);
        hmap.put("Lr", 262.0000);
        hmap.put("Rf", 267.0000);
        hmap.put("Db", 268.0000);
        hmap.put("Sg", 271.0000);
        hmap.put("Bh", 272.0000);
        hmap.put("Hs", 270.0000);
        hmap.put("Mt", 276.0000);
        hmap.put("Ds", 281.0000);
        hmap.put("Rg", 280.0000);
        hmap.put("Cn", 285.0000);
        hmap.put("Nh", 284.0000);
        hmap.put("Fl", 289.0000);
        hmap.put("Mc", 288.0000);
        hmap.put("Lv", 293.0000);
        hmap.put("Ts", 292.0000);
        hmap.put("Og", 294.0000);


        String molFormula = x;
        char nexChar;
        char doubNexChar;
        double molWeight = 0;

        String tempFormula;
        StringBuilder sb;


        for (int i = 0; i < molFormula.length() ; i++) {

            char curChar = molFormula.charAt(i);
            int molNum = 1;
            nexChar = ' ';
            doubNexChar = ' ';


            if (i < (molFormula.length()-1)) {
                nexChar = molFormula.charAt(i+1);
            } else {nexChar = '1';}

            if (i < (molFormula.length()-2)) {
                doubNexChar = molFormula.charAt(i+2);
            } else if(i == molFormula.length() - 1) {
                doubNexChar = ' ';
            } else {doubNexChar = '1';}



            if (Character.isUpperCase(curChar)){

                if (Character.isLowerCase(nexChar)) {

                    sb = new StringBuilder(3);
                    sb.append(curChar);
                    sb.append(nexChar);
                    tempFormula = sb.toString();

                    if (Character.isDigit(doubNexChar)) {

                        molNum = Character.getNumericValue(doubNexChar);
                        if (hmap.get(tempFormula) != null) {
                            System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
                            molWeight += (hmap.get(tempFormula) * molNum);
                        }

                    } else {

                        if (hmap.get(tempFormula) != null) {
                            System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
                            molWeight += (hmap.get(tempFormula) * molNum);
                        }
                    }

                } else if (Character.isDigit(nexChar)) {

                    tempFormula = Character.toString(curChar);
                    if (Character.isDigit(doubNexChar)) {
                        molNum = Character.getNumericValue(nexChar) * 10 + Character.getNumericValue(doubNexChar);
                    } else {
                        molNum = Character.getNumericValue(nexChar);
                    }
                    if (hmap.get(tempFormula) != null) {

                        System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
                        molWeight += (hmap.get(tempFormula) * molNum);
                    }

                } else {
                    tempFormula = Character.toString(curChar);
                    if (hmap.get(tempFormula) != null) {
                        System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
                        molWeight += (hmap.get(tempFormula) * molNum);
                    }
                }
            }
        }


        return molWeight;
    }

    public static String parenExtract(int x, String y) {
        int nestedParenCount = 0;
        String nexChar = "";
        String doubleNexChar = "";
        String newNum = "";
        int multiplyParen;
        for (int k = x + 1; k < y.length(); k++) {
            if (k == y.length() - 3) {
                nexChar = "" + y.charAt(k+1);
                doubleNexChar = "";
            } else if (k <= y.length() - 4) {
                nexChar = "" +y.charAt(k+1);
                doubleNexChar = "" + y.charAt(k+2);
            } else {
                nexChar = "";
                doubleNexChar = "";
            }


            if (y.charAt(k) == '(') {
                nestedParenCount++;
            } else if (nestedParenCount != 0 && y.charAt(k) == ')') {
                nestedParenCount--;
            } else if (nestedParenCount == 0 && y.charAt(k) == ')') {
                String parenForm = y.substring(x+1, k);
                String toRemove = y.substring(x,k+1);
                if (nexChar != "" && Character.isDigit(nexChar.charAt(0))) {
                    newNum+= nexChar;
                    toRemove = y.substring(x,k+2);
                    if (doubleNexChar != "" && Character.isDigit(doubleNexChar.charAt(0))) {
                        newNum+= doubleNexChar;
                        toRemove = y.substring(x,k+3);
                    }
                    multiplyParen = Integer.valueOf(newNum);
                    parenForm = addOnes(parenForm);
                    parenForm = multiplyInParen(multiplyParen,parenForm);
                }
                y = StringUtils.remove(y, toRemove);
                y += parenForm;
                break;
            }

        }
        return y;
    }

    public static String addOnes(String y) {
        String nexChar = "";
        String doubleNexChar = "";
        int newNumber = 1;
        for (int m = 0; m < y.length();m++) {
            if (m == y.length() - 2) {
                nexChar = "" + y.charAt(m+1);
                doubleNexChar = "";
            } else if (m <= y.length() - 3) {
                nexChar = "" +y.charAt(m+1);
                doubleNexChar = "" + y.charAt(m+2);
            } else {
                nexChar = "";
                doubleNexChar = "";
            }

            if (Character.isUpperCase(y.charAt(m))&& Character.isDigit(nexChar.charAt(0)) ) {
                m++;
            } else if (Character.isUpperCase(y.charAt(m))&& Character.isLowerCase(nexChar.charAt(0)) && Character.isDigit(doubleNexChar.charAt(0))) {
                m+=2;
            } else if (Character.isUpperCase(y.charAt(m))&& Character.isLowerCase(nexChar.charAt(0)) && ((m + 2 == y.length()) || Character.isUpperCase(doubleNexChar.charAt(0)))) {
                y = y.substring(0, m + 1) + newNumber + y.substring(m+2);
                m+=2;
            } else if (Character.isUpperCase(y.charAt(m))) {
                y = y.substring(0, m+1) + newNumber + y.substring(m+1);
                m++;
            }
        }

        return y;
    }

    public static String multiplyInParen(int x, String y) {

        int openParenCount = 0;
        for (int l = 0; l < y.length();l++) {
            int newNumber = 1;
            if (y.charAt(l) == '(') {
                openParenCount++;
            } else if (y.charAt(l) == ')') {
                openParenCount--;
            } else {
                if (openParenCount == 0 && Character.isDigit(y.charAt(l))) {
                    if (l < y.length() - 1 && Character.isDigit(y.charAt(l+1))) {
                        newNumber = Character.getNumericValue(y.charAt(l)) * 10 + Character.getNumericValue(y.charAt(l+1));
                    } else {
                        newNumber = Character.getNumericValue(y.charAt(l));
                    }
                    newNumber = x * newNumber;
                    if (newNumber > 10) {
                        y = y.substring(0, l) + newNumber + (l == y.length() - 1?"": y.substring(l+2));
                    } else {
                        y = y.substring(0, l) + newNumber + (l == y.length() - 1?"": y.substring(l+1));
                    }
                    if (newNumber >= 10) {
                        l++;
                    }
                    if (newNumber >= 100) {
                        l+=2;
                    }
                }
            }
        }
        return y;
    }

}

public class StringResult {
    public static String conversionFromArabicToRoman (int result){
        String stringResult = "";
        int roman1 = Number1.CheckingRomanNumber1();
        int roman2 = Number2.CheckingRomanNumber2();
        String hundreds [] = {"", "C"};
        String dozens [] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String units [] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        try {
            if (roman1 + roman2 == 2 && result == 0){
                throw new ArrayIndexOutOfBoundsException();
            } else {
                if (roman1 + roman2 == 2){
                    stringResult = hundreds [result / 100] + dozens[result % 100 / 10] + units[result % 100 % 10];
                } else { stringResult += result;}
                if (roman1 + roman2 == 1){
                    stringResult = "используются одновременно разные системы счисления";
                }

            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("в римской системе нет отрицательных чисел");
        }
        return stringResult;
    }
}

public class Number2 {
    static int roman2 = 0;
    public static int selectingNumber2FromString(String str){
        String number2 = "";
        for(int i = str.length() - 1; i > 0; i--){
            if (str.charAt(i) != '+' && str.charAt(i) != '*' && str.charAt(i) != '/' && str.charAt(i) != '-'){
                number2 = str.charAt(i) + number2;
            } else {break;}
        }
        switch (number2){
            case "I" :
                number2 = "1";
                roman2 = 1;
                break;
            case "II" :
                number2 = "2";
                roman2 = 1;
                break;
            case "III" :
                number2 = "3";
                roman2 = 1;
                break;
            case "IV" :
                number2 = "4";
                roman2 = 1;
                break;
            case "V" :
                number2 = "5";
                roman2 = 1;
                break;
            case "VI" :
                number2 = "6";
                roman2 = 1;
                break;
            case "VII" :
                number2 = "7";
                roman2 = 1;
                break;
            case "VIII" :
                number2 = "8";
                roman2 = 1;
                break;
            case "IX" :
                number2 = "9";
                roman2 = 1;
                break;
            case "X" :
                number2 = "10";
                roman2 = 1;
                break;
        }
        return Integer.parseInt(number2);
    }
    public static int CheckingRomanNumber2 (){
        return roman2;
    }

}

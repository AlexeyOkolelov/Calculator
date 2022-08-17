public class Number1 {
    static int roman1 = 0;
    public static int selectingNumber1FromString(String str){
        String number1 = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != '+' && str.charAt(i) != '*' && str.charAt(i) != '/' && str.charAt(i) != '-'){
                number1 += str.charAt(i);
            } else {break;}
        }
        switch (number1){
            case "I" :
                number1 = "1";
                 roman1 = 1;
                break;
            case "II" :
                number1 = "2";
                roman1 = 1;
                break;
            case "III" :
                number1 = "3";
                roman1 = 1;
                break;
            case "IV" :
                number1 = "4";
                roman1 = 1;
                break;
            case "V" :
                number1 = "5";
                roman1 = 1;
                break;
            case "VI" :
                number1 = "6";
                roman1 = 1;
                break;
            case "VII" :
                number1 = "7";
                roman1 = 1;
                break;
            case "VIII" :
                number1 = "8";
                roman1 = 1;
                break;
            case "IX" :
                number1 = "9";
                roman1 = 1;
                break;
            case "X" :
                number1 = "10";
                roman1 = 1;
                break;
        }
        return Integer.parseInt(number1);
    }
    public static int CheckingRomanNumber1 (){
        return roman1;
    }
}

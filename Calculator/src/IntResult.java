public class IntResult {
        public static int calculatingResult (String str, int number1, int number2) throws MoreThanOneSignException {
        String sign = "";
        int result = 0;
        int numberOfSign = 0;
        for (int i = 1; i < str.length(); i++ ){
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){
                sign += str.charAt(i);
                numberOfSign++;
            }
        }
        if (numberOfSign > 1){
            throw new MoreThanOneSignException();
                   }
        switch(sign){
            case("+"):
                result = number1 + number2;
                break;
            case("-"):
                result = number1 - number2;
                break;
            case("*"):
                result = number1 * number2;
                break;
            case("/"):
                result = number1 / number2;
                break;
        }
        return result;
    }

}

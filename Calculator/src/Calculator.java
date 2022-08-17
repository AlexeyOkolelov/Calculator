import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine()
                      .trim()
                      .replace(" ","");
        try {
            int number1 = Number1.selectingNumber1FromString(str);
            int number2 = Number2.selectingNumber2FromString(str);
            int result = IntResult.calculatingResult(str, number1, number2);
            String stringResult = StringResult.conversionFromArabicToRoman(result);
            System.out.println(stringResult);
        } catch (NumberFormatException e){
            System.out.println("строка не является математической операцией");
        } catch (MoreThanOneSignException e){
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

    }

}

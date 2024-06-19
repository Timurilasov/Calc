https://github.com/Timurilasov/Calc.git


import java.util.Scanner;


    public class Calculator {


        public static String calc(String input) {
            String[] inputArray = input.split(" ");

            int a = Integer.parseInt(inputArray[0]);
            String operation = inputArray[1];
            int b = Integer.parseInt(inputArray[2]);

            if (operation.equals("/") && b == 0) {
                throw new IllegalArgumentException("Ошибка: деление на ноль невозможно");
            }

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Числа должны быть от 1 до 10");
            }

            int result = 0;

            switch (operation) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Неверная операция");
            }

            return String.valueOf(result);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите арифметическое выражен");
            String input = scanner.nextLine();
            try {
                String result = calc(input);
                System.out.println("Результат: " + result);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }




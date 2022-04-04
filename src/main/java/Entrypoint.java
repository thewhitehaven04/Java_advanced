/**
 * @author German Bulavkin
 *
 * 1. Реализовать операции сложения, вычитания, умножения и деления для калькулятора из предыдущего задания
 *
 * 2. Поиск максимального элемента в массиве:
 * - задаем массив слов
 * - размерность массива произвольна, задается в консоли
 * - после чего в консоли вводятся слова в количестве равном заданной длине массива
 * - в полученном массиве необходимо найти самое длинное слово
 * - результат вывести на консоль
 *
 * 3. Программа должна выполнять одно из заданий на выбор.
 * - Если в консоли ввести 1 - запуститься выполнение калькулятора
 * - Если в консоли ввести 2 - поиск максимального слова в массиве
 */


import Calculator.CalculatorDispatch;
import LongestWord.FindLongestWord;

import java.util.Scanner;

public class Entrypoint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In order to exit, input 'exit' (without quotes).");
        System.out.println("Select one of the features: 1 - Calculator, 2 - find the longest string");

        String selection = in.nextLine();
        if (selection.equals("1")){
            CalculatorDispatch calculatorDispatch = new CalculatorDispatch();
            calculatorDispatch.run();
        }
        else if (selection.equals("2")){
            System.out.println("Input space-separated strings. The longest of these will be output.");
            String[] strings = in.nextLine().split(" ");
            FindLongestWord findLongestWord = new FindLongestWord(strings);
            System.out.printf("The longest string is: %s\n", findLongestWord.findLongest());
        }
    }
}

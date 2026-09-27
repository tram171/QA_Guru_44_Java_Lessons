package guru.qa;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Целочисленные типы
        byte aByte = 0; // 8b -128 +127
        short aShort = 0; // 16b -32768 +32767
        int aInt = 2; // 32b (-2^32) .. (+2^32 - 1)
        //Integer intWrapper = 2; чтобы был объектом
        long along = 0; // 64b (-2^64) .. (+2^64 - 1)

        //Типы с плавающей точкой
        float aFloat = 0.0F;
        double aDouble = 0.0;

        //Символьный тип
        char aChar = 'a'; // целочисленный
        //Character charWrapper = 'a'; чтобы был объектом

        //Логический тип
        boolean aBoolean = true;
        //Boolean booleanWrapper = true; чтобы был объектом

        //Строка (и еще куча объектных/ссылочных типов данных)
        String toBePrint = "Hello and welcome!";
        String toBeNoPrint = "Hello, but not welcome!";

        //Операторы
        //Оператор присвоения =

        //Арифметические операторы + - / * % ++ --
        System.out.println(4.0 + 3);
        System.out.println(5 / 3); //остаток отбрасывается, =1
        System.out.println(5 % 3); //показывает остаток от деления, =2
        System.out.println(5.0 / 3); //деление как double, =1.6666666666666667
        System.out.println(5.0 % 3); //показывает остаток от деления, но тип double, =2.0
        int result = ++aInt; //увеличивает на 1
        System.out.println(result);

        //Операторы сравнения >, <, >=, <=, !=, ==. Возвращают boolean
        System.out.println(3 == 2);
        //Объектные типы сравниваются с помощью .equals
        System.out.println(toBePrint.equals(toBeNoPrint));

        //Логические операторы &, |, &&, ||, !, ^
        System.out.println(toBePrint.equals("Hello and welcome!") && aInt == 3); //Оба истинны
        System.out.println(toBePrint.equals("Hello and welcome!") || aInt == 5); //Одно истинно
        System.out.println(!(toBePrint.equals("Hello and welcome!") && aInt == 3)); //Значение обратно полученному из сравнения

        //Оператор instanceof

        //Тернарный оператор, аналог if: проверить что-то прежде чем сделать
        char sex = 'm';
        String childName = sex == 'm' ? "Daniel" : "Daniella";
        System.out.println(childName);

        //Управляющая конструкция if
        char sex2 = 'm';
        if (sex2 == 'f') {
            childName = "Daniella";
        }
        else childName = "Daniel";
        System.out.println(childName);

        //Ключевое слово new - создание объектов
        // без new: List<String> teachers = List.of("Cat", "Dog");
        String name = new String("Kitten");

        System.out.println(toBePrint);

    }
}
package guru.qa;

public class JavaFirstHomeWork {
    public static void main(String... args) {
        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int aInt = 12;
        int bInt = 24;
        int ab = (bInt - aInt) * (aInt + bInt) - bInt / aInt;
        System.out.println("Task 0: (bInt - aInt) * (aInt + bInt) - bInt / aInt = " + ab);

        //1) применить несколько арифметических операций над int и double в одном выражении
        double aDouble = 54.98;
        System.out.println("Task 1: aDouble / aInt - (ab % aDouble) + bInt = " + (aDouble / aInt - (ab % aDouble) + bInt));

        //2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println("Task 2. Example 1: (aInt < bInt) is " + (aInt < bInt));
        System.out.println("Task 2. Example 2: (bInt == aDouble) is " + (bInt == aDouble));
        System.out.println("Task 2. Example 3: (aInt != bInt) is " + (aInt != bInt));
        System.out.println("Task 2. Example 4: (bInt >= aInt) is " + (bInt >= aInt));

        //3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
        System.out.println("Task 3. Example 1: Float max: " + Float.MAX_VALUE);
        System.out.println("Task 3. Example 2: Float min: " + Float.MIN_VALUE);
        System.out.println("Task 3. Example 3: Double max: " + Double.MAX_VALUE);
        System.out.println("Task 3. Example 4: Double min: " + Double.MIN_VALUE);

        //4) получить переполнение при арифметической операции
        Integer overInt = Integer.MAX_VALUE + 1;
        System.out.println("Task 4: " + overInt);
    }
}
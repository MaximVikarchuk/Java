package hw.lesson2;


 class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println("exercise1 : " + checkSN(3, 22));
        System.out.println("----------------");

        numPosNeg1(1);
        System.out.println("----------------");


        String result = (numPosNeg2(-3)) ? "positive" : "negative";
        System.out.println(result);
        System.out.println("----------------");


        stringAndNum("exercise4", 3);
        System.out.println("----------------");

        int year = 2018;
        System.out.println("year " + year + " is leap? " + isLeapYear(year));
        System.out.println("----------------");
    }
    // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    //    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean checkSN(int first, int second) {

        return (first + second >= 10) && (first + second <= 20);
    }


    // 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void numPosNeg1(int number) {
        if (number <= 0) {
        System.out.println(number + " negative ");
    } else {
            System.out.println(number + " positive ");
        }
    }


// 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
//    если число отрицательное, и вернуть false если положительное.

    public  static boolean numPosNeg2(int number1) {
        return (number1 < 0);
    }

    // 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
//    в консоль указанную строку, указанное количество раз;

    public static void stringAndNum(String value, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("string №" + i + ":" + value);

        }

    }

// 5. Написать метод, который определяет, является ли год високосный, и возвращает boolean (високосный - true,
//    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }


}
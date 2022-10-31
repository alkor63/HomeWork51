public class Main {
    public static void main(String[] args) {
// доп.задачки по переменным
// (6)
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * ( b + (c - d * e));
        result = -1 * result;
        System.out.println("Инвертированный результат = "+ result);
// (7)
        a = 5;
        b = 7;
        System.out.println("Было:  a = "+ a +", b = "+ b);
        a = b - a;
        b = b - a;
        a = b + a;
        System.out.println("Стало: a = "+ a +", b = "+ b);
// (8)
        a = 538;
        b = a % 100;
        b = b /10;
        System.out.println("В трехзначном числе "+ a +" вторая цифра = "+ b);

// Task 6*
        System.out.println("task 6 *");
// Определить лимит кредитной карты
        int age = 19;       // возраст клиента
        int salary = 58000; // месячная зарплата клиента
        double creditLimit; // лимит кредитки
        if (salary >= 80000) creditLimit = salary * 1.5;
        else if (salary >= 50000) creditLimit = salary * 1.2;
             else creditLimit = salary;
        if (age >= 23) creditLimit = creditLimit * 3;
        else creditLimit = creditLimit * 2;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+ creditLimit +" рублей");

// Task 7*
        System.out.println("task 7 *");
// Одобрить ли кредит заёмщику?
        age = 25;
        salary = 60000;
        int wantedSum = 330000;             // запрашиваемая сумма кредита
        double monthlyPayment;              // ежемесячный платеж по кредиту
        int maxMonthlyPay = salary / 2;     // максимально допустимый месячный платеж
        double creditRate = 10.;            // базовая ставка кредита, %
        if (salary > 80000) creditRate = creditRate - 0.7;
        if (age < 30) creditRate = creditRate + 0.5;
        if (age < 23) creditRate = creditRate + 0.5;
        monthlyPayment = wantedSum * (1 + creditRate/100) / 12;
        System.out.println("Максимальный платеж при ЗП "+salary+" равен "+maxMonthlyPay+" рублей");
        System.out.println("Платеж по кредиту "+ monthlyPayment +" рублей");
        if (monthlyPayment > maxMonthlyPay) System.out.println("В кредите отказано");
        else System.out.println("Кредит одобрен");

// 30.10ю2022 условнык операторы - повторение пройденного
        int x = 5;
        int y = 3;
        if (x < y) System.out.println("x < y");
        else if (x > y) System.out.println("x > y");
                else System.out.println("x = y");

        x = 7;
        if (x > 5 && x < 10) System.out.println("введенное число больше 5 и меньше 10");
        else System.out.println("введено неизвестное число");
// вариант 2 - через тернарный оператор
        String str = (x > 5 && x < 10) ? "введенное число больше 5 и меньше 10":"введено неизвестное число";
        System.out.println(str);

// deposit
        int deposit = 300;
        if (deposit < 100) creditRate = 5;
        else if (deposit > 200) creditRate = 10;
            else creditRate = 7;
        System.out.println("Сумма вклада с процентами = "+ deposit * (100+creditRate)/100);

// определить операцию по номеру
        x = 2;
        switch (x) {
            case 1: System.out.println("Выбранная операция 1 - сложение");
            break;
            case 2: System.out.println("Выбранная операция 2 - вычитание");
            break;
            case 3: System.out.println("Выбранная операция 3 - умножение");
            break;
            default: System.out.println("Выбранная неизвестная операция ");
        } // switch
    }
}
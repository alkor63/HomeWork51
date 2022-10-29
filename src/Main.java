public class Main {
    public static void main(String[] args) {
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
        int creditTerm = 12;                // срок кредитования, мес
        int wantedSum = 330000;             // запрашиваемая сумма кредита
        double monthlyPayment;              // ежемесячный платеж по кредиту
        int maxMonthlyPay = salary / 2;     // максимально допустимый месячный платеж
        double creditRate = 0.1;            // базовая ставка кредита
        if (salary > 80000) creditRate = creditRate - 0.007;
        if (age < 30) creditRate = creditRate + 0.005;
        if (age < 23) creditRate = creditRate + 0.005;
        monthlyPayment = wantedSum * (1 + creditRate) / creditTerm;
        System.out.println("Максимальный платеж при ЗП "+salary+" равен "+maxMonthlyPay+" рублей");
        System.out.println("Платеж по кредиту "+ monthlyPayment +" рублей");
        if (monthlyPayment > maxMonthlyPay) System.out.println("В кредите отказано");
        else System.out.println("Кредит одобрен");
    }
}
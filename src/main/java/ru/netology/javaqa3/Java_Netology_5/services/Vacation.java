package ru.netology.javaqa3.Java_Netology_5.services;

public class Vacation {
    int threshold = 20000;
    int money = 0;
    int count = 0;

    public int calculate(int income, int expense) {
        for (int i = 1; i < 12; i++) {
            if (money >= threshold) {
                count++;
                money = threshold - expense * 3;
            } else {
                money = money + income - expense;
            }
        }
        System.out.println("Я буду отдыхать " + count + " месяца в году");
        return count;
    }
}

package ru.netology.javaqa3.Java_Netology_5;

import org.junit.jupiter.api.Test;
import ru.netology.javaqa3.Java_Netology_5.services.Vacation;

public class VacationTest {

    @Test

    public void main() {

        Vacation monthVacation = new Vacation();
        System.out.println(monthVacation.calculate (10000, 3000));
    }
}

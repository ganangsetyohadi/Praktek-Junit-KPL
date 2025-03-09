package com.example.praktek_junit_kpl;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest {

    /*
     * Test Case 1: Pengujian Penambahan
     * Test ini memeriksa apakah fungsi penambahan pada kelas Calculator
     * dapat melakukan operasi penambahan dengan benar.
     * Kasus uji ini menggunakan dua bilangan positif (2 dan 2) dan
     * memastikan hasilnya adalah 4.
     */
    @Test
    public void addition_isCorrect() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    /*
     * Test Case 2: Pengujian Pengurangan
     * Test ini memeriksa apakah fungsi pengurangan pada kelas Calculator
     * dapat melakukan operasi pengurangan dengan benar.
     * Kasus uji ini menggunakan dua bilangan (10 dan 4) dan
     * memastikan hasilnya adalah 6.
     */
    @Test
    public void subtraction_isCorrect() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.subtract(10, 4));
    }
}
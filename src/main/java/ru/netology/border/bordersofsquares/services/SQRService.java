package ru.netology.border.bordersofsquares.services;

public class SQRService {

    public int calcSQR (int a, int b) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
                if ((i * i) >= a && (i * i) <= b) {
                    counter++;
                }
        }
        return counter;
    }
}

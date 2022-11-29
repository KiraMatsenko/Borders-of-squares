package ru.netology.border.bordersofsquares.services;

public class SQRService {

    public int calcSQR (int args) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
                if ((i * i) >= 200 && (i * i) <= 300) {
                    counter++;
                }
        }
        return counter;
    }
}

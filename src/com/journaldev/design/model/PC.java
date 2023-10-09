package com.journaldev.design.model;

// Класс PC (Персональный Компьютер), расширяющий абстрактный класс Computer
public class PC extends Computer {
    // Поля класса для хранения информации о RAM (оперативная память), HDD (жесткий диск) и CPU (процессор)
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса PC для инициализации полей RAM, HDD и CPU
    public PC(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Реализация абстрактного метода получения объема оперативной памяти
    @Override
    public String getRAM() {
        return this.ram;
    }

    // Реализация абстрактного метода получения объема жесткого диска
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // Реализация абстрактного метода получения информации о процессоре
    @Override
    public String getCPU() {
        return this.cpu;
    }
}

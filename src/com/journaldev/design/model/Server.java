package com.journaldev.design.model;

// Класс Server (Сервер), расширяющий абстрактный класс Computer
public class Server extends Computer {
    // Поля класса для хранения информации о RAM (оперативная память), HDD (жесткий диск) и CPU (процессор)
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса Server для инициализации полей RAM, HDD и CPU
    public Server(String ram, String hdd, String cpu) {
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

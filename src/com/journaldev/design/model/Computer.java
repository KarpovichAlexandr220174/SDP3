package com.journaldev.design.model;

// Абстрактный класс Computer (Компьютер)
public abstract class Computer {

    // Абстрактный метод для получения объема оперативной памяти
    public abstract String getRAM();

    // Абстрактный метод для получения объема жесткого диска
    public abstract String getHDD();

    // Абстрактный метод для получения информации о процессоре
    public abstract String getCPU();

    // Переопределенный метод toString() для представления объекта в виде строки
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}

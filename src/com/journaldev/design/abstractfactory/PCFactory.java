package com.journaldev.design.abstractfactory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;

// Класс PCFactory (Фабрика для создания Персональных Компьютеров), реализующий интерфейс ComputerAbstractFactory
public class PCFactory implements ComputerAbstractFactory {
    // Поля класса для хранения информации о RAM (оперативная память), HDD (жесткий диск) и CPU (процессор)
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса PCFactory для инициализации полей RAM, HDD и CPU
    public PCFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Реализация метода createComputer для создания объекта типа PC
    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}

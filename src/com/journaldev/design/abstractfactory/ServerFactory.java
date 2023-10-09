package com.journaldev.design.abstractfactory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.Server;

// Класс ServerFactory (Фабрика для создания Серверов), реализующий интерфейс ComputerAbstractFactory
public class ServerFactory implements ComputerAbstractFactory {
    // Поля класса для хранения информации о RAM (оперативная память), HDD (жесткий диск) и CPU (процессор)
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса ServerFactory для инициализации полей RAM, HDD и CPU
    public ServerFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Реализация метода createComputer для создания объекта типа Server
    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}

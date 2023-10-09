package com.journaldev.design.test;

import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;
import com.journaldev.design.model.Computer;

// Класс TestDesignPatterns (Тестовый класс для проверки шаблонов проектирования)
public class TestDesignPatterns {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    // Метод для тестирования абстрактной фабрики
    private static void testAbstractFactory() {
        // Создаем компьютеры с использованием фабрик PCFactory и ServerFactory через ComputerFactory
        Computer pc = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        // Выводим конфигурацию созданных компьютеров
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}

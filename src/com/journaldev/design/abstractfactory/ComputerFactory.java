package com.journaldev.design.abstractfactory;

import com.journaldev.design.model.Computer;

// Класс ComputerFactory (Фабрика для создания Компьютеров) с использованием абстрактной фабрики
public class ComputerFactory {
    // Метод getComputer, принимающий объект типа ComputerAbstractFactory и возвращающий созданный компьютер
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}

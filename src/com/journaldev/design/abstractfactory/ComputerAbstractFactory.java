package com.journaldev.design.abstractfactory;

import com.journaldev.design.model.Computer;

// Интерфейс ComputerAbstractFactory (Абстрактная Фабрика Компьютеров)
public interface ComputerAbstractFactory {
    // Метод createComputer для создания объекта типа Computer
    public Computer createComputer();
}

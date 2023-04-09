package io.slayer.hooks;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks {

    // run before each scenario
    // default order = 10000
    // with @Before method with smaller order is executed first
    // 1 (first), 10, 15, 100, 1000, 10000 (last)
    @Before
    public void prepareData() {
        System.out.println("Данные в БД добавлены");
    }

    @Before(order = 1000)
    public void connectToBD() {
        System.out.println("Подключение к БД установлено");
    }

    // run after each scenario
    // with @After method with bigger order is executed first
    // 10000 (first), 2000, 150, 10, 1 (last)
    @After(order = 11000)
    public void clearData() {
        System.out.println("Данные очищены");
    }

    @After
    public void bdDisconnect() {
        System.out.println("Подключение к БД остановлено");
    }

    // run before each step
    @BeforeStep
    public void beforeStep() {
        System.out.println("Before Step");
    }

    // run after each step
    @AfterStep
    public void afterStep() {
        System.out.println("After Step");
    }

}

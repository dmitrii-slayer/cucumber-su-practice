package io.slayer.hooks;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks {

    // run before each scenario
    @Before
    public void connectToBD() {
        System.out.println("Подключение к БД установлено");
    }

    // run after each scenario
    @After
    public void clearData() {
        System.out.println("Данные очищены");
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

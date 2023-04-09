package io.slayer.stepdefs;

import cucumber.api.java.ru.Допустим;

import java.time.LocalDate;

public class CustomTypeStepDefs {

    @Допустим("передадим в метод шага дату {localdate}")
    public void передадим_в_метод_шага_дату(LocalDate localdate) {
        System.out.println(localdate);
    }
}

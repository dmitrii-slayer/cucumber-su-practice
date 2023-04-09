package io.slayer.stepdefs;

import cucumber.api.java.ru.Допустим;
import io.slayer.User;

import java.time.LocalDate;
import java.util.List;

public class CustomTypeStepDefs {

    @Допустим("передадим в метод шага дату {localdate}")
    public void передадим_в_метод_шага_дату(LocalDate localdate) {
        System.out.println(localdate);
    }

    @Допустим("у нас есть пользователи")
    public void usersDataTable(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

}

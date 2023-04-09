package io.slayer.typeregistry;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableRowTransformer;
import io.slayer.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return new Locale("ru");
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<LocalDate>("localdate",
                "[0-9]{2}.[0-9]{2}.[0-9]{4}",
                LocalDate.class,
                new Transformer<LocalDate>() {
                    @Override
                    public LocalDate transform(String s) throws Throwable {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                        return LocalDate.parse(s, formatter);
                    }
                }));
        typeRegistry.defineDataTableType(new DataTableType(
                User.class,
                new TableRowTransformer<User>() {
                    @Override
                    public User transform(List<String> row) throws Throwable {
                        User user = new User();
                        user.setFirstName(row.get(0));
                        user.setLastName(row.get(1));
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                        user.setBirthDay(LocalDate.parse(row.get(2), formatter));
                        return user;
                    }
                }
        ));
    }
}

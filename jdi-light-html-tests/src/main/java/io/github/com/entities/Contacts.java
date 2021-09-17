package io.github.com.entities;


import com.epam.jdi.light.common.Order;
import com.jdiai.tools.DataClass;

public class Contacts extends DataClass<Contacts> {
    public String firstName, lastName, acceptConditions, position, passportNumber;
    public String passportSeria;
    @Order(1)
    public String description;
    @Order(2)
    public String gender;
    public String religion, weather;
    @Order(3)
    public boolean passport;
}

package model;

/**
 * @author Liu Jiaqi
 * @created 23.02.2018
 * @lastchange 23.02.2018
 */

import java.util.List;

public class World {
    private Object[][] obj;
    private List<Person> persons;

    World(Object[][] obj) {
        this.obj = obj;
    }

    void initialize(){
        for (Object obj: persons) {
        }
    }

    void sick(Person person){

    }
}

package model;
/**
 * @author Liu Jiaqi
 * @created 23.02.2018
 * @lastchange 23.02.2018
 */

public interface Animal {
    State state = State.HEALTHY;

    void infect(Animal animal);

    void infect(Person person);

    void getSick();

    void recover();

    void die();

    void getHealthy();

    State getState();
}

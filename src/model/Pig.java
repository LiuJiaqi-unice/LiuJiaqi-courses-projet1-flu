package model;

/**
 * @author Liu Jiaqi
 * @created 23.02.2018
 * @lastchange 23.02.2018
 */

public class Pig implements Animal {
    private State state;

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void getSick() {
        this.state = State.SICK;
    }

    @Override
    public void recover() {
        this.state = State.RECOVERING;
    }

    @Override
    public void die() {
        this.state = State.DEAD;
    }
    @Override
    public void getHealthy() {
        this.state = State.HEALTHY;
    }

    @Override
    public void infect(Animal animal) {
        if(animal.getState() == State.CONTAGIOUS) state= State.INFECTED;
    }

    @Override
    public void infect(Person person) {
        if(person.getState() == State.CONTAGIOUS) state= State.INFECTED;

    }
}

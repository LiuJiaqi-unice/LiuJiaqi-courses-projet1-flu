package model;

/**
 * @author Liu Jiaqi
 * @created 23.02.2018
 * @lastchange 23.02.2018
 */

enum State {
    HEALTHY("healthy"), INFECTED("infected"), SICK("sick"),
    CONTAGIOUS("contagious"), RECOVERING("recovering"), DEAD("dead");
    private String name;

    State(String name){
        this.name = name;
    }

    public String toString() {
        return this.name();
    }
}

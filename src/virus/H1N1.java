package virus;

/**
 * @author Liu Jiaqi
 * @created 23.02.2018
 * @lastchange 23.02.2018
 */

public class H1N1 extends Virus {
    H1N1(){
        this.sickTime = 5;
        this.contagiousTime = 5;
        this.recoveryTime = 4;

        this.infectionRate = 0.6;
        this.recoveryRate = 0.4;
        this.mortalityRate = 0.3;
    }
}

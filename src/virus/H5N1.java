package virus;

/**
 * @author Liu Jiaqi
 * @created 23.02.2018
 * @lastchange 23.02.2018
 */

public class H5N1 extends Virus {
    H5N1(){
        this.sickTime = 8;
        this.contagiousTime = 7;
        this.recoveryTime = 10;

        this.infectionRate = 0.7;
        this.recoveryRate = 0.3;
        this.mortalityRate = 0.5;
    }
}

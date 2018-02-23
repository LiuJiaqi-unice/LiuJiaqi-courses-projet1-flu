package virus;

/**
 * @author Liu Jiaqi
 * @created 23.02.2018
 * @lastchange 23.02.2018
 */

public abstract class Virus {
    int sickTime;
    int contagiousTime;
    int recoveryTime;

    double infectionRate;
    double recoveryRate;
    double mortalityRate;

    public int getSickTime(){ return sickTime; }
    public int getContagiousTime(){ return contagiousTime; }
    public int getRecoveryTime(){ return recoveryTime; }

    public double getInfectionTime(){ return infectionRate; }
    public double getRecoveryRate(){ return recoveryRate; }
    public double getMortalityRate(){ return mortalityRate;}
}

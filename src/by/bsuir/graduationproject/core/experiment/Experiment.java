package by.bsuir.graduationproject.core.experiment;

/**
 * @author l.zverugo Date: 29.04.14 Time: 14:29.
 */
public class Experiment {
    private int number;
    private double time;

    public Experiment(int number, double time) {
        this.number = number;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}

package by.bsuir.graduationproject.core.session;

import by.bsuir.graduationproject.core.user.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author l.zverugo Date: 29.04.14 Time: 14:48.
 */
public class InternalSession {
    private User user;
    private Date dateTimeRegister;
    private List<Double> attempts = new ArrayList<Double>();
    private int attemptsNumber = 0;

    public InternalSession(User user) {
        this.user = user;
        setDateTimeRegister();
    }

    private void setDateTimeRegister() {
        dateTimeRegister = Calendar.getInstance().getTime();
    }

    public void addAttempt(double time) {
        attemptsNumber++;
        attempts.add(time);
    }

    public User getUser() {
        return user;
    }

    public Date getDateTimeRegister() {
        return dateTimeRegister;
    }

    public List<Double> getAttempts() {
        return attempts;
    }

    public int getAttemptsNumber() {
        return attemptsNumber;
    }
}

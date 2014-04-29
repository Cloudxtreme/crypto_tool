package by.bsuir.graduationproject.core.converter;

import by.bsuir.graduationproject.core.experiment.Experiment;
import by.bsuir.graduationproject.core.session.InternalSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l.zverugo Date: 29.04.14 Time: 15:10.
 */
public class SessionToExperimentsConverter {
    public List<Experiment> convert(InternalSession session) {
        List<Experiment> experiments = new ArrayList<Experiment>();

        for (int i = 0; i < session.getAttempts().size(); i++) {
            Experiment experiment = new Experiment(i + 1, session.getAttempts().get(i));
            experiments.add(experiment);
        }

        return experiments;
    }
}

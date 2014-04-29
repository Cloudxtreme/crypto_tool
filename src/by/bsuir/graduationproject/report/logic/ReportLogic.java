package by.bsuir.graduationproject.report.logic;

import by.bsuir.graduationproject.common.utils.ApplicationPropertiesUtils;
import by.bsuir.graduationproject.common.utils.CommonKeys;
import by.bsuir.graduationproject.core.converter.SessionToExperimentsConverter;
import by.bsuir.graduationproject.core.experiment.Experiment;
import by.bsuir.graduationproject.core.session.InternalSession;
import by.bsuir.graduationproject.core.user.User;
import by.bsuir.graduationproject.report.gui.utils.ReportKeys;
import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author l.zverugo Date: 29.04.14 Time: 14:00.
 */
public class ReportLogic {

    public void processFullReportAction(InternalSession session) {
        buildReport(session);
    }

    private void buildReport(InternalSession session) {
        Collection report = new LinkedList();
        SessionToExperimentsConverter converter = new SessionToExperimentsConverter();
        List<Experiment> experiments = converter.convert(session);
        for (int i = 0; i < experiments.size(); i++) {
            report.add(experiments.get(i));
        }
        Map beans = new HashMap();
        beans.put(CommonKeys.EXPERIMENT, report);
        generateOutputFile(session, beans);
    }

    private void generateOutputFile(InternalSession session, Map beans) {
        User user = session.getUser();

        String fullReportPath = ApplicationPropertiesUtils.getStringProperty(ReportKeys.FULL_REPORT_PATH);
        String fullReportTemplatePath =
                ApplicationPropertiesUtils.getStringProperty(ReportKeys.FULL_REPORT_TEMPLATE_PATH);

        XLSTransformer transformer = new XLSTransformer();
        try {
            transformer.transformXLS(fullReportTemplatePath, beans, fullReportPath
                    + buildDestinationFileName(user));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }

    private String buildDestinationFileName(User user) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        temp.append(user.getLastName()).append(CommonKeys.UNDERLINE).append(user.getFirstName());

        result.append(temp).append(CommonKeys.BACKSLASH).append(temp).append(CommonKeys.DOT).append(CommonKeys.XLS);

        return result.toString();
    }
}

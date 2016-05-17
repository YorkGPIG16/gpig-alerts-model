package gpig.group2.models.alerts;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by james on 17/05/2016.
 */

@XmlRootElement(name="alerts")
public class AlertMessage {
    @XmlElement(name="alert")
    public List<Alert> alerts;
}

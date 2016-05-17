package gpig.group2.models.alerts;

import javax.xml.bind.annotation.*;

/**
 * Created by james on 17/05/2016.
 */

@XmlRootElement(name="action")
public class Action {

    @XmlAttribute(name="status")
    public ActionStatus status;

    @XmlElement(name="message")
    public String message;
}

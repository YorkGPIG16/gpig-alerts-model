package gpig.group2.models.alerts;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 17/05/2016.
 */

@XmlRootElement(name="alert")
public class Alert {
    @XmlAttribute(name="id")
    public Integer id;

    @XmlElement(name="action")
    public Action action = Action.ACTION_NOT_ACTIONED;

    @XmlAttribute(name="priority")
    public Priority priority;

    @XmlElement(name="message")
    public String message;
}

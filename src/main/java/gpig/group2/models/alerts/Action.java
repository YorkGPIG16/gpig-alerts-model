package gpig.group2.models.alerts;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 17/05/2016.
 */

@XmlRootElement(name="action")
public class Action {

    @XmlElement(name="status")
    public ActionStatus status;
    
    @XmlElement(name="message")
    public String message;
}

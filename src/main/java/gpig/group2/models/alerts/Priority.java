package gpig.group2.models.alerts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Created by james on 17/05/2016.
 */

@XmlEnum
public enum Priority {
    @XmlEnumValue("low")
    PRIORITY_LOW,

    @XmlEnumValue("medium")
    PRIORITY_MEDIUM,


    @XmlEnumValue("high")
    PRIORITY_HIGH,

}

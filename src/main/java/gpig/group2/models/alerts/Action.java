package gpig.group2.models.alerts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Created by james on 17/05/2016.
 */

@XmlEnum
public enum Action {

    @XmlEnumValue("not-actioned")
    ACTION_NOT_ACTIONED,

    @XmlEnumValue("ignore")
    ACTION_IGNORE,

    @XmlEnumValue("actioned")
    ACTION_ACTIONED,

}

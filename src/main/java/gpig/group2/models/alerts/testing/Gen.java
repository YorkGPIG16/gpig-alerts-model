package gpig.group2.models.alerts.testing;

import gpig.group2.models.alerts.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;

/**
 * Created by james on 17/05/2016.
 */
public class Gen {
    public static void main(String[] args) {
        Alert a = new Alert();
        a.id=444;
        a.message="This is an alert";
        a.priority = Priority.PRIORITY_HIGH;

        Alert b = new Alert();
        b.id=444;
        b.message="This is an alert";
        b.priority = Priority.PRIORITY_HIGH;
        b.action = new Action();
        b.action.message = "Message";
        b.action.status = ActionStatus.ACTION_ACTIONED;


        AlertMessage msg = new AlertMessage();
        msg.alerts = new ArrayList<>();
        msg.alerts.add(a);
        msg.alerts.add(b);

        StringWriter sw = new StringWriter();
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(AlertMessage.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(msg, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(sw);

    }
}

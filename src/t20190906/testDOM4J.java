package t20190906;

/*
测试DOM4J
 */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class testDOM4J {
    public static void main(String[] args) {
//        SAXReader reader = new SAXReader();
        String text = "<person> <name>James</name> </person>";
        try {
            Document document = DocumentHelper.parseText(text);
            Element rootElement = document.getRootElement();


            //System.out.printf("root element name=%s, value=%s\n", rootElement.getName(), rootElement.getText());
        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }
}

package t20190904;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class testXML {
    public static void main(String[] args) {
        testXML that = new testXML();
        that.xmlParse1();
//        that.xmlParse2();
    }

    public void xmlParse1() {
        System.out.println("xml-parse1 start");

        String xml = "<bookstore attr1=\"value1\">\n" +
                "<book category=\"CHILDREN\">\n" +
                "  <title>Harry Potter</title> \n" +
                "  <author>J K. Rowling</author> \n" +
                "  <year>2005</year> \n" +
                "  <price>29.99</price> \n" +
                "</book>\n" +
                "<book category=\"WEB\">\n" +
                "  <title>Learning XML</title> \n" +
                "  <author>Erik T. Ray</author> \n" +
                "  <year>2003</year> \n" +
                "  <price>39.95</price> \n" +
                "</book>\n" +
                "</bookstore>";
        InputStream stream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        System.out.println("parse start");

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(stream);

            //根节点名称和其中的属性
            Node bookstore = document.getElementsByTagName("bookstore").item(0);
            String attrValue = bookstore.getAttributes().getNamedItem("attr1").getNodeValue();
            System.out.printf("root name=%s, attribute attr1=%s\n", bookstore.getNodeName(), attrValue);

            //获取 book 列表
            NodeList books = ((Element) bookstore).getElementsByTagName("book");
            //第一个book的 attribute category 值
            System.out.println("book1 attribute category="+
                    books.item(0).getAttributes().getNamedItem("category").getTextContent()+"\n");

            //打印 book 列表
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                System.out.println("book name="+book.getNodeName());
                NodeList properties = book.getChildNodes();
                for (int j = 0; j < properties.getLength(); j++) {
                    Node property = properties.item(j);
                    if (!property.getNodeName().equals("#text")) {
                        System.out.printf("node name=%s, value=%s\n", property.getNodeName(), property.getTextContent());
                    }
                }
                System.out.println();
            }



//            //获取根元素信息
//            Element element = document.getDocumentElement();
//            String tag = element.getTagName();
//            String attr1 = element.getAttribute("attr1");
//            System.out.println("document tag="+tag+", attribute attr1="+attr1);
//
//
//            NodeList childNodes = element.getChildNodes();
//            for (int i = 0; i < childNodes.getLength(); i++) {
//                Node node = childNodes.item(i);
//                String nodeName = node.getNodeName();
//                if (!nodeName.equals("#text")) {
//                    //System.out.printf("node=%s, value=%s\n", node.getNodeName(), node.getTextContent());
//                    NodeList childNodes1 = node.getChildNodes();
//                    for (int j = 0; j < childNodes1.getLength(); j++) {
//                        Node node1 = childNodes1.item(j);
//                        if (!node1.getNodeName().equals("#text")) {
//                            System.out.printf("node=%s, value=%s\n", node1.getNodeName(), node1.getTextContent());
//                        }
//                    }
//                }
//            }




//            NodeList childNodes = document.getChildNodes();
//            for (int i = 0; i < childNodes.getLength(); i++) {
//
//
//
//
//                Node node = childNodes.item(0);
//                System.out.printf("child-node level1 name=%s, value=%s\n", node.getNodeName(), node.getNodeValue());
//
//                NodeList nodes = node.getChildNodes();
//                for (int j = 0; j < nodes.getLength(); j++) {
//                    Node node1 = nodes.item(j);
//                    System.out.printf("child-node level2 name=%s, value=%s\n", node1.getNodeName(), node1.getNodeValue());
//
////                    NodeList employeeMeta = node1.getChildNodes();
////                    for (int k = 0; k < employeeMeta.getLength(); k++) {
////                        System.out.println(employeeMeta.item(k).getNodeName() + ":" + employeeMeta.item(k).getTextContent());
////                    }
//                }
//            }

//            Node firstChild = element.getFirstChild();
//            System.out.printf("first-node type=%s, name=%s, value=%s",
//                    firstChild.getNodeType(), firstChild.getNodeName(), firstChild.getNodeValue());

//            NodeList nodeList = element.getChildNodes();
//            Node item = nodeList.item(0);
//            System.out.println("item attributes="+item.getAttributes()+", node="+item);
//            String nodeName = item.getNodeName();
//            String nodeValue = item.getNodeValue();
//            System.out.println("node-name="+nodeName+", node-value="+nodeValue);


//            NodeList employees = document.getChildNodes();
//            for (int i = 0; i < employees.getLength(); i++) {
//                Node employee = employees.item(i);
//                NodeList employeeInfo = employee.getChildNodes();
//                for (int j = 0; j < employeeInfo.getLength(); j++) {
//                    Node node = employeeInfo.item(j);
//                    NodeList employeeMeta = node.getChildNodes();
//                    for (int k = 0; k < employeeMeta.getLength(); k++) {
//                        System.out.println(employeeMeta.item(k).getNodeName() + ":" + employeeMeta.item(k).getTextContent());
//                    }
//                }
//            }

            System.out.println("解析完毕");

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

    public void xmlParse2() {
        System.out.println("xml-parse2 start");

        String xml = "<note>aaa\n" +
                "<to>George</to>bbb\n" +
                "<from>John</from>ccc\n" +
                "<body>Don't forget the meeting!</body>ddd\n" +
                "</note>";

        try {
            InputStream stream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(stream);

            //根节点
            Node root = document.getFirstChild();
            System.out.printf("root name=%s\n", root.getNodeName());

            //获取指定节点
            Node to = document.getElementsByTagName("to").item(0);
            System.out.printf("to, name=%s, value=%s", to.getNodeName(), to.getTextContent());

//            NodeList childNodes = root.getChildNodes();
//            for (int i = 0; i < childNodes.getLength(); i++) {
//                Node item = childNodes.item(i);
//                System.out.printf("for 1, type=%s, name=%s, value=%s, content-context=%s\n",
//                        item.getNodeType(), item.getNodeName(), item.getNodeValue(), item.getTextContent());
//            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }
}

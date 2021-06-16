import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class XMLUtil {
    public static Object getBean(String args) {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            NodeList nl = doc.getElementsByTagName("ClassName");
            Node classNode = null;
            if(args.equals("color")){
                classNode = nl.item(0).getFirstChild();
            }
            else if(args.equals("pen")){
                classNode = nl.item(1).getFirstChild();
            }
            String className = classNode.getNodeValue();

            Class c=Class.forName(className);
            Object obj=c.getDeclaredConstructor().newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


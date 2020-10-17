package factory;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class ReadXML1
{
    //�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
    public static Object getObject(String type)
    {
        try
        {
            //�����ĵ�����
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;                           
            doc=builder.parse(new File("src/factory/config1.xml"));        
            //��ȡ�����������ı��ڵ�
            NodeList nl=doc.getElementsByTagName("className");
         //   Node classNode=nl.item(0).getFirstChild();
           // String cName="factory."+classNode.getNodeValue();
           // System.out.println("��������"+cName);
            //ͨ����������ʵ�����󲢽��䷵��
            for(int i = 0;i < nl.getLength();i++) {
				String cName = nl.item(i).getFirstChild().getNodeValue();
				if(cName.equals(type)) {
					Class c = Class.forName("factory."+cName);
					Object obj = c.newInstance();		
					return obj;
				}
			}
            return null;
//            Class c=Class.forName(cName);
//              Object obj=c.newInstance();
//            return obj;
         }  
         catch(Exception e)
         {
                   e.printStackTrace();
                   return null;
         }
    }
}

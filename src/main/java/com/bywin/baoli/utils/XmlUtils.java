package com.bywin.baoli.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class XmlUtils {


    /**
     * 转换对象到String类型
     *
     * @param obj
     * @return
     */
    public static String objCvrt2Str(Object obj) {

        String res = "";
        ByteArrayOutputStream ous = null;
        try {
            ous = new ByteArrayOutputStream();
            JAXBContext jc0 = JAXBContext.newInstance(obj.getClass());
            Marshaller m = jc0.createMarshaller();

            m.marshal(obj, ous);
            res = ous.toString("UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ous.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return res;

    }

    /**
     * 将String类型的xml转换成对象
     */
    public static <T> T convertXmlStrToObject(Class<T> cls, String xmlStr) {
        Object xmlObject = null;
        try {
            JAXBContext context = JAXBContext.newInstance(cls);
            // 进行将Xml转成对象的核心接口  
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader sr = new StringReader(xmlStr);
            xmlObject = unmarshaller.unmarshal(sr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return (T) xmlObject;
    }


}

package com.protry.city.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author protry
 */
public class XmlBuilder {

    /**
     * 将XML转为指定的POJO
     * @param clazz
     * @param xmlStr
     * @return
     */
    public static Object xmlStrToObject(Class<?> clazz, String xmlStr) {

        try (Reader reader = new StringReader(xmlStr)){

            JAXBContext context = JAXBContext.newInstance(clazz);
            // XML 转为对象的接口
            Unmarshaller unmarshaller = context.createUnmarshaller();

            return unmarshaller.unmarshal(reader);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}

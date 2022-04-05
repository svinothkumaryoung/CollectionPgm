package com.cognizant.collectionPgm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainpgm {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionData.xml");
        StudentCollection studentCollection = (StudentCollection) context.getBean("collection");
        studentCollection.printData();
    }
}



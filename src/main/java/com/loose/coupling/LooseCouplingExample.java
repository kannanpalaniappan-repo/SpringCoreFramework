package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
//        UserDataProvider userDataProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(userDataProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceDataProvider);
//        System.out.println(userManagerWithWS.getUserInfo());
//
//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
//        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
//        System.out.println(userManagerWithNewDB.getUserInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");
        UserManager userManager = (UserManager) context.getBean("userManager");
        System.out.println(userManager.getUserInfo());
    }
}

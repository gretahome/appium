package Android.testNGdemo;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.*;

public class app2 {
    @AfterSuite
    public void beforesuite(){

        System.out.println("lnbeforesuite");
    }

    @AfterClass
    public void beforeClass(){

        System.out.println("beforeClass");


    }
    @Test
    public void beforeGroups(){
        List<User> userlist = new ArrayList<User>();
        User user1 = new User();
        User user2 = new User();
        user1.setName("greta");
        user1.setAge(24);
        user2.setName("kate");
        user2.setAge(24);
        userlist.add(user1);
        userlist.add(user2);

        Map<Integer,User> maps = new HashMap<Integer, User>();
        for(User user:userlist){
            maps.put(user.getAge(),user);


        }
        Collection<User> collvalue = maps.values();
        int size = collvalue.size();
        while(maps.keySet().iterator().hasNext()){
           String key =  maps.keySet().iterator().next().toString();


        }

        System.out.println(maps.get(user1));

        System.out.println("beforeGroups");

    }
    @AfterMethod
    public void beforeMethod(){

        System.out.println("beforeMethod");

    }
    @AfterTest
    public void beforeTest(){

        System.out.println("beforeTest");

    }
    @Test
    public void TestApp(){

        System.out.println("TestApp2");

    }
}

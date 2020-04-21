package com.sun3d.why.demo;


import java.time.Clock;
import java.time.Instant;
import java.util.*;

/**
 * Created by xiech on 2018/2/23 0023.
 */
public class DemoClass implements DemoInterface {

    @Override
    public double calculate(int a) {
        return sqrt(a);
    }


    public static void main(String[] args) {

     /*   DemoInterface demoInterface=new DemoInterface() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };
        double a1= demoInterface.calculate(100);
        double a2=demoInterface.sqrt(16);
        System.out.println(a1);
        System.out.println(a2);*/


        List<String> names= Arrays.asList("peter","anna","mike","xenia");
    /*    Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });*/


        /*Collections.sort(names,(String a,String b)->{
            return b.compareTo(a);
        });*/
        // Collections.sort(names,(String a,String b)->b.compareTo(a));

  /*      Collections.sort(names,( a, b)->b.compareTo(a));

        System.out.println(names.toString());*/
        //Converter<String,Integer> converter=(f)-> Integer.valueOf(f);

/*  Converter<String,Integer> converter1=new Converter<String, Integer>() {
      @Override
      public Integer convert(String s) {
          return Integer.valueOf(s);
      }
  };*/
/*Converter<String,Integer> converter=Integer::valueOf;
    Integer c=converter.convert("123");
  System.out.println(c);*/
   /*     Clock clock=Clock.systemDefaultZone();
        System.out.println(clock);
        long millis=clock.millis();
        System.out.println(millis);
        Instant instant=clock.instant();
        System.out.println(instant);
        Date f=Date.from(instant);
        System.out.println(f);*/
        System.out.println(new Date().getTime());
        for (String name : names) {
            System.out.println(new Date().getTime());
        }
        System.out.println(new Date().getTime());
        names.forEach(o ->{
            System.out.println(new Date().getTime());
        });
        System.out.println(new Date().getTime());
    }
}

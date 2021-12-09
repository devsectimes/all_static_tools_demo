package com.devsectimes.staticdemo.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class HelloStaticWorld {

  public static void main(String[] args ) {

      System.out.println("Hello Static World (Java 9 style)");
      HelloStaticWorld h=new HelloStaticWorld();
      System.out.println("Total ="+h.add(args));

  }

public int add(String... args) {

    List<Integer> arglist = new ArrayList<>();

    for(int i=0;i<args.length;i++) {
      arglist.add(Integer.parseInt(args[i]));
    }

    int total=0;

    Iterator<Integer> i=arglist.iterator();

    while(i.hasNext()) {
      total+=i.next();
    }

    return total;
  }

}

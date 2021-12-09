package com.devsectimes.staticdemo.java8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestHelloStaticWorld {

  @Test
  public void testSum() {

      HelloStaticWorld h=new HelloStaticWorld();
      int result=h.add("1","2","3","4","5");

      assertEquals(15,result);

  }

}

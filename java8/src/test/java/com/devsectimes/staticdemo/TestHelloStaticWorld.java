package com.devsectimes.staticdemo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestHelloStaticWorld {

  @Test
  public void testSum() {

      HelloStaticWorld h=new HelloStaticWorld();
      int result=h.add("1","2","3","4","5");

      assertEquals(15,result);

  }

}

package de.lamosoft.bosstest;

import java.util.Arrays;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class SimpleCalls {

  public void test( String[][] params, Function<String, String> f ) {

    Arrays.stream( params ).forEach( line -> {

      String expected = line[ 0 ];
      String param = line[ 1 ];
      String actual = f.apply( param );
      assertEquals( expected, actual );

    });

  }

}

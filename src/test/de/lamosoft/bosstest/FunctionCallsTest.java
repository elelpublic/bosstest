package de.lamosoft.bosstest;

import org.junit.ComparisonFailure;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FunctionCallsTest {

  @Test(expected = ComparisonFailure.class)
  public void testSomeSimpleCalls() {

    SimpleCalls calls = new SimpleCalls();
    String[][] params = {
      { "ABC", "abc" }
      , { "abc", "aBc" }
    }; 

    calls.test( params, in -> in.toUpperCase() );

  }

}


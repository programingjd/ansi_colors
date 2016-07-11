package info.jdavid.ansi.colors;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

  @Test public void testColors() {
    for(final Colors c: Colors.values()) {
      System.out.println(c.foreground(c.name() + " Foreground"));
      System.out.println(c.background(c.name() + " Background"));
    }
    System.out.println(Colors.colored(Colors.RED, Colors.WHITE, "Red on white."));
  }

}

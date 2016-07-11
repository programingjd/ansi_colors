package info.jdavid.ansi.colors;


public enum Colors {
    BLACK((byte)0), RED((byte)1), GREEN((byte)2), YELLOW((byte)3), BLUE((byte)4),
    MAGENTA((byte)5), CYAN((byte)6), WHITE((byte)7);

  private final byte index;

  private Colors(final byte index) {
    this.index = index;
  }

  public String fg(final String text) {
    return foreground(this, text);
  }

  public String foreground(final String text) {
    return foreground(this, text);
  }

  public String bg(final String text) {
      return background(this, text);
  }

  public String background(final String text) {
    return background(this, text);
  }

  public static String fg(final Colors c, final String text) {
    return foreground(c, text);
  }

  public static String foreground(final Colors c, final String text) {
    return "\u001b[3" + c.index + "m" + text + "\u001b[0m";
  }

  public static String bg(final Colors c, final String text) {
    return foreground(c, text);
  }

  public static String background(final Colors c, final String text) {
    return "\u001b[4" + c.index + "m" + text + "\u001b[0m";
  }

  public static String colored(final Colors fg, final Colors bg, final String text) {
    return "\u001b[3" + fg.index + ";4" + bg.index + "m" + text + "\u001b[0m";
  }

}

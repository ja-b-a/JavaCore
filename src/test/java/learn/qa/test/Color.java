package learn.qa.test;

public enum Color {
  RED("Red"),
  TERRACOTTA("Terracotta"),
  BROWN("Brown"),
  SIENNA("Sienna"),
  SEPIA("Sepia"),
  ORANGE("Orange"),
  YELLOW("Yellow"),
  GREEN("Green"),
  LIGHT_BLUE("LightBlue"),
  BLUE("Blue"),
  VIOLET("Violet"),
  BLACK("Black"),
  WHITE("White"),
  GRAY("Gray"),
  SILVER("Silver"),
  PEACHY("Peachy"),
  BEIGE("Beige"),
  CREAMY("Creamy"),
  SALAD("Salad"),
  CABBAGE("Cabbage"),
  EMERALD("Emerald"),
  DARK_GREEN("DarkGreen"),
  OLIVE("Olive"),
  GOLD("Gold"),
  FOREST_GREEN("ForestGreen");

  private final String text;

  Color(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  @Override
  public String toString() {
    return text;
  }
}
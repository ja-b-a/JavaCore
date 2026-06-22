package learn.qa.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Задачи 1-7 ArrayList")
class ArrayListTest {

  @Test
  @DisplayName("Создание списка цветов")
  void test1() {
    List<Color> colorList = new ArrayList<>();
    colorList.add(Color.RED);
    colorList.add(Color.TERRACOTTA);
    colorList.add(Color.BROWN);
    colorList.add(Color.SIENNA);
    colorList.add(Color.SEPIA);
    System.out.println(colorList);
  }

  @Test
  @DisplayName("Обрезка строк длиннее 3 символов")
  void test2() {
    List<String> colorList = new ArrayList<>();
    colorList.add(Color.RED.getText());
    colorList.add(Color.TERRACOTTA.getText());
    colorList.add(Color.BROWN.getText());
    colorList.add(Color.SIENNA.getText());
    colorList.add(Color.SEPIA.getText());
    for (int i = 0; i < colorList.size(); i++) {
      String color = colorList.get(i);
      if (color.length() > 3) {
        colorList.set(i, color.substring(0, 3));
      }
    }
    System.out.println(colorList);
  }

  @Test
  @DisplayName("Удаление четных элементов из списка")
  void test3() {
    List<String> colorList = new ArrayList<>();
    colorList.add(Color.RED.getText());
    colorList.add(Color.ORANGE.getText());
    colorList.add(Color.YELLOW.getText());
    colorList.add(Color.GREEN.getText());
    colorList.add(Color.LIGHT_BLUE.getText());
    colorList.add(Color.BLUE.getText());
    colorList.add(Color.VIOLET.getText());
    colorList.add(Color.BLACK.getText());
    colorList.add(Color.WHITE.getText());
    colorList.add(Color.GRAY.getText());
    for (int i = colorList.size() - 1; i >= 0; i--) {
      if (i % 2 != 0) {
        colorList.remove(i);
      }
    }
    System.out.println(colorList);
  }

  @Test
  @DisplayName("Замена Blue на Black, если Blue найден")
  void test4() {
    List<String> colorList = new ArrayList<>();
    colorList.add(Color.RED.getText());
    colorList.add(Color.GREEN.getText());
    colorList.add(Color.BLUE.getText());
    colorList.add(Color.WHITE.getText());
    colorList.add(Color.YELLOW.getText());
//    colorList.add(Color.BLACK.getText());

    replaceColor(colorList, Color.BLUE.getText(), Color.BLACK.getText());
    System.out.println(colorList);
  }

  private static void replaceColor(List<String> colorList, String colorToReplace,
      String replacementColor) {
    if (colorList.contains(replacementColor)) {
      System.out.println(replacementColor + " already exists");
    } else {
      for (int i = 0; i < colorList.size(); i++) {
        if (colorList.get(i).equals(colorToReplace)) {
          colorList.set(i, replacementColor);
        }
      }
    }
  }

  @Test
  @DisplayName("Вывод элементов с 3 по 7 включительно")
  void test5() {
    List<String> colorList = new ArrayList<>();
    colorList.add(Color.RED.getText());
    colorList.add(Color.ORANGE.getText());
    colorList.add(Color.YELLOW.getText());
    colorList.add(Color.GREEN.getText());
    colorList.add(Color.LIGHT_BLUE.getText());
    colorList.add(Color.BLUE.getText());
    colorList.add(Color.VIOLET.getText());
    colorList.add(Color.BLACK.getText());
    colorList.add(Color.WHITE.getText());
    colorList.add(Color.GRAY.getText());
    for (int i = 2; i <= 6; i++) {
      System.out.println(colorList.get(i));
    }
  }

  @Test
  @DisplayName("Объединение, сортировка и удаление дубликатов двух списков")
  void test6() {
    List<String> colorListOne = new ArrayList<>();
    colorListOne.add(Color.PEACHY.getText());
    colorListOne.add(Color.BEIGE.getText());
    colorListOne.add(Color.SILVER.getText());
    colorListOne.add(Color.ORANGE.getText());
    colorListOne.add(Color.CREAMY.getText());

    List<String> colorListTwo = new ArrayList<>();
    colorListTwo.add(Color.GREEN.getText());
    colorListTwo.add(Color.SALAD.getText());
    colorListTwo.add(Color.CABBAGE.getText());
    colorListTwo.add(Color.SILVER.getText());
    colorListTwo.add(Color.EMERALD.getText());

    List<String> mergedList = new ArrayList<>();
    mergedList.addAll(colorListOne);
    mergedList.addAll(colorListTwo);

    mergedList.sort(null);

    mergedList = new ArrayList<>(new LinkedHashSet<>(mergedList));
    System.out.println(mergedList);
  }

  @Test
  @DisplayName("Сравнение двух списков по трём критериям")
  void test7() {
    List<String> colorListOne = new ArrayList<>();
    colorListOne.add(Color.GREEN.getText());
    colorListOne.add(Color.DARK_GREEN.getText());
    colorListOne.add(Color.GREEN.getText());

    List<String> colorListTwo = new ArrayList<>();
    colorListTwo.add(Color.WHITE.getText());
    colorListTwo.add(Color.OLIVE.getText());
    colorListTwo.add(Color.GOLD.getText());
    colorListTwo.add(Color.FOREST_GREEN.getText());
    colorListTwo.add(Color.GREEN.getText());

//    colorListTwo.add(Color.GREEN.getText());
//    colorListTwo.add(Color.DARK_GREEN.getText());
//    colorListTwo.add(Color.GREEN.getText());

    if (hasSameSize(colorListOne, colorListTwo)) {
      System.out.println("colorListOne и colorListTwo имеют одинаковое количество элементов");
    } else {
      System.out.println("colorListOne и colorListTwo имеют разное количество элементов в списке");
    }

    if (hasSameElement(colorListOne, colorListTwo)) {
      System.out.println("Все элементы colorListOne присутствуют в colorListTwo");
    } else {
      System.out.println("Не все элементы colorListOne присутствуют в colorListTwo");
    }

    if (hasSameOrder(colorListOne, colorListTwo)) {
      System.out.println("Все элементы colorListOne присутствуют в colorListTwo в том же порядке");
    } else {
      System.out.println("Элементы colorListOne и colorListTwo присутствуют в разном порядке");
    }
  }

  private static boolean hasSameSize(List<String> colorListOne, List<String> colorListTwo) {
    return colorListOne.size() == colorListTwo.size();
  }

  private static boolean hasSameElement(List<String> colorListOne, List<String> colorListTwo) {
    List<String> sortedListOne = new ArrayList<>(colorListOne);
    List<String> sortedListTwo = new ArrayList<>(colorListTwo);
    Collections.sort(sortedListOne);
    Collections.sort(sortedListTwo);
    return sortedListOne.equals(sortedListTwo);
  }

  private static boolean hasSameOrder(List<String> colorListOne, List<String> colorListTwo) {
    int minSize = Math.min(colorListOne.size(), colorListTwo.size());
    for (int i = 0; i < minSize; i++) {
      if (!colorListOne.get(i).equals(colorListTwo.get(i))) {
        return false;
      }
    }
    return true;
  }
}
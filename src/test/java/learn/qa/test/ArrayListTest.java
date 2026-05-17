package learn.qa.test;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;


class ArrayListTest {

  @Test
  void test1() {
    ArrayList<String> colorList = new ArrayList<>();
    colorList.add("Red");
    colorList.add("Terracotta");
    colorList.add("Brown");
    colorList.add("Sienna");
    colorList.add("Sepia");
    System.out.println(colorList);
  }

  @Test
  void test2() {
    ArrayList<String> colorList = new ArrayList<>();
    colorList.add("Red");
    colorList.add("Terracotta");
    colorList.add("Brown");
    colorList.add("Sienna");
    colorList.add("Sepia");
    for (int i = 0; i < colorList.size(); i++) {
      String color = colorList.get(i);
      if (color.length() > 3) {
        colorList.set(i, color.substring(0, 3));
      }
    }
    System.out.println(colorList);
  }

  @Test
  void test3() {
    ArrayList<String> colorList = new ArrayList<>();
    colorList.add("Red");
    colorList.add("Orange");
    colorList.add("Yellow");
    colorList.add("Green");
    colorList.add("LightBlue");
    colorList.add("Blue");
    colorList.add("Violet");
    colorList.add("Black");
    colorList.add("White");
    colorList.add("Gray");
    for (int i = colorList.size() - 1; i >= 0; i--) {
      if (i % 2 != 0) {
        colorList.remove(i);
      }
    }
    System.out.println(colorList);
  }

  @Test
  void test4() {
    ArrayList<String> colorList = new ArrayList<>();
    colorList.add("Red");
    colorList.add("Green");
    colorList.add("Blue");
    colorList.add("White");
    colorList.add("Yellow");
//    colorList.add("Black");
    if (colorList.contains("Black")) {
      System.out.println("Black already exists");
    } else {
      for (int i = 0; i < colorList.size(); i++) {
        if (colorList.get(i).equals("Blue")) {
          colorList.set(i, "Black");
        }
      }
    }
    System.out.println(colorList);
  }

  @Test
  void test5() {
    ArrayList<String> colorList = new ArrayList<>();
    colorList.add("Red");
    colorList.add("Orange");
    colorList.add("Yellow");
    colorList.add("Green");
    colorList.add("LightBlue");
    colorList.add("Blue");
    colorList.add("Violet");
    colorList.add("Black");
    colorList.add("White");
    colorList.add("Gray");
    for (int i = 2; i <= 6; i++) {
      System.out.println(colorList.get(i));
    }
  }

  @Test
  void test6() {
    ArrayList<String> colorListOne = new ArrayList<>();
    colorListOne.add("Peachy");
    colorListOne.add("Beige");
    colorListOne.add("Silver");
    colorListOne.add("Orange");
    colorListOne.add("Creamy");

    ArrayList<String> colorListTwo = new ArrayList<>();
    colorListTwo.add("Green");
    colorListTwo.add("Salad");
    colorListTwo.add("Cabbage");
    colorListTwo.add("Silver");
    colorListTwo.add("Emerald");

    ArrayList<String> mergedList = new ArrayList<>();
    mergedList.addAll(colorListOne);
    mergedList.addAll(colorListTwo);

    mergedList.sort(null);

    for (int i = 0; i < mergedList.size(); i++) {
      String colors = mergedList.get(i);
      while (mergedList.indexOf(colors) != mergedList.lastIndexOf(colors)) {
        mergedList.remove(mergedList.lastIndexOf(colors));
      }
    }
    System.out.println(mergedList);
  }

  @Test
  void test7() {
    ArrayList<String> colorListOne = new ArrayList<>();
    colorListOne.add("Green");
    colorListOne.add("DarkGreen");
    colorListOne.add("Green");

    ArrayList<String> colorListTwo = new ArrayList<>();
    colorListTwo.add("White");
    colorListTwo.add("Olive");
    colorListTwo.add("Gold");
    colorListTwo.add("ForestGreen");
    colorListTwo.add("green");

//    colorListTwo.add("Green");
//    colorListTwo.add("DarkGreen");
//    colorListTwo.add("Green");

    if (colorListOne.size() == colorListTwo.size()) {
      System.out.println("Имеют одинаковое количество элементов в списке");
    } else {
      System.out.println("Имеют разное количество элементов в списке");
    }

    if (colorListOne.containsAll(colorListTwo) || colorListTwo.containsAll(colorListOne)) {
      System.out.println("Все элементы одного из списков присутствуют во втором списке");
    } else {
      System.out.println("Не все элементы одного из списков присутствуют во втором списке");
    }

    boolean isSameOrder = true;
    int minSize = Math.min(colorListOne.size(), colorListTwo.size());

    for (int i = 0; i < minSize; i++) {
      if (!colorListOne.get(i).equals(colorListTwo.get(i))) {
        isSameOrder = false;
        break;
      }
    }
    if (isSameOrder) {
      System.out.println("Все элементы одного из списков присутствуют во втором в том же порядке");
    } else {
      System.out.println("Элементы присутствуют в разном порядке");
    }
  }
}
package learn.qa.test;

import java.util.HashMap;
import java.util.Map.Entry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Задачи 3-6 HashMap")
public class HashMapTest {

  /**
   * 3. Добавье по названию из map новую позицию 4. Модифицируйте по названию из map существующую
   * позицию (прибавление вычитание) 5. Удалите по названию из map позицию 6. Изучите метод Map
   * containsKey("тут ваше значение") почитайте что он возвращает, подумайте где может понадобиться
   * и добавьте
   */

  @Test
  @DisplayName("Добавление новой позиции в Map")
  void test3() {
    HashMap<String, Integer> sales = new HashMap<>();
    sales.put("Мармеладные червячки Haribo", 150 * 15);
    sales.put("Конфеты Маска", 300 * 4);
    sales.put("Шоколадные шарики Maltesers", 130 * 8);
    sales.put("Кокосовая вода с личи FOCO", 200 * 10);
    sales.put("Чай Arizona", 220 * 14);
    sales.put("Печенье-соломка Lotte Pepero", 115 * 35);

    for (Entry<String, Integer> stringIntegerEntry : sales.entrySet()) {
      System.out.printf("%s, Сумма продаж: %d руб.%n", stringIntegerEntry.getKey(),
          stringIntegerEntry.getValue());
    }
  }

  @Test
  @DisplayName("Модификация по названию существующей позиции в Map. Прибавление, вычетание")
  void test4() {
    HashMap<String, Integer> sales = new HashMap<>();
    sales.put("Мармеладные червячки Haribo", 150 * 15);
    sales.put("Конфеты Маска", 300 * 4);
    sales.put("Шоколадные шарики Maltesers", 130 * 8);
    sales.put("Кокосовая вода с личи FOCO", 200 * 10);
    sales.put("Чай Arizona", 220 * 14);
    sales.put("Печенье-соломка Lotte Pepero", 115 * 35);

    sales.put("Мармеладные червячки Haribo", sales.get("Мармеладные червячки Haribo") + 300);
    sales.put("Конфеты Маска", sales.get("Конфеты Маска") - 600);

    for (Entry<String, Integer> stringIntegerEntry : sales.entrySet()) {
      System.out.printf("%s, Сумма продаж: %d руб.%n", stringIntegerEntry.getKey(),
          stringIntegerEntry.getValue());
    }
  }

  @Test
  @DisplayName("Удаление позиции из Map по названию")
  void test5() {
    HashMap<String, Integer> sales = new HashMap<>();
    sales.put("Мармеладные червячки Haribo", 150 * 15);
    sales.put("Конфеты Маска", 300 * 4);
    sales.put("Шоколадные шарики Maltesers", 130 * 8);
    sales.put("Кокосовая вода с личи FOCO", 200 * 10);
    sales.put("Чай Arizona", 220 * 14);
    sales.put("Печенье-соломка Lotte Pepero", 115 * 35);

    sales.remove("Чай Arizona");

    for (Entry<String, Integer> stringIntegerEntry : sales.entrySet()) {
      System.out.printf("%s, Сумма продаж: %d руб.%n", stringIntegerEntry.getKey(),
          stringIntegerEntry.getValue());
    }
  }

  @Test
  @DisplayName("Проверка содержится ли название в Map. Использование containsKey")
  void test6() {
    HashMap<String, Integer> sales = new HashMap<>();
    sales.put("Мармеладные червячки Haribo", 150 * 15);
    sales.put("Конфеты Маска", 300 * 4);
    sales.put("Шоколадные шарики Maltesers", 130 * 8);
    sales.put("Кокосовая вода с личи FOCO", 200 * 10);
    sales.put("Чай Arizona", 220 * 14);
    sales.put("Печенье-соломка Lotte Pepero", 115 * 35);

    if (sales.containsKey("Чай Arizona")) {
      sales.remove("Чай Arizona");
      System.out.println("Чай Arizona: удален из Map");
    } else {
      System.out.println("Чай Arizona: не найден в Map");
    }

    for (Entry<String, Integer> stringIntegerEntry : sales.entrySet()) {
      System.out.printf("%s, Сумма продаж: %d руб.%n", stringIntegerEntry.getKey(),
          stringIntegerEntry.getValue());
    }
  }
}
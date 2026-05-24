package learn.qa.test;

import java.util.HashMap;
import java.util.Map.Entry;
import org.junit.jupiter.api.Test;

public class HashMapTest {

  /**
   * Отчет продаж магазина
   * 1. Создайте HashMap<String, Integer> и добавьте туда список товаров и сумму продаж
   * 2. Вбейте в idea - iter выберите что предложит idea
   * (итерацию по созданному выше HashMap в методе где вы вбили iter).
   * Вывести в консоль результат по каждому товару в терминал
   */

  @Test
  void test1_2() {
    HashMap<String, Integer> sales = new HashMap<>();
    sales.put("Мармеладные червячки Haribo", 150 * 15);
    sales.put("Конфеты Маска", 300 * 4);
    sales.put("Шоколадные шарики Maltesers", 130 * 8);
    sales.put("Кокосовая вода с личи FOCO", 200 * 10);
    sales.put("Чай Arizona", 220 * 14);

    for (Entry<String, Integer> stringIntegerEntry : sales.entrySet()) {
      System.out.printf("%s, Сумма продаж: %d руб.%n", stringIntegerEntry.getKey(),
          stringIntegerEntry.getValue());
    }
  }
}
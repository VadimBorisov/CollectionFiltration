/**
 * Напишите метод filter, который принимает на вход массив любого типа, вторым арументом метод должен принимать класс,
 * реализующий интерфейс Filter, в котором один метод - Object apply(Object o).
 *
 * Метод должен быть реализован так чтобы возращать новый массив,
 * к каждому элементу которого была применена функция apply
 */

public class CollectionFiltration {

  public static  <T> Object[] filter(T[] array, Filter filter) {
    Object[] result = new Object[array.length];

    for (int i = 0; i < array.length; i++) {
      result[i] = filter.apply(array[i]);
    }

    return result;
  }
}

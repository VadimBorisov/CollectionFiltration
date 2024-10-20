import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Integer[] array = new Integer[]{1, 2, 3, 4};

    Object[] newArr = CollectionFiltration.filter(array, new FilterImpl());

    System.out.println(Arrays.toString(newArr));
  }
}

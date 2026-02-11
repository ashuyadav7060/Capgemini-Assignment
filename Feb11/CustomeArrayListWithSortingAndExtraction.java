package Feb11;

interface Comparator<T> {
  int compare(T a, T b);
}

class NewArrayList1<T> implements Comparator<T> {
  private T[] data;
  private int size;

  public NewArrayList1() {
    data = (T[]) new Object[4];
    size = 0;
  }

  public int compare(T a, T b) {
    if (a == null && b == null) {
      return 0;
    }

    if (a == null) {
      return 1;
    }

    if (b == null) {
      return -1;
    }

    if (a instanceof Integer && b instanceof Integer) {
      return (Integer) a - (Integer) b;
    }

    if (a instanceof String && b instanceof String) {
      String str1 = (String) a;
      String str2 = (String) b;

      int min = Math.min(str1.length(), str2.length());

      // bac, cda
      for (int i = 0; i < min; i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
          return str1.charAt(i) - str2.charAt(i);
        }
      }
      return 0;
    }

    throw new RuntimeException("Unsorted Type");
  }

  public void add(T val) {
    if (size == data.length) {
      resize();
    }
    data[size++] = val;
  }

  private void resize() {
    T[] newData = (T[]) new Object[data.length * 2];
    for (int i = 0; i < size; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.print(data[i] + " ");
    }
  }

  public int size() {
    return size;
  }

  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  public void remove(int index) {
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i + 1];
    }
    size--;
  }

  public void search(T val) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(val)) {
        System.out.println("Given data is present in list");
        return;
      }
    }
    System.out.println("Given data is not present in list");
  }

  public void sort() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (compare(data[j], data[j + 1]) > 0) {
          T temp = data[j + 1];
          data[j + 1] = data[j];
          data[j] = temp;
        }
      }
    }

    print();
  }

}

public class CustomeArrayListWithSortingAndExtraction {
  public static void main(String[] args) {
    NewArrayList1<Integer> list = new NewArrayList1<>();
    // NewArrayList<String> list1 = new NewArrayList<>();
    // add data
    list.add(40);
    list.add(30);
    list.add(50);
    list.add(90);
    list.add(10);
    list.add(70);
    list.add(110);

    // print data
    list.print();
    System.out.println();

    // get size
    System.out.println(list.size());

    // get element
    System.out.println(list.get(2));

    // remove data at an index
    list.remove(1);
    list.print();

    System.out.println();

    // search an element
    list.search(50);

    // sorting
    list.sort();

    // for sorting

    System.out.println();
    NewArrayList1<String> list1 = new NewArrayList1<>();

    list1.add("hello");
    list1.add("ashu");
    list1.add("iuefw");

    list1.sort();

  }
}

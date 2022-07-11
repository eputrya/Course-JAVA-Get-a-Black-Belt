package Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
        arrayList2.add("Igor");
        List<String> myList = arrayList1.subList(1, 4);
        System.out.println("ArrayList = " + myList);
        myList.add("Fedor");
        System.out.println("Sub list = " + myList);
        System.out.println("ArrayList = " + arrayList1);
        arrayList1.add("Sveta");
        System.out.println("ArrayList = " + arrayList1);
        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[5]);

        for (String s: array2) {
            System.out.println(s);
        }

        // list созданный с помощью List.of или copyOf не возможно модифицировать и данные листы не могут содержрать значение null
        List<Integer> list10 = List.of(3, 8, 13);
        List<String> list20 = List.copyOf(arrayList1);

        arrayList1.retainAll(arrayList2);
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);
        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);
    }
}

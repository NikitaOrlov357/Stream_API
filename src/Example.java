import java.util.*;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("dsa");
//        arrayList.add("asr");
//        arrayList.add("nmo");

//        int[] array = {1,34,5,12,65};
//
//        array = Arrays.stream(array)
//                .sorted()
//                .toArray();
//
//        System.out.println(Arrays.toString(array));
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(9);
        arrayList1.add(4);
        arrayList1.add(6);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(1);
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(1);
        arrayList3.add(9);
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(5);
        arrayList4.add(1);
        arrayList4.add(1);

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(arrayList4);

        System.out.println(arrayList);

        List<List<Integer>> arrayList5 = arrayList.stream()

                .peek(Collections::sort)
                .sorted((o1, o2) -> {

                    StringBuilder stringBuilder1 = new StringBuilder();
                    for (Integer value : o1) {
                        stringBuilder1.append(value).append(" ");
                    }

                    StringBuilder stringBuilder2 = new StringBuilder();
                    for (Integer value : o2) {
                        stringBuilder2.append(value).append(" ");
                    }
                    return stringBuilder1.toString().compareTo(stringBuilder2.toString());
                })
                .collect(Collectors.toList());
        System.out.println(arrayList5);

    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Stream Tasks

//        1.Listdəki Stringleri uzunluguna gore siralayin
//        ArrayList<String> stringList =new ArrayList<>();
//        stringList.add("Hecer");
//        stringList.add("Hecer123");
//        stringList.add("Hecer12");
//        List<String> sortedList = stringList.stream()
//                .sorted(Comparator.comparing(String::length).reversed())
//                .toList();
//        sortedList.forEach(str -> System.out.println(str));


//        2.Listdeki ededleri tek ve cut olaraq qrublasdir
//        ArrayList<Integer> numberList = new ArrayList<>();
//        numberList.add(6);
//        numberList.add(7);
//        numberList.add(3);
//        numberList.add(8);
//        numberList.add(4);
//        List<Integer> filteredList = numberList.stream()
//                .filter(n -> n % 2 == 0)
//                .toList();
//        System.out.println("Even: ");
//        filteredList.forEach(str -> System.out.print(str));
//        System.out.println();
//        List<Integer> filteredOddList = numberList.stream()
//                .filter(n -> n % 2 != 0)
//                .toList();
//        System.out.println("Odd: ");
//        filteredOddList.forEach(str2 -> System.out.print(str2));

//        3.Listdeki Stringleri boyuk herflere cevirin
//        ArrayList<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("one");
//        stringArrayList.add("two");
//        stringArrayList.add("three");
//        stringArrayList.add("four");
//        List<String> upperCase = stringArrayList.stream()
//                .map(String::toUpperCase)
//                .toList();
//        upperCase.forEach(System.out::println);

//        4.Massivdeki elementlerin kublarinin cemini tapin
//        int[] numbers = {1,2,3}; //1+8+27=36
//        int sum = Arrays.stream(numbers)
//                .map(n-> n*n*n)
//                .sum();
//        System.out.println(sum);

//        5.Listdeki Stringlerin uznlluqlari 5-den boyuk olanlari fitrleyin
//        ArrayList<String> stringSize = new ArrayList<>();
//        stringSize.add("12345");
//        stringSize.add("123");
//        stringSize.add("12");
//        stringSize.add("1234567");
//        stringSize.add("123456789");
//        List<String> filtered = stringSize.stream()
//                .filter(string -> string.length()>5)
//                .toList();
//        filtered.forEach(System.out::println);

//        6.Listdeki Stringleri uzunluqlarina gore qruplasdirin
//        ArrayList<String> stringSize = new ArrayList<>();
//        stringSize.add("12345");
//        stringSize.add("123");
//        stringSize.add("12");
//        stringSize.add("1234567");
//        stringSize.add("123456789");
//        List<String> filtered = stringSize.stream()
//                .filter(string -> string.length()>5)
//                .toList();
//        filtered.forEach(System.out::println);
//        System.out.println();
//        List<String> filteredList = stringSize.stream()
//                .filter(string -> string.length()<=5)
//                .toList();
//        filteredList.forEach(System.out::println);

    }
}
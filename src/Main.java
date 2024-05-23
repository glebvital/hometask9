// Q6 is too hard for me >:(
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Q1 setup
//        ArrayList<Integer> Q1 = new ArrayList<>();
//        Q1.add(12);
//        Q1.add(62);
//        Q1.add(14);
//        Q1.add(87);
//        Q1.add(32);

//        Q1
//        int max = Q1.get(0);

//        for (int i = 0; i < Q1.size(); i++) {
//            if (max< Q1.get(i)){
//                max = Q1.get(i);
//            }
//        }

//        Q2
//        String Q2s = "bob bob";

//        if (Q2(Q2s)){
//            System.out.println(Q2s+" is polidrom");
//        }else {
//            System.out.println(Q2s+" isn't polidrom");
//        }

//        Q3 setup
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(1);
//        a.add(2);
//        a.add(2);
//        a.add(3);
//        a.add(3);

//        Q3(a);

        //Q4 setup
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(5);
//        list.add(3);
//        list.add(6);

//        Q4
//        Map<Integer,Integer> b = Q4(list);
//        for (Map.Entry<Integer,Integer> entry : b.entrySet()) {
//            System.out.println("number "+entry.getKey()+" was "+entry.getValue()+" times");
//        }

//        Q5
//        Map<String,Integer> b = Q5();
//        for (Map.Entry<String,Integer> entry : b.entrySet()) {
//            System.out.println("word/s "+entry.getKey()+" was "+entry.getValue()+" times");
//        }



    }
    public static boolean Q2 (String a){
        a = a.toLowerCase().replaceAll("//s","");
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void Q3(ArrayList<Integer> list){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        for (int i = 0; i < set.size(); i++) {
            System.out.print(set.toArray()[i]);
        }
    }

    public static Map<Integer,Integer> Q4(ArrayList<Integer> list){
        Map<Integer,Integer> a = new HashMap<>();
        for (int num : list){
            if (a.containsKey(num)){
                a.put(num,a.get(num)+1);
            }else {
                a.put(num,1);
            }
        }
        return a;
    }
    public static Map<String, Integer> Q5() {
        String text = "Hello old world hello world Mercurius hEllo";
        String[] words = text.split(" ");
        HashMap<String,Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String words1 : words) {
            arrayList.add(words1);
        }
        for (String words1 : arrayList) {
            hashMap.put(words1, hashMap.getOrDefault(words1, 0) + 1);
        }
        return hashMap;
    }
}
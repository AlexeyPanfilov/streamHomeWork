import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Niger");
        strings.add("Nigoewrr");
        strings.add("Anger");
            Comparator<String> comparing = new Comparator<>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
        };
        System.out.println(strings);


//        String s1 = "Niger";
//        String s2 = "Nibger";
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) < s2.charAt(i)) {
//                System.out.println(s1.charAt(i) + " < " + s2.charAt(i));;
//                break;
//            } else if (s1.charAt(i) > s2.charAt(i)) {
//                System.out.println(s1.charAt(i) + " > " + s2.charAt(i));
//                break;
//            } else {
//                System.out.println((s1.charAt(i) + " = " + s2.charAt(i)));;
//            }
//        }
    }
}

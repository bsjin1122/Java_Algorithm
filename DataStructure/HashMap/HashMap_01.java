package DataStructure.HashMap;

import java.util.HashMap;

public class HashMap_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<>();
        HashMap<String, Integer> h2 = new HashMap<>();

        h1.put("aaa", 111);
        h1.put("bbb", 222);
        h1.put("ccc", 333);
        h1.putIfAbsent("aaa", 000);
        h1.putIfAbsent("ddd", 444);
        h2.putAll(h1);

        System.out.println("h1 : " + h1); // h1 : {aaa=111, ccc=333, bbb=222, ddd=444}
        System.out.println("h2 : " + h2); // h2 : {aaa=111, ccc=333, bbb=222, ddd=444}

        System.out.println("[1]: " + h1.containsKey("aaa"));
        System.out.println("[2]: " + h1.containsValue(111));
        System.out.println("[3]: " + h1.isEmpty());
        System.out.println("[4]: " + h1.size());
        System.out.println("[5]: " + h1);
        System.out.println("[6]: " + h1.remove("aaa", 111));
        System.out.println("[7]: " + h1.put("bbb", 000));
        System.out.println("[8]: " + h1.replace("ccc", 888));
        System.out.println("h1 : " + h1);
        System.out.println("h2 : " + h2);


        for (String key: h1.keySet()) {
            String value = String.valueOf(h1.get(key));
            System.out.println("Key:" + key + ", Value:" + value);
        }

    }
}

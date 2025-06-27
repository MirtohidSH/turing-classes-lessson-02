package org.example;

public class StringApp {
    public static void main(String[] args) {
        // 1 - valueOf()
        int a = 5;
        String s = String.valueOf(a);
        System.out.println(s);

        // 2 - length()
        String str = "Hello World";
        System.out.println(str.length());

        // 3 - charAt()
        System.out.println(str.charAt(0));

        // 4 - substring()
        System.out.println(str.substring(1));

        // 5 - substring(0,1)
        System.out.println(str.substring(0,1));

        // 6 - equals()
        System.out.println(str.equals("Hello World"));

        // 7 - equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("hello world"));

        // 8 - contains()
        System.out.println(str.contains("llo"));

        // 9 - startsWith()
        System.out.println(str.startsWith("H"));

        // 10 - endWith
        System.out.println(str.endsWith("l"));

        // 11 - indexOf()
        System.out.println(str.indexOf("l"));

        // 12 - lastIndexOf
        System.out.println(str.lastIndexOf("l"));

        // 13 - isEmpty()
        System.out.println(str.isEmpty());

        // 14 - toLowerCase()
        String str2 = str.toLowerCase();
        System.out.println(str2);

        // 15 - toUpperCase()
        String str3 = str.toUpperCase();
        System.out.println(str3);

        // 16 - trim()
        String str4 = "       hell o w o r l d";
        System.out.println(str4.trim());

        // 17 - replace()
        System.out.println(str.replace("h", "l"));

        // 18 - replaceAll()
        System.out.println(str.replaceAll("o", "l"));

        // 19 - split()
        String[] str5 = str.split("o");
        for (String ss : str5) System.out.print(ss + " ");

        // 20 - join()
        String strr5 = String.join(", ", "Ali", "Veli", "Aysel");
        System.out.println("\n" + strr5);

        // 21 - format()
        int b = 25;
        String str6 = "Ali";
        String str7 = String.format("Ad: %s, Yaş: %d", str6, b);
        System.out.println(str7);

        // 22 - matches()
        String str8 = "test";
        String str9 = "test";
        System.out.println(str8.matches(str9));

        // 23 - repeat()
        System.out.println(str8.repeat(3));
    }
}

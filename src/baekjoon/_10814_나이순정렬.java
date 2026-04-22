package baekjoon;

import java.util.*;


public class _10814_나이순정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Person> list = new ArrayList<>();

        // 입력
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();

            list.add(new Person(age,name));
        }

        // 정렬
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person a,Person b) {
                return a.age - b.age;
            }
        });
        for (Person p : list) {
            System.out.println(p.age + " " + p.name);
        }

    } // main
} // class

class Person {
    int age;
    String name;

    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }
}

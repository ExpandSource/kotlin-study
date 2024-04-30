package j_class;

public class Person5 {
    private String name;
    private int age;

    public Person5(String name, int age) {
        System.out.println("사람 객체를 초기화합니다");
        // logic...
        this.name = name;
        this.age = age;
    }

    public Person5() {}

    public Person5(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        if (age < 19) {
            System.out.println("미성년자 나이");
        }
        return age;
    }
}
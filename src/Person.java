public class Person implements Comparable<Person>{
    @Override
    public int compareTo(Person o) {
        // so sánh dối tượng A(this) và B(o)

        // lúc nào thì return về > 0 : A > B
        // lúc nào thì return về = 0 : A = B
        // lúc nào thì return về < 0 : A < B

//        if (this.age > o.age) return 1;
//        if (this.age == o.age) return 0;
//        if (this.age < o.age) return -1;
//        return this.age - o.age;

        // tất cả các Lớp có sẵn trong java đêu triển khai Comparable
        return this.weight.compareTo(o.weight);

    }

    private String name;
    private int age;
    private Double weight;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

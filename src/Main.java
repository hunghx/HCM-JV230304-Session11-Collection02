import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List có bnh lớp ke thua
        // ArrayList, LinkedList, Vector

        List<String> array = new ArrayList<>();
        List<String> linked = new LinkedList<>();


        // các chức năng của list : add , set, remove , get

        // Set : ko cho phép lưu trữ trung lặp
        // HashSet, LinkedHashSet , TreeSet( phải đc sắp xếp )

        Set<Integer> set= new LinkedHashSet<>();
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(12);
        set.add(17);
        set.add(11);
        System.out.println(set);

        // Stack và Queue
        // Stack : là lớp kế thừa Vector : ngăn xếp (Last In Fisrt Out)
        // các phương thức làm việc
        Stack<Integer> stack = new Stack<>();
        stack.push(2); // thêm mới
        stack.push(3); // thêm mới
        stack.push(1); // thêm mới
        stack.push(0); // thêm mới

        // lấy ra
        while (!stack.empty()){
            Integer element = stack.pop();
            System.out.println(element);
        }


        // Queue : là interface : hàng đợi (First In First Out)
        //
        Queue<Integer> queue = new ArrayDeque<>();
        // poll(lấy và xóa), peek (lấy ko xóa) , remove (lấy và xóa), element (lấy nhưng ko xóa) , offer (thêm) , add (thêm)

//        queue.add(5);
        queue.offer(6);
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }

//        queue.element();
        queue.peek();

// hàng đợi 2 đầu : FIFO vs LILO : tìm hiểu thêm`
//        LinkedList<Integer> vong = new LinkedList<>();
//        vong.addFirst(2);
//        vong.getFirst();
//        vong.addLast(3);
//        vong.getLast();

        // Comparable và Comparator : so sánh các đối tượng, giá trị trong java

        // có 2  để so sánh
        // Comparable


        Person[] people = new Person[]{
                new Person("Khánh",19),
                new Person("Nam",18),
                new Person("Sơn",20),
                new Person("Phát",30),
                new Person("Quang",16)
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));


// xây dựng lớp Book : id : String, name : Stirng, content : String, totalPage : int , price : double, createdAt : java.util.Date
// tạo mảng  Book[] có 5 dữ liệu mẫu
// tiến hành sắp xếp mảng theo id giảm dần , tổng số trang tăng dần , giá giảm dần , ngày xuất bản mới nhất (giảm dân)


        // Comparator : interface có pttt : compare(A a, B b);
//        Comparator  vs Comparable ,
//      Arrays.sort(array) / Arrays.sort(array , Comparator)
        Comparator<Person> com = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };

        Arrays.sort(people,(o1,o2)-> o1.getAge()-o2.getAge() );
        Arrays.sort(people,(o1,o2)-> o1.getName().compareTo(o2.getName()));
        Arrays.sort(people,(o1,o2)-> o1.getAge()-o2.getAge() );
        Arrays.sort(people,(o1,o2)-> o1.getAge()-o2.getAge() );
        // sử dụng lambda : functional interface
    }
}
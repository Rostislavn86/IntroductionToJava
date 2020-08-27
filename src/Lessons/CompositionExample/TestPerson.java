package Lessons.CompositionExample;

//https://javadevblog.com/chto-takoe-kompozitsiya-primer-kompozitsii-v-java.html#:~:text=%D0%9A%D0%BE%D0%BC%D0%BF%D0%BE%D0%B7%D0%B8%D1%86%D0%B8%D1%8F%20%D1%8F%D0%B2%D0%BB%D1%8F%D0%B5%D1%82%D1%81%D1%8F%20%D0%BE%D0%B4%D0%BD%D0%B8%D0%BC%20%D0%B8%D0%B7%20%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D0%BE%D0%B2,%D0%BA%D0%BE%D1%82%D0%BE%D1%80%D1%8B%D0%B9%20%D1%81%D1%81%D1%8B%D0%BB%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20%D0%BD%D0%B0%20%D0%B4%D1%80%D1%83%D0%B3%D0%B8%D0%B5%20%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B.

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();

        System.out.println(salary);
    }

}

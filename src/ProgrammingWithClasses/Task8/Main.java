package ProgrammingWithClasses.Task8;

public class Main
{
    public static void main(String[] args)
    {
        Methods methods = new Methods();

        //Customer[] customer = new Customer[5];

//    customer[0] = new Customer(1234,"Емельянов","Олег","Игоревич","Гвиршиани 4","123456789455",125896);
//    customer[1] = new Customer(1233,"Лазарев","Илья","Петрович","Гамарника 5","12586478624",125782);
//    customer[2] = new Customer(1222,"Ларионов","Фёдор","Ярославович","Янковского 5","1238648752",125783);
//    customer[3] = new Customer(1220,"Петров","Кирилл","Фёдорович","Гришковца 7","12386487777",125789);
//    customer[4] = new Customer(1199,"Сидоров","Виктор","вИКТОРОВИЧ","Столетова 8","12386487897",125790);

        methods.customer[0] = new Customer(1199,"Сидоров","Виктор","вИКТОРОВИЧ","Столетова 8","123456789",125790);
        methods.customer[1] = new Customer(1233,"Лазарев","Илья","Петрович","Гамарника 5","100000000",125782);
        methods.customer[2] = new Customer(1222,"Ларионов","Фёдор","Ярославович","Янковского 5","789456321456",125783);
        methods.customer[3] = new Customer(1220,"Петров","Кирилл","Фёдорович","Гришковца 7","789654123465",125789);
        methods.customer[4] = new Customer(1234,"Емельянов","Олег","Игоревич","Гвиршиани 4","456789456123",125896);

        //System.out.println(Long.parseLong("456789456123"));

        methods.sortBySurname();

        methods.listOfBuersInTheRange();

    }
}

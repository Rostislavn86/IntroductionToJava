package BasicOfOOP.Task2;

import java.util.Scanner;

public class Payment
{

    private String nameOfThePayment;
    private int countOfThePayment;
    private int priceOfPayment;

    Payment(int c)
    {
    for(int i = 0; i < c; i++)
    {
    Product product = new Product();
    this.nameOfThePayment += product.nameOfTheProduct + ",";
    this.countOfThePayment += product.countOfTheProduct;
    this.priceOfPayment += product.priceOfProduct * product.countOfTheProduct;
    }

    }

    @Override
    public String toString() {
        if (nameOfThePayment.contains("null")) nameOfThePayment = nameOfThePayment.replace("null","");
        return  "Список заказываемых товаров : " + nameOfThePayment + '\'' +
                ", общее количество заказываемых товаров : " + countOfThePayment +
                ", общая сумма заказываемых товаров : " + priceOfPayment;
    }

    public void setNameOfThePayment(String nameOfThePayment) {
        this.nameOfThePayment = nameOfThePayment;
    }

    public void setCountOfThePayment(int countOfThePayment) {
        this.countOfThePayment = countOfThePayment;
    }

    public void setPriceOfPayment(int priceOfPayment) {
        this.priceOfPayment = priceOfPayment;
    }

    public class Product
    {
        private String nameOfTheProduct;
        private int countOfTheProduct;
        private int priceOfProduct;

        Product()
        {
            System.out.println("Введите название продкта : ");

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            setNameOfTheProduct(str);

            System.out.println("Введите количество едениц продукта : ");

            int strCount = sc.nextInt();

            setCountOfTheProduct(strCount);

            System.out.println("Введите цену за еденицу продукта : ");

            int strCountPrice = sc.nextInt();

            setPriceOfProduct(strCountPrice);
        }

        public String getNameOfTheProduct()
        {
            return nameOfTheProduct;
        }

        public void setNameOfTheProduct(String nameOfTheProduct)
        {
            this.nameOfTheProduct = nameOfTheProduct;
        }

        public int getCountOfTheProduct() {
            return countOfTheProduct;
        }

        public void setCountOfTheProduct(int countOfTheProduct) {
            this.countOfTheProduct = countOfTheProduct;
        }

        public int getPriceOfProduct() {
            return priceOfProduct;
        }

        public void setPriceOfProduct(int priceOfProduct) {
            this.priceOfProduct = priceOfProduct;
        }

    }

}

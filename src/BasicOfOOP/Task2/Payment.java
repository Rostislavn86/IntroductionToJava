package BasicOfOOP.Task2;

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
    this.nameOfThePayment += product.nameOfTheProduct + " ";
    this.countOfThePayment += product.countOfTheProduct;
    this.priceOfPayment += product.priceOfProduct;
    //System.out.println(product.toString());
    }

    }

    @Override
    public String toString() {
        return "Payment{" +
                "nameOfThePayment='" + nameOfThePayment + '\'' +
                ", countOfThePayment=" + countOfThePayment +
                ", priceOfPayment=" + priceOfPayment +
                '}';
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
            setNameOfTheProduct("1");
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

        @Override
        public String toString() {
            return "Product{" +
                    "nameOfTheProduct='" + nameOfTheProduct + '\'' +
                    ", countOfTheProduct=" + countOfTheProduct +
                    ", priceOfProduct=" + priceOfProduct +
                    '}';
        }
    }

}

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();//hangi veritabanı isterlerse onu yazıyorz buraya.
        customerManager.getCustomer();


    }
}

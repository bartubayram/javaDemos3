public class Main {
    public static void main(String[] args) {
//        BaseLogger [] loggers = new BaseLogger[]{new FileLogger(),new CustomerManager(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        for (BaseLogger logger:loggers  ) {
//            logger.Log("Log Message");
//
//        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

        CustomerManager customerManager1 = new CustomerManager(new FileLogger());
        customerManager1.add();

        CustomerManager customerManager2= new CustomerManager(new ConsoleLogger()   );
        customerManager2.add();
    }
}
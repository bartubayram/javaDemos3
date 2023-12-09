public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }

    public void add(){
        System.out.println("Musteri eklendi");
        this.logger.log("Log mesaji");// database in log'unu çalıştırmak için kullanılır BaseLogger logger olarka
                                         // istenılen ksıımda loggerın ne olacagını bilemiyoruz
                                        // o yüzden this.logger'ın log'unu alıyoruz


    }

}

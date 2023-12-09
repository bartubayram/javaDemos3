public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün ha cok guzel.";
        String yeniMesaj=sehirVer() ;
        System.out.println(yeniMesaj);
      int sayi = topla(7,8);
        System.out.println(sayi);
        int toplam =topla2(1,3,5,7);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }
    public static void sil() {
        System.out.println("silindi");
    }
    public static void guncelle() {
        System.out.println("guncellendi");

    }
    public static int topla (int s1,int s2){
       return s1+s2;
    }
    public static int topla2(int... sayilar){
       int toplam =0;
       for(int sayi:sayilar){
           toplam+=sayi;

       }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }

}
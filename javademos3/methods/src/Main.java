public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        mesajVer("bartubayramkurnaz");

    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 90;
        boolean mevcut = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                mevcut = true;
                break;
            }

        }
        String mesaj = "sayimevcut" + aranacak;
        if (mevcut) {
            mesajVer(mesaj);
        } else {
            mesajVer("sayimevcut degil " + aranacak);
        }

    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);

    }
}
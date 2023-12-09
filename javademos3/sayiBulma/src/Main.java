public class Main {
    public static void main(String[] args) {
        int[] sayilar=new int[] {1,2,5,7,9,0};
        int aranacak=0;
        boolean mevcut=false;
        for(int i =0;i<sayilar.length;i++){
           if(sayilar[i]==aranacak){
              mevcut=true;
              break;
           }

        }
        if(mevcut){
            System.out.println("mevcut");
        }
        else{
            System.out.println("mevcut degil");
        }

    }
}

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    public static void sehirlerGez(LinkedList<String> il){
        ListIterator<String> iterator = il.listIterator();
        
        int islem;
        
        islemler();
        
        Scanner scanner = new Scanner(System.in);
        
        if (!iterator.hasNext()){ // LinkedList boş ise sürece true döner
            
            System.out.println("Herhangi bir şehir bulunamadı.");
            
        }
        
            boolean cikis = false;
            boolean ileri = true;
        while (!cikis){
            
            System.out.println("Bir islem seçiniz ?");
            
            islem = scanner.nextInt();
            
            switch(islem){
                
                case 0: 
                    
                    islemler();
                    break;  
                    
                case 1:
                    if (!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    ileri = true;
                    if (iterator.hasNext()){
                        System.out.println("İle gidiliyor..." + iterator.next());
                        
                    }
                    else{
                        System.out.println("Gidilecek il yok!");
                        ileri = true; 
                    }
                    break;
                case 2:
                    if (ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri =false ;
                    }
                    if(iterator.hasPrevious()){ //Öncesi var mı ?
                        System.out.println("İle gidiliyor..." + iterator.previous());
                    }
                    else{
                        
                        System.out.println("Yolculuk başladı...");
                    }
                    break;
                case 3:
                    
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor....");
                    break;
                
                
            }
            
        }
        
    }
    
    public static void islemler(){
        
        System.out.println("0 - İslemleri Gör");
        System.out.println("1 - Bir Sonraki İle Git -->");
        System.out.println("2 - Bir Önceki İle Gir <--");
        System.out.println("3- Uygulamadan Çık");
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> il = new LinkedList<>();
        
        il.add("İzmir");
        il.add("Ankara");
        il.add("Kahramanmaraş");
        il.add("Gaziantep");
       
        sehirlerGez(il);
    }
}

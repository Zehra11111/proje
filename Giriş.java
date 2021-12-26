
import java.util.Scanner;


public class Giriş {
   public void Sistem() {
     

      Scanner input = new Scanner(System.in);
        System.out.println(" Hoşgeldiniz...");
        
      System.out.println("**");
    
      String islemler = "1. Nüfus İşlemleri\n"
                   + "2. Vergi ödeme İşlemleri\n";
                
     System.out.println(islemler); 

     System.out.println("**");

    while(true){
        System.out.println("\nİşleminizi Seçiniz : ");
        String islem = input.nextLine();

          if (islem.equals("1.Nüfus İşlemleri")) {
              System.out.println("**");
    
          String islemler1 = "1.İsim değişikliği\n"
                   + "2. Soyisim değişikliği\n" 
                  + "3.Sürücü belgesi alma\n";
              System.out.println(islemler1);   
              System.out.println("**");
              System.out.println("Yapmak istediğiniz diğer işlemi söyleyiniz");
              String islem1 = input.nextLine();
              if(islem1.equals("1.İsim değişikliği")){
                  
              }
          
          }
              
        }

 }         

   }

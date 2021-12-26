
public class Test {
    public static void main(String[] args) {
        
       Belediye b1 = new Belediye ();
       b1.VatandasEkle(new vatandas("Zehra","Kondakçı","123456")); 
       b1.VatandasEkle(new vatandas("Sevde","Kondakçı","123456"));
       vatandas v1 = b1.VatandasBul("1238888888");
       if (v1 == null)
            System.out.println("Vatandaş Bulunamadı");
       else
            System.out.println("Vatandaş: " +v1.getAd());
       
       
        
       
      
      
         
}

    }

import java.util.ArrayList;

public class Belediye {

    private ArrayList<vatandas> _vatandaslar;

    public void Belediye() {
        _vatandaslar= new ArrayList<vatandas>();
        System.out.println("56");
    }

    public boolean VatandasEkle(vatandas kisi) {
         if (VatandasBul(kisi.getTckn())==null)
              return false;
        _vatandaslar.add(kisi); 
         
          
        return true;
         
    }
    
    public vatandas VatandasBul(String tckn){
        vatandas v1 ;
        
        for (int i = 0; i < _vatandaslar.size(); i++) {
             v1=_vatandaslar.get(i);
             if (tckn.equals(v1.getTckn())){
             return v1;
             }
            
             }
         return null;
    }
    

   
   /* public void İsimDeğiştirme(String isim_soyisim, String yeniisim_soyad) {

        this.isim_soyisim = yeniisim_soyad;

    }*/

    /*public void SoyisimDeğiştirme(String isim_yenisoyad, String durum) {
        if (durum.equals("Rütbe bildiren") || durum.equals("Aşiret ismi içeren")) {
            this.isim_soyisim = isim_yenisoyad;
        } else {
            System.out.println("Mahkeme kararı olmadan bu şartlar dışında soyisim değişikliği"
                    + "yapamamaktayız.");
        }
    }

    /* public void AdresDeğiştirme(String yeni_adres ){
        this.adres=yeni_adres;
     } */
   /* public void SürücüBelgesi(boolean rapor, boolean resim) {
        if (rapor == true && resim == true) {
            System.out.println("Sürücü belgeniz oluşturuluyor");
        } else {
            System.out.println("Sürücü belgeniz sağlık raporu ve biomeetrik fotoğraf"
                    + " olmadan oluşturulamaz");
        }
    }

    public void gümrük(String isim_soyisim, int kütle, int ödeme) {
        int gümrük = kütle * 18 / 100;
        System.out.println("Vergi ücretiniz: " + gümrük);

        if (gümrük == ödeme && kütle > 450 && isim_soyisim.equals(this.getIsim_soyisim())) {
            System.out.println("Verginiz ödenmiştir.");
            gümrük = 0;

        } else if (ödeme > gümrük && kütle > 450 && isim_soyisim.equals(this.getIsim_soyisim())) {
            System.out.println("Verginiz ödenmiştir.");
            System.out.println("Para üstünüz:" + (ödeme - gümrük));
            gümrük = 0;
        } else if (kütle < 450) {
            System.out.println("Kütle miktarından dolayı vergi ücreti yoktur.");
        }
        if (gümrük == 0) {
            System.out.println("Daha önce ödeme yapılmıştır.");
        }
    }

    public void pasaport(String isim_soyisim, int ödeme, int ay) {
        if (ay <= 6) {
            int pasaport = 309;
            System.out.println("Pasaport vergi ücretiniz:" + pasaport);
            if (ödeme == pasaport && isim_soyisim.equals(this.getIsim_soyisim())) {
                System.out.println("Verginiz ödenmiştir.");
                pasaport = 0;
            } else if (pasaport == 0) {
                System.out.println("Daha önce ödeme yapılmıştır.");
            }
        }
        if (ay >= 24) {
            int pasaport = 1478;
            System.out.println("Pasaport vergi ücretiniz:" + pasaport);
            if (ödeme == pasaport && isim_soyisim.equals(this.getIsim_soyisim())) {
                System.out.println("Verginiz ödenmiştir.");
                pasaport = 0;
            } else if (pasaport == 0) {
                System.out.println("Daha önce ödeme yapılmıştır.");
            }
        }
        if (ay > 6 && ay < 12) {
            int pasaport = 452;
            System.out.println("Pasaport vergi ücretiniz:" + pasaport);
            if (ödeme == pasaport && isim_soyisim.equals(this.getIsim_soyisim())) {
                System.out.println("Verginiz ödenmiştir.");
                pasaport = 0;
            } else if (pasaport == 0) {
                System.out.println("Daha önce ödeme yapılmıştır.");
            }
        }
        if (ay >= 12 && ay < 24) {
            int pasaport = 738;
            System.out.println("Pasaport vergi ücretiniz:" + pasaport);
            if (ödeme == pasaport && isim_soyisim.equals(this.getIsim_soyisim())) {
                System.out.println("Verginiz ödenmiştir.");
                pasaport = 0;
            } else if (pasaport == 0) {
                System.out.println("Daha önce ödeme yapılmıştır.");
            }
        }
    }

    public void emlak(String isim_soyisim, int ödeme, String gayrımenkul, int ücret) {
        if (gayrımenkul.equals("konut") || gayrımenkul.equals("arazi")) {
            int emlak = ücret * 2 / 1000;
            System.out.println("Emlak vergisi ücretiniz: " + emlak);
            if (ödeme == emlak && isim_soyisim.equals(this.getIsim_soyisim())) {
                System.out.println("Verginiz ödenmiştir.");
                emlak = 0;
            } else if (emlak == 0) {
                System.out.println("Daha önce ödeme yapılmıştır.");
            }
        }
        if (gayrımenkul.equals("işyeri")) {
            int emlak = ücret * 4 / 1000;
            System.out.println("Emlak vergisi ücretiniz: " + emlak);
            if (ödeme == emlak && isim_soyisim.equals(this.getIsim_soyisim())) {
                System.out.println("Verginiz ödenmiştir.");
                emlak = 0;
            } else if (emlak == 0) {
                System.out.println("Daha önce ödeme yapılmıştır.");
            }
        }
        if (gayrımenkul.equals("arsa")) {
            int emlak = ücret * 6 / 1000;
            System.out.println("Emlak vergisi ücretiniz: " + emlak);
            if (ödeme == emlak && isim_soyisim.equals(this.getIsim_soyisim())) {
                System.out.println("Verginiz ödenmiştir.");
                emlak = 0;
            } else if (emlak == 0) {
                System.out.println("Daha önce ödeme yapılmıştır.");
            }
        }

    }
*/
}

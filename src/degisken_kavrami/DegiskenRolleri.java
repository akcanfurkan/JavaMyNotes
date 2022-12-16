package degisken_kavrami;


/*
Java dilinde, değişkenler üç farklı role sahip olabilirler:

Instance değişkenler: Bu değişkenler, bir sınıfın nesnelerine özgüdür ve her nesne için ayrı bir değer saklar.
Örneğin, bir "Kisi" sınıfında, "ad" ve "yas" instance değişkenleri olabilir.
Bu değişkenler, sınıf içinde yalnızca "this" anahtar sözcüğü ile erişilebilirler.

Static değişkenler: Bu değişkenler, bir sınıfın tüm nesnelerine ortaktır ve sınıf adı ile erişilebilirler.
Örneğin, bir "Ogrenci" sınıfında, "ogrenciSayisi" static değişkeni olabilir.
Bu değişken, sınıf içinde yalnızca "className.variableName" şeklinde veya "variableName" şeklinde erişilebilir.

Local değişkenler: Bu değişkenler, bir yöntem veya bir blok içinde tanımlanır ve
yalnızca o yöntem veya blok içinde kullanılabilirler.
Örneğin, bir "topla" yönteminde, "sonuc" local değişkeni olabilir.

Aşağıdaki örnekte, "Kisi" sınıfında instance değişkenler, static değişken ve local değişkenler gösterilmektedir:
 */

public class DegiskenRolleri {
    public static void main(String[] args) {
         class Kisi {
            // instance değişkenler
            private String ad;
            private int yas;

            // static değişken
            private static int nesneSayisi = 0;

            // Constructor
            public Kisi(String ad, int yas) {
                this.ad = ad;
                this.yas = yas;
                nesneSayisi++;
            }

            // Yöntemler
            public void setAd(String ad) {
                this.ad = ad;
            }

            public String getAd() {
                return this.ad;
            }

            public void setYas(int yas) {
                this.yas = yas;
            }

            public int getYas() {
                return this.yas;
            }

            public static int getNesneSayisi() {
                return nesneSayisi;
            }
        }
        Kisi kisi1 = new Kisi("Ahmet", 30);
        Kisi kisi2 = new Kisi("Mehmet", 35);

        System.out.println(kisi1.getAd()); // "Ahmet"
        System.out.println(kisi1.getYas()); // 30

        System.out.println(Kisi.getNesneSayisi()); // 2

        kisi1.setAd("Ali");
        kisi1.setYas(40);

        System.out.println(kisi1.getAd()); // "Ali"
        System.out.println(kisi1.getYas()); // 40

        // Local değişken örneği
        int sonuc = 0;
        for (int i = 0; i < 10; i++) {
            sonuc += i;
        }
        System.out.println(sonuc); // 45


    }
}


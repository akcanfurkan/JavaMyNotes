package referans_kavrami;

      // Bu sınıf Cat adını taşımaktadır ve bir kedi nesnesinin adı, yaşı ve türünü temsil etmek için kullanılır.
     // Cat sınıfının üç özelliği vardır: name, age, breed. Bunlar kedi nesnesinin adını, yaşını ve türünü saklamak için kullanılır.

 public class Cat {
    String name;
    int age;
    String breed;

    // Cat sınıfının bir yapıcı metodu (constructor) vardır. Bu metod kedi nesnesinin özelliklerini ayarlamak için
    // kullanılır.
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Cat sınıfının bir metodu da printInfo adında bir metod vardır. Bu metod, kedi nesnesinin adı, yaşı ve türünü ekrana yazdırmak için
    // kullanılır.
    public void printInfo() {
        System.out.println("Adı: " + this.name);
        System.out.println("Yaşı: " + this.age);
        System.out.println("Türü: " + this.breed);
    }

    // main metodu ise, Cat sınıfının bir örneğini oluşturur ve printInfo metodunu çağırarak kedi nesnesinin bilgilerini ekrana
    // yazdırır.
    public static void main(String[] args) {
        Cat muffin = new Cat("Muffin", 2, "Kisi");
        Cat boncuk = new Cat( "Boncuk", 2, "Kedi");
        muffin.printInfo();
        boncuk.printInfo();
    }
}

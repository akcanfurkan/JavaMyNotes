package degisken_kavrami;

public class IlkelVeriTipleri {

    public static void main(String[] args) {

        //Aşağıdaki ifadeler tamsayı ve ondalıklı sayı veri türlerinin özelliklerini yazdırır:

        System.out.println("Byte En Küçük Değeri: " + Byte.MIN_VALUE + " En Büyük Değeri: " + Byte.MAX_VALUE + " Kaç Bit: " + Byte.SIZE);
        System.out.println("Short En Küçük Değeri: " + Short.MIN_VALUE + " En Büyük Değeri: " + Short.MAX_VALUE + " Kaç Bit: " + Short.SIZE);
        System.out.println("İnteger En Küçük Değeri: " + Integer.MIN_VALUE + " En Büyük Değeri: " + Integer.MAX_VALUE + " Kaç Bit: " + Integer.SIZE);
        System.out.println("Long En Küçük Değeri: " + Long.MIN_VALUE + " En Büyük Değeri: " + Long.MAX_VALUE + " Kaç Bit: " + Long.SIZE);
        System.out.println("Float En Küçük Değeri: " + Float.MIN_VALUE + " En Büyük Değeri: " + Float.MAX_VALUE + " Kaç Bit: " + Float.SIZE);
        System.out.println("Double En Küçük Değeri: " + Double.MIN_VALUE + " En Büyük Değeri: " + Double.MAX_VALUE + " Kaç Bit: " + Double.SIZE);

        //char veri tipinin özeliiklerine bakalım:

        char ch = 'a';

        System.out.println("Chracter: " + ch + " Its numerıc value: " + (int)ch);
        ch = 'A';
        System.out.println("Chracter: " + ch + " Its numerıc value: " + (int)ch);
        ch = '9';
        System.out.println("Chracter: " + ch + " Its numerıc value: " + (int)ch);
        ch = ' ';
        System.out.println("Chracter: " + ch + " Its numerıc value: " + (int)ch);
        ch = '£';
        System.out.println("Chracter: " + ch + " Its numerıc value: " + (int)ch);

        ch = (char) -5;
        System.out.println("Chracter: " + ch + " Its numerıc value: " + (int)ch);

        ch = (char) -65535;
        System.out.println("Chracter: " + ch + " Its numerıc value: " + (int)ch);





    }

}

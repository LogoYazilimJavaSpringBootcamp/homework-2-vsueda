import java.util.*;

public class Odev1 {
    public void Odev(){
        //Collection framework içerisindeki yapıları örnekleyip açıklayınız.
        // <Set> -> aynı elemandan iki tane bulunmasına izin vermez ve bu sebeple de birden fazla null değer alamaz.
        //Interfaceleri
        //<HashSet> Verileri belli bir sıra olmadan kaydeder.
        HashSet<String> computers = new HashSet<String>();
        computers.add("Dell");
        computers.add("Casper");
        computers.add(null);
        //İkinciye Dell veya null eklemeye çalışırsak buna izin vermez

        //LinkedHashSet<E> ekleme sırasını korur
        LinkedHashSet<String> colors = new LinkedHashSet<String>();
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");
        // Çıktısı Yellow Blue Green şeklinde olacaktır.

        //TreeSet<E> ascending olarak tutulur. null ekleme yapılmasına izin verilmez.
        TreeSet<String> dictionary = new TreeSet<String>();
        dictionary.add("Phone");
        dictionary.add("Computer");
        dictionary.add("Glass");
        //Çıktısı Computer Glass Phone şeklinde tutulur

        //List<E> -> aynı eleman eklenmesine, istenilen indekse eklenmesine izin verir ve elemanları ekleme sırasına göre tutar.
        //Interfaceleri
        //ArrayList<E>
        ArrayList<String> computers2 = new ArrayList<>();
        computers2.add("Dell");
        computers2.add("Casper");
        computers2.add(3,"HP");

        //LinkedList<E> Ekleme ve silme işlemlerinde arrayliste göre daha hızlı çalışır. Arama işlemleri içiçn arrayliste göre daha dezavantajlıdır.
        LinkedList<String> computers3 = new LinkedList<>();
        computers3.add("Dell");
        computers3.add("Casper");

        //Queue<E> FIFO prensibi ile çalışır.

        //Map<K, V> veriler key ile tutulur, keyler unique özelliğe sahiptir.
        //Interfaceleri
        //HashMap<K, V> sıralaması yoktur, null değer kabul eder.
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(1, "Sueda");
        students.put(2, "Reyhan");

        //TreeMap<K, V> key değerleri için ascending sıralama yapar
        HashMap<Integer, String> students2 = new HashMap<Integer, String>();
        students2.put(2, "Sueda");
        students2.put(1, "Reyhan");
        //Çıktısı 1 Reyhan 2 Sueda şeklinde olacaktır

        //HashTable<K, V> hashmapin aksine null değer almaz.
    }


    /*

    Java’nın platform bağımsızlığını nasıl sağladığını anlatınız.
->“Bir Kez Yaz, Her Yerde Çalıştır” (Write Once, Run Anywhere –WORA)  prensibi ile kodları direkt makine diline çevirmektense kaynak kodlara çevirir.
Bu sayede her platformda çalıştırılabilir.

Java neden çoklu kalıtımı desteklemez? Hangi diller bu duruma neden izin verir?
-> Çoklu kalıtım SOLID prensiplerinden Single Responsibility prensibini ezmektedir. Burada bir sınıfa birden fazla davranış eklemiş oluyoruz.
Override edilirken çakışmalara sebep olabileceği için bunun kullanılması tercih edilmemektedir. Ancak bu özelliği intefaceler aracılığı ile sağlanılabilinmektedir.
Bağımlılığı arttırır.
->C++, Perl, Python, Lisp ilişki

Build Tool nedir? Java ekosistemindeki toollar neler?
->Kaynak kodların derlenmesi, bağımlılıkların indirilmesi vb. aşamalarında bu süreci doğru sırada ve hatasız bir şekilde derleyen yapıdır.
-> JDK, gradale, apache, hibernate, docker
     */
}

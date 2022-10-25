# ebebek-Java-QA-Practicum


"Employee" adında, fabrika çalışanlarını temsil eden ve metotlar ile çalışanların maaşlarını hesaplayan bir sınıf yazdım. Bu sınıf 4 nitelik ve 5 metoda sahiptir. 

Projenin amacı; personelin Adı, maaşı, çalışma saati, başlangıç yılı, vergi, aylık bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini hesaplayarak konsola yazdırmaktır.

<h3>Sınıfın Nitelikleri</h3>

name : Çalışanın adı ve soyadı
<br>salary : Çalışanın maaşı
<br>workHours : Haftalık çalışma saati
<br>hireYear : İşe başlangıç yılı

<h3>Sınıfın Metotları</h3>

**Employee(name,salary,workHours,hireYear)** : Kurucu metot olup 4 parametre almaktadır.

****tax()**** : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır. 1000 ise bir mesaj yazdırır ve programdan çıkar.
tax() fonksiyonu ile sadece salary’i uygulanan vergi hesaplanacak.

**bonus()** : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde aylık yani 30 günlük bonus ücretini hesaplayacaktır.

**raiseSalary()** : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
raiseSalary() metodunu hesaplarken vergi ve bonuslar dikkate alınmıştır.

**ToString()** : Çalışana ait bilgileri ekrana bastıracaktır.


Notlar :
<br>**_Toplam maaş:_** çalışanın kendi maaşı +artış+ bonus.
<br>_**Vergi ve bonuslarla birlikte maaş :**_ vergi, bonus ve çalışanın kendi maaşı ile bulunacak.

Oluşturulan Run class'ında ise Employee class'ında oluşturulan constractordan nesne oluşturdum ve bu nesne ile metodları çağırarak çalıştırdım.

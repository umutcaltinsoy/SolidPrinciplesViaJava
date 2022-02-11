# Innova&Patika Java Spring Bootcamp - Week 5

## SOLID Prensipleri

* (S)ingle Responsibility Principle

* (O)pen/Closed Principle

* (L)iskov ‘s Substitution Principle

* (I)nterface Segregation Principle

* (D)ependency Inversion Principle


#### 1.) Single Responsibility Principle

Projenin içerisindeki her bir yapı, diğer yapılara o kadar bağımlıdır ve yapılan işler o kadar iç içe geçmiştir ki; küçük bir değişikliğin neleri etkileyeceğini kestirmeniz çok zordur ve genelde böyle projeler çöp proje olarak görülür. İçerisindeki class’ları methodları alıp başka bir projede kullanamazsınız.

Eğer tek sorumluluk prensibine uyarsanız bu şekilde binlerce satırlık class’larınız methodlarınız olmaz. Her class’ın, her mothodun sadece tek bir yaptığı iş vardır, böylece bir değişiklik yapmak için sadece bir nedeniniz olmuş olur. Genişleyebilir, tekrar kullanılabilir ve test edilebilir yapılar kurmak için tek sorumlulukilkesini dikkate almamız gerekir.

#### 2.) Open/Closed Principle

Open/Closed prensibine göre; sınıflar genişletmeye açık, ancak değişikliğe kapalı olmalıdır. Projemizde oluşabilecek yeni istek ve ihtiyaçlar sonucunda yapacağımız geliştirmeler, projemizdeki diğer sistemleri etkilememeli ve herhangi bir değişikliğe sebep olmamalıdır.

#### 3.) Liskov's Substitution Principle

Liskov Substitution(Yerine geçme) prensibine göre; alt sınıflarda oluşturulan nesnelerin üst sınıfların nesneleriyle yer değiştirdiklerinde aynı davranışı göstermek zorunda olduklarını söyler. Yani; türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanmak zorundadır. Eğer kullanmaz ise ortaya işlevsiz kodlar çıkacaktır.

#### 4.) Interface Segregation Principle

Interface Segregation(Ara yüz Ayrılması) prensibi’nin temel amacı; interface implementasyonu sonucunda oluşacak gereksiz kodları önlemek ve kodumuzun daha amaca yönelik hale gelmesini sağlamaktır. Şöyle ki; bir class bir interface implement ettiğinde, interface’in barındırdığı tüm method’ları barındırmak veya oluşturmak zorundadır. Interface Segregation’a göre eğer bir class’ta gerçekten ihtiyaç duyulmayan ve kullanılmayan method’lar interface aracılığı ile implement edilmiş ise bu kodlar dummy code olur. Bu yüzden interface’ler ayrılmalı ve class’lar açısından işlevsel olmayan method’lar barındırması engellenmelidir. Bunu yaparak, class’larımızın yalnızca kendilerini ilgilendiren method’lar ile ilgilenmesini sağlayabiliriz.

#### 5.) Dependency Inversion Principle

Dependency Inversion(Bağımlılıkların Tersine Çevrilmesi) prensibi, yazılım modüllerinin ayrıştırılmasını ifade eder. Bu şekilde, düşük seviyeli modüllere bağlı yüksek seviyeli modüller yerine, her ikisi de sadece abstract(soyut) kavramlara bağlı olacaktır. Burada amaç; üst seviyedeki modüllerin alt seviyelere bağımlı olmasından dolayı çıkabilecek sorunları ortadan kaldırmaktır. Yani alt seviyede yapılan herhangi bir değişikliğin üst seviyede kod değişikliğine veya onun bağımlılıklarının etkinlemesine engel olmaktır.

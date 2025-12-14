# 🧠 Java Stream API – `filter()` ve `map()` Pratik Soruları

Bu dosya, Java Stream API’de özellikle `filter()` ve `map()` metodlarını pratik etmek için hazırlanmıştır.  
Toplam **10 soru** yer alır: 5 kolay, 5 orta seviye.

---

## 🟢 Kolay Seviye (Filter / Map Temel Kullanım)

### 1. Pozitif Sayıları Filtrele
Bir `List<Integer>` veriliyor.  
Sadece **pozitif sayıları** içeren yeni bir liste oluştur.

> **Örnek Girdi:** `[3, -1, 0, 5, -7]`  
> **Beklenen Çıktı:** `[3, 5]`

---

### 2. Harfleri Büyük Yap
Bir `List<String>` listesindeki tüm kelimeleri **büyük harfe** dönüştür.

> **Örnek Girdi:** `["java", "stream", "api"]`  
> **Beklenen Çıktı:** `["JAVA", "STREAM", "API"]`

---

### 3. Çift Sayıların Karelerini Al
Bir `List<Integer>` içinden sadece **çift sayıları** al ve her birinin **karesini** hesapla.

> **Örnek Girdi:** `[1, 2, 3, 4, 5, 6]`  
> **Beklenen Çıktı:** `[4, 16, 36]`

---

### 4. Uzunluğu 5’ten Büyük Kelimeler
Bir `List<String>` içinde uzunluğu **5’ten büyük** kelimeleri filtrele.

> **Örnek Girdi:** `["apple", "banana", "kiwi", "mango"]`  
> **Beklenen Çıktı:** `["banana"]`

---

### 5. Null veya Boş Değerleri Temizle
Bir `List<String>` içinde `null` veya `""` (boş) olanları filtrele ve kalanları büyük harfe çevir.

> **Örnek Girdi:** `["java", "", null, "stream"]`  
> **Beklenen Çıktı:** `["JAVA", "STREAM"]`

---

## 🟡 Orta Seviye (Birleştirme, Karma Kullanım)

### 6. Kişi Yaş Filtresi
Bir `List<Person>` nesnesi var (`Person` sınıfında `String name`, `int age`).  
Yaşı 18’den büyük kişilerin **isimlerini büyük harflerle** listele.

> **Örnek:**  
> `Ali(17), Ayşe(22), Berk(30)` → `["AYŞE", "BERK"]`

---

### 7. Metin Listesinden Uzunluk Listesi
Bir `List<String>` içinde her kelimenin **uzunluğunu** içeren bir `List<Integer>` oluştur,  
ama sadece uzunluğu **3’ten fazla** olan kelimeleri dahil et.

> **Örnek:**  
> `["AI", "ChatGPT", "Java"] → [7, 4]`

---

### 8. Fiyat Filtresi
Bir `List<Double>` fiyat listesinde yalnızca **100 TL’den büyük** olanları al,  
her birine **%10 indirim** uygula (0.9 ile çarp), sonucu yeni liste olarak döndür.

> **Örnek:**  
> `[50.0, 120.0, 200.0] → [108.0, 180.0]`

---

### 9. Karakter Dizilerini Sayıya Çevir
Bir `List<String>` içinde sadece **sayıya çevrilebilen** değerleri al,  
bunları `Integer`’a dönüştürüp yazdır.

> **Örnek:**  
> `["10", "abc", "30", "5x"] → [10, 30]`

---

### 10. İsim Baş Harfi
Bir `List<String>` içindeki her ismin **ilk harfini** al,  
sadece “A” ile başlayan isimleri filtrele,  
kalanların ilk harflerini büyük harfle listele.

> **Örnek:**  
> `["ali", "ahmet", "mehmet", "ayşe", "veli"] → ["A", "A", "A"]`

---

💡 **Ek Öneri:**  
Her sorudan sonra şu yapıyı pratik et:
```java
list.stream()
    .filter(...)   // filtreleme koşulu
    .map(...)      // dönüştürme işlemi
    .toList();     // sonucu yeni liste olarak döndür

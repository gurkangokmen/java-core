# 🧠 Java Stream API Pratik Soruları

Bu belge, Java Stream API'yi öğrenmek ve pekiştirmek için hazırlanmış **10 adet pratik soru** içerir.
Her sorunun altında çözümü ve açıklaması yer alır.

---

## 🟢 Kolay Sorular (1–5)

### 1️⃣ Pozitif Sayıları Filtrele
**Soru:**
Bir `int[] numbers = {-2, -1, 0, 3, 5, -4, 7}` dizisinden yalnızca pozitif sayıları listele.

**Çözüm:**
```java
int[] numbers = {-2, -1, 0, 3, 5, -4, 7};
List<Integer> positives = Arrays.stream(numbers)
        .filter(n -> n > 0)
        .boxed()
        .toList();
System.out.println(positives); // [3, 5, 7]
```

---

### 2️⃣ Uzunluğu 3'ten Büyük Olan Kelimeleri Bul
**Soru:**
`List<String> words = List.of("car", "bus", "airplane", "ship");` listesinden uzunluğu 3’ten fazla olan kelimeleri yazdır.

**Çözüm:**
```java
List<String> words = List.of("car", "bus", "airplane", "ship");
List<String> longWords = words.stream()
        .filter(w -> w.length() > 3)
        .toList();
System.out.println(longWords); // [airplane, ship]
```

---

### 3️⃣ Karelerini Hesapla
**Soru:**
`List<Integer> nums = List.of(1, 2, 3, 4, 5);` listesindeki sayıların karelerini yazdır.

**Çözüm:**
```java
List<Integer> nums = List.of(1, 2, 3, 4, 5);
List<Integer> squares = nums.stream()
        .map(n -> n * n)
        .toList();
System.out.println(squares); // [1, 4, 9, 16, 25]
```

---

### 4️⃣ Kelimeleri Büyük Harfe Çevir
**Soru:**
`List<String> names = List.of("ali", "veli", "ayşe");` listesindeki kelimeleri büyük harfe dönüştür.

**Çözüm:**
```java
List<String> names = List.of("ali", "veli", "ayşe");
List<String> upper = names.stream()
        .map(String::toUpperCase)
        .toList();
System.out.println(upper); // [ALI, VELI, AYŞE]
```

---

### 5️⃣ Toplamı Bul
**Soru:**
`List<Integer> numbers = List.of(3, 6, 9, 12);` listesindeki sayıların toplamını hesapla.

**Çözüm:**
```java
List<Integer> numbers = List.of(3, 6, 9, 12);
int sum = numbers.stream()
        .mapToInt(Integer::intValue)
        .sum();
System.out.println(sum); // 30
```

---

## 🟡 Orta Sorular (6–10)

### 6️⃣ En Uzun Kelimeyi Bul
**Soru:**
`List<String> words = List.of("java", "spring", "microservices", "api");` listesindeki en uzun kelimeyi bul.

**Çözüm:**
```java
List<String> words = List.of("java", "spring", "microservices", "api");
String longest = words.stream()
        .max(Comparator.comparingInt(String::length))
        .orElse("");
System.out.println(longest); // microservices
```

---

### 7️⃣ Tek Sayıların Küplerini Al ve Azalan Sırala
**Soru:**
`List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);` listesindeki tek sayıların küplerini azalan sırada listele.

**Çözüm:**
```java
List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
List<Integer> result = numbers.stream()
        .filter(n -> n % 2 != 0)
        .map(n -> n * n * n)
        .sorted(Comparator.reverseOrder())
        .toList();
System.out.println(result); // [729, 343, 125, 27, 1]
```

---

### 8️⃣ Aynı Harfle Başlayanları Grupla
**Soru:**
`List<String> fruits = List.of("apple", "apricot", "banana", "blueberry", "avocado");` listesini ilk harflerine göre grupla.

**Çözüm:**
```java
List<String> fruits = List.of("apple", "apricot", "banana", "blueberry", "avocado");
Map<Character, List<String>> grouped = fruits.stream()
        .collect(Collectors.groupingBy(f -> f.charAt(0)));
System.out.println(grouped);
// {a=[apple, apricot, avocado], b=[banana, blueberry]}
```

---

### 9️⃣ En Büyük 3 Sayıyı Bul
**Soru:**
`List<Integer> nums = List.of(10, 40, 20, 70, 30, 90, 50);` listesindeki en büyük 3 sayıyı bul.

**Çözüm:**
```java
List<Integer> nums = List.of(10, 40, 20, 70, 30, 90, 50);
List<Integer> top3 = nums.stream()
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .toList();
System.out.println(top3); // [90, 70, 50]
```

---

### 🔟 Liste Elemanlarını Virgülle Birleştir
**Soru:**
`List<String> cities = List.of("Ankara", "İstanbul", "İzmir");` listesini tek satırda virgülle birleştir.

**Çözüm:**
```java
List<String> cities = List.of("Ankara", "İstanbul", "İzmir");
String joined = cities.stream()
        .collect(Collectors.joining(", "));
System.out.println(joined); // Ankara, İstanbul, İzmir
```

---

## ✅ Sonuç
Bu 10 alıştırma, Java Stream API'nin temel yapı taşlarını (filter, map, sorted, collect, groupingBy, joining) pratik etmeni sağlar.  
Dilersen bir sonraki aşamada **Stream API ile custom nesne filtreleme ve aggregation (reduce, groupingBy)** içeren ileri seviye örnekler de hazırlayabilirim.


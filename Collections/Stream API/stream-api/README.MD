# Java Stream API Nedir?

## 🚀 1. Stream API Nedir?

**Stream API**, Java 8 ile gelen ve koleksiyon verileri üzerinde
fonksiyonel programlama tarzında işlem yapmamızı sağlayan bir yapıdır.

### Özellikleri

-   Veriyi depolamaz, sadece işler.\
-   İşlemler **pipeline (boru hattı)** şeklinde zincirlenir.\
-   Kodlar daha **kısa**, **okunabilir**, ve **paralel
    çalıştırılabilir** hale gelir.

### Amaç

`for`, `for-each` gibi döngülerle yaptığın işlemleri daha sade ve
fonksiyonel biçimde yapmak.

------------------------------------------------------------------------

## ⚙️ 2. Stream API'nin Temel Yapısı

Bir stream işlemi 3 aşamadan oluşur: 
1. **Kaynak (Source)**: Örneğin bir
`List`, `Set`, `Array`, veya `File`. 

2. **Ara işlemler (Intermediate
Operations)**: Stream'i dönüştüren veya filtreleyen işlemler (örneğin
`filter`, `map`).

3. **Son işlemler (Terminal Operations)**: Stream'i
tüketen işlemler (örneğin `collect`, `forEach`, `count`).

------------------------------------------------------------------------

## 🧩 3. Stream API Metotları

### Kaynak (Source) Metotları

  --------------------------------------------------------------------------------
Metot                    Açıklama                       Örnek
  ------------------------ ------------------------------ ------------------------
`stream()`               Koleksiyondan stream           `list.stream()`
oluşturur.

`of()`                   Belirtilen elemanlardan stream `Stream.of(1, 2, 3)`
oluşturur.

`Arrays.stream()`        Diziden stream oluşturur.      `Arrays.stream(arr)`

`IntStream.range(a,b)`   Belirli aralıkta int stream    `IntStream.range(1,5)`
üretir.
  --------------------------------------------------------------------------------

------------------------------------------------------------------------

### 🔍 Ara (Intermediate) İşlemler

#### `filter(Predicate<T> p)`

Koşulu sağlayan elemanları alır.

``` java
list.stream().filter(x -> x > 10)
```

#### `map(Function<T, R> f)`

Her elemanı dönüştürür.

``` java
list.stream().map(x -> x * 2)
```

#### `flatMap(Function<T, Stream<R>> f)`

İç içe listeleri düzleştirir.

``` java
List<List<Integer>> nested = List.of(List.of(1,2), List.of(3,4));
nested.stream().flatMap(List::stream); // 1,2,3,4
```

#### `distinct()`

Tekrarlanan elemanları kaldırır.

``` java
list.stream().distinct()
```

#### `sorted()`

Elemanları sıralar.

``` java
list.stream().sorted()
```

Özel karşılaştırıcıyla:

``` java
list.stream().sorted(Comparator.reverseOrder())
```

#### `peek(Consumer<T> c)`

Ara debug veya loglama için kullanılır (stream'i değiştirmez).

``` java
list.stream().peek(System.out::println)
```

#### `limit(long n)`

İlk `n` elemanı alır.

``` java
list.stream().limit(3)
```

#### `skip(long n)`

İlk `n` elemanı atlar.

``` java
list.stream().skip(2)
```

------------------------------------------------------------------------

### 🧮 Son (Terminal) İşlemler

#### `forEach(Consumer<T> c)`

Her eleman üzerinde işlem yapar.

``` java
list.stream().forEach(System.out::println);
```

#### `collect(Collector c)`

Stream'i koleksiyona çevirir.

``` java
list.stream().collect(Collectors.toList());
```

#### `count()`

Eleman sayısını döner.

``` java
list.stream().count();
```

#### `findFirst()`

İlk elemanı döner (Optional).

``` java
list.stream().findFirst();
```

#### `findAny()`

Herhangi bir elemanı döner (paralel streamlerde farklı davranabilir).

``` java
list.stream().findAny();
```

#### `anyMatch(Predicate<T> p)`

Koşulu sağlayan en az bir eleman varsa `true`.

``` java
list.stream().anyMatch(x -> x > 10);
```

#### `allMatch(Predicate<T> p)`

Tüm elemanlar koşulu sağlıyorsa `true`.

``` java
list.stream().allMatch(x -> x > 0);
```

#### `noneMatch(Predicate<T> p)`

Hiçbir eleman koşulu sağlamıyorsa `true`.

``` java
list.stream().noneMatch(x -> x < 0);
```

#### `min(Comparator<T>)` / `max(Comparator<T>)`

En küçük / en büyük elemanı bulur.

``` java
list.stream().min(Integer::compareTo);
```

#### `reduce()`

Tüm elemanları tek değere indirger (örneğin toplam, çarpım).

``` java
list.stream().reduce(0, Integer::sum); // Toplam
```

------------------------------------------------------------------------

### ⚡ Paralel Stream

Stream işlemlerini çok çekirdekli çalıştırır:

``` java
list.parallelStream()
    .filter(x -> x > 10)
    .forEach(System.out::println);
```

------------------------------------------------------------------------

## 🧠 4. Örnek --- Tümünü Gösteren Basit Senaryo

``` java
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 8, 5, 2, 8, 10);

        List<Integer> result = numbers.stream()
            .filter(n -> n > 4)
            .distinct()
            .sorted()
            .map(n -> n * 2)
            .peek(System.out::println)
            .collect(Collectors.toList());

        System.out.println("Sonuç: " + result);
    }
}
```

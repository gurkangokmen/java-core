# 1. Kalıtım zincirine bakmak (en kesin yöntem)

**Checked exceptions**: `Exception` sınıfından türeyip **RuntimeException’ın alt sınıfı olmayan**lardır.  
**Unchecked exceptions**: `RuntimeException` veya onun alt sınıflarıdır.

## Örnek

| Checked            | Unchecked                            |
|------------------|-------------------------------------|
| `IOException extends Exception`  | `NullPointerException extends RuntimeException` |

> **Özet kural:**
> - `RuntimeException` ve alt sınıfları → **unchecked**
> - `Exception` (ama `RuntimeException` değil) → **checked**

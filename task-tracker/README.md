Görev Takip Uygulaması (Task Tracker)

Bu uygulama, Java dilinde yazılmış basit bir komut satırı (CLI) görev takip sistemidir. Görev ekleyebilir ve listeleyebilirsiniz.

Özellikler

Görev ekleme

Görev listeleme

Görev durumu (default: TODO)

Kullanılan Teknolojiler

Java 8

Maven

H2 (hazır, ileride kullanılabilir)

Kurulum ve Çalıştırma

# Maven ile derleme
mvn clean compile

# Uygulamayı çalıştırma
mvn exec:java -Dexec.mainClass="com.recep.tasktracker.App"

Maven Gereksinimi

pom.xml dosyasında H2 veritabanı bağımlılığı tanımlıdır.

Örnek Çıktı

--- GÖREV TAKİP UYGULAMASI ---
1. Görev Ekle
2. Görevleri Listele
3. Çıkış
Seçiminiz: 1
Görev adı: Örnek Görev
Açıklama: Bu bir deneme görevdir.
Görev başarıyla eklendi.

Geliştiren

Recep YÜKSEKTEPE

Deploy

İlerleyen adımda Railway veya Docker ile deploy edilecektir.

Lisans

MIT


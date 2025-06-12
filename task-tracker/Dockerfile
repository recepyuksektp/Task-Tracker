# Maven ve JDK içeren resmi image kullanılıyor
FROM maven:3.8.6-openjdk-17

# Çalışma dizinini ayarla
WORKDIR /app

# Proje dosyalarını kopyala
COPY . .

# Maven ile build et
RUN mvn clean package

# Uygulamayı başlat
CMD ["java", "-cp", "target/task-tracker-1.0-SNAPSHOT.jar", "com.recep.tasktracker.App"]

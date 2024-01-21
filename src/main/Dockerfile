# Kullanılacak temel imaj
FROM openjdk:17-jdk-slim

# Çalışma dizini oluştur
WORKDIR /app

# Proje dosyalarını kopyala
COPY target/*.jar app.jar

# Uygulamayı çalıştır
CMD ["java", "-jar", "app.jar"]
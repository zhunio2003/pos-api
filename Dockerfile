# Dockerfile para Spring Boot API
FROM openjdk:17-jdk-slim

# Información del mantenedor
LABEL maintainer="tu-email@ejemplo.com"
LABEL description="POS API - Sistema de Punto de Venta"

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo JAR generado por Maven/Gradle
COPY target/pos-api-*.jar app.jar

# Exponer el puerto 8080 (puerto por defecto de Spring Boot)
EXPOSE 8080

# Variables de entorno por defecto
ENV SPRING_PROFILES_ACTIVE=docker
ENV JAVA_OPTS="-Xmx512m -Xms256m"

# Comando para ejecutar la aplicación
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]

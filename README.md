# Microservicio Veterinaria - Backend 🐾

Este repositorio contiene el backend (API REST) para la aplicación móvil *Veterinaria App. Está construido con **Spring Boot (Kotlin)* y proporciona los servicios necesarios para gestionar el registro, consulta y adopción de animales.

## 🛠️ Tecnologías

* *Lenguaje:* Kotlin
* *Framework:* Spring Boot 3.x
* *Base de Datos:* H2 Database (En memoria para desarrollo/pruebas)
* *Persistencia:* Spring Data JPA
* *Herramienta de Construcción:* Gradle (Kotlin DSL)

## 🚀 Cómo Iniciar el Proyecto

Este proyecto incluye el Gradle Wrapper (gradlew), lo que significa que no necesitas tener Gradle instalado globalmente.

### Prerrequisitos
* Java JDK 17 o superior instalado.
* Visual Studio Code (recomendado).

### Pasos para Ejecutar

1.  *Clonar el repositorio:*
    bash
    git clone <URL_DE_ESTE_REPOSITORIO>
    cd veterinaria-backend
    

2.  *Dar permisos de ejecución (si es necesario):*
    Si el comando de abajo falla por permisos, ejecuta esto primero:
    bash
    chmod +x gradlew
    

3.  *Ejecutar el servidor:*
    Desde la terminal integrada de *Visual Studio Code* (Ctrl + ñ), ejecuta:

    bash
    ./gradlew bootRun
    

    > *Nota:* La primera vez puede tardar unos minutos mientras descarga las dependencias.

4.  *Verificar que está corriendo:*
    Una vez que veas el mensaje Started VeterinariaBackendApplication, el servidor estará listo.

    Abre tu navegador y visita:
    * *API Animales:* [http://localhost:8080/api/animales](http://localhost:8080/api/animales)
    * *Consola H2:* [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## 📡 Endpoints Disponibles

La API expone los siguientes endpoints para ser consumidos por la aplicación móvil:

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| *GET* | /api/animales | Obtiene la lista de todos los animales. |
| *POST* | /api/animales | Registra un nuevo animal. |
| *PUT* | /api/animales/{id} | Actualiza un animal (ej. marcar como adoptado). |
| *DELETE* | /api/animales/{id} | Elimina un animal de la base de datos. |

## 📱 Conexión con la App Android

Para conectar la aplicación móvil (emulador o dispositivo físico) a este backend local:

1.  Averigua tu *IP Local* (ipconfig en Windows o ifconfig en Mac/Linux).
2.  En el código de Android (RetrofitClient.kt), configura la BASE_URL usando esa IP y el puerto 8080.
    * Ejemplo: http://192.168.1.X:8080/
3.  Asegúrate de que ambos dispositivos estén en la misma red Wi-Fi.

---
*Desarrollado por:* Alonso Rivadeneira y Constanza Rojas.

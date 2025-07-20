<!--Título-->
<h1 align="center">BurgerMail - Pedidos de Hamburguesas</h1>

<!--Banner-->
<img src="https://i.imgur.com/vVdUNDK.gif" alt="BurgerMail Banner">

## Descripción

>[!NOTE]
> BurgerMail es una aplicación Android desarrollada en Java, diseñada para autoservicio en locales de comida rápida. Permite a los clientes armar pedidos personalizados de hamburguesas y enviarlos automáticamente por correo electrónico al local y al cliente como confirmación. 
>
>La app guía al usuario paso a paso: 
>
>1. Ingreso del nombre y correo. 
>2. Selección de cantidad de hamburguesas.
>3. Elección del tipo de carne. 
>4. Ingredientes. 
>5. Salsas.
>6. Acompañamientos. 
>7. Revisión del resumen.
>8. Confirmación del pedido. 
>
>Cada hamburguesa se registra individualmente, el total se calcula automáticamente, y el envío se realiza a través de una API interna basada en JavaMail (SMTP).

## Capturas de Pantalla

>[!NOTE]
> Estas son algunas vistas representativas del funcionamiento de la aplicación.
> <br>
>
>### 🟢 Inicio del Pedido
>
>| Splash | Inicio del Pedido | Nombre del Cliente | Email del Cliente |
>|--------|-------------------|--------------------|-------------------|
>| <img src="https://i.imgur.com/oSEdT0p.jpg" width="170px"> | <img src="https://i.imgur.com/yilGfeS.jpg" width="170px"> | <img src="https://i.imgur.com/4Fo0cCA.jpg" width="170px"> | <img src="https://i.imgur.com/zYZKPY9.jpg" width="170px"> |
>
>### 🍔 Personalización de la Hamburguesa
>
>| Cantidad del Pedido | Tipo de Carne | Ingredientes | Salsas |
>|---------------------|---------------|--------------|--------|
>| <img src="https://i.imgur.com/S1dvc2A.jpg" width="170px"> | <img src="https://i.imgur.com/pxuNVSK.jpg" width="170px"> | <img src="https://i.imgur.com/MQUfGoe.jpg" width="170px"> | <img src="https://i.imgur.com/Y00Xn1H.jpg" width="170px"> |
>
>### 🧾 Resumen y Confirmación del Pedido
>
>| Acompañamiento | Lista Hamburguesas | Fin del Pedido | Confirmación |
>|----------------|--------------------|----------------|--------------|
>| <img src="https://i.imgur.com/FRg6dlQ.jpg" width="170px"> | <img src="https://i.imgur.com/tuud0aC.jpg" width="170px"> | <img src="https://i.imgur.com/ku7FUHf.jpg" width="170px"> | <img src="https://i.imgur.com/qppKfFp.jpg" width="170px" height="370px"> |

## Características

>[!NOTE]
> - Registro de nombre y correo electrónico del cliente.
> - Creación de múltiples hamburguesas por pedido.
> - Personalización completa: carne, ingredientes, salsas y acompañamiento.
> - Cálculo automático del precio total.
> - Edición y eliminación de hamburguesas en la lista.
> - Envío del resumen del pedido por correo electrónico.
> - SplashScreen moderno al iniciar.

## Tecnologías Utilizadas

>[!NOTE]
> - Java  
> - Android SDK 24+
> - Bibliotecas:
>   - JavaMail (`android-mail` y `android-activation`) – envío de correos mediante SMTP (Gmail)
>   - SplashScreen (`androidx.core:core-splashscreen`) – pantalla inicial animada

## Configuración del Correo

>[!IMPORTANT]
> Desde mayo de 2022, Gmail **ya no permite usar tu contraseña habitual** en apps externas.
>
> Debes generar una **contraseña de aplicación** de 16 dígitos desde:  
> 👉 [https://myaccount.google.com/apppasswords](https://myaccount.google.com/apppasswords)
>
> Requisitos:
> 1. Activa la verificación en 2 pasos en tu cuenta Gmail.
> 2. Elige la opción **Correo** y nómbrala como "BurgerMailApp".
> 3. Usa esa contraseña en lugar de tu contraseña real en la variable `PASS` del código.

## Instalación

>[!TIP]
> 1. Clona el repositorio:
>    ```bash
>    git clone https://github.com/tu-usuario/BurgerMail.git
>    ```
> 2. Abre el proyecto en Android Studio.
> 3. Verifica y sincroniza las dependencias de Gradle.
> 4. Configura la contraseña de aplicación para el envío de correos.
> 5. Compila y ejecuta el proyecto en un emulador o dispositivo Android.

## Uso

>[!TIP]
> 1. Ingresa tu nombre y correo electrónico.
> 2. Personaliza tu hamburguesa (carne, ingredientes, salsas, acompañamiento).
> 3. Agrega la hamburguesa a la lista.
> 4. Repite si deseas más ítems.
> 5. Confirma y envía el pedido por email.
> 6. Visualiza el resumen enviado.

## Gradle

>[!TIP]
> Asegúrate de incluir estas dependencias en tu archivo `build.gradle`:
>
> ```gradle
> implementation 'com.sun.mail:android-mail:1.6.7'
> implementation 'com.sun.mail:android-activation:1.6.7'
> implementation 'androidx.core:core-splashscreen:1.0.1'
> ```

## Contribución

>[!NOTE]
> Si deseas mejorar esta aplicación:
> 1. Crea un "Issue" con tu propuesta.
> 2. Realiza los cambios en una rama aparte.
> 3. Envía una Pull Request.

## Licencia

>[!IMPORTANT]
> Este proyecto se encuentra bajo la Licencia Apache 2.0.
> Consulta el archivo [LICENSE](https://github.com/jcallally/android-java-app-burgermail/blob/main/LICENSE) para más detalles.
>
> ```
>    Copyright (c) 2025 Javier Callally
>    
>    Licensed under the Apache License, Version 2.0 (the "License");
>    you may not use this file except in compliance with the License.
>    You may obtain a copy of the License at
>    
>    http://www.apache.org/licenses/LICENSE-2.0
>    
>    Unless required by applicable law or agreed to in writing, software
>    distributed under the License is distributed on an "AS IS" BASIS,
>    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
>    See the License for the specific language governing permissions and
>    limitations under the License.
> ```

## Versión Completa

>[!IMPORTANT]
> Esta es una versión incompleta del proyecto **BurgerMail**, publicada únicamente con fines informativos y de demostración.  
>
> La versión completa incluye todas las funcionalidades activadas, soporte técnico y futuras actualizaciones. Está disponible solo para clientes registrados que hayan adquirido la aplicación.  
>
> 📩 Si deseas obtener la versión completa, por favor contacta directamente con el autor. 

## Contacto

>[!IMPORTANT]
> Si tienes preguntas o deseas más información:
>
> - Nombre: Javier Callally
> - Correo Electrónico: jcallally@gmail.com

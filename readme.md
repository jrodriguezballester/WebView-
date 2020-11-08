# WebView

<https://github.com/jrodriguezballester/WebView.git>

Realización de una practica de embeber una pagina web en una webView android

## Realizacion

1) En el Manifest dar permiso al usuario para usar internet
![Screenshot](/imagenes/capt2.png)
2) En el diseño de la activity (activity_main.xml)
![Screenshot](/imagenes/capt1.png)
    Pondremos el WebView  donde queremos embeber la web (Widgets--> WebView)
3) En el codigo de la activity (Main_activity.java)
![Screenshot](/imagenes/capt3.png)
    * Relacionar objeto grafico con objeto java
    * Administrar las propiedades del WebView con WebSettings en particular dar acceso a javascript

 (<https://developer.android.com/reference/android/webkit/WebSettings>)
    * Indicar la url de la web a embeber
    * Utilizamos WebViewClient para obtener otras funcionalidades (<https://developer.android.com/reference/android/webkit/WebViewClient>)

      * Cargar los enlaces dentro del mismo webview

      * Poner en el titulo de la App el titulo de la Web
   ![Screenshot](/imagenes/capt5.png)



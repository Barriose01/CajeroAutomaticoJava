# CajeroAutomaticoJava
Programa que emula el comportamiento de un cajero automatico en Java

Es necesario contar con un programa o IDE que permita ejecutar archivos .java.
Los archivos se deben mantener en la carpeta en la que aparecen al descargarse el archivo

Al iniciar el programa (CajeroAutomatico4.java), aparecera el siguiente menu, en donde se nos presentaran algunas opciones:

![image](https://user-images.githubusercontent.com/107152796/189545386-fc485dd5-7a25-4144-ae77-1313599215d3.png)

Al elegir la opcion de consultar el saldo, nos mostrara cuanto saldo tenemos actualmente. Como este programa es un demo y no
hace uso de bases de datos, al iniciarlo por primera vez, nos aparecera un saldo de $10000, lo que nos permitira hacer uso de
otras funciones:

![image](https://user-images.githubusercontent.com/107152796/189545431-0bf4a8a7-df70-4b40-9679-156426e88f65.png)

Si ingresamos en la opcion de hacer un retiro, nos redirigira a otro menu, en donde se nos dan opciones para retirar distintas
cantidades de dinero:

![image](https://user-images.githubusercontent.com/107152796/189545464-dbfe5f0f-a79c-4eea-8dbb-133fb2e66746.png)

Al elegir cualquiera de las opciones, siempre que el monto seleccionado sea menor al saldo con el que se cuente, se descontara
esa cantidad del saldo:

![image](https://user-images.githubusercontent.com/107152796/189545515-7d004b5b-e148-42c4-a3a4-ba75ed3646b5.png)

Tambien podemos retirar un monto ingresado por nosotros mismos al escoger la opcion numero 5 de este menu. Nos aparecera un mensaje
pidiendonos el monto y se efectuara la operacion, siempre que el monto ingresado sea menor al saldo con el que se cuente:

![image](https://user-images.githubusercontent.com/107152796/189545586-4f1232f9-2bf3-4ae4-ab38-cc467d638870.png)

Volviendo al menu principal, tenemos la opcion de hacer un deposito. En esta seccion, se nos pedira que ingresemos un monto, el cual
se agregara al saldo con el que contamos:

![image](https://user-images.githubusercontent.com/107152796/189545637-ec07da6d-bd21-4306-b8c7-06fb60798187.png)

Al volver al menu principal, si queremos salir, seleccionamos la opcion 4. Al hacer esto, se terminara el programa




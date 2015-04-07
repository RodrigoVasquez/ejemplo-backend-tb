# ejemplo-backend-tb

Asumiendo que $GLASSFISH_HOME, path de instalación glassfish

* Instalar glassfish4: https://glassfish.java.net
* Iniciar el dominio $GLASSFISH_HOME/bin/asadmin start-domain
* Copiar el driver (mysql-connector-java-5.1.X.jar) de mysql a $GLASSFISH_HOME/lib
* Crear un recurso jdbc: http://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-glassfish-config.html
* Importar proyecto en Netbeans o eclipse (ambos deben tener soporte para gradle).
* Modificar el glassfishHome en el archivo: ~/.gradle/gradle.properties: glassfishHome=/path/to/glassfish_home
* Ejecutar gradle deploy
* Verificar que esta funcionando en localhost:8080/ejemplo-backend-tb/customers

* PD: Se asume que existe una base de datos que posee una tabla customer, que tiene los siguientes tres campos:
    + idcustomer del tipo int
    + namecustomer del tipo varchar
    + lastnamecustomer del tipo varchar

# ejemplo-backend-tb

Asumiendo que $GLASSFISH_HOME, path de instalación glassfish

1.- Instalar glassfish4: https://glassfish.java.net
2.- Iniciar el dominio $GLASSFISH_HOME/bin/asadmin start-domain
3.- Copiar el driver (mysql-connector-java-5.1.X.jar) de mysql a $GLASSFISH_HOME/lib
4.- Crear un recurso jdbc: http://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-glassfish-config.html
5.- Importar proyecto en Netbeans o eclipse (ambos deben tener soporte para gradle).
6.- Modificar el glassfishHome en el archivo 
          ~/.gradle/gradle.properties:
           glassfishHome=/path/to/glassfish_home
7.- Ejecutar gradle deploy
8.- Verificar que esta funcionando en localhost:8080/ejemplo-backend-tb/customers

PD: Se asume que existe una base de datos que posee una tabla customer, que tiene los siguientes tres campos:
    1.- idcustomer del tipo int
    2.- namecustomer del tipo varchar
    3.- lastnamecustomer del tipo varchar

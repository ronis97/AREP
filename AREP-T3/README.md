# Segundo taller de AREP

API Servicios y clientes, aplicativo donde se emula el funcionamiento de un servidor web

## Autor

Edgar Ronaldo Henao Villarreal 

## Preparacion

Clonamos el repositorio con la siguiente instrucción en consola:

```
git clone https://github.com/ronis97/AREP-T3.git
```
Entramos a la carpeta creada:

```
cd AREP-T3
```

### Prerrequisitos

Necesitamos de:
* Maven
* VS code

Para una correcta ejecucion del aplicativo.

### Instalacion

Ejecutamos la siguiente instruccion en consola:

```
mvn package
```

con esto maven se encargara de descargar todos los recursos necesarios para la ejecucion del aplicativo.

Para ejecutar el programa simplemente corremos la instrucción:

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.AREP.HttpServer" 
```

En el navegador entramos con la dirección:

```
http://localhost:8080
```




### Ejecucion

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://vast-badlands-50797.herokuapp.com)



# Hoja de Trabajo - Parcial 2

## Instrucciones

### Alquiler de Carros

1. Cree una clase Cliente, la cual contenga nombre, nit y saldo.
    1. Del Cliente es indispensable en su constructor, el nombre, el nit y su saldo a cero inicialmente.
    1. Crear sus métodos de acceso:
1. Cree una clase Vehiculo, la cual contenga: placas, modelo, marca, precio y estado (alquilado/libre). 
    1. Constructor con placa, modelo, marca y precio.
    1. Crear sus métodos de acceso
1. Cree una clase Alquiler, la cual contenga un Cliente, Vehiculo, fechaInicial y dias.
    1. Crear un constructor con toda la información

### Te Alquilo

1. Crear una clase que contenga una lista Vehículos, una lista de Clientes y una lista de Alquileres. Todas deben ser listas de diferente tipo.
1. Cree una implementación de Ordenamiento QuickSort para ordenar Vehiculos, e implemente un método en TeAlquilo, que muestre el listado de vehiculos ordenado (usted escoja el criterio)
1. Cree una implementación de Ordenamiento ShellSort para ordenar los clientes, e implemente un método en TeAlquilo, que muestre el listado de Clientes ordenado (usted escoja el criterio)
1. Cree un método que permita el alquiler de un vehiculo, revisando si el vehiculo existe en la lista.

### Prueba TeAlquilo

1. Cree una clase de prueba donde:
    1. Ingrese 5 Vehículos
    1. Ingrese 5 Clientes
    1. Alquile 3 carros
    1. Alquile un carro duplicado (para probar que no puede alquilarse, mostrando algún mensaje)
    1. Muestre listado de
        1. Vehículos - ordenado según método
        1. Clientes - ordenado según método
        1. Alquileres.

## Required

* jdk 1.8+
* Maven - https://maven.apache.org/

## Build and Run

```sh
mvn clean package
java -cp target/sort-methods-1.0.0.jar edu.advanced.sort.ShellSort
```

...existing code...
# Ejercicio Persona - Juan David Ortiz

## Diagrama de clases (Mermaid)

```mermaid
classDiagram

class Persona {
  - String nombre
  - String apellidos
  - String numeroDocumentoIdentidad
  - int anoNacimiento

  + Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anoNacimiento)
  + void imprimirInformacion()
  + int calcularEdad()
}

class p1 {
  nombre = "Samuel"
  apellidos = "Rengifo"
  numeroDocumentoIdentidad = "1457893621"
  anoNacimiento = 1998
}

class p2 {
  nombre = "Jhon"
  apellidos = "Montes"
  numeroDocumentoIdentidad = "1572364894"
  anoNacimiento = 2001
}

Persona <|.. p1 : instanceOf
Persona <|.. p2 : instanceOf
```
...existing
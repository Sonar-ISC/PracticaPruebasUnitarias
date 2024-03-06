# Practica Caja Negra y Pruebas Unitarias

En esta practica se definen una serie de enunciados los cuales tiene
como objetivo realizar pruebas unitarias y de caja negra a los mismos.

Cubre las siguientes técnicas de caja negra:
* Valores limite
* Equivalencia
* Tablas de decisión
* Transición de estados

La practica se divide en 3 partes:
1. Primero se analizan los enunciados propuestos por cada técnica de caja negra.
2. Se establecen los casos de prueba para cada enunciado según la técnica de prueba correspondiente.
3. Se desarrolla el código de las pruebas unitarias para cada enunciado.

Nota: Como se ha mencionado como tester es normal que no se tenga acceso al código fuente, por lo que se asume que el código de las pruebas unitarias solamente realizara en base a la descripción del enunciado.

## Enunciados

### Valores limite

Se tiene un sistema que validad si un joven es apto para aplicar al programa de renta joven.
> Este programa de Prosperidad Social es el resultado de la evolución de Jóvenes en Acción y beneficiará a jóvenes entre 14 y 28 años que se encuentran matriculados en Instituciones de Educación Superior (IES), el SENA y Escuelas Normales Superiores.

### Equivalencia

Función que clasifica la calificación de un curso en 'Aprobado', 'Reprobado', o 'Excelente'. 'Aprobado' es una calificación de 60 a 89, 'Excelente' es 90 o más, y cualquier cosa menor a 60 es 'Reprobado'.

### Tablas de decisión

Función que simula un sistema de login. El acceso es concedido si el usuario y la contraseña son correctos. Existen dos roles: 'Admin' y 'Usuario', cada uno con un usuario y contraseña específicos.
La entrada es un usuario y una contraseña, y la salida es un mensaje con el rol de usuario o un mensaje de error el cual es "Acceso denegado".

### Transición de estados

Función que maneja las transiciones de estado de un pedido en línea: 'Pendiente', 'En Proceso', 'Enviado', 'Entregado'.
La entrada es el estado actual y la acción a realizar, y la salida es el nuevo estado del pedido.
Las acciones posibles son: 'Procesar', 'Enviar', 'Entregar'.


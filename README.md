# Sistema de Gestión de Catálogo de Productos

Este proyecto es una aplicación simple basada en consola para gestionar un catálogo de productos, incluyendo ordenadores y teléfonos móviles. Permite a los usuarios añadir, listar, eliminar y modificar productos en el catálogo.

## Estructura del Proyecto

El proyecto consta de los siguientes paquetes y clases principales:

### Paquetes

- `Interfaz`: Contiene la clase de la interfaz de usuario.
- `dominio`: Contiene las clases de dominio que representan el catálogo y los productos.

### Clases

#### `Interfaz.Interfaz`

Maneja la interfaz de usuario y las interacciones con el usuario. Proporciona métodos para mostrar el menú, añadir productos, listar productos, eliminar productos y modificar productos.

#### `dominio.Catalogo`

Gestiona la lista de productos y proporciona métodos para añadir, eliminar y modificar productos. También maneja la grabación y carga del catálogo desde un archivo.

#### `dominio.Producto`

Representa un producto genérico con atributos como marca, CPU, GPU y RAM. Proporciona métodos para obtener y establecer estos atributos.

#### `dominio.Moviles`

Extiende `Producto` para incluir un atributo adicional para el precio. Proporciona métodos para obtener y establecer el precio.

## Empezando

### Instalación

1. Clona el repositorio en tu máquina local:
    ```sh
    git clone https://github.com/NicolasLopezFernandez/SegundaEntrega.git
    ```

2. Abre el proyecto en tu IDE.

3. Construye el proyecto para asegurar que todas las dependencias se resuelvan.

### Ejecutando la Aplicación

1. Navega al paquete `Interfaz`.

2. Ejecuta la clase `Interfaz`.

3. Sigue las instrucciones en pantalla para interactuar con la aplicación.

### Uso

Al ejecutar la aplicación, se te presentará un menú con las siguientes opciones:

1. **Añadir un nuevo ordenador**: Permite añadir un nuevo ordenador al catálogo introduciendo sus detalles.
2. **Listar todos los ordenadores**: Muestra una lista de todos los ordenadores en el catálogo.
3. **Añadir un nuevo móvil**: Permite añadir un nuevo móvil al catálogo introduciendo sus detalles.
4. **Listar todos los móviles**: Muestra una lista de todos los móviles en el catálogo.
5. **Eliminar un producto**: Permite eliminar un producto del catálogo especificando su índice.
6. **Modificar un producto**: Permite modificar los detalles de un producto en el catálogo especificando su índice.
7. **Salir**: Sale de la aplicación y guarda el catálogo en un archivo.

### Ejemplo

Aquí hay un ejemplo de cómo usar la aplicación:

1. Ejecuta la aplicación.
2. Selecciona la opción `1` para añadir un nuevo ordenador.
3. Introduce los detalles del ordenador cuando se te solicite.
4. Selecciona la opción `2` para listar todos los ordenadores y verifica que el nuevo ordenador ha sido añadido.
5. Selecciona la opción `5` para eliminar un producto especificando su índice.
6. Selecciona la opción `6` para modificar un producto especificando su índice e introduciendo los nuevos detalles.
7. Selecciona la opción `7` para salir de la aplicación y guardar el catálogo.

## Licencia

Este proyecto está licenciado bajo la Licencia Apache 2.0

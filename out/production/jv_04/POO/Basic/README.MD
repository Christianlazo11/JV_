Crea una clase abstracta "Cohete" con propiedades como velocidad, altura y métodos abstractos como "encenderMotor()" y 
"apagarMotor()". Luego, crea subclases como "CoheteSatelite" y "CoheteCarga" que hereden de "Cohete" y proporcionen su
propia implementación de los métodos.

Ejercicio 2: Configuración del cohete

Crea una clase "Propulsor" con propiedades como potencia y métodos para encender y apagar. Luego, crea una clase "Cohete"
que tenga una lista de propulsores y métodos para agregar y quitar propulsores. Utiliza la encapsulación para garantizar 
un acceso controlado a los propulsores.

Ejercicio 3: Etapas del lanzamiento

Crea una clase abstracta "Etapa" con propiedades como tiempo de duración y métodos abstractos como "encenderEtapa()" y "
apagarEtapa()". Luego, crea subclases como "EtapaDespegue" y "EtapaSeparacion" que hereden de "Etapa" y proporcionen su
propia implementación de los métodos.

Ejercicio 4: Sistemas de navegación

Crea una clase "SistemaNavegacion" con propiedades como coordenadas y métodos para establecer la ubicación y calcular la
distancia a un destino. Luego, crea una clase "Cohete" que tenga una instancia de "SistemaNavegacion" y métodos para 
interactuar con él. Utiliza la abstracción para ocultar los detalles de implementación del sistema de navegación.

Ejercicio 5: Módulos del cohete

Crea una clase abstracta "Modulo" con propiedades y métodos comunes a todos los módulos, como "encender()" y "apagar()".
Luego, crea subclases como "ModuloMotor", "ModuloComunicacion" y "
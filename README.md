# RefactorizacionLegacy

Nuestra misión en esta sesión es enfrentarnos a un miedo habitual en la industria. Donde tendremos que aplicar cosas como la Regla del Boy Scout ("deja el código siempre más limpio de como lo encontraste") y exprimiremos las herramientas de nuestro Entorno Integrado de Desarrollo (IDE) para refactorizar este módulo, eliminando por completo su deuda técnica. Por lo que nos va a tocar actuar como cirujanos del código, viendo primero cuales son los problemas que tiene el código que nos dan.

## Los tres grandes problemas de este código antes de la refactorización:

1. Pésima legibilidad y falta de semántica, ya que este código a simple vista no se entiende que hace ya que las variables y los números usados son difíciles de entender sin el contexto.


2. El uso de los if y else tan seguidos, ya que sumándole el gran problema anterior, esto hace que se entienda aún menos.


3. Falta de limpieza y mantenibilidad, ya que si la empresa quiere añadir nuevos datos este código va a ser muy difícil de cambiar o modificar por su estructura y su poca limpieza.

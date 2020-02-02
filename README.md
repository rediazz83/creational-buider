# creational-buider
Ejemplo usando el patron Builder

# Builder

> El objetivo del patrón Builder es abstraer la construcción de objetos complejos de su implementación, de modo que un cliente pueda crear objetos complejos sin tener que preocuparse de las diferencias en su implantación.

### Dominios de uso
El patrón se utiliza en los dominios siguientes:

  - Un cliente necesita construir objetos complejos sin conocer su implementación.

  - Un cliente necesita construir objetos complejos que tienen varias representaciones o implementaciones.

### Caso de estudio

Durante la compra de un vehículo, el vendedor crea todo un conjunto de documentos que contienen en especial la solicitud de pedido y la solicitud de matriculación del cliente. Es posible construir estos documentos en formato HTML o en formato PDF según la elección del cliente. En el primer caso, el cliente le provee una instancia de la clase ConstructorDocumentaciónVehículoHtml y, en el segundo caso, una instancia de la clase ConstructorDocumentaciónVehículoPdf. El vendedor realiza, a continuación, la solicitud de creación de cada documento mediante esta instancia.

De este modo el vendedor genera la documentación con ayuda de los métodos construyeSolicitudPedido y construyeSolicitudMatriculación.

El vendedor puede crear las solicitudes de pedido y las solicitudes de matriculación sin conocer las subclases de ConstructorDocumentaciónVehículo ni las de Documentación.

Las relaciones de dependencia entre el cliente y las subclases de ConstructorDocumentaciónVehículo se explican por el hecho de que el cliente crea una instancia de estas subclases.

La estructura interna de las subclases concretas de Documentación no se muestra (entre ellas, por ejemplo, la relación de composición con la clase Documento).

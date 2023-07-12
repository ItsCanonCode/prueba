    Product (Producto):
        Atributos:
            id: Long (identificador único del producto)
            name: String (nombre del producto)
            description: String (descripción del producto)
            price: BigDecimal (precio del producto)
            quantity: Integer (cantidad disponible del producto)

    Category (Categoría):
        Atributos:
            id: Long (identificador único de la categoría)
            name: String (nombre de la categoría)
            description: String (descripción de la categoría)
            products: List<Product> (lista de productos asociados a la categoría)

    User (Usuario):
        Atributos:
            id: Long (identificador único del usuario)
            name: String (nombre del usuario)
            email: String (correo electrónico del usuario)
            password: String (contraseña del usuario)
            role: String (rol del usuario, por ejemplo, "admin" o "user")

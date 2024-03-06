// E05





interface ProcesarPedido <T>{
    fun procesar (pedido: T){

    }
}

data class PedidoFisico(val id: Int, val productoFisico:String, val direccionEnvio: String)

data class PedidoDigital(val id: Int, val productoDigital: String, val urlDescarga: String)

data class PedidoSuscripcion(val id: Int, val prodcutoSuscripcion: String, val duracionMeses: Int)


class ProcesarPedidoFisico : ProcesarPedido<PedidoFisico>{

    override fun procesar(pedido: PedidoFisico) {
        println("Procesando pedido ${pedido.productoFisico} a la direccion ${pedido.direccionEnvio}")
    }
}

class ProcesarPedidoDigital : ProcesarPedido<PedidoDigital>{
    override fun procesar(pedido: PedidoDigital) {
        super.procesar(pedido)
    }
}


class ProcesarPedidoSuscripcion : ProcesarPedido<PedidoSuscripcion>{
    override fun procesar(pedido: PedidoSuscripcion) {
        super.procesar(pedido)
    }
}


class GestorPedido <T>(private val procesador: ProcesarPedido<T>){
    fun procesarPedido(pedido: T){
        procesador.procesar(pedido)
    }
}



fun main(){
    val pedidoDigital = PedidoDigital(1, "hola", "htpps.fgfg")
    val gestorPedidoDigital = GestorPedido
}











/*

data class Pedido(val id: Int, val tipo: String, val detalles: String)

interface ProcesadorPedido{
    fun procesar(pedido: Pedido)
}


class ProcesadorPedidoDigital : ProcesadorPedido{
    override fun procesar(pedido: Pedido) {
        println("Procesando pedido digital: ${pedido.detalles}")
    }
}


class ProcesadorPedidoFisico : ProcesadorPedido {
    override fun procesar(pedido: Pedido) {
        println("Procesando pedido fisico: ${pedido.detalles}")
    }
}


class ProcesadorPedidoSuscripcion : ProcesadorPedido {
    override fun procesar(pedido: Pedido) {
        println("Procesando pedido suscripcion: ${pedido.detalles}")
    }
}


class GestorPedidos(private val procesadores: Map<String, ProcesadorPedido>){
    fun procesarPedido(pedido: Pedido){
        val procesadorPedido =  procesadores[pedido.tipo]
        procesadorPedido?.procesar(pedido) ?: println("No se ha podido procesar")

    }
}


fun main() {
    //TODO: Crear un diccionario con la clave del tipo de pedido y el procesador que lo va a gestionar  Map<String, ProcesadorPedido>

    val diccionario = mapOf(
        "fisico" to ProcesadorPedidoFisico(),
        "digital" to ProcesadorPedidoDigital(),
        "suscripcion" to ProcesadorPedidoSuscripcion()
    )


    //TODO: Crear una variable gestorPedidos para gestionar los pedidos

    val gestionarPedido = GestorPedidos(diccionario)


    // Procesar pedidos...

    //TODO: Crear una variable que contenga un pedido 1 de tipo "digital" para un "E-book de Kotlin"
    //TODO: Utilizar gestorPedidos para procesar este pedido

    val pedido1 = Pedido(1, "digital", "E-book de kotlin")

    gestionarPedido.procesarPedido(pedido1)

    //Hacer lo mismo para un pedido "fisico" ("Libro impreso de Kotlin") y procesarlo
    val pedido2 = Pedido(2, "fisico", "Libro impreso de Kotlin")
    gestionarPedido.procesarPedido(pedido2)

    //Hacer lo mismo para una "suscripción" ("Suscripción a curso de Kotlin") y procesarlo
    val pedido3 = Pedido(3, "suscripcion", "uscripción a curso de Kotlin")
    gestionarPedido.procesarPedido(pedido3)



    //TODO: Hacer lo mismo para un tipo "desconocido" ("Producto misterioso") y procesarlo
    //TODO: Al procesar este pedido mostrará un mensaje de tipo de pedido no soportado.

    val pedido4 = Pedido(4, "desconocido", "uscripción a curso de Kotlin")
    gestionarPedido.procesarPedido(pedido4)
}


 */
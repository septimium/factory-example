interface Factory{
    fun createDevice(): Device = TODO("poti pune ceva default aici")
}

class LaptopFactory : Factory{
    override fun createDevice(): Device {
        return Laptop()
    }
}

class SmartphoneFactory : Factory{
    override fun createDevice(): Device {
        return Smartphone()
    }
}

class TabletFactory : Factory{
    override fun createDevice(): Device {
        return Tablet()
    }
}

abstract class Device(){
    abstract fun printDetails()
}

class Laptop: Device(){
    override fun printDetails() {
        println("This device is a laptop!")
    }
}

class Smartphone: Device(){
    override fun printDetails() {
        println("This device is a smartphone!")
    }
}

class Tablet: Device(){
    override fun printDetails() {
        println("This device is a tablet!")
    }
}

fun main() {
    val laptopFactory = LaptopFactory()
    val laptop = laptopFactory.createDevice()
    laptop.printDetails()

    val tabletFactory = TabletFactory()
    val tablet = tabletFactory.createDevice()
    tablet.printDetails()

    val smartphoneFactory = SmartphoneFactory()
    val smartphone = smartphoneFactory.createDevice()
    smartphone.printDetails()
}
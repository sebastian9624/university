
#Instancia de la clase Vehiculo
class Vehiculo:
    #Consructor de la clase
    def __init__(self, marca, modelo, motor):
        self.marca = marca
        self.modelo = modelo
        self.motor = motor
    
    #Metodo encender
    def encender():
        print("El vehiculo esta encendido")
    

#Se crea un objeto de la clase Vehiculo
vehiculo1 = Vehiculo("mercedes", "2026", "2.0")
vehiculo2 = Vehiculo("Aston Martin", "2026", "2.0")
vehiculo3 = Vehiculo("Cadillac", "2026", "2.0")

print(vehiculo1.marca, vehiculo1.modelo, vehiculo1.motor)
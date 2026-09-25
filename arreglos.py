meses = [
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
]

areas = ["Ropa", "Deportes", "Jugueteria"]

# si los valores son nulos los reemplaza por 0
ventas = [[0.0 for _ in range(3)] for _ in range(12)]

# menu de seleccion
def main():
    opcion = 0
    while opcion != 5:
        # Menú
        print("=========== Menu Sistema de Ventas de Productos=========== ")
        print("1) Mostrar tabla de ventas \n" +
              "2) Ingresar venta \n" +
              "3) Eliminar venta \n" +
              "4) Buscar venta \n" +
              "5) finalizar programa")
    
        opcion = int(input("Seleccione una opción: "))

        match opcion:
            case 1:
                tabla_de_ventas()
            case 2:
                ingresar_venta()
            case 3:
                eliminar_venta()
            case 4:
                buscar_venta()
            case 5:
                break
            case _:  # "_"= default
                print("Error, opcion inexistente")




# Tabla de ventas
def tabla_de_ventas():
    print("\n========================== Tabla De Ventas ==========================")
    print(f"{'Mes':<12} | {areas[0]:<12} | {areas[1]:<12} | {areas[2]:<12}")
    print("---------------------------------------------------------------------")

    for i in range(12):
        print(f"{meses[i]:<12} | ${ventas[i][0]:<11.2f} | ${ventas[i][1]:<11.2f} | ${ventas[i][2]:<11.2f}")


# Ingresar venta
def ingresar_venta():
    print("\n=== Ingresar Venta ===")

    mes = int(input("Ingrese el número de mes: ")) - 1
    area = int(input("Ingrese el numero de área: ")) - 1

    if 0 <= mes < 12 and 0 <= area < 3:
        monto = float(input(f"Ingrese el monto de la venta para {meses[mes]} en el área de {areas[area]}: $"))
        ventas[mes][area] = monto
        print("¡Venta ingresada correctamente!")
    else:
        print("Mes o área no válidos.")
    print("¡Ventas ingresadas correctamente!")


# Eliminar venta
def eliminar_venta():
    print("\n=== Eliminar Venta ===")

    mes = int(input("Ingrese el número de mes: ")) - 1
    area = int(input("Ingrese el numero de área: ")) - 1

    if 0 <= mes < 12 and 0 <= area < 3:
        ventas[mes][area] = 0.0
        print("Venta eliminada.")
    else:
         print("Mes o área no válidos.")



# Buscar venta
def buscar_venta():
    print("\n=== Buscar Venta ===")

    mes = int(input("Ingrese el número de mes: ")) - 1
    area = int(input("Ingrese el numero de área: ")) - 1

    if 0 <= mes < 12 and 0 <= area < 3:
        print(f"La venta en {meses[mes]} para el área {areas[area]} es: ${ventas[mes][area]}")
    else:
        print("Mes o área no válidos.")

if __name__ == "__main__":
    main()
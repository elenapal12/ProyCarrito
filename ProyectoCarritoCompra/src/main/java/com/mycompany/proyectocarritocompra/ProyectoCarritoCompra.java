/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectocarritocompra;

/**
 *
 * @author andrea/cecilia
 */
public class ProyectoCarritoCompra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrito carrito = new Carrito();

        // Catálogo simple
        Producto[] catalogo = {
            new Producto("Pan", 2.0),
            new Producto("Leche", 5.5),
            new Producto("Arroz", 4.2),
            new Producto("Huevos", 7.0)
        };

        int opcion;
        do {
            System.out.println("\n=== Menú de Compras ===");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver carrito");
            System.out.println("4. Ver total");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Catálogo disponible:");
                    for (int i = 0; i < catalogo.length; i++) {
                        System.out.println((i + 1) + ". " + catalogo[i]);
                    }
                    break;
case 2:
                    System.out.print("Ingrese el número del producto: ");
                    int numProd = sc.nextInt();
                    if (numProd >= 1 && numProd <= catalogo.length) {
                        carrito.agregarProducto(catalogo[numProd - 1]);
                    } else {
                        System.out.println("Producto inválido.");
                    }
                    break;
                case 3:
                    carrito.mostrarCarrito();
                    break;
                case 4:
                    System.out.println("Total a pagar: Bs " + carrito.calcularTotal());
                    break;
                case 5:
                    System.out.println("Gracias por comprar con nosotros.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
    }
}

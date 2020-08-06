package restaurante;

import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tipo = 0;
        int plato = 0;
        int platoa = 0;
        int platob = 0;
        double precio = 0;
        double iva = 0;
        double iva2 = 0;
        double iva3 = 0;
        double desc = 0;
        int cant = 0;
        int cant2 = 0;
        int cant3 = 0;
        int sopa = 10000;
        int ensalada = 25000;
        int jugo = 5000;
        int carne = 30000;
        int pollo = 28000;
        int perro = 5000;
        int hambg = 7000;

        System.out.println("__________________________________");
        System.out.println("¡Bienvenido al restaurante online!");
        System.out.println("__________________________________");
        System.out.println("¿Qué tipo de comida es tu favorita?");
        System.out.println("(Escribe el número que corresponda a tu elección)");
        System.out.println("1. Vegetariano");
        System.out.println("2. No vegetariano");
        System.out.println("3. Comidas rapidas");
        tipo = entrada.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("____________________________________________");
                System.out.println("Te presento el menú de platos vegetarianos:");
                System.out.println("");
                System.out.println("1. Sopa de vegetales: $10.000");
                System.out.println("2. Ensaladas: $25.000");
                System.out.println("3. Jugos: $5.000");
                System.out.println("4. Todos: $40.000");
                System.out.println("____________________________________________");
                System.out.println("Escribe el número que corresponda a tu elección");
                System.out.println("y separado por un espacio escribe la cantidad que quieres.");
                plato = entrada.nextInt();
                cant = entrada.nextInt();
                if (plato == 1) {
                    iva = (sopa * cant) * 0.19;
                    precio = (iva) + (sopa * cant);
                    desc = precio * 0.20;
                    iva = precio - desc;
                    System.out.println("____________________________________________");
                    System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                    System.out.println("1. Ensaladas: $25.000");
                    System.out.println("2. Jugos: $5.000");
                    System.out.println("3. Pedir la cuenta");
                    platoa = entrada.nextInt();
                    switch (platoa) {
                        case 1:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantas ensaladas quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (ensalada * cant2) * 0.19;
                            precio = (iva2) + (ensalada * cant2);
                            desc = precio * 0.20;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                            System.out.println("1. Jugos: $5.000");
                            System.out.println("2. Pedir la cuenta");
                            platob = entrada.nextInt();
                            if (platob == 1) {
                                System.out.println("____________________________________________");
                                System.out.println("¿Cuantos jugos quieres?");
                                cant3 = entrada.nextInt();
                                iva3 = (jugo * cant3) * 0.19;
                                precio = (iva3) + (jugo * cant3);
                                desc = precio * 0.20;
                                iva3 = (precio - desc) + iva + iva2;
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " sopas");
                                System.out.println(cant2 + " ensaladas");
                                System.out.println(cant3 + " jugos");
                                System.out.println("Total = $" + iva3 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else if (platob == 2) {
                                System.out.println("____________________________________________");
                                System.out.println(cant + " sopas");
                                System.out.println(cant2 + " ensaladas");
                                System.out.println("Total = $" + iva2 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else {
                                System.out.println("____________________________________________");
                                System.out.println("Ingresaste un valor incorrecto");
                            }
                            break;
                        case 2:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantos jugos quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (jugo * cant2) * 0.19;
                            precio = (iva2) + (jugo * cant2);
                            desc = precio * 0.20;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                            System.out.println("1. Ensaladas: $25.000");
                            System.out.println("2. Pedir la cuenta");
                            platob = entrada.nextInt();
                            if (platob == 1) {
                                System.out.println("____________________________________________");
                                System.out.println("¿Cuantas ensaladas quieres?");
                                cant3 = entrada.nextInt();
                                iva3 = (ensalada * cant3) * 0.19;
                                precio = (iva3) + (ensalada * cant3);
                                desc = precio * 0.20;
                                iva3 = (precio - desc) + iva + iva2;
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " sopas");
                                System.out.println(cant2 + " jugos");
                                System.out.println(cant3 + " ensaladas");
                                System.out.println("Total = $" + iva3 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else if (platob == 2) {
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " sopas");
                                System.out.println(cant2 + " ensaladas");
                                System.out.println("Total = $" + iva2 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else {
                                System.out.println("____________________________________________");
                                System.out.println("Ingresaste un valor incorrecto");
                            }
                            break;
                        case 3:
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " sopas");
                            System.out.println("Total = $" + iva + " con IVA incluido y 20% de descuento");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        default:
                            System.out.println("____________________________________________");
                            System.out.println("Ingresaste un valor incorrecto");
                    }
                } else if (plato == 2) {
                    iva = (ensalada * cant) * 0.19;
                    precio = (iva) + (ensalada * cant);
                    desc = precio * 0.20;
                    iva = precio - desc;
                    System.out.println("____________________________________________");
                    System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                    System.out.println("1. Sopa de vegetales: $10.000");
                    System.out.println("2. Jugos: $5.000");
                    System.out.println("3. Pedir la cuenta");
                    platoa = entrada.nextInt();
                    switch (platoa) {
                        case 1:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantas sopas quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (sopa * cant2) * 0.19;
                            precio = (iva2) + (sopa * cant2);
                            desc = precio * 0.20;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                            System.out.println("1. Jugos: $5.000");
                            System.out.println("2. Pedir la cuenta");
                            platob = entrada.nextInt();
                            if (platob == 1) {
                                System.out.println("____________________________________________");
                                System.out.println("¿Cuantos jugos quieres?");
                                cant3 = entrada.nextInt();
                                iva3 = (jugo * cant3) * 0.19;
                                precio = (iva3) + (jugo * cant3);
                                desc = precio * 0.20;
                                iva3 = (precio - desc) + iva + iva2;
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " ensaladas");
                                System.out.println(cant2 + " sopas");
                                System.out.println(cant3 + " jugos");
                                System.out.println("Total = $" + iva3 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else if (platob == 2) {
                                System.out.println("____________________________________________");
                                System.out.println(cant + " ensaladas");
                                System.out.println(cant2 + " sopas");
                                System.out.println("Total = $" + iva2 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else {
                                System.out.println("____________________________________________");
                                System.out.println("Ingresaste un valor incorrecto");
                            }
                            break;
                        case 2:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantos jugos quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (jugo * cant2) * 0.19;
                            precio = (iva2) + (jugo * cant2);
                            desc = precio * 0.20;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                            System.out.println("1. Sopa de vegetales: $10.000");
                            System.out.println("2. Pedir la cuenta");
                            platob = entrada.nextInt();
                            if (platob == 1) {
                                System.out.println("____________________________________________");
                                System.out.println("¿Cuantas sopas quieres?");
                                cant3 = entrada.nextInt();
                                iva3 = (sopa * cant3) * 0.19;
                                precio = (iva3) + (sopa * cant3);
                                desc = precio * 0.20;
                                iva3 = (precio - desc) + iva + iva2;
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " ensaladas");
                                System.out.println(cant2 + " jugos");
                                System.out.println(cant3 + " sopas");
                                System.out.println("Total = $" + iva3 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else if (platob == 2) {
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " ensaladas");
                                System.out.println(cant2 + " jugos");
                                System.out.println("Total = $" + iva2 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else {
                                System.out.println("____________________________________________");
                                System.out.println("Ingresaste un valor incorrecto");
                            }
                            break;
                        case 3:
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " ensaladas");
                            System.out.println("Total = $" + iva + " con IVA incluido y 20% de descuento");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        default:
                            System.out.println("____________________________________________");
                            System.out.println("Ingresaste un valor incorrecto");
                    }
                } else if (plato == 3) {
                    iva = (jugo * cant) * 0.19;
                    precio = (iva) + (jugo * cant);
                    desc = precio * 0.20;
                    iva = precio - desc;
                    System.out.println("____________________________________________");
                    System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                    System.out.println("1. Sopa de vegetales: $10.000");
                    System.out.println("2. Ensaladas: $25.000");
                    System.out.println("3. Pedir la cuenta");
                    platoa = entrada.nextInt();
                    switch (platoa) {
                        case 1:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantas sopas quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (sopa * cant2) * 0.19;
                            precio = (iva2) + (sopa * cant2);
                            desc = precio * 0.20;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                            System.out.println("1. Ensaladas: $25.000");
                            System.out.println("2. Pedir la cuenta");
                            platob = entrada.nextInt();
                            if (platob == 1) {
                                System.out.println("____________________________________________");
                                System.out.println("¿Cuantas ensaladas quieres?");
                                cant3 = entrada.nextInt();
                                iva3 = (ensalada * cant3) * 0.19;
                                precio = (iva3) + (ensalada * cant3);
                                desc = precio * 0.20;
                                iva3 = (precio - desc) + iva + iva2;
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " jugos");
                                System.out.println(cant2 + " sopas");
                                System.out.println(cant3 + " ensaladas");
                                System.out.println("Total = $" + iva3 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else if (platob == 2) {
                                System.out.println("____________________________________________");
                                System.out.println(cant + " jugos");
                                System.out.println(cant2 + " sopas");
                                System.out.println("Total = $" + iva2 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else {
                                System.out.println("____________________________________________");
                                System.out.println("Ingresaste un valor incorrecto");
                            }
                            break;
                        case 2:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantas ensaladas quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (ensalada * cant2) * 0.19;
                            precio = (iva2) + (ensalada * cant2);
                            desc = precio * 0.20;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                            System.out.println("1. Sopa de vegetales: $10.000");
                            System.out.println("2. Pedir la cuenta");
                            platob = entrada.nextInt();
                            if (platob == 1) {
                                System.out.println("____________________________________________");
                                System.out.println("¿Cuantas sopas quieres?");
                                cant3 = entrada.nextInt();
                                iva3 = (sopa * cant3) * 0.19;
                                precio = (iva3) + (sopa * cant3);
                                desc = precio * 0.20;
                                iva3 = (precio - desc) + iva + iva2;
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " jugos");
                                System.out.println(cant2 + " ensaladas");
                                System.out.println(cant3 + " sopas");
                                System.out.println("Total = $" + iva3 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else if (platob == 2) {
                                System.out.println("____________________________________________");
                                System.out.println("Cuenta:");
                                System.out.println(cant + " jugos");
                                System.out.println(cant2 + " ensaladas");
                                System.out.println("Total = $" + iva2 + " con IVA incluido y 20% de descuento");
                                System.out.println("____________________________________________");
                                System.out.println("¡Gracias por su compra, vuelta pronto!");
                            } else {
                                System.out.println("____________________________________________");
                                System.out.println("Ingresaste un valor incorrecto");
                            }
                            break;
                        case 3:
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " jugos");
                            System.out.println("Total = $" + iva + " con IVA incluido y 20% de descuento");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        default:
                            System.out.println("____________________________________________");
                            System.out.println("Ingresaste un valor incorrecto");
                    }
                } else if (plato == 4) {
                    iva = ((sopa + ensalada + jugo) * cant) * 0.19;
                    precio = (iva) + ((sopa + ensalada + jugo) * cant);
                    desc = precio * 0.20;
                    iva = (precio - desc);
                    System.out.println("____________________________________________");
                    System.out.println("Cuenta:");
                    System.out.println(cant + " platos completos");
                    System.out.println("= $" + iva + " con IVA incluido y 20% de descuento");
                    System.out.println("____________________________________________");
                    System.out.println("¡Gracias por su compra, vuelta pronto!");
                } else {
                    System.out.println("Ingresaste un valor incorrecto");
                }
                break;
            case 2:
                System.out.println("____________________________________________");
                System.out.println("Te presento el menú de platos no vegetarianos:");
                System.out.println("");
                System.out.println("1. Bandeja de carne: $30.000");
                System.out.println("2. Bandeja de pollo: $28.000");
                System.out.println("3. Todos: $58.000");
                System.out.println("____________________________________________");
                System.out.println("Escribe el número que corresponda a tu elección");
                System.out.println("y separado por un espacio escribe la cantidad que quieres.");
                plato = entrada.nextInt();
                cant = entrada.nextInt();
                if (plato == 1) {
                    iva = (carne * cant) * 0.19;
                    precio = (iva) + (carne * cant);
                    desc = precio * 0.10;
                    iva = precio - desc;
                    System.out.println("____________________________________________");
                    System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                    System.out.println("1. Bandeja de pollo: $28.000");
                    System.out.println("2. Pedir la cuenta");
                    platoa = entrada.nextInt();
                    switch (platoa) {
                        case 1:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantas bandejas de pollo quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (pollo * cant2) * 0.19;
                            precio = (iva2) + (pollo * cant2);
                            desc = precio * 0.10;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " Bandejas de carne");
                            System.out.println(cant2 + " Bandejas de pollo");
                            System.out.println("= $" + iva2 + " con IVA incluido y 10% de descuento");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        case 2:
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " Bandejas de carne");
                            System.out.println("= $" + iva + " con IVA incluido y 10% de descuento");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        default:
                            System.out.println("____________________________________________");
                            System.out.println("Ingresaste un valor incorrecto");
                    }
                } else if (plato == 2) {
                    iva = (pollo * cant) * 0.19;
                    precio = (iva) + (pollo * cant);
                    desc = precio * 0.10;
                    iva = precio - desc;
                    System.out.println("____________________________________________");
                    System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                    System.out.println("1. Bandeja de carne: $30.000");
                    System.out.println("2. Pedir la cuenta");
                    platoa = entrada.nextInt();
                    switch (platoa) {
                        case 1:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantas bandejas de carne quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (carne * cant2) * 0.19;
                            precio = (iva2) + (carne * cant2);
                            desc = precio * 0.10;
                            iva2 = (precio - desc) + iva;
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " Bandejas de pollo");
                            System.out.println(cant2 + " Bandejas de carne");
                            System.out.println("= $" + iva2 + " con IVA incluido y 10% de descuento");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        case 2:
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " Bandejas de pollo");
                            System.out.println("= $" + iva + " con IVA incluido y 10% de descuento");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        default:
                            System.out.println("____________________________________________");
                            System.out.println("Ingresaste un valor incorrecto");
                    }
                } else if (plato == 3) {
                    iva = ((pollo + carne) * cant) * 0.19;
                    precio = (iva) + ((pollo + carne) * cant);
                    desc = precio * 0.10;
                    iva = precio - desc;
                    System.out.println("____________________________________________");
                    System.out.println("Cuenta:");
                    System.out.println(cant + " Bandejas de pollo y de carne");
                    System.out.println("= $" + iva + " con IVA incluido y 10% de descuento");
                    System.out.println("____________________________________________");
                    System.out.println("¡Gracias por su compra, vuelta pronto!");
                }
                break;
            case 3:
                System.out.println("____________________________________________");
                System.out.println("Te presento el menú de comidas rapidas:");
                System.out.println("");
                System.out.println("1. Perro caliente: $5.000");
                System.out.println("2. Hamburguesa $7.000");
                System.out.println("3. Todos: $12.000");
                System.out.println("____________________________________________");
                System.out.println("Escribe el número que corresponda a tu elección");
                System.out.println("y separado por un espacio escribe la cantidad que quieres.");
                plato = entrada.nextInt();
                cant = entrada.nextInt();
                if (plato == 1) {
                    iva = (perro * cant) * 0.19;
                    precio = (iva) + (perro * cant);
                    iva = precio;
                    System.out.println("____________________________________________");
                    System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                    System.out.println("1. Hamburguesa: $7.000");
                    System.out.println("2. Pedir la cuenta");
                    platoa = entrada.nextInt();
                    switch (platoa) {
                        case 1:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantas hamburguesas quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (hambg * cant2) * 0.19;
                            precio = (iva2) + (hambg * cant2);
                            iva2 = precio + iva;
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " perros calientes");
                            System.out.println(cant2 + " hamburguesas");
                            System.out.println("= $" + iva2 + " con IVA incluido");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        case 2:
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " perros calientes");
                            System.out.println("= $" + iva + " con IVA incluido");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        default:
                            System.out.println("____________________________________________");
                            System.out.println("Ingresaste un valor incorrecto");
                    }
                } else if (plato == 2) {
                    iva = (hambg * cant) * 0.19;
                    precio = (iva) + (hambg * cant);
                    iva = precio;
                    System.out.println("____________________________________________");
                    System.out.println("¿Deseas pedir algo más? Escribe solo el número");
                    System.out.println("1. Perro caliente: $5.000");
                    System.out.println("2. Pedir la cuenta");
                    platoa = entrada.nextInt();
                    switch (platoa) {
                        case 1:
                            System.out.println("____________________________________________");
                            System.out.println("¿Cuantos perros caientes quieres?");
                            cant2 = entrada.nextInt();
                            iva2 = (perro * cant2) * 0.19;
                            precio = (iva2) + (perro* cant2);
                            iva2 = precio + iva;
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " hamburguesas");
                            System.out.println(cant2 + " perros calientes");
                            System.out.println("= $" + iva2 + " con IVA incluido.");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        case 2:
                            System.out.println("____________________________________________");
                            System.out.println("Cuenta:");
                            System.out.println(cant + " hamburguesas");
                            System.out.println("= $" + iva + " con IVA incluido.");
                            System.out.println("____________________________________________");
                            System.out.println("¡Gracias por su compra, vuelta pronto!");
                            break;
                        default:
                            System.out.println("____________________________________________");
                            System.out.println("Ingresaste un valor incorrecto");
                    }
                } else if (plato == 3) {
                    iva = ((perro + hambg) * cant) * 0.19;
                    precio = (iva) + ((perro + hambg) * cant);
                    System.out.println("____________________________________________");
                    System.out.println("Cuenta:");
                    System.out.println(cant + " combos de perro caliente y hamburguesa");
                    System.out.println("= $" + precio + " con IVA incluido y 10% de descuento");
                    System.out.println("____________________________________________");
                    System.out.println("¡Gracias por su compra, vuelta pronto!");
                }
                break;
            default: 
                System.out.println("Ingresaste un valor incorrecto, vuelve a intentarlo");
        }
    }
}

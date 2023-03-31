

import java.util.Scanner;

public class Main {
    private static void init(ValidarCampos validar) {
        boolean correcto;
        do {
            Scanner teclat = new Scanner(System.in);
            System.out.println("Escribe un nombre");
            validar.setNombreUsuario(teclat.nextLine());
            correcto = validar.compruebaNombre(validar.getNombreUsuario(), null);
            teclat.close();
        } while (!correcto);
        do{
            Scanner email = new Scanner(System.in);
            System.out.println("Escribe un email");
            validar.setEmail(email.nextLine());
            correcto = validar.compruebaEmail(validar.getEmail());
            email.close();
        } while (!correcto);

        do{
            Scanner contraseña = new Scanner(System.in);
            System.out.println("Escribe una contraseña");
            validar.setPassword(contraseña.nextLine());
            correcto = validar.compruebaContraseña(validar.getPassword());
            contraseña.close();
        }while(!correcto);
        do{

            correcto = validar.generarCodigo();
            System.out.println("Has entrado con éxito");
        } while (!correcto);


    }

    public static void main(String[] args) {
        ValidarCampos validar = new ValidarCampos(null, null, null);
        init(validar);

        
    }

}
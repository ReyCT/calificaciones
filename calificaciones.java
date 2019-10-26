import java.util.Scanner;
public class calificaciones
{
    private static int porcentaje;
    private static int faltas=0;
    private static int terminados=0;
    private static int codeformat=0;
    private static int participaciones=0;
    private static int examen=0;
    private static int proyecto=0;
    private static String apun="apun";
    private static String nombre;
    private static int input;
    private static String inputuser;
    private static Scanner scan = new Scanner(System.in);
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String args[])
    {
        System.out.println("¿A quien desea evaluar?");
        nombre = scanner.nextLine();
        if (nombre.equals(apun))
        {
            showmenu();
        }
    }
    public static void evaluador()
    {
        for (int i=1; i<=5; i++)
        {
            if (i==1)
            {
                System.out.println("¿termino la actividad el alumno\n1=Si  0=No?");
                validacion();
                if (input==1)
                {

                }
                else if (input==0)
                {
                    terminados = terminados+1;
                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
            }
            else if (i==2)
            {
                System.out.println("¿falto el alumno\n1=Si  0=No?");
                validacion();
                if (input==1)
                {
                    faltas = faltas+1;
                }
                else if (input==0)
                {

                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
            }
            else if (i==3)
            {
                System.out.println("¿Su codigo tenia el formato adecuado?\n1=Si  0=No?");
                validacion();
                if (input==1)
                {
                    codeformat = codeformat+1;
                }
                else if (input==0)
                {

                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
            }
            else if (i==4)
            {
                System.out.println("¿Participo el alumno?\n1=Si  0=No?");
                validacion();
                if (input==1)
                {
                    participaciones = participaciones+1;
                }
                else if (input==0)
                {

                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
            }
        }
    }
    public static void showmenu()
    {
        System.out.println("¿Que desea hacer?\n1 Registrar notas diarias\n2 Agregar calificacion del examen\n3 Agregar calificacion del proyecto\n4 Promediar calificacion final");
        validacion();
        if (input==1)
        {
            evaluador();
            showmenu();
        }
        else if (input==2)
        {
            System.out.println("¿Que calificacion obtuvo en el examen?");
            validacion();
            porcentaje = porcentaje+(input*4);
            examen = input*4;
            if (input<0 && input>10)
            {
                System.out.println("Introduce una cantidad de aciertos valida");
                validacion();
            }
            showmenu();
        }
        else if (input==3)
        {
            System.out.println("¿Que calificacion obtuvo en el proyecto?");
            validacion();
            porcentaje = porcentaje+(input*2);
            proyecto = input*2;
            if (input<0 && input>10)
            {
                System.out.println("Introduce una cantidad de aciertos valida");
                validacion();
            }
            showmenu();
        }
        else if (input==4)
        {
            System.out.println("Faltas: "+faltas);
            System.out.println("Participaciones: "+participaciones);
            System.out.println("Le diste formato a tu codigo "+codeformat+" veces");
            System.out.println("termino "+terminados+" actividades");
            System.out.println("Tu promedio final es: "+porcentaje);
            System.out.println("\n ¿Desea volver a evaluar?\n1=Si 0=No");
            validacion();
            if (input==1)
            {
                System.out.println("¿A quien desea evaluar?");
                nombre = scanner.nextLine();
                if (nombre.equals(apun))
                {
                    showmenu();
                }
                else if (input==0)
                {
                    System.out.println("Gracias por evaluar");
                }
            }
        }
    }
    public static void validacion()
    {
        boolean valid = true;
        inputuser = scan.nextLine();
        while(valid==true)
        {
            try
            {
                input = Integer.valueOf(inputuser);
                valid=false;
            }
            catch(Exception e)
            {
                System.out.println("Introduce un valor numerico entero");
                inputuser = scan.nextLine();
            }
        }
    }
}

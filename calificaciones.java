import java.util.Scanner;

public class calificaciones
{
    private static int dias;
    private static int porcentaje=0;
    private static int faltas=0;
    private static int terminados=0;
    private static int codeformat=0;
    private static int participaciones=0;
    private static int preguntas=0;
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
        dias++;
        int calificacion=8;
        for (int i=1; i<=5; i++)
        {
            if (i==1)
            {
                System.out.println("¿termino la actividad el alumno\n1=Si  0=No?");
                validacion();
                if (input==1)
                {
                    terminados++;
                }
                else if (input==0)
                {

                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
                porcentaje=porcentaje+((calificacion/dias)*terminados);
            }
            else if (i==2)
            {
                System.out.println("¿falto el alumno\n1=Si  0=No?");
                validacion();
                if (input==1)
                {

                }
                else if (input==0)
                {
                    faltas++;
                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
                porcentaje=porcentaje+((calificacion/dias)*faltas);
            }
            else if (i==3)
            {
                System.out.println("¿Su codigo tenia el formato adecuado?\n1=Si  0=No?");
                validacion();
                if (input==1)
                {
                    codeformat++;
                }
                else if (input==0)
                {

                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
                porcentaje=porcentaje+((calificacion/dias)*codeformat);
            }
            else if (i==4)
            {
                System.out.println("¿Participo el alumno?\n1=Si  0=No?");
                validacion();
                if (input==1)
                {
                    participaciones++;
                }
                else if (input==0)
                {

                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
                porcentaje=porcentaje+((calificacion/dias)*participaciones);
            }
            else if (i==5)
            {
                System.out.println("¿hizo preguntas el alumno?\n1=Si  0=No?");
                validacion();
                if (input==1)
                {
                    preguntas++;
                }
                else if (input==0)
                {

                }
                else
                {
                    System.out.println("Introduce un valor de 1 o 0");
                    validacion();
                }
                porcentaje=porcentaje+((calificacion/dias)*preguntas);
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

            examen=40;
            int vueltas=0;
            int calificacion=0;
            System.out.println("¿Cuantos examenes aplico?");
            validacion();
            vueltas=input;
            examen=examen/input;
            for (int i=1; i<=vueltas; i++)
            {
                System.out.println("¿Que calificacion obtuvo en el examen numero " + i + "?");
                validacion();
                calificacion=calificacion+input;
                if (input < 0 && input > 100)
                {
                    System.out.println("Introduce una calificacion valida");
                    validacion();
                }
            }
            examen=(calificacion*examen)/100;
            porcentaje=porcentaje+examen;
            showmenu();
        }
        else if (input==3)
        {
            proyecto=20;
            int vueltas=0;
            int calificacion=0;
            System.out.println("¿Cuantos proyectos aplico?");
            validacion();
            vueltas=input;
            proyecto=proyecto/input;
            for (int i=1; i<=vueltas; i++)
            {
                System.out.println("¿Que calificacion obtuvo en el proyecto numero "+i+"?");
                validacion();
               calificacion=calificacion+input;
                if (input < 0 && input > 100)
                {
                    System.out.println("Introduce una cantidad de aciertos valida");
                    validacion();
                }
            }
            proyecto=(calificacion*proyecto)/100;
            porcentaje=porcentaje+proyecto;
            showmenu();
        }
        else if (input==4)
        {
            System.out.println("Faltas: "+faltas);
            System.out.println("Participaste "+participaciones+"/"+dias+" dias");
            System.out.println("Le diste formato a tu codigo "+codeformat+" veces");
            System.out.println("termino "+terminados+" actividades");
            System.out.println("Puntos obtenidos en examen(es): "+examen+"/40");
            System.out.println("Puntos obtenidos en proyecto(s): "+proyecto+"/20");
            System.out.println("\nTu promedio final es: "+porcentaje);
            if (porcentaje<70)
            {
                System.out.println("El alumno NO aprobo");
            }
            else if (porcentaje>=70)
            {
                System.out.println("El alumno aprobo");
            }
            System.out.println("\n ¿Desea continuar con la evaluacion?\n1=Si 0=No");
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

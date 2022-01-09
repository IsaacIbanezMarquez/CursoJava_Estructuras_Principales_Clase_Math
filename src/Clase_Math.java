

public class Clase_Math
{
    // La clase Math nos permite realizar operaciones matemáticas con los métodos que contiene.


        public static void main(String[] args)
        {
            double raíz = Math.sqrt(9);

            System.out.println(raíz);
        }




    //Ejercicio 1
    // Crear un código que muestre el nombre del alumno y el promedio de cuatro materias asignadas.
    // La forma de ingreso será: NOMBRE: NOTA1-NOTA2-NOTA3-NOTA4.Este ejercicio tiene la finalidad
    // de generar una primera aproximación a la algorítimica.


    public static class Problema1
    {
        String datos;public Problema1(String datos)
    {
        this.datos=datos;
    }


        public void calcular()
        {
            int auxiliar= datos.indexOf(":");
            String nombre= datos.substring(0, auxiliar);
            String nota1 = datos.substring(auxiliar+2, auxiliar+5);
            String nota2= datos.substring(auxiliar+6, auxiliar+9);
            String nota3= datos.substring(auxiliar+10, auxiliar+13);
            String nota4= datos.substring(auxiliar+14, datos.length());

            double not1= new Double(nota1).doubleValue();
            double not2= new Double(nota2).doubleValue();
            double not3= new Double(nota3).doubleValue();
            double not4= new Double(nota4).doubleValue();
            double promedio = (not1+not2+not3+not4)/4;
            double aux = promedio - Math.round(promedio);

            System.out.println("Bienvenido "+nombre+"\nSus notas este semestre fueron : "+nota1+","+nota2+", "+nota3+" y "+nota4+". \nSu promedio final fue: "+promedio);
        }
        public static void main(String args[])
        {
            Problema1 a= new Problema1("CARLOS PEREZ: 7.0-3.5-4.5-5.7");a.calcular();
        }
    }
}



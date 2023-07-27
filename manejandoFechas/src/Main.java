import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //capturar la fecha del sistema
        LocalDate fechaActual = LocalDate.now();

        //ingresar una fecha al programa
        LocalDate fechaManual = LocalDate.of(2023,07,27);

        //calcular diferencia entre dos fechas
        LocalDate nacimiento = LocalDate.of(1992,06,12 );
        LocalDate actual = LocalDate.now();
        Long diferencia = ChronoUnit.YEARS.between(nacimiento,actual);

        //obtener de una fecha el mes, dia o año separadamente
        Integer dia = nacimiento.getDayOfMonth();
        Integer diaDos = nacimiento.getDayOfYear();
        DayOfWeek diaTres = nacimiento.getDayOfWeek();

        /*System.out.println(dia);
        System.out.println(diaDos);
        System.out.println(diaTres);*/

        //Agregando o restando días a una fecha
        LocalDate fechaDespues = nacimiento.plusDays(365);
        //System.out.println(fechaDespues);

        LocalDate fechaAnterior = nacimiento.minusDays(365);
        //System.out.println(fechaAnterior);

        //Asignando formato específico a una fecha
        DateTimeFormatter formatoDeseado = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter formatoDeseado2 = DateTimeFormatter.ofPattern("EEE,dd MMMM yyyy");
        String fechaAmostrar = nacimiento.format(formatoDeseado);

        System.out.println(nacimiento);
        System.out.println(fechaAmostrar);

        //Si tengo un string, ¿cómo lo convierto en localdate?

    }
}
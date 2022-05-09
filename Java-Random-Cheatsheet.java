import java.util.Random;        // La libreria Random permite generar numeros aleatorios int y float


Random random = new Random();       // Se instancia un Random primero

int min = 1;        // Establecemos un minimo y un maximo para generar el random
int max = 10;


int random1 = random.nextInt(max + min) + min;  // Primera forma

int random2 = (int) (Math.random()*(max-min)) + min;    // Segunda forma

System.out.println(random1);
System.out.println(random2);

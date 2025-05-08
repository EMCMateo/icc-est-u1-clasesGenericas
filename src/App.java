import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Box <Integer> integerBox = new Box<>();
        Box <Double> doubleBox= new Box<>();
        Box <String> stringBox= new Box<>();


    integerBox.set(920);
    doubleBox.set(5.45);
    stringBox.set("HOla");

    System.out.println(integerBox);
    System.out.println(doubleBox);
    System.out.println(stringBox);

    
        Par<Integer, Boolean> integerBoolPar = new Par<>();
        Par<String, Double> stringDoublePar = new Par<>();
        Par<String, Integer> stringIntPar = new Par<>("Pota", 26);
        Par<Boolean, Integer> bolIntPar = new Par<>();

        bolIntPar.setValues(true, 2);

        integerBoolPar.setClave(20);
        integerBoolPar.setValor(true);

        stringDoublePar.setClave("ODA");
        stringDoublePar.setValor(3.25);
    
    System.out.println(integerBoolPar);
    System.out.println(stringDoublePar);
    System.out.println(stringIntPar);
    System.out.println(bolIntPar);


        Persona [] personas = new Persona[10];
        personas[0] = new Persona("Juan", 30);
        personas[1] = new Persona("Ana", 20);
        personas[2] = new Persona("Pedro", 40);
        personas[3] = new Persona("Maria", 15);
        personas[4] = new Persona("Lucia", 25);
        personas[5] = new Persona("Carlos", 35);
        personas[6] = new Persona("Sofia", 10);
        personas[7] = new Persona("Luis", 45);
        personas[8] = new Persona("Elena", 5);
        personas[9] = new Persona("Pablo", 50);

        int personaMayor = 0;
        int personaMenor = 0;
        
        for (int i = 0; i<personas.length;i++){
            if (personas[i].getEdad() >= 18){
                personaMayor++;

            }else{
                personaMenor++;
            }
        }



        Par<String, Integer> [] personasMayores = new Par[personaMayor]; 
        Par<String, Integer> [] personasMenores = new Par[personaMenor]; 


        int indexMayor = 0;
        int indexMenor = 0;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {

                personasMayores[indexMayor++] = new Par<>(personas[i].getNombre(), personas[i].getEdad());
            } else {

                personasMenores[indexMenor++] = new Par<>(personas[i].getNombre(), personas[i].getEdad());
            }
        }

        System.out.println("Personas mayores de edad: ");
        for (int i = 0; i < personasMayores.length ; i++){
            System.out.println(personasMayores[i].getClave() + " " + personasMayores[i].getValor());
        }
        System.out.println("Menores de edad: ");
        for (int i = 0; i < personasMenores.length; i++){
            System.out.println(personasMenores[i].getClave() + " " + personasMenores[i].getValor());

        }


    }
}

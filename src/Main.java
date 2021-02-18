public class Main{
    public static void main(String[] args){
        persona panchito = new persona();
        persona lupita = new persona();

        panchito.setName("Panchito");
        lupita.setName("lupita");

        panchito.cumplirAnios();
        panchito.cumplirAnios();
        panchito.cumplirAnios();
        panchito.cumplirAnios();

        lupita.cumplirAnios();
        lupita.cumplirAnios();

        System.out.println(panchito.getName() + " tiene " + panchito.getEdad() + " años.");
        System.out.println(lupita.getName() + " tiene " + lupita.getEdad() + " años.");

    }
}

class persona{
    private int edad;
    private String name;

    public persona(){
        edad=20;
    }

    public void setName(String name){
        this.name = name; //this->este
    }
    public String getName(){
        return name;
    }
    public void cumplirAnios(){
        edad++;
    }
    public int getEdad(){
        return edad;
    }
}

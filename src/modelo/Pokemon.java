package modelo;
import java.util.Random;


public class Pokemon {

    //Atributos
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEsp;
    private int defensaEsp;
    private int velocidad;
    static int estamina;
    private int nivel;
    private int experiencia;
    private int fertilidad;
    //Enums
    private Tipo tipo1;
    private Tipo tipo2;
    private Estado estado;
    Movimiento[] movimientos;

    //TODO: Hacer constructor pasándole todos los parámetros
    public Pokemon pokemonRdm(Pokemon pokemon){

        Random random = new Random();
        pokemon.vitalidad = random.nextInt(9) + 1;
        pokemon.ataque = random.nextInt(9) + 1;
        pokemon.defensa = random.nextInt(9) + 1;
        pokemon.ataqueEsp = random.nextInt(9) + 1;
        pokemon.defensaEsp = random.nextInt(9) + 1;
        pokemon.velocidad = random.nextInt(9) + 1;
        

        movimientos = new Movimiento[4];
        return pokemon;
    }

    


    
     //Meter coleccion movimientos: hacer movimiento de tipo movimiento

    //Meter lista de movimientos posibles

   

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMote() {
        return this.mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public int getVitalidad() {
        return this.vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueEsp() {
        return this.ataqueEsp;
    }

    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }

    public int getDefensaEsp() {
        return this.defensaEsp;
    }

    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEstamina() {
        return this.estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getFertilidad() {
        return this.fertilidad;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public Tipo getTipo1() {
        return this.tipo1;
    }

    public void setTipo1(Tipo tipo1) {
        this.tipo1 = tipo1;
    }

    public Tipo getTipo2() {
        return this.tipo2;
    }

    public void setTipo2(Tipo tipo2) {
        this.tipo2 = tipo2;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Random getR1() {
        return this.r1;
    }

    public void setR1(Random r1) {
        this.r1 = r1;
    }
     

    //Constructor

   

    //Metodos get y set

    Random r1 = new Random();

    //Completar método (aprender ataques)
    public void subirNivel(){
        if (experiencia >= 10 * nivel) {
            nivel++;
            vitalidad = r1.nextInt(4) + 1 + vitalidad;
            ataque = r1.nextInt(4) + 1 + ataque;
            defensa = r1.nextInt(4) + 1 + defensa;
            ataqueEsp = r1.nextInt(4) + 1 + ataqueEsp;
            defensaEsp = r1.nextInt(4) + 1 + defensaEsp;
            velocidad = r1.nextInt(4) + 1 + velocidad;

        }
         
    }

    

    //Completar método
    public int atacar(){
        return 3;
    }
    

    //TODO: Completar método con el enumerado
    public Ventaja comprobarVentaja(Pokemon ejemplo){

        switch (tipo1) {
            case FUEGO : 
                if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.BICHO ) {
                    return Ventaja.VENTAJA;
                    
                }
                else if (ejemplo.tipo1 == Tipo.TIERRA || ejemplo.tipo1 == Tipo.AGUA ) {
                    
                    return Ventaja.DESVENTAJA;
                    
                }
            case AGUA : 
                if (ejemplo.tipo1 == Tipo.FUEGO  || ejemplo.tipo1 == Tipo.TIERRA) {
                    
                    return Ventaja.VENTAJA;
                    
                }
                else if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.ELECTRICO ) {
                    
                    return Ventaja.DESVENTAJA;
                }

            case PLANTA : 
                if (ejemplo.tipo1 == Tipo.TIERRA  || ejemplo.tipo1 == Tipo.AGUA) {
                   
                    return Ventaja.VENTAJA;    
                }
                else if (ejemplo.tipo1 == Tipo.FUEGO || ejemplo.tipo1 == Tipo.BICHO ) {
                    
                    return Ventaja.DESVENTAJA;
                }
            case VOLADOR : 
                if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.BICHO) {
                    
                    return Ventaja.VENTAJA;    
                }
                else if (ejemplo.tipo1 == Tipo.ELECTRICO || ejemplo.tipo1 == Tipo.TIERRA ) {
                    
                    return Ventaja.DESVENTAJA;
                }
            case ELECTRICO : 
                if (ejemplo.tipo1 == Tipo.AGUA || ejemplo.tipo1 == Tipo.VOLADOR) {
                    
                    return Ventaja.VENTAJA;    
                }
                else if (ejemplo.tipo1 == Tipo.TIERRA || ejemplo.tipo1 == Tipo.PLANTA ) {
                    return Ventaja.DESVENTAJA;
                }
            case BICHO : 
                if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.AGUA) {
                    return Ventaja.VENTAJA;
                    
                }
                else if (ejemplo.tipo1 == Tipo.FUEGO || ejemplo.tipo1 == Tipo.VOLADOR ) {
                    return Ventaja.DESVENTAJA;
                }
            case TIERRA : 
                if (ejemplo.tipo1 == Tipo.FUEGO || ejemplo.tipo1 == Tipo.ELECTRICO) {
                    return Ventaja.VENTAJA;
                      
                }
                else if (ejemplo.tipo1 == Tipo.PLANTA || ejemplo.tipo1 == Tipo.AGUA ) {
                    return Ventaja.DESVENTAJA;
                }

                break;
        
            
            
                  
        }
        return Ventaja.NEUTRO;
        
        
    }
    
    public void descansar(){
        this.estamina = 100;
    }

    //Completar método
    public void aprenderAtaque(Movimiento movimiento, int posicion){
        this.movimientos[posicion] = movimiento;
    }

    



    




    

    
}

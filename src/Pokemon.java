import java.util.Random;


public class Pokemon {

    //Atributos
    String nombre;
    String mote;
    int vitalidad;
    int ataque;
    int defensa;
    int ataqueEsp;
    int defensaEsp;
    int velocidad;
    int estamina = 100;
    int nivel;
    int experiencia;
    int fertilidad;
    //Enums
    Tipo tipo1;
    Tipo tipo2;
    Estado estado;


    
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
    int atacar(){
        return 3;
    }
    

    //Completar método
    int comprobarVentaja(){
        return 3;
    }

    //Completar método
    public void descansar(){
        estamina = 100;
    }

    //Completar método
    int aprenderAtaque(){
        return 3;
    }

    



    




    

    
}

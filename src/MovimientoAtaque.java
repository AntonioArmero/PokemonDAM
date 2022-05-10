public class MovimientoAtaque extends Movimiento {

    int potenciaAtaque;
    Tipo tipo1;

   public void consumirEstaminaAtaque () {
        Pokemon.estamina =- potenciaAtaque/2;

    }


    
    
    
}


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        return new Money((this.euros + added.euros), (this.cents + added.cents));
    }
    
    public boolean less(Money compared){
       return ((100 * this.euros) + this.cents) < ((100 * compared.euros) + compared.cents); 
    }
    
    public Money minus(Money decremented){
        int newEuro = this.euros - decremented.euros;
        int newCent = this.cents - decremented.cents;
        if(newCent < 0){
            newEuro--;
            newCent += 100;
        }
        if(newEuro < 0){
            return new Money(0, 0);
        }
        return new Money(newEuro, newCent);
    }

}

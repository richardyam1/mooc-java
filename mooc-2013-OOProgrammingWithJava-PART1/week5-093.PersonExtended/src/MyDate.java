
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared) {
        if(this.year > compared.year){  
            if(this.month > compared.month){
                return this.year - compared.year;
            }
            
            else if(this.month == compared.month){
                if(this.day >= compared.day){
                    return this.year - compared.year;
                }
                else{
                    return this.year - compared.year - 1;
                }
            }
            
            else{
                return this.year - compared.year - 1;
            }
        }
        
        else if(this.year < compared.year){
            
            if(this.month < compared.month){
                return compared.year - this.year;
            }
            
            else if(this.month == compared.month){   
                if(this.day <= compared.day){
                    return compared.year - this.year;
                }               
                else{
                    return compared.year - this.year - 1;
                }               
            }
            
            else{
                return compared.year - this.year - 1;
            }
        }
        
        
        return 0;   
    }

  
}
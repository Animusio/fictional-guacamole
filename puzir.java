
public class puzir{
    public static void main(String[] args) {
        int[] masiv = {4548,89994,33,443433,9994264,44333,99239,66,434};
        boolean otsort = false;

        while(!otsort){
            otsort = true;

            for(int i = 0; i < masiv.length-1; i++){

                if(masiv[i] > masiv[i+1]){
                    int peremen = masiv[i];
                    masiv[i]=masiv[i+1];
                    masiv[i+1]= peremen;
                    otsort = false;
                }
            }
        }
        for(int i = 0; i < masiv.length; i++){
            System.out.println(masiv[i]);
        }
    }
}

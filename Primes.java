public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args [0]);
        int p = 2;
        int multiple = 2*p;
        boolean [] BoolyArray = new boolean[N +1];

         for (int i = 2; i <= N; i++) { //initialize all to true
            BoolyArray[i] = true;
         }

          while (p*p <= N) //implementing the algorithm
          {
            if (BoolyArray[p] == true)
            {
                multiple = p*2;
            
            while (multiple <= N)
            {
                BoolyArray[multiple] = false;
                multiple = p + multiple;
            }
            }
             p++;
          }
     
System.out.println("Prime numbers up to " + N + ":");

int count = 0;
for (int i = 2; i <= N; i++) {
    if (BoolyArray[i]) {
        System.out.println(i);
        count++;
    }
}

int percent = (int) Math.round(100.0 * count / N);

System.out.println(
    "There are " + count + " primes between 2 and " + N +
    " (" + percent + "% are primes)"
);
    
}}     


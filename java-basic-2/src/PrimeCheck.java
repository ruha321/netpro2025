import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimeCheck {
    List<Integer> primes = new ArrayList<>();
    Map<String, Integer> prime_check = new HashMap<>();
    List<String> prime_keys = new ArrayList<>();
    Prime_pair[] pairs;

    public static void main(String[] args) {
        PrimeCheck pc = new PrimeCheck();
        //pc.prime_check();
        pc.prime_count();
        pc.pair_to_list();
    }

    public PrimeCheck() {
        prime_generation();
    }
    
    void prime_generation() {
        primes.add(2);
        LABEL:for (int i = 3; i <= 100000; i += 2) {
            for (int p: primes) {
                if (i % p == 0) {
                    continue LABEL;
                }
            }
            primes.add(i);
        }
    }

    void prime_count() {
        int preprime = 0;
        String preprimeString = "";
        String pairPart = "";
        for (int pi: primes){
            if(preprime == 0){
                preprime = pi;
                preprimeString = String.valueOf(preprime);
                pairPart = preprimeString.charAt(preprimeString.length() - 1) + "";
                continue;
            }
            String piString = String.valueOf(pi);
            String piPairPart = piString.charAt(piString.length() - 1) + "";
            String pair = pairPart + "-" + piPairPart;
            // System.out.println(preprime + "," + pi + "," + pair);
            // TODO
            if (!prime_check.containsKey(pair)) {
                prime_check.put(pair, 1);
                prime_keys.add(pair);
            } else {
                prime_check.put(pair,prime_check.get(pair) + 1);
            }
            preprime = pi;
            preprimeString = piString;
            pairPart = piPairPart;

        }
    }

    void pair_to_list() {
        pairs = new Prime_pair[prime_check.size()];
        int i = 0;
        for (String pair: prime_keys) {
            pairs[i] = new Prime_pair(pair, prime_check.get(pair));
            i += 1;
        }

        Arrays.sort(pairs);
        for(int j = pairs.length - 1; j >= 0; j--) {
            System.out.println(pairs[j].toString());
        };
    }

    void prime_check() {
        for (int p: primes) {
            System.out.print(p + ",");
        }
        System.out.println();
    }

    class Prime_pair implements Comparable<Prime_pair>{
        String pair;
        int count;
        
        Prime_pair(String pair, int count) {
            this.pair = pair;
            this.count = count;
        }

        int getCount() {
            return this.count;
        }

        String getPair() {
            return this.pair;
        }

        @Override
        public String toString() {
            return this.getPair() + " " + this.getCount();
        }

        @Override
        public int compareTo(Prime_pair p) {
            return this.getCount() - p.getCount();
        }
    }
}

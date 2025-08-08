import java.util.ArrayList;
class sieve_of_eratosthenes {
    public int[] sieve(int n) {
        int N=n;
        ArrayList<Integer> primesList = new ArrayList<>();
       
        boolean[] isPrime = new boolean[N + 1];
        

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <=N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primesList.add(i);
            }
        }
        int[] primes = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primes[i] = primesList.get(i);
        }
        return primes;
    }
}

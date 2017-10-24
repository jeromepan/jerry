import java.math.BigInteger;
import java.util.Scanner;

class Matrix{
    public BigInteger mod;
    public BigInteger d[][] = new BigInteger[3][3];
    public Matrix(Boolean flag, BigInteger _mod){
        for(int i=1; i<=2; i++) for(int j=1; j<=2; j++) d[i][j] = BigInteger.ZERO;
        if(flag == true)
            d[1][1] = d[2][2] = BigInteger.ONE;
        mod = _mod;
    }
    Matrix mul(Matrix b){
        Matrix res = new Matrix(false, mod);
        for(int i=1; i<=2; i++)
            for(int j=1; j<=2; j++)
                for(int k=1; k<=2; k++)
                    res.d[i][j] = res.d[i][j].add(d[i][k].multiply(b.d[k][j]).mod(mod)).mod(mod);
        return res;
    }
    Matrix pow(long b){
        Matrix res = new Matrix(true, mod);
        Matrix a = this;
        while(b != 0){
            if((b%2) != 0) res = res.mul(a);
            b/=2;
            a = a.mul(a);
        }
        return res;
    }
}
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        long n =  s.nextLong();
        BigInteger k = s.nextBigInteger();
        BigInteger mod = s.nextBigInteger();
        Matrix st = new Matrix(false, mod);
        st.d[1][1] = k.subtract(BigInteger.ONE);
        st.d[1][2] = k.subtract(BigInteger.ONE);
        st.d[2][1] = BigInteger.ONE;
        st.d[2][2] = BigInteger.ZERO;
        st = st.pow(n-1);

        BigInteger res1 = k.subtract(BigInteger.ONE).multiply(st.d[1][1]).mod(mod);
        BigInteger res2 = k.subtract(BigInteger.ONE).multiply(st.d[2][1]).mod(mod);
        BigInteger res = res1.add(res2).mod(mod);
        System.out.println(res);
    }
}
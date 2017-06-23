import java.math.*;

public class RsaKey {

    // This can be i or j in a private or public key.
    private BigInteger numf;
    // This is the common part n in a private or public key.
    private BigInteger second;

    // Construct key.
    public RsaKey(BigInteger first, BigInteger second) {
	this.numf = first;
	this.second = second;
    }

    // Get i or j.
    public BigInteger getFirst() {
	return numf;
    }

    // Get n.
    public BigInteger getSecond() {
	return second;
    }

}
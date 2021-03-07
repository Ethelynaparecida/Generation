package ExcExtraInterface;

public class SegurodeVida implements Tributavel{
	public double seguro;
	
	
	@Override
	public double calculaTributos() {
		seguro = seguro - 42;
		return 0;
	}

	
}

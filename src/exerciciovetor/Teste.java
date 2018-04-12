package exerciciovetor;

public class Teste 
{
	public static void main(String[] args) 
	{
		
		Vetor v = new Vetor(10);
		
		v.addValue(3);
		v.addValue(6);
		v.addValue(0);
		v.addValue(99);
		v.addValue(-8);
		v.addValue(112);
		v.addValue(3);
		v.addValue(3);
		v.addValue(88);
		
		v.show();
	
	    if(v.contains(99) > 0) {
	    		v.delValue(99);
	    }
	    
	    v.show();
	    
	    v.delAllValues(3);
	    
	    v.show();
	    
	    v.delValue(88);
	    
	    v.show();
	    
	  //testa limite de insercao no vetor
	    
	    for(int i=0; i < 20; i++) { 
	    		v.addValue(55);
	    }
	    
	    v.show();
	    
	}

}

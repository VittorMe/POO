public  class  Calculadora {
	private  int bateria ;
	private  int maxBateria; // objeto
	
	public Calculadora  ( int  maxBattery ) { // parametro
		this.maxBateria = maxBattery;
		this.bateria =  0 ;
	}
	
	public  int  getBattery () {
		return bateria;
	}
	
	 public void  charge (  int valor ) { 
		bateria += valor;
		if (bateria > maxBateria) {
			bateria = maxBateria;
		}
	
	}
	
    public String som( int a , int b ) {  
    	if (bateria == 0 ) {
    		return  " Erro: bateria insuficiente " ;
    	}
    	bateria -= 1;
    	return (a + b) + " " ;
    }
    
    public  String  div ( int  a , int  b ) {
    	if (bateria == 0 ) {
    		return  " Erro: bateria insuficiente " ;
    	}
    	bateria -= 1;
    	if (b == 0 ) return  " Erro: divisao por zero " ;
    	return (a / b) + " " ;
    }  
}


public class Onibus{	
  
    //VARIAVEIS
    public int maxPessoa;
    public int numPessoa;
    public float horario;
    
    //METODO CONSTRUTOR
    public Onibus(){
        
    }
    public Onibus(int maxPessoa, int numPessoa, float horario){
        this.maxPessoa = maxPessoa;
        this.numPessoa = numPessoa;
        this.horario = horario;
    }
    
    //METODOS ESPECIAIS
    public int getMaxpessoa(){
        return this.maxPessoa;
    }
    public void setMaxpessoa(int mxp){
        this.maxPessoa = mxp;
    }
    
    public int getNumpessoa(){
        return this.numPessoa;
    }
    public void setNumpessoa(int np){
        this.numPessoa = np;
    }
    
    public float getHorario() {
    	return this.horario;
    }
    
    public void setHorario(float hr) {
    	this.horario = hr;
    }
    
    //METODOS
    
    public void embarcar(int pe){
        if((this.getNumpessoa()+pe)>this.getMaxpessoa()){
            System.out.println("LOTADO");
        }else if(this.getNumpessoa()<this.getMaxpessoa()){
            this.setNumpessoa(this.getNumpessoa()+ pe);
            System.out.println("Embarcou!");
        }
    }
    public void desembarcar(int pes){
        if(this.getNumpessoa()==0){
            System.out.println("Não tem mais Aluno");
            }else if(this.getNumpessoa()<pes){
            System.out.println("Não tem esse tanto de pessoas!");
            
        }else if(this.getNumpessoa()>pes){
            this.setNumpessoa(this.getNumpessoa()-pes);
            System.out.println("Desembarcou!");
        } 
    }
    
    public void dirigir(float hr){
        if(this.getNumpessoa()<=0){
            System.out.println("AINDA NAO ESTÁ NA HORA CERTA!");
        }else if (this.getHorario()== hr) {
        	System.out.println("Saindo !");
        }
    }
    
    public void status(){
        System.out.println("Status: ");
        System.out.println("Máximo de ALunos: "+this.getMaxpessoa());
        System.out.println("Número de Alunos: "+this.getNumpessoa());
        System.out.println("Horário da Saida : " +this.getHorario());
    }

    
    
}
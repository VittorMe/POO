import static java.lang.System.exit;
import java.util.Scanner;
public class Onibus2 {
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        Onibus onibus = new Onibus();   
        
        
        while(true){
           int op;
           System.out.println("Oque deseja fazer?");
           System.out.println("1: Criar o ONIBUS");
           System.out.println("2: Embarcar aluno");
           System.out.println("3: Desembarcar aluno .");
           System.out.println("4: Dirigir.");
           System.out.println("5: Status.");
           System.out.println("6: Encerrar.");
           op = ler.nextInt();
            switch(op){
                
                
                case 1:
                    //criar carro
                    int mp;
                    int pa;
                    float ho;

                    System.out.println("Quantas pessoas cabem no onibus?");
                    mp = ler.nextInt();
                    onibus.setMaxpessoa(mp);
                    System.out.println("Quantidade de pessoas atualmente?");
                    pa = ler.nextInt();
                    onibus.setNumpessoa(pa);
                    System.out.println("Qual o horario de saido do Onibus");
                    ho = ler.nextFloat();
                    onibus.setHorario(ho);
                    break;
                    
                case 2:
                   //embarcar
                        int q;
                        System.out.println("Quantos?");
                        q = ler.nextInt();
                        onibus.embarcar(q);
                    break;
                    
                case 3:
                   //desembarcar
                        int qu;
                        System.out.println("Quantos?");
                        qu = ler.nextInt();
                        onibus.desembarcar(qu);
                    break;
                    
                    
                case 4:
                    //dirigir
                        float hr;
                        System.out.println("Que horas vai sair? ");
                        hr = ler.nextFloat();
                        onibus.dirigir(hr);;    
                    break;
                
                case 5:
                    //status
                	onibus.status();   
                    break;
                    
                case 6:
                    //encerrar
                        System.exit(0);   
                    break;    
                    
                default:
                    System.out.println("Ação Inválida!");
                    break;
                   
            } 
          
        }
        
    }
    
}//FINAL
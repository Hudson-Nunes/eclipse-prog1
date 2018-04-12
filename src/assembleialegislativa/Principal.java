package assembleialegislativa;

public class Principal
{
   public static void main(String[] args)
   {
       Deputado[] deputados = new Deputado[10];
       
       //Cria os arrays de funcionários de cada um dos 10 deputados, individualmente.
       
      deputados[0] = new Estadual("Dep1", "PPT", 20000, 22000, 12, "RS");
      deputados[1] = new Federal("Dep2", "PPS", 25000, 32000, 34, 123);
      deputados[2] = new Federal("Dep3", "PLN", 10000, 8000, 3, 456);
      deputados[3] = new Federal("Dep4", "JNF", 13000, 13000, 34, 789);
      deputados[4] = new Estadual("Dep5", "PPL", 9000, 7200, 21, "RS");
      deputados[5] = new Estadual("Dep6", "PIL", 22000, 17600, 10, "SP");
      deputados[6] = new Federal("Dep7", "KML", 32000, 30000, 10, 321);
      deputados[7] = new Federal("Dep8", "WHM", 25000, 29000, 4, 654);
      deputados[8] = new Estadual("Dep9", "GRE", 10000, 8000, 9, "SC");
      deputados[9] = new Estadual("Dep10", "MIO", 21000, 16800, 32, "RJ");
   
      //Preenche os arrays de funcionarios de cada um dos deputados
      
      for(int i = 0; i < deputados.length; i++) {
          for(int j = 0; j < deputados[i].getFuncionarios().length; j++) {
              deputados[i].getFuncionarios()[j] = new Funcionario("Funcionario "+ i, (int)((Math.random()*15000)+1), (int)((Math.random()*15000)+1));
          }   
      }
      
      //Cria os arrays para armazenar cada um dos tipos de corrupcao
      
      Deputado[] excedeFuncionarios = new Deputado[10];
      Deputado[] recebemValores = new Deputado[10];
      Deputado[] desviamVerbas = new Deputado[10];
      
      
      System.out.println("\n*****Deputados com mais funcionários que o permitido*****");
      for(int i = 0; i < excedeFuncionarios.length; i++) {
          if(excedeFuncionarios[i] == null) {
              System.out.print("");
          }
          else if(excedeFuncionarios[i] instanceof Estadual) {
              System.out.println(((Estadual)excedeFuncionarios[i]).getEstado());
          }
          else if(excedeFuncionarios[i] instanceof Federal) {
              System.out.println(((Federal)excedeFuncionarios[i]).getNumeroCadastro());
          }
      }
    
 
      System.out.println("\n*****Deputados que recebem valores dos funcionários*****");
      for(int i = 0; i < recebemValores.length; i++) {
          if(recebemValores[i] == null) {
              System.out.print("");
          }
          else if(recebemValores[i] instanceof Estadual) {
              System.out.println(((Estadual)recebemValores[i]).getEstado());
          }
          else if(recebemValores[i] instanceof Federal) {
              System.out.println(((Federal)recebemValores[i]).getNumeroCadastro());
          }
      }
      
      
      System.out.println("\n*****Deputados que desviam verbas*****");
      for(int i = 0; i < desviamVerbas.length; i++) {
          if(desviamVerbas[i] == null) {
              System.out.print("");
          }
          else if(desviamVerbas[i] instanceof Estadual) {
              System.out.println(((Estadual)desviamVerbas[i]).getEstado());
          }
          else if(desviamVerbas[i] instanceof Federal) {
              System.out.println(((Federal)desviamVerbas[i]).getNumeroCadastro());
          }
      }
    
   }
}
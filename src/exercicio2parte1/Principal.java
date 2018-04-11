package exercicio2parte1;

public class Principal
{
    public static void main(String[] args)
    {
        
        System.out.println("***** Exercício 4 *****");
        System.out.println();
        // a) crie 3 alunos conforme as descrições
        System.out.println("a) cria 3 alunos conforme as descrições e b) imprima as informações");
        System.out.println();
        Aluno aluno1 = new Aluno("Brandamente Brasil", 1585248, 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", 2254879, 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", 85994, 7, 1);
        
        // b) imprima as informações de cada um dos 3 alunos
        aluno1.imprimeInfo();
        System.out.println();
        aluno2.imprimeInfo();
        System.out.println();
        aluno3.imprimeInfo();
        System.out.println();
        
        // c) altere a nota do grau A de Radigunda para 9
        System.out.println("c) altera a nota do grau A de Radigunda para 9 e d)imprima a média final dela");
        aluno2.setGrauA(9);
        
        // d) imprima apenas a média final de Radigunda
        System.out.printf("%.2f", aluno2.calculaMediaFinal());
        System.out.println();
        
        // e) imprima somente a matrícula de Vitimado
        System.out.println();
        System.out.println("e) imprima somente a matrícula de Vitimado");
        System.out.println(aluno3.getMatricula());
        System.out.println();
        
        // f) altere a matrícula de Brandamente para 1585228
        System.out.println("f) altera a matrícula de Brandamante para 1585228");
        aluno1.setMatricula(1585228);
        System.out.println(aluno1.getMatricula());
        System.out.println();
        
        // g) crie 2 pessoas
        System.out.println("g) cria 2 pessoas, h) aumenta a idade de uma delas e i) imprima as informações delas");
        Pessoa pessoa1 = new Pessoa(19, "Excelsa",'F');
        Pessoa pessoa2 = new Pessoa(102, "Pacífico", 'M');
        
        // h) aumenta a idade de Excelsa
        pessoa1.aumentaIdade();
        
        // i) imprima as informações das duas pessoas
        pessoa1.imprimeInfo();
        System.out.println();
        pessoa2.imprimeInfo();
    }
    
}

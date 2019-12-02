/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudante objEstudante1 = new Estudante("Joao", "1231231", "(99)99999");
        Estudante objEstudante2 = new Estudante("Felipe", "1231231", "(99)88888"); // Monitor
        Estudante objEstudante3 = new Estudante("Ricardo", "1231231", "(99)77777");
        Estudante objEstudante4 = new Estudante("Lucas", "1231231", "(99)66666");
        Estudante objEstudante5 = new Estudante("Robson", "1231231", "(99)555555");
        
            //ADICIONANDO DISCIPLINA E NOTA
            objEstudante1.addDisciplinasNotas("POO", 10);
            objEstudante1.addDisciplinasNotas("Eng SF", 5);
            objEstudante1.addDisciplinasNotas("S.O", 5);
            objEstudante1.addDisciplinasNotas("Estrutura", 10);
            objEstudante1.addDisciplinasNotas("Estatística", 10);
            
            objEstudante3.addDisciplinasNotas("POO", 6);
            objEstudante3.addDisciplinasNotas("Eng SF", 6);
            objEstudante3.addDisciplinasNotas("S.O", 6);
            objEstudante3.addDisciplinasNotas("Estrutura", 6);
            objEstudante3.addDisciplinasNotas("Estatística", 6);
            
            //MOSTRANDO OS DADOS
            System.out.println("-----------------------------------");
            System.out.println("ESTUDANTE 1");
            objEstudante1.listarNotasDisciplinas();
            System.out.println("Média: " + objEstudante1.calculaMediaNotas());
            //objEstudante1.calculaMediaNotas();
            System.out.println("-----------------------------------");
            
            System.out.println("ETUDANTE 3");
            objEstudante3.listarNotasDisciplinas();
            System.out.println("Média: " + objEstudante3.calculaMediaNotas());
            System.out.println("-----------------------------------");
            
            objEstudante2.addEstudante(objEstudante1); //seta estudante 1 e estudante 3 como monitorados do estudante 2
            objEstudante2.addEstudante(objEstudante3);            
            System.out.println("Estudandtes monitorados pelo estudante 2: ");
            objEstudante2.listarMonitorados();
            System.out.println("-----------------------------------");
    }
}

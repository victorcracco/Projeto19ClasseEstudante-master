/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Willian
 */
public class Estudante {
    protected String nome;
    protected String RA;
    protected String cel;
    ArrayList<String> disciplinas = new ArrayList();
    ArrayList<Integer> notas = new ArrayList();
    ArrayList<Estudante> monitor = new ArrayList();

    public Estudante() {
    }

    public Estudante(String nome, String RA, String cel) {
        this.nome = nome;
        this.RA = RA;
        this.cel = cel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public void addDisciplinasNotas(String d, int n){
        this.disciplinas.add(d);
        this.notas.add(n);
    }    
    public void listarNotasDisciplinas(){
        for (int i = 0; i < disciplinas.size(); i++){
        System.out.println("Disciplina: " + this.disciplinas.get(i) + " Nota: " + this.notas.get(i));
        }
    }
    
    public int calculaMediaNotas(){
        int media=0, ac=0;
        for (int i = 0; i < notas.size(); i++){
            ac = ac + notas.get(i);
        }
        media = ac / notas.size();
        return media;
    }
    
    public void addEstudante(Estudante objEst){
         monitor.add(objEst);
    }
    
    public void listarMonitorados(){
        for (int i = 0; i < monitor.size(); i++){
            System.out.println("Estudante: " + monitor.get(i).nome);
        }
    }    
}
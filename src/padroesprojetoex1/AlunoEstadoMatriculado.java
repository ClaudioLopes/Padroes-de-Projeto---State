/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetoex1;

/**
 *
 * @author claudio
 */
public class AlunoEstadoMatriculado implements AlunoEstado{
    
    public void Matricular(Aluno a){
        System.out.println("Aluno ja matriculado");
    }
    public void Formar(Aluno a){
        a.setEstado(new AlunoEstadoFormado());
    }
    public void Trancar(Aluno a){
        a.setEstado(new AlunoEstadoTrancado());
    }
    public void Jubilar(Aluno a){
        a.setEstado(new AlunoEstadoJubilado());
    }
    public void Evadir(Aluno a){
        a.setEstado(new AlunoEstadoEvadido());
    }
    
    public String getEstado(){
        return "Matriculado";
    }
}

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
public class AlunoEstadoTrancado implements AlunoEstado{
    public void Matricular(Aluno a){
         a.setEstado(new AlunoEstadoMatriculado());
    }
    
    public void Formar(Aluno a){
         System.out.println("Aluno esta trancado");
    }
    
    public void Trancar(Aluno a){
         System.out.println("Aluno ja trancado");
    }
    
    public void Jubilar(Aluno a){
         a.setEstado(new AlunoEstadoJubilado());
    }
    
    public void Evadir(Aluno a){
         System.out.println("Aluno esta trancado");
    }
    
    public String getEstado(){
        return "Trancado";
    }
}

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
public class AlunoEstadoFormado implements AlunoEstado{
    
    public void Matricular(Aluno a){
         System.out.println("Aluno esta formado");
    }
    
    public void Formar(Aluno a){
         System.out.println("Aluno ja formado");
    }
    
    public void Trancar(Aluno a){
         System.out.println("Aluno esta formado");
    }
    
    public void Jubilar(Aluno a){
         System.out.println("Aluno jesta formado");
    }
    
    public void Evadir(Aluno a){
         System.out.println("Aluno esta formado");
    }
    
    public String getEstado(){
        return "Formado";
    }
    
}

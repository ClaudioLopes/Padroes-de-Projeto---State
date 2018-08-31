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
public class AlunoEstadoJubilado implements AlunoEstado{
    public void Matricular(Aluno a){
         System.out.println("Aluno esta jubilado");
    }
    
    public void Formar(Aluno a){
         System.out.println("Aluno esta jubilado");
    }
    
    public void Trancar(Aluno a){
         System.out.println("Aluno esta jubilado");
    }
    
    public void Jubilar(Aluno a){
         System.out.println("Aluno ja esta jubilado");
    }
    
    public void Evadir(Aluno a){
         System.out.println("Aluno esta jubilado");
    }
    
    public String getEstado(){
        return "Jubilado";
    }
}

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
public class AlunoEstadoEvadido implements AlunoEstado{
    public void Matricular(Aluno a){
         System.out.println("Aluno evadido");
    }
    
    public void Formar(Aluno a){
         System.out.println("Aluno evadido");
    }
    
    public void Trancar(Aluno a){
         System.out.println("Aluno evadido");
    }
    
    public void Jubilar(Aluno a){
         System.out.println("Aluno evadido");
    }
    
    public void Evadir(Aluno a){
         System.out.println("Aluno ja evadido");
    }
    
    public String getEstado(){
        return "Evadido";
    }
}

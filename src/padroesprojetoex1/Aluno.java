/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetoex1; // padrão state

public class Aluno {
    AlunoEstado estado;


    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
    
        
    public void Matricular(){
       estado.Matricular(this);
    }
    
    public void Formar(){
       estado.Formar(this);
    }
    
    public void Trancar(){
        estado.Trancar(this);
    }
    
    public void Jubilar(){
        estado.Jubilar(this);
    }
    
    public void Evadir(){
        estado.Evadir(this);
    }

    public Aluno() {
    }
}

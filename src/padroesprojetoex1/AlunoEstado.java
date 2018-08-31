/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetoex1;

public interface AlunoEstado {
    
    public void Matricular(Aluno a);
    public void Formar(Aluno a);
    public void Trancar(Aluno a);
    public void Jubilar(Aluno a);
    public void Evadir(Aluno a);
    public String getEstado();
}

public class Gerente extends Funcionario {

    private int senha;

    public boolean Autentica (int senha){
        if (this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public double bonificacao(){
        return this.salario;
}
}
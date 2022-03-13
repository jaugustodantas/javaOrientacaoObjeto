public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private int tipo; 

    //inicio construtores
    public Funcionario(String nome, String cpf,double salario,int tipo){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tipo = tipo;
    }

    //fim construtores

    // começo dos sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    //fim dos sets

    // começo gets
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }
    public int getTipo() {
        return tipo;
    }
    //fim dos gets

    //metodos
    public double bonificacao(){
        if(this.tipo == 0){
            return this.salario *0.1;
        }else if (this.tipo ==1){
            return this.salario;
        }else{
            return this.salario + 1000;
        }
    }

    //fim metodos
}
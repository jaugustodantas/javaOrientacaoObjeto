public class Programa {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("zé", "111111", 1700, 0);
        Funcionario funcionario2 = new Funcionario("jaum", "222222", 2000, 1);
        Funcionario funcionario3 = new Funcionario("tom","333333",3000,2);

        System.out.println(funcionario.bonificacao());
        System.out.println(funcionario2.bonificacao());
        System.out.println(funcionario3.bonificacao());

    }
}
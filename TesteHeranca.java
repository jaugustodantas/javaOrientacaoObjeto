public class TesteHeranca {

    public static void main(String[] args) {
            Gerente g1 = new Gerente();

            g1.setNome("jaum");
            g1.setCpf("1234");
            g1.setSenha(1234);

            g1.setSalario(1000);
            System.out.println(g1.getSalario());
            System.out.println(g1.getNome());
            System.out.println(g1.getCpf());
            System.out.println(g1.Autentica(1234));
            g1.salario = 3;
            System.out.println(g1.getSalario());
    }
}
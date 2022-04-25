public class Principal {
    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Maria");
        vendedor.setDepartamento("Vendedor de Sapatos");
        vendedor.setSalario(1200);
        vendedor.setDataDeEntrada("12/03/2002");
        vendedor.setRg("41");
        vendedor.setEstaNaEmpresa(true);

        Gerente gerente = new Gerente();
        gerente.setNome("Luiz");
        gerente.setDepartamento("Gerente de Vendas");
        gerente.setSalario(4200);
        gerente.setDataDeEntrada("19/04/1999");
        gerente.setRg("43");
        gerente.setEstaNaEmpresa(true);

        Supervisor supervisor = new Supervisor();
        supervisor.setNome("Carlos");
        supervisor.setDepartamento("Supervisor de Estoque");
        supervisor.setSalario(6700);
        supervisor.setDataDeEntrada("24/03/1998");
        supervisor.setRg("45");
        supervisor.setEstaNaEmpresa(true);

}
}

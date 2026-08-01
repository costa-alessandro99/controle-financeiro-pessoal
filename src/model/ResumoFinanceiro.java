package model;

public class ResumoFinanceiro {

    private FinancialManagement management;

    public ResumoFinanceiro(FinancialManagement management){
        this.management = management;
    }

    public void resumoTotal() {


        System.out.println("==================");
        System.out.println("Resumo Financeiro: ");
        System.out.println("==================");
        System.out.println();

        System.out.printf("Saldo disponível: R$%.2f\n", management.getSaldoTotal());
        System.out.printf("Valor total investido: R$%.2f\n", management.getTotalInvestido());
        System.out.printf("Patrimônio total: R$%.2f\n", management.exibirPatrimonioTotal());
        System.out.println();

        management.exibirTransacoes();
        management.exibirInvestimentos();

        System.out.println();

    }
}

//        Código sem uso por ora, talvez reuse novamente.
//        System.out.printf("Receitas: R$%.2f\n", management.getTotalReceitas());
//        System.out.printf("Despesas: R$%.2f\n", management.getTotalDespesas());
//        System.out.printf("Saldo total disponível: R$%.2f\n", management.getSaldoTotal());
//        System.out.println();

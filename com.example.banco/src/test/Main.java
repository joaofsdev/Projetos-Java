package test;

import dominio.*;
import exceptions.SaldoInsuficienteException;
import exceptions.TransacaoInvalidaException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> bancodeDados = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        ContaBancaria contaTeste = new ContaCorrente("Teste01", "01", 1000, 200);
        bancodeDados.add(contaTeste);
        boolean continuar = true;

        while (continuar) {
            System.out.println("===== Menu Banco Central =====\n");
            System.out.println("1 - Criar Conta Banco Central");
            System.out.println("2 - Listar Contas do Banco Central");
            System.out.println("3 - Fazer Transferencia");
            System.out.println("4 - Sair\n");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = input.nextLine();
                    System.out.println("Digite o numero da conta: ");
                    String numeroConta = input.nextLine();
                    System.out.println("Digite seu saldo: ");
                    double saldo = input.nextDouble();
                    input.nextLine();
                    System.out.println("Digite o limite de cheque: ");
                    double limiteChequeEspecial = input.nextDouble();
                    input.nextLine();

                    System.out.println("Qual tipo de conta deseja abrir\n");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupanca");
                    int conta = input.nextInt();
                    input.nextLine();

                    if (conta == 1) {
                        ContaCorrente contaCorrente = new ContaCorrente(nome, numeroConta, saldo, limiteChequeEspecial);
                        bancodeDados.add(contaCorrente);
                        System.out.println("Conta Corrente criada com sucesso!");
                    } else if (conta == 2) {
                        ContaPoupanca contaPoupanca = new ContaPoupanca(nome, numeroConta, saldo);
                        bancodeDados.add(contaPoupanca);
                        System.out.println("Conta Poupanca criada com sucesso!");
                    } else if (conta != 1 && conta != 2) {
                        System.out.println("Erro ao criar Conta!");
                    }
                    break;
                case 2:
                    for (ContaBancaria b : bancodeDados) {
                        System.out.println(b.gerarExtrato());
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor da transferencia?");
                    double valor = input.nextDouble();
                    input.nextLine();
                    System.out.println("Qual o numero da conta?");
                    String numeroC = input.nextLine();

                    boolean contaEncontrada = false;

                    for (ContaBancaria c : bancodeDados) {
                        if (c.getNumeroConta().equals(numeroC)) {
                            contaEncontrada = true;

                            System.out.println("Qual o tipo de transferencia?");
                            System.out.println("1 - PIX");
                            System.out.println("2 - TED");
                            System.out.println("3 - DEPOSITO");
                            int op = input.nextInt();
                            input.nextLine();

                            if (op == 1) {
                                try (AuditoriaBacen log = new AuditoriaBacen()) {
                                    c.processarTransferencia(valor, TipoTransacao.PIX);
                                    log.registrarOperacao(c, valor, TipoTransacao.PIX);
                                } catch (SaldoInsuficienteException | TransacaoInvalidaException e) {
                                    System.out.println(e.getMessage());
                                }
                            } else if (op == 2) {
                                try (AuditoriaBacen log = new AuditoriaBacen()) {
                                    c.processarTransferencia(valor, TipoTransacao.TED);
                                    log.registrarOperacao(c, valor, TipoTransacao.TED);
                                } catch (SaldoInsuficienteException | TransacaoInvalidaException e) {
                                    System.out.println(e.getMessage());
                                }
                            } else if (op == 3) {
                                try (AuditoriaBacen log = new AuditoriaBacen()) {
                                    c.processarTransferencia(valor, TipoTransacao.DEPOSITO);
                                    log.registrarOperacao(c, valor, TipoTransacao.DEPOSITO);
                                } catch (SaldoInsuficienteException | TransacaoInvalidaException e) {
                                    System.out.println(e.getMessage());
                                }
                            } else {
                                System.out.println("Erro: Selecione um tipo de transferencia existente!");
                            }

                            break;
                        }
                    }

                    if (!contaEncontrada) {
                        System.out.println("Erro: Número da conta não existe!");
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Selecione uma opção valida!");
            }
        }
    }
}

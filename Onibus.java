import java.util.Scanner;

public class Onibus{
  public static void main (String [] args){
    
    int assentos [] [] = new int [10] [4];
    int numeroAssento = 1;
    int escolha = -5;
    int escolhaAssento = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("===========>> Seja Bem Vindo ao <===========");
    System.out.println("  Sistema de reservas e vendas de assentos ");
    System.out.println();
    for (int i = 0 ; i < 10 ; i++){
      for (int j = 0 ; j < 4 ; j++){
        assentos [i] [j] = numeroAssento;
        numeroAssento++;
      }
    }

    while(escolha != 0){
      System.out.println("   ________________");
      System.out.println("  /----------------\\");
      for (int i = 0 ; i < 10 ; i++){
        for (int j = 0 ; j < 4 ; j++){
          if (j == 0 || j == 2){
            System.out.print(" | ");
          } else {
            System.out.print(" ");
          }

          if (escolha == 1)
          {
            if (escolhaAssento == assentos [i] [j])
            {
              assentos [i] [j] = -1;
            }
          }else if (escolha == 2){
            if (escolhaAssento == assentos [i] [j])
            {
              assentos [i] [j] = -2;
            }
          }else if (escolha ==3 && assentos [i] [j] == -2){
            assentos [i] [j] = escolhaAssento;
          }
          
          if (assentos [i] [j] != -1 && assentos [i] [j] != -2){
            System.out.printf("%3d", assentos [i] [j]);
          } else if (assentos [i] [j] == -1){
            System.out.printf("%3s", "V");
          } else if (assentos [i] [j] == -2){
            System.out.printf("%3s", "R");
          }
        }
        System.out.print("|");
        System.out.println();
      }
      System.out.println("  ------------------");
      
      System.out.println(" Digite [1] para comprar um assento.");
      System.out.println(" Digite [2] para reservar um assento.");
      System.out.println(" Digite [3] para cancelar a reserva de um assento.");
      escolha = sc.nextInt();

      if (escolha != 0){
        System.out.println(" Digite que assento deseja que seja realizado a operação: ");
        escolhaAssento = sc.nextInt();
      }
    }
  

  sc.close();

  }
}
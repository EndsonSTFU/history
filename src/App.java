import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("                                                         Hora de Aventura\n");
        Thread.sleep(2000);
        System.out.println("Você acorda em um mundo colorido.\n");
        Thread.sleep(2000);
        System.out.println("-Olà, eu sou o Finn- disse o garoto desconhecido.\n");
        Thread.sleep(2000);
        System.out.println("-Você deve tá bem confuso, vou te passar a visão. O Rei Gelado sequestrou a Princesa mais uma vez e temos que ajudar.");
        Thread.sleep(2000);
        System.out.println("-Tamo indo para o Reino Gelado.\n");
        Thread.sleep(2000);
        System.out.println("Você e Finn e partem em direção ao Reino Doce Em busca de uma espada para você.");
        Thread.sleep(2000);

        String espada;
        Scanner finn = new Scanner(System.in);
        System.out.println("Escolha uma espada: Espada de grama ou Espada de fogo?\n");
        espada = finn.nextLine();
        if (espada.equals("espada de grama")) {
            Thread.sleep(2000);
            System.out.println("Antes de tocar na espada ela se envolve em seu braço como uma cobra e permanece la, vocês partem em direção ao Reino gelado.\n");
            Thread.sleep(2000);
            System.out.println("Você se assunta com uma sombra misteriosa com chifres aparece na floresta.\n");
            Thread.sleep(2000);
            System.out.println("-E agora carinha? Vai lutar?- disse Finn.\n");
            Thread.sleep(2000);

            String luta;
            Scanner sombra = new Scanner(System.in);
             System.out.println("Oque vai fazer? lutar ou esperar?\n");
             luta = sombra.nextLine();
             Thread.sleep(2000);
             if (luta.equals("lutar")) {
             System.out.println("Era a Maga Caçadora, e ao se defender ela lhe lança um feitiço mortal");
             System.out.println("                                               ///FIM BRUTAL///");
                }

             else if(luta.equals("esperar")){
             System.out.println("Era a Maga caçadora, ao ver Finn e Jake ela se junta a vocês na missão de ajudar a Princesa.\n");
             Thread.sleep(2000);
             System.out.println("Vocês seguem na direção do objetivo.");
             Thread.sleep(2000);
             System.out.println("Você não está acostumado com longas caminhadas e Finn pergunta se quer parar.");
             Thread.sleep(2000);
            
            
                 String parada;
                 Scanner sono = new Scanner(System.in);
                 System.out.println("Quer parar ou continuar?");
                 parada = sono.nextLine();
                 if (parada.equals("parar")) {
                    System.out.println("Você se perde em pensamentos aleatorios.");
                    Thread.sleep(2000);
                    System.out.println("Depois de muito tempo a Maga Caçadora toca em você e você acorda.\n");
                    Thread.sleep(2000);
                    System.out.println("Após isso vocês seguem rumo ao Reino Gelado");
                    System.out.println("Depois de uma longa caminhada vocês se deparam com a princesa totalmente congelada");
                    Thread.sleep(2000);
                    System.out.println("Você percebe que é sua culpa por ter parado por tanto tempo");
                    Thread.sleep(2000);
                    System.out.println("Finn cai de joelhos totalmente em prantos.");
                    Thread.sleep(1000);
                    System.out.println("Todos em volta começam a chorar e por algum motivo você é contagiado pelo abalo de todos e acaba chorando junto de todos.\n");
                    Thread.sleep(2000);
                    System.out.println("                                                     ///FIM TRISTE///");

                    }
                    else if(parada.equals("continuar")){
                        System.out.println("Mesmo sabendo que você está com dificuldades para andar vocês continuam andando até encontrar o Rei Gelado prestes a congelar a princesa.");
                        Thread.sleep(2000);
                        System.out.println("A espada de grama faz um braço de grama e soca o rei gelado em um instante antes do desastre");
                        Thread.sleep(2000);
                        System.out.println("A princesa tira sua arma de portais do bolso e lhe manda de volta para casa.\n");
                        Thread.sleep(2000);
                        System.out.println("                                                     ///FIM///");
                   sono.close(); 
                }
             sombra.close();
            }
            
            }
            else if(espada.equals("espada de fogo")){
                System.out.println("Você pega a espada e sente algo ruim.");
                Thread.sleep(2000);
                System.out.println("A espada de fogo começa a tomar o controle do seu corpo e tudo em volta pega fogo.");
                Thread.sleep(2000);
                System.out.println("Finn não tem outra opção a não ser lutar contar você lhe golpeando com sua espada e acabando rapidamente com a luta.");
                Thread.sleep(2000);
                System.out.println("                                               ///FIM BRUTAL///");
                

                finn.close();

        }
     }
}

    
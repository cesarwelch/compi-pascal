package compiler;

import analysis.SemTable;

/**
 *
 * @author cwelch
 */

public class Main {

    public static String prgName;

    /**
     * Archivo principal, llama a cada uno de los pasos del compilador
     *
     * @param args pensado para poder correrse desde la linea de comando.
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        if (args.length < 1) {
                prgName = "./test4";
        } else
                prgName = args[0];

        System.out.println("Corriendo compilador en el programa: " + prgName);

        for (int i = 1; i < 8; i++) {
            switch(i){
                case 1:
                    //System.out.println("Lanzado LexicalExec");
                    analysis.LexicalExec.exec();
                    break;
                case 2:
                    //System.out.println("Lanzado SyntacticExec");
                    analysis.SyntacticExec.exec();
                    break;
                case 3:
                    //System.out.println("Creando Arbol");
                    abstree.Main.exec();
                    break;
                case 4:
                    //System.out.println("Lanzado SemanticExec");
                    analysis.SemanticExec.exec();
                    System.err.println(SemTable.printST());
                    break;
                case 5:
                    //System.out.println("Lanzado FrameExec");
                    analysis.FrameExec.exec();
                    break;
                case 6:
                    //System.out.println("Generando Codigo Intermedio");
                    finalCode.intermediateCodeExec.exec();
                    break;
                case 7:
                    //System.out.println("Generando Codigo Final");
                    //finalCode.finalCodeExec.exec();
                    break;
                default:
                    break;
            }
            //Thread.sleep(1000); //Pausa para que no se monte la salida
        }

        System.out.println("------------");
        System.out.print("Finalizado.\n");
        System.exit(0);
    }
}

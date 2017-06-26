package atividadeSO;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Processo {

    private ArrayList<String> processos = new ArrayList();

    private int indice = 0;

    public void carregarProcessos() {

        File arquivo = new File("");

        char[] letras = "ABCDE".toCharArray();

        try {
            FileReader leitor = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(leitor);

            String s = null;
            int n = 0;

            while ((s = buffer.readLine()) != null) {
                String c = String.valueOf(letras[n]);
                c += " - " + s;
                processos.add(c);
                n++;
            }

            buffer.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < processos.size(); i++) {
            System.out.println(processos.get(i));
        }

    }

    public double calcularMediaTurnaround() {
        double total = 0;

        for (int i = 0; i < processos.size(); i++) {
            String n = processos.get(i);
            String[] processo = n.split(" - ");
            total += Double.parseDouble(processo[1]);
        }
        return total / processos.size();
    }

    public int tempoEspera() {
        String tempo = processos.get(0);
        String[] array = tempo.split(" - ");
        return Integer.parseInt(array[1]);
    }
    
    public int tempoTurnaroundRR(int quantum) {
        String tempo = processos.get(indice);
        String[] array = tempo.split(" - ");
        int tempoExec = Integer.parseInt(array[1]);
        
        if ((tempoExec - quantum) < 0) {
            return tempoExec;
        } else {
            return quantum;
        }
    }

    public String obterNomeProcesso() {
        String tempo = processos.get(0);
        String[] array = tempo.split(" - ");
        return array[0];
    }

    public String obterNomeMenorProcesso() {
        String s = processos.get(0);
        String[] processo = s.split(" - ");
        String nomeProcesso = processo[0];
        int menorTempoExec = Integer.parseInt(processo[1]);

        for (int i = 0; i < processos.size(); i++) {
            s = processos.get(i);
            processo = s.split(" - ");
            int tempoExec = Integer.parseInt(processo[1]);
            if (tempoExec < menorTempoExec) {
                nomeProcesso = processo[0];
                menorTempoExec = tempoExec;
            }
        }
        return nomeProcesso;
    }
    
    public String NomeProcessoRR() {
        String nome = processos.get(indice);
        String[] array = nome.split(" - ");
        return array[0];
    }

    public int obterTempoMenorProcesso() {
        String s = processos.get(0);
        String[] processo = s.split(" - ");
        int menorTempoExec = Integer.parseInt(processo[1]);

        for (int i = 0; i < processos.size(); i++) {
            s = processos.get(i);
            processo = s.split(" - ");
            int tempoExec = Integer.parseInt(processo[1]);
            if (tempoExec < menorTempoExec) {
                menorTempoExec = tempoExec;
            }
        }
        return menorTempoExec;
    }

    public String saida() {
        String s = "";

        for (String str : processos) {
            s += str + "\n";
        }

        return s;
    }

    public boolean vazio() {
        return processos.isEmpty();
    }

    public int obterQuantum(int n) {
        return n;
    }

    

    

    public void execRR(int quantum) {

        String s = processos.get(indice);
        String[] processo = s.split(" - ");
        int t = Integer.parseInt(processo[1]);
        int resto = t - quantum;

        if (resto > 0) {
            processo[1] = Integer.toString(resto);
            s = processo[0] + " - " + processo[1];
            processos.set(indice, s);
        } else {
            processos.remove(indice);
            indice--;
        }
        indice++;
        if (indice >= processos.size()) {
            indice = 0;
        }
    }
}

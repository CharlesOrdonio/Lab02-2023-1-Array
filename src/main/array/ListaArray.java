package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return false;
    }

    @Override
    public int buscaIndice(int valor) {
        for (int i = 0; i < array.length; i++) {
            if (i == valor) {
                return i;
            }
        }
        return false;
    }

    @Override
    public int minimo() {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    @Override
    public int maximo() {
        int maximo = array[0]
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return minimo;
    }

    @Override
    public int predecessor(int valor) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == valor){
                if (array[i - 1] == null) {
                    return false;
                }
                else{
                    return array[i - 1];
                }
            }
        }
    }

    @Override
    public int sucessor(int valor) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == valor){
                if (array[i + 1] == null) {
                    return false;
                }
                else{
                    return array[i + 1];
                }
            }
        }
    }

    @Override
    public void insereElemento(int valor) {
        int novoTamanho = array.length + 1;
        int[] novoArray = new int[novoTamanho];

        for (int i = 0; i < novo array; i++) {
            novoArray[i] = novoTamanho.length;
        }

        novoArray[valor] = valor;

        for (int i = posicaoInserir + 1; i < novoTamanho; i++) {
            novoArray[i] = array[i - 1];
        }

        array = novoArray;
        return novoArray;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        int novoTamanho = array.length + 1;
        int[] novoArray = new int[novoTamanho];

        novoArray[buscaElemento] = valor;

        return novoArray;
    
    }

    @Override
    public void insereInicio(int valor) {
        for (int i = indice_fim - 1; i > 0; i--)
            array[i] = array[i+1];
        array[0] = valor;
    }

    @Override
    public void insereFim(int valor) {
        for (int i = indice_fim; i < 0 ; i++)
            array[i] = array[i-1];
        array[i] = valor
    }

    @Override
    public void remove(int valor) {
        
    }

    @Override
    public void removeIndice(int indice) {
        int novoTamanho = array.length - 1;
        int[] novoArray = new int[novoTamanho];

        System.arraycopy(array, 0, novoArray, 0, indice);

        System.arraycopy(array, indice + 1, novoArray, indice, novoTamanho - indice);

        return novoArray;
    }

    @Override
    public void removeInicio() {
        
    }

    @Override
    public void removeFim() {
        
    }
    
}

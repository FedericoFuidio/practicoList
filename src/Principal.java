import DataTypes.*;
import Exceptions.*;

public class Principal {


    public static void problemaDeJosefo(int n, int m) throws IllegalArgumentsException {
        if(m > n){
            throw new IllegalArgumentsException("m debe ser menor o igual que n");
        }
        ListaEncadenadaCircular mesa = new ListaEncadenadaCircular();
        int r = m;
        for (int i = 0; i < n; i++) {
            mesa.add(i + 1);
        }
        System.out.print("Orden de eliminación: ");
        while (mesa.size() > 1) {
            System.out.print(mesa.get(r) + " ");
            mesa.remove(r);
            r = r + m;
            if(r > mesa.size()-1){
                //r = r% mesa.size();
            }
        }
        System.out.println();

        System.out.println("Ganador: " + mesa.get(1));
    }

    public static void main(String[] args) throws IlegalIndexException, EmptyStackException, EmptyQueueException, NotBalancedException, EmptyHeapException {

        MyStack<Integer> temp = new ListaEnlazada<>();
        temp.push(30);
        temp.push(50);
        temp.push(20);
        temp.push(70);
        System.out.println(temp.top());
        temp.pop();
        System.out.println(temp.top());
        temp.pop();
        System.out.println(temp.top());
        temp.pop();
        System.out.println(temp.top());
        temp.pop();
        temp.push(20202);
        System.out.println(temp.top());
        temp.pop();
        System.out.println("     10"); //n filas (si la primera es la fila 0) (n = 5)
        System.out.print("    /  \\"); //n-1 (espacio = 2)
        System.out.println();
        System.out.print("   /    \\"); //n-2 (espacio = 4)
        System.out.println();
        System.out.print("  /      \\"); //n-3 (espacio = 6)
        System.out.println();
        System.out.print(" /        \\"); //n-4 (espacio = 8)
        System.out.println();
        System.out.print(4 + "          " + 5); //n-5 (espacio = 10)
        System.out.println();
        //... n-k (espacio = 2*k)

        for(int i = 0; i < 5; i++){
            System.out.print(" ");
        }
        System.out.println(10);
        for(int i = 0; i < 4; i++){
            System.out.print(" ");
        }
        System.out.print("/");
        for (int i = 0; i < 2; i++){

            System.out.print(" ");
        }
        System.out.print("\\");
        System.out.println();
        System.out.print("   /    \\"); //n-2 (espacio = 4)
        System.out.println();
        System.out.print("  /      \\"); //n-3 (espacio = 6)
        System.out.println();
        System.out.print(" /        \\"); //n-4 (espacio = 8)
        System.out.println();
        System.out.print(4 + "          " + 5); //n-5 (espacio = 10)

    }


}

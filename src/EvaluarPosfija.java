import Exceptions.*;
import DataTypes.*;

public class EvaluarPosfija {

    public EvaluarPosfija(String expresion) throws EmptyStackException {
        String posfija = expresion;
        System.out.println(metodo(expresion));
    }

    private Double metodo(String operacion) throws EmptyStackException, IllegalArgumentException {
        String operaciones = "+-*/";
        MyStack temp = new ListaEnlazada();
        String[] post = operacion.split(" ");
        int i = 0;
        while(i < post.length){
            if(!operaciones.contains(post[i])){
                temp.push(Double.parseDouble(post[i]));
            } else{
                Double a = (Double) temp.top();
                temp.pop();
                Double b = (Double) temp.top();
                temp.pop();

                if(post[i].equals("+")){
                    temp.push(b+a);
                }
                else if(post[i].equals("-")){
                    temp.push(b-a);
                }
                else if(post[i].equals("*")){
                    temp.push(b*a);
                }
                else if(post[i].equals("/")){
                    temp.push(b/a);
                }
            }
            i++;
        }

        Double a =(Double) temp.top();
        temp.pop();
        if(!temp.isEmpty()){
            throw new IllegalArgumentException("La entrada no es válida");
        }

        return a;
    }
}

import DataTypes.ListaEnlazada;
import DataTypes.MyStack;
import Exceptions.*;

public class BalanceoSimbolos {
    private final String expresion;


    public BalanceoSimbolos(String Expresion) throws EmptyStackException, NotBalancedException {
        this.expresion = Expresion;
        balanceo();
    }

    public void balanceo() throws NotBalancedException, EmptyStackException {
        MyStack temp = new ListaEnlazada();
        String apertura = "([{";
        String clausura = ")]}";
        String[] exp = this.expresion.split("");
        int i = 0;
        while(i < exp.length){
            if(apertura.contains(exp[i])){
                temp.push(exp[i]);
            }
            else if(temp.isEmpty() && clausura.contains(exp[i])){
                throw new NotBalancedException("Existe un parentesis de cierre al cual no le corresponde uno de apertura");
            }
            else if(clausura.contains(exp[i])){
                if(!exp[i].equals(cerrar(temp.top()))){
                    System.out.println(temp.top());
                    System.out.println(cerrar(temp.top()));
                    throw new NotBalancedException("Orden equivocado de parentesis");
                }
                temp.pop();
            }

            i++;

        }

        if(!temp.isEmpty()){
            throw new NotBalancedException("Existe un parentesis de apertura al cual no le corresponde uno de cierre");
        }
    }

    public String cerrar(Object temp){
        if(temp.equals("(")){
            return ")";
        }
        else if(temp.equals("[")){
            return "]";
        }

        else if(temp.equals("{")){
            return "}";
        }

        return null;
    }
}
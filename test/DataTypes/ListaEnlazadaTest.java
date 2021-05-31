package DataTypes;

import Exceptions.EmptyStackException;
import Exceptions.IlegalIndexException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaEnlazadaTest {

    @Test
    public void add() throws IlegalIndexException {
        Lista temp = new ListaEnlazada();
        temp.add(21);
        temp.add(12);
        temp.add("Prueba");
        temp.add("hola");

        assertEquals(21, temp.get(0));
        assertEquals("Prueba", temp.get(2));
    }

    @Test
    public void remove() throws IlegalIndexException {
        Lista temp = new ListaEnlazada();
        temp.add(21);
        temp.add(12);
        temp.add("Prueba");
        temp.add("hola");
        temp.remove(0);

        assertEquals(12, temp.get(0));

        temp.add(121);

        temp.remove(2);

        assertEquals(121, temp.get(2));
    }

    @Test
    public void get() throws IlegalIndexException {
        Lista temp = new ListaEnlazada();
        for(int i = 0; i < 10; i++){
            temp.add(i);
        }

        assertEquals(0, temp.get(0));
        assertEquals(9, temp.get(9));
        assertEquals(2, temp.get(2));
    }

    @Test
    public void pop() throws EmptyStackException {
        MyStack temp = new ListaEnlazada();
        temp.push(2);
        temp.push(4);
        temp.push(6);

        temp.pop();

        assertEquals(4, temp.top());

        temp.pop();

        assertEquals(2, temp.top());

        temp.pop();

        if(!temp.isEmpty()){
            fail();
        }

    }

    @Test
    public void top() {

    }

    @Test
    public void push() {
    }

    @Test
    public void makeEmpty() {
    }

    @Test
    public void enqueue() {
    }

    @Test
    public void dequeue() {
    }

    @Test
    public void enqueueLeft() {
    }

    @Test
    public void dequeueLeft() {
    }

    @Test
    public void enqueueRight() {
    }

    @Test
    public void dequeueRight() {
    }
}
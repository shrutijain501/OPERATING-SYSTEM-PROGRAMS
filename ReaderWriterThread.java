/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.concurrent.Semaphore;
import javaapplication1.ReaderWriter;
/**
 *
 * @author Student
 */
public class ReaderWriterThread {
    int rc=0;
    public static void main(String[] args) throws Exception{
        while(true)
        {
    ReaderWriter r=new ReaderWriter();
    Thread t1=new Thread(r);
    Thread t2=new Thread(r);
    Writer w=new Writer();
    Thread t3=new Thread(w);
    t1.setName("thread1");
    t1.start();
    t2.setName("thread2");
    t2.start();
    t3.setName("thread3");
    t3.start();
        }
    }
}


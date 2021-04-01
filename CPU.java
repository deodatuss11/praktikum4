/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poin2;

/**
 *
 * @author Deodatuss
 */
class CPU {
    double price;
 // nested class
    class Processor{
        // members of nested class
        double cores;
        String manufacturer;
        double getCache(){
                return 4.3;
            }
        }
    // nested protected class
    protected class RAM{
        // members of protected nested class
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;
        }
    }
    
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        
        CPU.RAM ram = cpu.new RAM();
        
        System.out.println("Processor Cache = "+processor.getCache());
        System.out.println("RAM Clock Speed = "+ram.getClockSpeed());
    }
}



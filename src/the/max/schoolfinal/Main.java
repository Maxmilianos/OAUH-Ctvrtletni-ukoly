/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.max.schoolfinal;

import the.max.schoolfinal.ulohy.*;
import the.max.schoolfinal.utils.Utils;

/**
 *
 * @author holomek_maxmilian
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Starting... ");
        Utils.load();
        new Uloha2().start();
    }
    
}

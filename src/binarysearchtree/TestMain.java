/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class TestMain {
    
    
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
       
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        AvlTree<Integer> avl = new AvlTree<>();
        System.out.println("Type 1 for BST, Type 2 for AVL \n");
        
        
            for (int i = 0; i < 3000; i++) {
                bst.insert(i);
            }
            
            bst.contains(2999);
            System.out.println(bst.contains(2999));
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
       
        }
        
    }

//AVL: 27.281.900 ns = 27,2819 ml
//BST: 55.944.500 ns = 55,9445 ml
    


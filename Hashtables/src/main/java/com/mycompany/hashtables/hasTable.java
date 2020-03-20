/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashtables;

/**
 *
 * @author udari
 */
class hasTable {
    
    void hasTable(int a[], int b[]) {
        
        int i=0, j=0;
    
    while(i<a.length && j<b.length) {
    
    if(a[i]==b[j]) {
        System.out.println(a[i] +""); i++; j++; }
    
    else if(a[i] <b[j])
            i++;
    else if(b[j]<a[i])
        j++;
    }
}
    public static void main(String args[]) {
        hasTable ne= new hasTable();
        
        int a[]={1,4,5,6,9,3,1,3};
        int b[]={1,4,6,10,5,6,3,1};
        
        System.out.print("Common elements are");
        ne.hasTable(a,b);
    }
}

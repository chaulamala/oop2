/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arissetyawan.email@gmail.com
 */
public class TestModel{
   
    public static void main(String args[]){
        /*
        Person p= new Person();
        p.find(1);
        p.setName("Jonox");
        p.create();
        System.out.println(System.currentTimeMillis());
        System.out.println(p.all());
        Order o = new Order();
        o.setUser(1);
        o.initOrCeate(2);
        o.find(1);
        o.setUser(1);
        o.initOrCeate(21);
        o.find(5);
//        */
//        Category cat = new Category();
//        cat.setName("Category B");
//        cat.create();
//        System.out.println(cat.all());
//
//        User user= new User();
//        user.Login("coba", "rahasia");
//        user.token?? >> if(user.getToken()!=null){
//            
//        sukses >>>> response json suksses
//        }
        /*
        
            
            public String getToken(){
                return this.token
            }
        public void setToken(){
            this.token= "safniosanjclksjclkxckxhchfsfs"; /// method random
        }
            while(next){
                /// >>> 
        user.setToken();
        user.setName(rs.getString("SFsafa);
        
        }
        
        */
        User user= new User();
        user.setPassword("coba");
        System.out.println(user.getPassword());
        
        user.doLogin("usernyah", "pass");
    }
}
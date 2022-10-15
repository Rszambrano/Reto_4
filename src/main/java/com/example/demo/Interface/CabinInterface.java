/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Modelo.Cabin;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface CabinInterface  extends CrudRepository <Cabin, Integer> {
    
}

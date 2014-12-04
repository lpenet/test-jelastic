/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet.test;

import java.io.Serializable;
import javax.inject.Named;
import lombok.Getter;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

/**
 *
 * @author lpenet
 */
@Named
@ViewAccessScoped
public class TestBean implements Serializable {
    @Getter
    private String test1 = "Test1";
    
    public String uneMethode(String test) {
        return "Une Methode : " + test;
    }
}

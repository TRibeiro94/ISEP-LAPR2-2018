/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr2.ClientServicesProvider.aplicationagpsd.Utils;

/**
 *
 * @author Tiago
 */
public class GeographicAreaRepetedException extends IllegalArgumentException {
    
    public GeographicAreaRepetedException(){
        super("Geographic area already exists");
    }
}
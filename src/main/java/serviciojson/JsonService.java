/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciojson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonService { // ESTA CLASE ME SIRVE TAL Y COMO ESTÁ. 
    
    public static Object stringToPojo(String json, Class clase) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        return mapeador.readValue(json,clase);
    }
    

}

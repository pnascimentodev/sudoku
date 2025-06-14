package br.com.dio.util;

import java.util.HashMap;
import java.util.Map;

public final class BoardTemplate {

    private BoardTemplate() {}
    
    /**
     * Template predefinido de jogo Sudoku
     * Cada entrada no mapa é representada como "linha,coluna" -> "valorEsperado,fixo"
     * Onde "fixo" determina se o número já está presente no início do jogo
     */
    public static Map<String, String> getDefaultTemplate() {
        Map<String, String> template = new HashMap<>();
        
        // Primeiro quadrante
        template.put("0,0", "5,true");
        template.put("0,1", "3,true");
        template.put("0,2", "4,false");
        template.put("1,0", "6,false");
        template.put("1,1", "7,false");
        template.put("1,2", "2,true");
        template.put("2,0", "1,true");
        template.put("2,1", "9,false");
        template.put("2,2", "8,false");
        
        // Segundo quadrante
        template.put("0,3", "9,false");
        template.put("0,4", "7,true");
        template.put("0,5", "8,false");
        template.put("1,3", "1,true");
        template.put("1,4", "9,false");
        template.put("1,5", "5,false");
        template.put("2,3", "3,false");
        template.put("2,4", "4,true");
        template.put("2,5", "2,false");
        
        // Terceiro quadrante
        template.put("0,6", "1,false");
        template.put("0,7", "2,false");
        template.put("0,8", "6,true");
        template.put("1,6", "8,false");
        template.put("1,7", "4,true");
        template.put("1,8", "3,false");
        template.put("2,6", "6,false");
        template.put("2,7", "5,true");
        template.put("2,8", "7,false");
        
        // Quarto quadrante
        template.put("3,0", "8,false");
        template.put("3,1", "5,true");
        template.put("3,2", "9,false");
        template.put("4,0", "4,true");
        template.put("4,1", "2,false");
        template.put("4,2", "6,false");
        template.put("5,0", "7,false");
        template.put("5,1", "1,false");
        template.put("5,2", "3,true");
        
        // Quinto quadrante
        template.put("3,3", "7,false");
        template.put("3,4", "8,true");
        template.put("3,5", "6,false");
        template.put("4,3", "5,false");
        template.put("4,4", "3,true");
        template.put("4,5", "9,false");
        template.put("5,3", "2,true");
        template.put("5,4", "4,false");
        template.put("5,5", "1,false");
        
        // Sexto quadrante
        template.put("3,6", "3,true");
        template.put("3,7", "4,false");
        template.put("3,8", "2,false");
        template.put("4,6", "7,false");
        template.put("4,7", "8,false");
        template.put("4,8", "1,true");
        template.put("5,6", "9,false");
        template.put("5,7", "6,true");
        template.put("5,8", "5,false");
        
        // Sétimo quadrante
        template.put("6,0", "9,false");
        template.put("6,1", "6,true");
        template.put("6,2", "1,false");
        template.put("7,0", "2,false");
        template.put("7,1", "8,false");
        template.put("7,2", "7,true");
        template.put("8,0", "3,true");
        template.put("8,1", "4,false");
        template.put("8,2", "5,false");
        
        // Oitavo quadrante
        template.put("6,3", "5,false");
        template.put("6,4", "1,true");
        template.put("6,5", "3,false");
        template.put("7,3", "9,true");
        template.put("7,4", "6,false");
        template.put("7,5", "4,false");
        template.put("8,3", "8,false");
        template.put("8,4", "2,true");
        template.put("8,5", "7,false");
        
        // Nono quadrante
        template.put("6,6", "2,false");
        template.put("6,7", "7,false");
        template.put("6,8", "4,true");
        template.put("7,6", "5,true");
        template.put("7,7", "3,false");
        template.put("7,8", "1,false");
        template.put("8,6", "9,false");
        template.put("8,7", "1,true");
        template.put("8,8", "6,false");
        
        return template;
    }

    public final static String BOARD_TEMPLATE =
            """
            *************************************************************************************
            *|---0---||---1---||---2---|*|---3---||---4---||---5---|*|---6---||---7---||---8---|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            0|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |0
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            1|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |1
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            2|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |2
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *************************************************************************************
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            3|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |3
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            4|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |4
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            5|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |5
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *************************************************************************************
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            6|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |6
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            7|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |7
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            8|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |8
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|---0---||---1---||---2---|*|---3---||---4---||---5---|*|---6---||---7---||---8---|*
            *************************************************************************************
            """;

}

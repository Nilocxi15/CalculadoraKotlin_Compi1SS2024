/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package com.example.calculadorakotlin.analyzers;
import java_cup.runtime.*;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%

//-------> Directivas
%public
%class L_Analyzer
%cupsym Symbols
%cup
%column
%full
%ignorecase
%line

//------> Expresiones Regulares
number = [0-9]+
decimal = {number}"."{number}
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]

%%

/*------------  3raa Area: Reglas Lexicas ---------*/

//-----> Simbolos

<YYINITIAL> "+"         { System.out.println("Reconocio "+yytext()+" mas"); return new Symbol(Symbols.mas, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "-"         { System.out.println("Reconocio "+yytext()+" menos"); return new Symbol(Symbols.menos, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "*"         { System.out.println("Reconocio "+yytext()+" por"); return new Symbol(Symbols.por, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "/"         { System.out.println("Reconocio "+yytext()+" div"); return new Symbol(Symbols.div, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "("         { System.out.println("Reconocio "+yytext()+" paro"); return new Symbol(Symbols.paro, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> ")"         { System.out.println("Reconocio "+yytext()+" parc"); return new Symbol(Symbols.parc, (yycolumn + 1), (yyline + 1), yytext()); }

//-------> Simbolos ER
<YYINITIAL> {number}    { System.out.println("Reconocio "+yytext()+" numero"); return new Symbol(Symbols.number, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {decimal}   {System.out.println("Reconocio "+yytext()+" decimal"); return new Symbol(Symbols.decimal, (yycolumn + 1), (yyline +1), yytext());}

{WhiteSpace} {/* Ignore */}

//------> Errores Lexicos
.                       { System.out.println("Error Lexico"+yytext()+" Linea "+ (yyline + 1) +" Columna "+ (yycolumn + 1)); }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @tittle EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
 * @author Juanvi Girbes 20837208J
 * @version 1.0
 */

/**
 * Constructor con tres parámetros
 * JUAN VICENTE GIRBES ALVENTOSA
 * 20837208J
 */
public class juanvi_girbes_20837208j {
    static final double FACTOR_HORA_EXTRA = 1.2;
 private String nombreCompleto, dni;
 private double salarioBasePorHora = 10.56;
 public juanvi_girbes_20837208j(String nombreCompleto, String dni) {
 this.nombreCompleto = nombreCompleto;
 this.dni = dni;
 }
 /**
  * Calcula el salario bruto mensual enf unción del salario base por hora y las
  * horas extras.
  * El precio por hora de la hora extra se determina con la constante 
  * FACTOR_HORA_EXTRA
  * @param horasExtra Número de horas extra dedicadas redondeado a la baja
  * (entero)
  * @return Devuelve el salario bruto mensual en euros con dos decimales
  */
 public double getSalarioEsteMes(int horasExtra) {
 double cantidadExtra, salarioFinal;
 cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
 return salarioFinal;
 }
 /**
  * 
  * @param args 
  */

 // Este método no lo comentaremos con JavaDoc
 public static void main(String[] args) {
 juanvi_girbes_20837208j emp = new juanvi_girbes_20837208j("JUANVI GIRBES",
"20837208J");
 int horasExtra = 2;
 System.out.println("El salario de " + emp.nombreCompleto + " este mes
 será de " + emp.getSalarioEsteMes(horasExtra)
 + " euros, al hacer " + horasExtra + " horas extra.");
 
 }
    
}

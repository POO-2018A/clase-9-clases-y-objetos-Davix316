
package cedula;

/**
 *
 * @author toshiba
 */
public class Cedula {

    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if(validarCedula(cedula)){
            System.out.println("Cedula valida");
            this.cedula = cedula;
        }else {
            System.out.println("Cedula no valida");
        }
    }
    
    //Metodos privados
    private boolean validarCedula(String cedula){
        //Declaracion de variables
        int acumulador =0;
        int sumaCoef;
        int ultimoDigito;
        int digitoTrueRecibido = Integer.parseInt(cedula.charAt(9)+"");//Almacenar ultimo digito de cedula
        //Producto de cada termino del arreglo
        for(int i=0; i<9 ; i++ ){
            if(i%2 ==0){
                sumaCoef = Integer.parseInt(cedula.charAt(i)+"")*2;
            }else {
                sumaCoef = Integer.parseInt(cedula.charAt(i)+"")*1;
            }
            if(sumaCoef>9){
                sumaCoef=sumaCoef-9;
            }
            acumulador=sumaCoef+acumulador;
        }
        ultimoDigito=acumulador;
        //Decena suoerior
        System.out.println("La suma total es: "+ ultimoDigito);
        while (acumulador%10 != 0){
                acumulador++;
            }
        
        ultimoDigito = acumulador-ultimoDigito;
        //Comparacion ultimo digito de cedula
        System.out.println("El ultimo digito de su cedula es el: "+ultimoDigito);
        if(ultimoDigito == digitoTrueRecibido){
            return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        Cedula p = new Cedula();
        // TODO code application logic here
            p.cedula ="1718165523";
            
            System.out.println("El numero de cedula ingresado es: "+ p.cedula);
            p.setCedula(p.cedula);
    }
    
}

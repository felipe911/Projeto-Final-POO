package fatec.poo.validacoes;

public class Validacao {

    public static boolean validaCodigo(String codigo){ // verifica se existe caracteres no txt.codigo
        if(codigo == ""){
            return false;
        }
        else{ // verifica se o que está no txt.codigo não são numeros de 0 a 9 utilizando a tabela asci
            for(int i = 0; i < codigo.length(); i++){
                if((int)codigo.charAt(i) < 48 || (int)codigo.charAt(i) > 57 ){
                    return false; // false = contem outros caracteres
                }
            }
        return true; // true = só numeros inteiros de 0 a 9
        }
    }
    
    
    static public boolean validarCPF(String strCPF) {
        double Soma;
        double Resto;

        if (strCPF.length()<= 13 || strCPF.equals(" ") || strCPF.equals("   .   .   -  ")) {
            return false;
        } else {
            for (int c = 0; c <= 9; c++) {
                if (strCPF.equals("" + c + c + c + "." + c + c + c + "." + c + c + c + "-" + c + c)) {
                    return false;
                }
            }
        }

        Soma = (Integer.parseInt(strCPF.substring(0, 1)) * 10)
                + (Integer.parseInt(strCPF.substring(1, 2)) * 9)
                + (Integer.parseInt(strCPF.substring(2, 3)) * 8)
                + (Integer.parseInt(strCPF.substring(4, 5)) * 7)
                + (Integer.parseInt(strCPF.substring(5, 6)) * 6)
                + (Integer.parseInt(strCPF.substring(6, 7)) * 5)
                + (Integer.parseInt(strCPF.substring(8, 9)) * 4)
                + (Integer.parseInt(strCPF.substring(9, 10)) * 3)
                + (Integer.parseInt(strCPF.substring(10, 11)) * 2);

        Resto = (Soma * 10) % 11;

        if (Resto == 10) {
            Resto = 0;
        }

        if (Resto != Integer.parseInt(strCPF.substring(12, 13))) {
            return false;
        }

        Soma = 0;
        Resto = 0;

        Soma = (Integer.parseInt(strCPF.substring(0, 1)) * 11)
                + (Integer.parseInt(strCPF.substring(1, 2)) * 10)
                + (Integer.parseInt(strCPF.substring(2, 3)) * 9)
                + (Integer.parseInt(strCPF.substring(4, 5)) * 8)
                + (Integer.parseInt(strCPF.substring(5, 6)) * 7)
                + (Integer.parseInt(strCPF.substring(6, 7)) * 6)
                + (Integer.parseInt(strCPF.substring(8, 9)) * 5)
                + (Integer.parseInt(strCPF.substring(9, 10)) * 4)
                + (Integer.parseInt(strCPF.substring(10, 11)) * 3)
                + (Integer.parseInt(strCPF.substring(12, 13)) * 2);

        Resto = (Soma * 10) % 11;

        if (Resto == 10) {
            Resto = 0;
        }

        if (Resto != Integer.parseInt(strCPF.substring(13, 14))) {
            return false;
        } else {
            return true;
        }
    }
}
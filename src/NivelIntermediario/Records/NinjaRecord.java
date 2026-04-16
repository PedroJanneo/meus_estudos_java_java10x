package NivelIntermediario.Records;

import java.util.Locale;

// por padrão, o record já cria construtor, GET e seus atributos são final
public record NinjaRecord(String nome,String email) {

    public String maisuculoEmail(String email){
        return  email.toUpperCase();
    }
}

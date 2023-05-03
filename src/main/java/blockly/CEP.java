package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import java.util.concurrent.Callable;



@CronappSwagger
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CEP {

public static final int TIMEOUT = 300;

/**
 *
 * CEP
 *
 * @author Rafael Juan Cardoso Martins
 * @since 03/05/2023, 11:56:02
 *
 */
public static Var ConsultarCEP() throws Exception {
 return new Callable<Var>() {

   private Var CEP = Var.VAR_NULL;
   private Var Retorno = Var.VAR_NULL;

   public Var call() throws Exception {
    CEP =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Endereco.active.CEP"));
    Retorno =
    cronapi.json.Operations.toJson(
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/x-www-form-urlencoded"),
    Var.valueOf(
    Var.valueOf("https://viacep.com.br/ws/").getObjectAsString() +
    CEP.getObjectAsString() +
    Var.valueOf("/json/").getObjectAsString()), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.Logradouro"),
    cronapi.json.Operations.getJsonOrMapField(Retorno,
    Var.valueOf("logradouro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.Bairro"),
    cronapi.json.Operations.getJsonOrMapField(Retorno,
    Var.valueOf("bairro")));
    return Var.VAR_NULL;
   }
 }.call();
}

}


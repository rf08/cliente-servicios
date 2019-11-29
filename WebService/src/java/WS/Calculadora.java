package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Calculadora")
public class Calculadora {

    @WebMethod(operationName = "Calculadora")
    public int Calculadora(@WebParam(name = "dato") int dato, @WebParam(name = "dato1") int dato1, @WebParam(name = "cond") int cond) {
        int result = 0;
        switch(cond){
            case 1:{
                result = dato+dato1;
            }break;
            case 2:{
                result = dato-dato1;
            }break;
            case 3:{
                result = dato*dato1;
            }break;
            default :{
                result = 0;
            }break;
        }
        return result;
    }

    
}

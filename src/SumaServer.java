

import sumaApp.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

class SumaImpl extends sumaPOA{
    private ORB orb;
    
    public void setORB(ORB orb_val){
        orb=orb_val;
    }
    
    public int sumar(int primerNumero,int segundoNumero){
        return primerNumero+segundoNumero;
    }
     public int restar(int primerNumero,int segundoNumero){
        return primerNumero+segundoNumero;
    }
      public int multiplicar(int primerNumero,int segundoNumero){
        return primerNumero+segundoNumero;
    }
       public int dividir(int primerNumero,int segundoNumero){
        return primerNumero+segundoNumero;
    }
    
    public void shutdown(){
        orb.shutdown(false);
    }
}

public class SumaServer{

    public static void main(String [] args){
        try{
            ORB orb= ORB.init(args,null);
            POA rootpoa=POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();
            SumaImpl sumaImpl=new SumaImpl();
            sumaImpl.setORB(orb);
            
            org.omg.CORBA.Object ref=rootpoa.servant_to_reference(sumaImpl);
            suma href=sumaHelper.narrow(ref);
            org.omg.CORBA.Object objRef=orb.resolve_initial_references("NameService");
            NamingContextExt ncRef=NamingContextExtHelper.narrow(objRef);
            
            
            String name="Suma";
            NameComponent path[]=ncRef.to_name(name);
            ncRef.rebind(path, href);
            System.out.println("Servidor de suma listo y en espera");
            orb.run();
        }
        catch(Exception e){
            System.err.println("ERROR: "+e);
            e.printStackTrace(System.out);
        }
        System.out.println("Adios cerrando servidor");
    }
}

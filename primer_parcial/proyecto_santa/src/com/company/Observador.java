package com.company;


public class Observador extends Thread{


    @Override
    public void run() {
        while(true){

            if(Panel.hayRojo<=0 && Panel.hayAzul<=0){
               System.out.println("santa duerme");

                Panel.semaforoAzul=0;
                Panel.semaforoRojo=0;

            }else if(Panel.hayAzul>=3){

                Panel.accesoAzul=true;
                System.out.println("acceso azul");
                while (Panel.hayAzul>0){

                    System.out.println("santa atiende a duendes");
                }

                Panel.accesoAzul=false;



            }else if(Panel.hayRojo>=9){

                Panel.accesoRojo=true;
                while (Panel.hayRojo>0){
                    System.out.println("Santa se va a repartir");

                }

                Panel.accesoRojo=false;

            }


            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

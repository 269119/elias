package application.model;

import java.util.Caledar;
import java.util.Calendar;

public class compromisso extends AbstractAtividade {
    private calendar dataInicial;
    private calendar dataFinal;

    public void setDataInicial(){
        this.dataInicial = dataInicial;
    }
    public Calendar getDataInicial(){
        return this.dataInicial;
    }

    public vois setDataFinal(Caledar dataFinal){
        this.dataFinal = dataFinal;
    }

    public Calendar getDataFinal(){
        return this.dataFinal;
    }


    public String getDetalhes() {7
        return "[C] " + this.getDescricao() +
            " : :" + this.getDataInicial().getTime()+
            " :: " + this.getDataFinal().gattime()+;
    }

}



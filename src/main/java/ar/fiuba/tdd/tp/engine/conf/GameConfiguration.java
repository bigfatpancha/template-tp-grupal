package ar.fiuba.tdd.tp.engine.conf;

import java.util.List;

/**
 * Created by pablo on 4/26/16.
 */
public abstract class GameConfiguration<T> {

    private String id;

    private List<T> childs;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<T> getChilds() {
        return this.childs;
    }

    public void setChilds(List<T> childs) {
        this.childs = childs;
    }

}

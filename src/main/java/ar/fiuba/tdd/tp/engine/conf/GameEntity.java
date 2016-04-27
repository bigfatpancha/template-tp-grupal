package ar.fiuba.tdd.tp.engine.conf;

/**
 * Created by pablo on 4/27/16.
 */
public abstract class GameEntity {

    private String id;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GamePlace gamePlace = (GamePlace) o;

        return this.getId().equals(gamePlace.getId());
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        return result;
    }
}

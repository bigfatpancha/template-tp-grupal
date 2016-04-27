package ar.fiuba.tdd.tp.engine.model;

/**
 * Created by pablo on 4/27/16.
 */
public abstract class GameEntity {

    private String id;

    private String place;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        GameEntity gamePlace = (GameEntity) object;

        return this.getId().equals(gamePlace.getId());
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        return result;
    }


    public boolean isInThatPlace(String place) {
        return  this.place.equalsIgnoreCase(place);
    }
}

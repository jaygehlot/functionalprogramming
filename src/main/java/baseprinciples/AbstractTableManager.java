package baseprinciples;

public abstract class AbstractTableManager<D> {

    public abstract String getTableName();

    public void putItem(D value) {
        System.out.println("Adding item to " + getTableName());
    }
}

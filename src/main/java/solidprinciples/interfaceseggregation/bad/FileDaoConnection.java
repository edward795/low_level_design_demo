package solidprinciples.interfaceseggregation.bad;

public class FileDaoConnection implements DaoInterface{
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("Unsupported operation connection not allowed!");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}

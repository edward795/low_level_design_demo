package solidprinciples.interfaceseggregation.bad;

public class DBDaoConnection implements DaoInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Opening a file is not supported!");
    }

    @Override
    public void deleteRecord() {

    }
}

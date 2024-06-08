package interfaceseggregation.good;

import interfaceseggregation.good.DaoInterface;

public class DBDaoConnection implements DBInterface, DaoInterface {
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}

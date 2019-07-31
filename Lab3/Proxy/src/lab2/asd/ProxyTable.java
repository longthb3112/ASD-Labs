package lab2.asd;

public class ProxyTable implements ITable {
    private ITable executor;

    public ProxyTable(ITable table) {
        this.executor = table;
    }

    @Override
    public int numOfRows() {
        return executor.numOfRows();
    }

    @Override
    public IRow getRow(int rowNum) {
        return executor.getRow(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        synchronized (this) {
            executor.addRow(row, rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        synchronized (this) {
            executor.modifyRow(rowNum, row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        synchronized (this) {
            executor.deleteRow(rowNum);
        }
    }
}

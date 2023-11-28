package springHibernate.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import springHibernate.model.Mahasiswa;

/**
 *
 * @author dell
 */
public class MahasiswaTableModel extends AbstractTableModel {
    private List<Mahasiswa> mahasiswas = new ArrayList<>();
    private final String HEADER[] = {"NPM", "Nama", "Kelas", "Alamat"};

    public MahasiswaTableModel(List<Mahasiswa> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }

    @Override
    public int getRowCount() {
        return mahasiswas.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return HEADER[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Mahasiswa barang = mahasiswas.get(rowIndex);

    switch (columnIndex) {
        case 0:
            return barang.getNpm();
        case 1:
            return barang.getNama();
        case 2:
            return barang.getKelas();
        case 3:
            return barang.getAlamat();
        default:
            return null;
    }}
}

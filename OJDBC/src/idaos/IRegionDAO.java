package idaos;

import java.util.List;
import models.Region;
public interface IRegionDAO {

    /**
     * getAll method untuk mengambil semua data pada tabel Regions
     * @return List
     */
    public List<Region> getAll();

    /**
     * Method yang digunakan untuk mendapatkan dan menyeleksi data dari tabel Regions
     * sesuai masukan parameter id 
     * @param id
     * @return list data yang sesuai dengan id
     */
    public List<Region> getById(int id);

    /**
     * Method yang digunakan untuk mendapatkan dan menyeleksi data dari tabel Regions
     * sesuai masukan parameter String
     * @param key
     * @return list data yang sesuai dengan parameter masukan
     */
    public List<Region> search(String key);

    /**
     * Method yang digunakan untuk memasukkan data ke dalam tabel Regions.
     * Parameter r adalah objek yang merujuk ke attribut tabel Regions.
     * @param r
     * @return true apabila data berhasil tersimpan melalui query, false apabila gagal menyimpan
     */
    public boolean insert(Region r);

    /**
     * Method yang digunakan untuk mengganti nilai data di dalam tabel regions
     * sesuai id. Parameter r adalah objek yang merujuk ke attribut tabel Regions.
     * @param r
     * @return true apabila query berhasil melakukan update, false apabila gagal melakukan update.
     */
    public boolean update(Region r);

    /**
     * Method yang digunakan untuk menghapus satu baris data sesuai id masukan.
     * @param id
     * @return true apabila berhasil, false apabila gagal
     */
    public boolean delete(int id);
}

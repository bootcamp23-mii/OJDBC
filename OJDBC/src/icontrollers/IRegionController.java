package icontrollers;

import java.util.List;
import models.Region;
public interface IRegionController {
    
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
    public List<Region> getById(String id);
    /**
     * Method yang digunakan untuk mendapatkan dan menyeleksi data dari tabel Regions
     * sesuai masukan parameter String
     * @param key
     * @return list data yang sesuai dengan parameter masukan
     */
    public List<Region> search(String key);
    /**
     * Method yang digunakan untuk memasukkan data ke dalam tabel Regions.
     * Parameter id dan name adalah objek yang merujuk ke attribut tabel Regions.
     * @param id
     * @param name
     * @return String
     */
    public String insert(String id, String name);
     /**
     * Method yang digunakan untuk mengganti nilai data di dalam tabel regions
     * sesuai id. Parameter id dan name adalah objek yang merujuk ke attribut tabel Regions.
     * @param id
     * @param name
     * @return String
     */
    public String update(String id, String name);
    /**
     * Method yang digunakan untuk menghapus satu baris data sesuai id masukan.
     * @param id
     * @return String 
     */
    public String delete(String id);
    
}

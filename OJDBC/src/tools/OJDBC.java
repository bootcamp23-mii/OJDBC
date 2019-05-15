package tools;

import controllers.RegionController;
import daos.RegionDAO;
import icontrollers.IRegionController;
import idaos.IRegionDAO;
import models.Region;

public class OJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Region region = new Region();
        region.setId(0);
        region.setName("region");
        System.out.println(region.getId() + " " + region.getName());

        Region r = new Region(1, "Region New");
        System.out.println(r.getId() + " " + r.getName());

//        
//        
//        
//        
//        
//        DBConnection connection = new DBConnection();
//        System.out.println(connection);
//
//        IRegionDAO irdao = new RegionDAO(connection.getConnection());
//        Region region = new Region(31, "My Region");
//        System.out.println(irdao.insert(region));
//        System.out.println(region.getId());
//        
//        System.out.println(region.getName());
//            DBConnection connection = new DBConnection();
//        System.out.println(connection);
//        IRegionController irc = new RegionController(connection.getConnection());
//        
//        IRegionDAO irdao = new RegionDAO(connection.getConnection());
//        
//        System.out.println(irdao.delete(33));
//        for (Region region : irdao.search("er")) {
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
//        System.out.println(irc.delete("19"));
//        for (Region region : irc.search("mer")) {
//            System.out.println("ID : "+region.getId());
//            System.out.println("Name : "+region.getName());
//        }
    }

}

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;

/**
 * Created by Nagender B on 24/01/17.
 */

public class GreenDAODataPaginationService {

    AbstractDao yourDAOObject=null;
    private int items_per_page;
    private int total_pages;
    long total_items;
    Class yourDAOClass;
    public GreenDAODataPaginationService(AbstractDao yourDAOObject,int items_per_page,Class yourDAOClass)
    {
        try {
            this.yourDAOClass = yourDAOClass;
            this.yourDAOObject = yourDAOObject;
            this.items_per_page = items_per_page;
            total_items = (long)yourDAOClass.getMethod("count").invoke(yourDAOClass.cast(yourDAOObject),null);
            total_pages = ((int) (total_items / items_per_page));
        }catch (Exception nsm){
            nsm.printStackTrace();
        }

    }

    /** One Based index
     *
     * @param pageNumber
     * @return The Items for specified pageNumber with respecting the items_per_page set.
     */
    public ArrayList<Object> getRecordsForPage(int pageNumber)throws Exception {
        if(pageNumber != 0 && pageNumber >0) {
            return new ArrayList<Object>(((QueryBuilder<Object>) yourDAOClass.getMethod("queryBuilder").invoke(yourDAOClass.cast(yourDAOObject), null)).offset(items_per_page * (pageNumber - 1)).limit(items_per_page).list());
        }
        else {
            throw new Exception("PageNumber should be positive and index from 1");
        }
    }
    
    public int getTotal_pages() {
        return total_pages;
    }
    
}

import com.sky.Interface.IShipmentManagement;
import com.sky.entity.ShipmentManagementResult;
import com.sky.service.ShipmentManagementImpl;
import org.junit.Test;

/**
 * Description: Split And Merge
 *
 * @author sky
 * @create 2020/7/2823:01
 */
public class ShipmentManagementTest {

    @Test
    public void test1(){
        IShipmentManagement shipmentManagement = new ShipmentManagementImpl();
        ShipmentManagementResult result = shipmentManagement.doAction(3000);
        System.out.println("SplitOneNum:"+result.getSplitOneNum());
        System.out.println("SplitTwoNum:"+result.getSplitTwoNum());
        System.out.println("SplitThreeNum:"+result.getSplitThreeNum());
        System.out.println("MergeNum:"+result.getMergeNum());
    }
}

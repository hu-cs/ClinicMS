package models;

import java.util.List;
import java.util.Map;

import models.*;
import org.junit.*;

import com.avaje.ebean.Ebean;

import static org.junit.Assert.*;
import play.libs.Yaml;
import play.test.WithApplication;
import static play.test.Helpers.*;

public class ModelsTest extends WithApplication {

	@Before
	public void setUp() {
		start(fakeApplication(inMemoryDatabase()));
        if(Ebean.find(User.class).findRowCount() == 0) {

		Map<String, List<Object>> all = (Map<String, List<Object>>) Yaml.load("unit-test.yml");

		// Insert users first
		Ebean.save(all.get("users"));

		// Insert ambulanceInfos
		Ebean.save(all.get("ambulanceInfo"));


		// Insert bedReservations
		Ebean.save(all.get("bedReservation"));
		
		// Insert listSellDrugs
		Ebean.save(all.get("listSellDrug"));
		
		// Insert operations
		Ebean.save(all.get("operation"));
		
//		// Insert parturitions
//		Ebean.save(all.get("parturition"));
//		
//		// Insert patients
//		Ebean.save(all.get("patient"));
//		
//		// Insert registerDrugs
//		Ebean.save(all.get("registerDrug"));
//		
//		// Insert sellDrugs
//		Ebean.save(all.get("sellDrug"));
        }
	}
	
    @Test
    public void createAndRetrieveUser() {
        User user = User.find.where().eq("firstName", "mohsen").findUnique();
        User secondUser = user;
        assertNotNull(user);
        assertEquals("mohsen", user.firstName);
        assertEquals("users records count is not 6", 6, User.find.findRowCount());
        User.find.ref((long) 6).delete();
        assertEquals("users records count is not 5", 5, User.find.findRowCount());
        assertSame("this users are really one object", user, secondUser);
        assertTrue("Usre 1 should have access to lab Access", user.labAccess == true);
    }
    

    @Test
    public void createAndRetrieveAmbulanceInfo() {
    	AmbulanceInfo ambulance = AmbulanceInfo.find.byId(2);
    	AmbulanceInfo secondAmbulance = ambulance;
        assertNotNull(ambulance);
        assertEquals("ahmad", ambulance.firstName);
        assertEquals("ambulance records count is not 6", 6, User.find.findRowCount());
        User.find.ref((long) 6).delete();
        assertEquals("users records count is not 5", 5, User.find.findRowCount());
        assertSame("this ambulance records are not really one object",
        		ambulance, secondAmbulance);
        assertTrue("searched Ambulance list must be 3", AmbulanceInfo.find.
        		where().like("firstName", "ahmad").findList().size() == 3); 
    }
    
    @Test
    public void createAndRetrieveBedReservation() {
    	BedReservation bed = BedReservation.find.byId(2);
    	BedReservation secondBed = bed;
        assertNotNull(bed);
        assertEquals("reza", bed.name);
        assertEquals("bed records count is not 7", 7, BedReservation.find.findRowCount());
        BedReservation.find.ref(7).delete();
        assertEquals("reserved bed records count is not 6", 6, BedReservation.find.findRowCount());
        assertSame("this bed records are not really one object",
        		bed, secondBed);
        assertTrue("searched bed list must be 3", BedReservation.find.
        		where().like("bedDepartment", "operation").findList().size() == 3); 
    }
    
    @Test
    public void createAndRetrieveListSellDrug() {
    	ListSellDrug sell = ListSellDrug.find.byId(2);
    	ListSellDrug secondBed = sell;
        assertNotNull(sell);
        assertEquals("sell drug records count is not 5", 5, ListSellDrug.find.findRowCount());
        ListSellDrug.find.ref(5).delete();
        assertEquals("sell drugs records count is not 4", 4, ListSellDrug.find.findRowCount());
        assertSame("this sells are not really one object",
        		sell, secondBed);
        assertTrue("searched list must be equal 4 ", ListSellDrug.find.
        		where().ilike("sellDate", "%"+"2001"+ "%").
        		findList().size() == 4); 
    } 
    
    @Test
    public void createAndRetrieveOperations() {
    	Operation operation = Operation.find.byId((long) 2);
    	Operation secondOps = operation;
        assertNotNull(operation);
        assertEquals("Operation records count is not 8", 8, Operation.find.findRowCount());
        Operation.find.ref((long) 5).delete();
        assertEquals("operation records count is not 7", 7, Operation.find.findRowCount());
        assertSame("this sells are not really one object",
        		operation, secondOps);
        assertTrue("searched list must be equal 0 ", Operation.find.
        		where().ilike("doctor", "reza").
        		findList().size() == 0); 
        assertFalse("Charge must be greater than discount", 
        		operation.discount == operation.charge);
    } 
    
    
}
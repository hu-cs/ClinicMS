package controllers;

import models.User;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import play.mvc.*;
import play.libs.*;
import play.test.*;
import static play.test.Helpers.*;
import com.avaje.ebean.Ebean;
import com.google.common.collect.ImmutableMap;

public class LoginControllerTest extends WithApplication {
    @Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase(), fakeGlobal()));
        if(Ebean.find(User.class).findRowCount() == 0) {

    		Map<String, List<Object>> all = (Map<String, List<Object>>) Yaml.load("unit-test.yml");

    		// Insert users first
    		Ebean.save(all.get("users"));


            }
        }
    @Test
    public void loginSucceed() {
        Result result = callAction(
            controllers.routes.ref.Application.authenticate(),
            fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
                "firstName", "mohsen",
                "password", "123456"))
        );
        assertEquals(303, status(result));
        assertEquals("mohsen", session(result).get("firstName"));
    }
    
    @Test
    public void loginFailed() {
        Result result = callAction(
            controllers.routes.ref.Application.authenticate(),
            fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
                "firstName", "ali",
                "password", "12345"))
        );
        assertEquals(400, status(result));
        assertNull(session(result).get("firstName"));
    }
    
    @Test
    public void authenticated() {
        Result result = callAction(
            controllers.routes.ref.Application.users(),
            fakeRequest().withSession("firstName", "mohsen")
        );
        assertEquals(200, status(result));
    }
    
}
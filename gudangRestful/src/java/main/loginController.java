/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package main;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author krisn
 */
@Path("loginController")
public class loginController {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of loginController
     */
    public loginController() {
    }

    /**
     * Retrieves representation of an instance of login.loginController
     * @return an instance of java.lang.String
     */
    
    
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";
 
    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(String userJson) {
        Gson gson = new Gson();
        User user = gson.fromJson(userJson, User.class);
 
        if (user.getUsername().equals(USERNAME) && user.getPassword().equals(PASSWORD)) {
            return Response.status(200).entity("{\"message\":\"Login successful\"}").build();
        } else {
            return Response.status(401).entity("{\"message\":\"Invalid username or password\"}").build();
        }
    }
    
    
//    @POST
//    @Path("/Login")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String Login(User usr){
//        if(usr.getUsername().equals("admin") && usr.getPassword().equals("admin")){
//            return "Sukses Login";
//        }else{
//            return "Gagal Login";
//        }
//    }
    
    
    @GET
    @Path("/getdata")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<loginModel>getData()throws ClassNotFoundException{
        ArrayList<loginModel> tmn = new ArrayList<>();
        int[] id = {1,2};
        String[] nama = {"Sastro", "Sumbronowati"};
        
        for(int i = 0; i < nama.length;i++){
            loginModel tm = new loginModel();
            tm.setId(id[i]);
            tm.setNama(nama[i]);
            tmn.add(tm);
        }
        return tmn;
    }

    /**
     * PUT method for updating or creating an instance of loginController
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

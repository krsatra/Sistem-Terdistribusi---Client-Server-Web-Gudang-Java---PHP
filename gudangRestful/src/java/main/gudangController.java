///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
// */
//package main;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.UriInfo;
//import javax.ws.rs.Produces;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PUT;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
///**
// * REST Web Service
// *
// * @author krisn
// */
//@Path("gudangController")
//public class gudangController {
//
//    koneksi cekkoneksi = new koneksi();
//    
//
//    public gudangController() {
//    }
//
//    /**
//     * Retrieves representation of an instance of main.gudangController
//     * @return an instance of java.lang.String
//     */
//    
//    @Path("/tambahData")
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
////    public gudangModel addUser(gudangModel model){
////        return cekkoneksi.insertUser(model);
////    }
//    public Response createProductInJSON(gudangModel Model){       
//        cekkoneksi.insertUser(Model);
//        return Response.status(201).entity(1).build();
//        
//    }
//    
//    @Path("/tampilData")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public ArrayList<gudangModel> getUser() throws SQLException{
//        return cekkoneksi.getUser();
//    }
//    
//    @Path("/tampilDataID/{id}")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public ArrayList<gudangModel> getUser(@PathParam("id") int id) throws SQLException{
//        return cekkoneksi.getUserID(id);
//    }
//    
//    @Path("/updateData")
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
////    public gudangModel updateUser(gudangModel model){
////        return cekkoneksi.updatetUser(model);
////    }
//    public Response updateProductInJSON(gudangModel Model){   
//        cekkoneksi.updatetUser(Model);
//        return Response.status(201).entity(1).build();
//        //return cekkoneksi.updatetUser(model);
//    }
//    
//    @Path("/deleteDataID/{id}")
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
////    public int deleteUser(@PathParam("id") int id){
////        return cekkoneksi.deletetUser(id);
////    }
//    public Response deleteProductInJSON(gudangModel Model){
//        System.out.println(Model.getId());
//        cekkoneksi.deletetUser(Model);
//        return Response.status(201).entity(1).build();
//    }
//}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package main;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Faiq
 */
@Path("gudangController")

public class gudangController {
    koneksi cekkoneksi = new koneksi();
    

    public gudangController() {
    }

    /**
     * Retrieves representation of an instance of main.gudangController
     * @return an instance of java.lang.String
     */
    
    @Path("/tambahData")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
//    public GudangModel addUser(GudangModel model){
//        return cekkoneksi.insertUser(model);
//    }
    public Response createProductInJSON(gudangModel Model){       
        cekkoneksi.insertUser(Model);
        return Response.status(201).entity(1).build();
        
    }
    @Path("/tampilData")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<gudangModel> getUser() throws SQLException{
        return cekkoneksi.getUser();
    }
    
    @Path("/tampilDataID/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<gudangModel> getUser(@PathParam("id") int id) throws SQLException{
        return cekkoneksi.getUserID(id);
    }
    
    @Path("/updateData")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateProductInJSON(gudangModel Model){   
        cekkoneksi.updatetUser(Model);
        return Response.status(201).entity(1).build();
        //return cekkoneksi.updatetUser(model);
    }
    
    @Path("/deleteDataID")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteProductInJSON(gudangModel Model){
        System.out.println(Model.getId());
        cekkoneksi.deletetUser(Model);
        return Response.status(201).entity(1).build();
    }

}

package com.dubbox.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by Mr.PanYang on 2018/8/21.
 */
@Path("user")
public interface UserService {

    /**
     * @Author: My.PanYang
     * @Description: rest 风格请求  http://localhost:8081/getUser/2
     * @Date: 14:03 2018/8/21
     */
    @GET
    @Path("getUser/{id : \\d+}")
    @Consumes({MediaType.APPLICATION_JSON})
    String getUserById(@PathParam("id") int id);

}

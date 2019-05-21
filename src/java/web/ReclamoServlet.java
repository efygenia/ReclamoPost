package web;

import entidades.Reclamos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Reclamo", urlPatterns = {"/Reclamo"})
public class ReclamoServlet extends HttpServlet {
    
  
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Estamos en el metodo POST");
        
        Reclamos miReclamo = new Reclamos();
        miReclamo.nombre = "pepe";
        miReclamo.email = "pepe@gmail.com";      
        miReclamo.texto = "Los auriculares no funcionan";     
        
        System.out.println("miReclamo");
        
        
        
        System.out.println(req.getReader().readLine());
        resp.getWriter().print("Recibimos su pedido, aguarde sentado.");
        
    }
    
}

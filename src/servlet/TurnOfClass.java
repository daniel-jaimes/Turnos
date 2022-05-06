package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "turnofclass", urlPatterns = {"/turnofclass.do"})
public class TurnOfClass extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TurnOfClass() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setAttribute("productos", ProductosService.getInstance().getProductos());
        getServletContext().getRequestDispatcher("/index.html").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ArrayList<Producto> productos = ProductosService.getInstance().getProductosFiltered(filtro);
        //request.setAttribute("productos", productos);
        getServletContext().getRequestDispatcher("/index.html").forward(request, response);
    }
}

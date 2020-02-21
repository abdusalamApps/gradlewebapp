import models.AllInfoRow;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class DisplayAll
 */
@WebServlet(name = "AllContentServlet", urlPatterns = "all-content")
public class AllContentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    static private Database db = new Database();

    /**
     * Default constructor.
     */
    public AllContentServlet() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<AllInfoRow> rows = new ArrayList<>();

        if (db.getAllData() == null) {
            rows.add(new AllInfoRow("", 0, 0, 0, 0, 0, 0));
        } else {
        	rows = db.getAllData();
		}

        String[] heads = {"Respondent",
                "Project Character Answer 1", "Project Character Answer 2",
                "Data Answer 1", "Data Answer 2", "Data Answer 3", "Data Answer 4"
        };


//		FormGenerator generator = new FormGenerator();
//		out.println(generator.generateTable(heads, allInfo, cssTag));

        request.setAttribute("heads", heads);
        request.setAttribute("rows", rows);
        request.getRequestDispatcher("displayall.jsp").forward(request, response);

        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

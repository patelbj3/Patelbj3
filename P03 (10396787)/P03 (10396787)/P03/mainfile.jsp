<%@ page import="java.sql.*" %>
<%@ page import="java.lang.*" %>

<%
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gedcom","root","");
		Statement st = con.createStatement();
		
		String Fn,Ln,Sex,Fan,Mon,Sp,ComFa,ComMo;
		int FamName=1;
		Fn=request.getParameter("fname");
		Ln=request.getParameter("lname");
		Sex=request.getParameter("sex");
		Fan=request.getParameter("fathername");
		Mon=request.getParameter("mothername");
		Sp=request.getParameter("sp");
	
		String sql = "select * from gedcom;";
	  	ResultSet rs = st.executeQuery(sql);
		int count=0;
    	while(rs.next())
		{
			if(Fan.equals(rs.getString("FatherName")) && Mon.equals(rs.getString("MotherName")))
			{
				if(!(Fn.equals(rs.getString("FirstName"))))
				{
					String random=rs.getString("FamilyName");
					FamName=Integer.parseInt(random);
					break;
				}
				else
				{
					count++;
				}
				
			}
			else
			{
				FamName++;
			}
				
		
		}	
			
		Integer count1=new Integer(count);
		if(count1.equals(0))
		{		
	
				String sql2= "insert into gedcom values(null,'"+request.getParameter("fname")+"','"+request.getParameter("lname")+"','"+request.getParameter("sex")+"','"+request.getParameter("fathername")+"','"+request.getParameter("mothername")+"',"+FamName+");";
				st.executeUpdate(sql2);
				
				response.sendRedirect("index.jsp");
				
		}

				
		else
		{
			response.sendRedirect("existnames.jsp");
			
			
		}
		
		
		
		
		
		
		
	
	
%>

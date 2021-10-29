package com.repository;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.Status;

public class StatusReportRepository extends AbstractRepository{

	public StatusReportRepository() throws IOException {
		super();
	}

	//Create StatusReport
	public void createStatus(Status stsrpt) throws SQLException{
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO status_report(comp_id,emp_id,dept_id,comments,create_date) VALUES (?,?,?,?,?)");
		pstmt.setInt(1,stsrpt.getCompId());
		pstmt.setInt(2,stsrpt.getEmpId());
		pstmt.setInt(3,stsrpt.getDeptId());
		pstmt.setString(4,stsrpt.getComments());
		pstmt.setDate(5,new java.sql.Date(stsrpt.getCreateDate().getTime()));
		pstmt.executeUpdate();
	}

	//Get StatusReport
	public Status getStatusReportById(Integer id) throws SQLException{
		Status stsrpt = new Status();
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM status_report where id=?");
		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();
		
		if(rs.next()){
			stsrpt.setId(rs.getInt("id"));
			stsrpt.setCompId(rs.getInt("comp_id"));
			stsrpt.setEmpId(rs.getInt("emp_id"));
			stsrpt.setDeptId(rs.getInt("dept_id"));
			stsrpt.setComments(rs.getString("comments"));			
			stsrpt.setCreateDate(rs.getDate("create_date"));
		}
		return stsrpt;
	}
	
	//Update StatusReport
	public void updateStatus(Status stsrpt) throws SQLException{
		PreparedStatement upstmt = con.prepareStatement("UPDATE status_report SET comp_id = ?, comments = ?, create_date = ? WHERE id = ?");
		upstmt.setInt(1, stsrpt.getCompId());
		upstmt.setString(2, stsrpt.getComments());
		upstmt.setDate(3, new java.sql.Date(stsrpt.getCreateDate().getTime()));
		upstmt.setInt(4, stsrpt.getId());
		upstmt.executeUpdate();
	}
	
	//delete StatusReport
	public void deleteStatus(Integer srId) throws SQLException{
		PreparedStatement dpstmt = con.prepareStatement("DELETE FROM status_report WHERE id = ?");
		dpstmt.setInt(1, srId);
		dpstmt.executeUpdate();
	}
	
	//get List of all StatusReport
	public List<Status> getAllStatusReport() throws SQLException{
		Statement stm = con.createStatement();
		List<Status> stsrptList = new ArrayList<Status>();
		String sql = "Select * from status_report;";
		ResultSet rs= stm.executeQuery(sql);
		while(rs.next()){
			Status stsrpt = new Status();
			stsrpt.setId(rs.getInt("id"));
			stsrpt.setCompId(rs.getInt("comp_id"));
			stsrpt.setEmpId(rs.getInt("emp_id"));
			stsrpt.setDeptId(rs.getInt("dept_id"));			
			stsrpt.setCreateDate(new Date(rs.getDate("create_date").getTime()));
			stsrpt.setComments(rs.getString("comments"));
			stsrptList.add(stsrpt);
		}
		return stsrptList;
	}
}
/**
 * 
 */
package com.amsidh.mvc.dtos;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/**
 * @author amsidhlokhande
 *
 */
@Component
public class VechileDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Vechile getVechileByVechileId(Integer vechileId)
	{
		
		Vechile vechile=null;
		String query="SELECT * FROM VECHILE WHERE VECHILEID = ?"; 
        vechile=jdbcTemplate.queryForObject(query,new Object[]{vechileId},new VechileRowMapper());
		return vechile;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public void saveTenVechile()
	{
		for(int i=0;i<10;i++)
		{
			jdbcTemplate.execute("INSERT INTO VECHILE(VECHILEID,VECHILETYPE) VALUES("+i+",'" + "VECHILETYPE"+ i + "')");
			
		}
	}

	public List<Vechile> getAllVechile()
	{
		return (List<Vechile>)jdbcTemplate.query("SELECT * FROM VECHILE", new VechileRowMapper());
	}
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	private static final class VechileRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rst, int rowNumber) throws SQLException {
			return new Vechile(rst.getInt("VECHILEID"),rst.getString("VECHILETYPE"));
		}
		
	}
	
}

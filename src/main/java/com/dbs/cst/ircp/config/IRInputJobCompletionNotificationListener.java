package com.dbs.cst.ircp.config;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.dbs.cst.ircp.model.IRInput;

@Component
public class IRInputJobCompletionNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(IRInputJobCompletionNotificationListener.class);

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public IRInputJobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("!!! JOB FINISHED! Time to verify the results");

			List<IRInput> results = jdbcTemplate.query("SELECT nric,case_id,tax_type,name,amount_due,appointment_date,release_date,spaces FROM tbl_irinput", new RowMapper<IRInput>() {
				@Override
				public IRInput mapRow(ResultSet rs, int row) throws SQLException {
					return new IRInput(rs.getString(1), rs.getString(2), Integer.valueOf(rs.getInt(3)), rs.getString(4), BigDecimal.valueOf(rs.getDouble(5)), rs.getDate(6), rs.getDate(7), rs.getString(8));
				}
			});

			for (IRInput iRInput : results) {
				log.info("Found <" + iRInput + "> in the database.");
			}

		}
	}
}

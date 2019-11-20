package com.revature.dao;

import java.util.List;

import com.revature.model.Reimbursement;
import com.revature.model.ReimbursementStatus;

public interface ReimbursementDao {

	// Manager can see everything
	List<Reimbursement> findAll();
	
	// Employee can see own reimbursements
	List<Reimbursement> findAll(String username);
	
	List<Reimbursement> findAll(ReimbursementStatus status);
	
	Reimbursement findOne(int id);
	
	boolean create(Reimbursement reim);
	
	Reimbursement resolve(Reimbursement reim, ReimbursementStatus status);
	
}

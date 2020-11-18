package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Control;

@Repository
public interface ControlLoginRepository extends JpaRepository<Control, Integer> {
	/*
	 * name and passwordを取り出し
	 */
	
	@Query(value = "select c from Control c where c.controlName=?1 and c.passWord=?2")
	List<Control> findBycontrolNameAndpassWord(String controlName, String passWord);

	/*
	 * 管理者nameで職位を取り出す
	 */
	List<Control> findByControlName(String controlName);

	/*
	 * 管理者nameで取り出す
	 */
	@Query("select c from Control c where c.controlName=?1")
	Control findBycontrolName(String controlName);

	
}

package com.pluralsight.conferencedemo.controllers;

import java.util.List;

import com.pluralsight.conferencedemo.service.SessionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pluralsight.conferencedemo.models.Session;
import com.pluralsight.conferencedemo.repositories.SessionRepository;

@RestController
@RequestMapping("/api/v1")
public class SessionController {

	@Autowired(required = true)
	private SessionService sessionService;
	
	@GetMapping("/sessions")
	@ResponseBody
	public ResponseEntity<List<Session>> getAllSession() {
		return new ResponseEntity<List<Session>>(sessionService.getAll(), HttpStatus.OK);
	}

	/*
	@GetMapping
	@RequestMapping("{id}")
	public Session get(@PathVariable Long id) {
		return sessionRepository.getOne(id);
	}
	
	@PostMapping
	public Session create(@RequestBody final Session session) {
		return sessionRepository.saveAndFlush(session);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		sessionRepository.deleteById(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public Session update(@PathVariable Long id, @RequestBody Session session) {
		Session existingSession = sessionRepository.getOne(id);
		BeanUtils.copyProperties(session, existingSession, "session_id");
		return sessionRepository.saveAndFlush(existingSession);
	}
	 */
}

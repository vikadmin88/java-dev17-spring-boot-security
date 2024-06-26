package org.springtest.service.service;

import org.springtest.service.dto.NoteDto;
import org.springtest.service.exception.NoteNotFoundException;

import java.util.List;
import java.util.UUID;

public interface NoteService {
    List<NoteDto> listAll(String username);
    NoteDto add(NoteDto note, String username);
    void deleteById(UUID id) throws NoteNotFoundException;
    void update(NoteDto note) throws NoteNotFoundException;
    NoteDto getById(UUID id) throws NoteNotFoundException;
}

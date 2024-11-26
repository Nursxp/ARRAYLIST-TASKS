package service;

import models.Library;

import java.util.ArrayList;
import java.util.List;

public interface LibraryService {
    ArrayList<Library> saveLibrary(ArrayList<Library> libraries);

    List<Library> getAllLibraries();

    Library getLibraryById(Long id);

    Library updateLibrary(Long id, Library library);

    String deleteLibrary(Long id);

}

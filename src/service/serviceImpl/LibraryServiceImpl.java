package service.serviceImpl;

import models.Database;
import models.Library;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

import static models.Database.*;

public class LibraryServiceImpl implements LibraryService {

    @Override
    public ArrayList<Library> saveLibrary(ArrayList<Library> libraries) {
        Database.libraries.addAll(libraries);
        return libraries;
    }

    @Override
    public List<Library> getAllLibraries() {
        return Database.libraries;
    }

    @Override
    public Library getLibraryById(Long id) {
        for (Library library : libraries) {
            if (library.getId() == id) {
                return library;
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        library.setId(id);
        Database.libraries.add(library);
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (Library library : libraries) {
            if (library.getId() == id) {
                Database.libraries.remove(library);
            }
        }
        return "";
    }
}
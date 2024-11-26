package service.serviceImpl;

import models.Database;
import models.Reader;
import service.ReaderService;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    @Override
    public boolean saveReader(Reader reader) {
        Database.readers.add(reader);
        return reader != null;
    }

    @Override
    public List<Reader> getAllReaders() {
        return Database.readers;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (Reader reader : Database.readers) {
            if (reader.getId() == id) {
                return reader;
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        Database.readers.add(reader);
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
    }

    @Override
    public String toString() {
        return "ReaderServiceImpl{}";
    }
}

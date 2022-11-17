package erudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import erudio.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
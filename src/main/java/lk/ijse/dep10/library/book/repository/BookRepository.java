package lk.ijse.dep10.library.book.repository;

import lk.ijse.dep10.library.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {

}

package vrto

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface GroovyRepo extends JpaRepository<User, Long> {

    @Query('''
            SELECT u FROM User u
            WHERE u.id = :id
            AND u.name = :name
            AND u.surname = :surname
            AND u.age > 0
    ''')
    User findByParams(@Param("id") Long id, @Param("name") String name, @Param("surname") String surname);

}
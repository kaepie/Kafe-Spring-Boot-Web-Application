package ku.cs.kafe.repository;


import ku.cs.kafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
/**
 * @author 6510450291 Chutipong Triyasith
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    Member findByUsername(String username);
}

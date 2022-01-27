package pl.tomaszewski.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TableRepository extends JpaRepository<Table, Long> {

//    @Query("SELECT a FROM Table a WHERE a.kolumna1 IN (SELECT a.kolumna1 from a group by a.kolumna1 HAVING COUNT(a.kolumna1) =1 )")
//    List<Table>findTable();

    @Query("SELECT a FROM Table a WHERE a.kolumna1 IN (SELECT a.kolumna1 from a group by a.kolumna1 HAVING COUNT(a.kolumna1) =1 )")
    List<Table> findTable1Unique();

    @Query("SELECT a FROM Table a WHERE a.kolumna2 IN (SELECT a.kolumna2 from a group by a.kolumna2 HAVING COUNT(a.kolumna2) =1 )")
    List<Table> findTable2Unique();

    @Query("SELECT a FROM Table a WHERE a.kolumna3 IN (SELECT a.kolumna3 from a group by a.kolumna3 HAVING COUNT(a.kolumna3) =1 )")
    List<Table> findTable3Unique();

    @Query("SELECT a FROM Table a WHERE a.kolumna4 IN (SELECT a.kolumna4 from a group by a.kolumna4 HAVING COUNT(a.kolumna4) =1 )")
    List<Table> findTable4Unique();

    @Query("SELECT a FROM Table a WHERE a.kolumna1 IN (SELECT a.kolumna1 from a group by a.kolumna1 HAVING COUNT(a.kolumna1) >1 )")
    List<Table> findTable1Repeat();

    @Query("SELECT a FROM Table a WHERE a.kolumna2 IN (SELECT a.kolumna2 from a group by a.kolumna2 HAVING COUNT(a.kolumna2) >1 )")
    List<Table> findTable2Repeat();

    @Query("SELECT a FROM Table a WHERE a.kolumna3 IN (SELECT a.kolumna3 from a group by a.kolumna3 HAVING COUNT(a.kolumna3) >1 )")
    List<Table> findTable3Repeat();

    @Query("SELECT a FROM Table a WHERE a.kolumna4 IN (SELECT a.kolumna4 from a group by a.kolumna4 HAVING COUNT(a.kolumna4) >1 )")
    List<Table> findTable4Repeat();
}
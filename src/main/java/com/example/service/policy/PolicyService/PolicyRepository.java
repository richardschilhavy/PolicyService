package com.example.service.policy.PolicyService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface PolicyRepository extends CrudRepository<Policy, Long>
{

}
@Repository
class PolicyRepositoryImpl implements PolicyRepository {
    @Override
    public <S extends Policy> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Policy> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Policy> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Policy> findAll() {
        return null;
    }

    @Override
    public Iterable<Policy> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Policy entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Policy> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
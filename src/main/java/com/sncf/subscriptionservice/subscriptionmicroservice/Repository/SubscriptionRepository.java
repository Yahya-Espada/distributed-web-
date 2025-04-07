package com.sncf.subscriptionservice.subscriptionmicroservice.Repository;

import com.sncf.subscriptionservice.subscriptionmicroservice.Entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    List<Subscription> findByUserEmail(String email);
    List<Subscription> findByActiveTrue();
}

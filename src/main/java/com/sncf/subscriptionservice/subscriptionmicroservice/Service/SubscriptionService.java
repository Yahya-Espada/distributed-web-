package com.sncf.subscriptionservice.subscriptionmicroservice.Service;


import com.sncf.subscriptionservice.subscriptionmicroservice.Entity.Subscription;

import java.util.List;
import java.util.Optional;

public interface SubscriptionService {
    List<Subscription> getAllSubscriptions();
    Optional<Subscription> getSubscriptionById(Long id);
    List<Subscription> getSubscriptionsByUserEmail(String email);
    Subscription createSubscription(Subscription subscription);
    Subscription updateSubscription(Long id, Subscription subscription);
    void deleteSubscription(Long id);
}

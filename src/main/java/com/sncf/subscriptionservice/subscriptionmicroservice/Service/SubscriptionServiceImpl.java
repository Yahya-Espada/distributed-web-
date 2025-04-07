package com.sncf.subscriptionservice.subscriptionmicroservice.Service;

import com.sncf.subscriptionservice.subscriptionmicroservice.Entity.Subscription;
import com.sncf.subscriptionservice.subscriptionmicroservice.Repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

    private final SubscriptionRepository repository;

    @Override
    public List<Subscription> getAllSubscriptions() {
        return repository.findAll();
    }

    @Override
    public Optional<Subscription> getSubscriptionById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Subscription> getSubscriptionsByUserEmail(String email) {
        return repository.findByUserEmail(email);
    }

    @Override
    public Subscription createSubscription(Subscription subscription) {
        return repository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Long id, Subscription subscription) {
        return repository.findById(id).map(existing -> {
            existing.setUserEmail(subscription.getUserEmail());
            existing.setPlan(subscription.getPlan());
            existing.setStartDate(subscription.getStartDate());
            existing.setEndDate(subscription.getEndDate());
            existing.setActive(subscription.isActive());
            return repository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Subscription not found"));
    }

    @Override
    public void deleteSubscription(Long id) {
        repository.deleteById(id);
    }
}

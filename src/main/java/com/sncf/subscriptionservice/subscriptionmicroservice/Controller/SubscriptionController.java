package com.sncf.subscriptionservice.subscriptionmicroservice.Controller;

import com.sncf.subscriptionservice.subscriptionmicroservice.Entity.Subscription;
import com.sncf.subscriptionservice.subscriptionmicroservice.Service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscriptions")
@RequiredArgsConstructor
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @GetMapping
    public List<Subscription> getAll() {
        return subscriptionService.getAllSubscriptions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subscription> getById(@PathVariable Long id) {
        return subscriptionService.getSubscriptionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/user")
    public List<Subscription> getByUserEmail(@RequestParam String email) {
        return subscriptionService.getSubscriptionsByUserEmail(email);
    }

    @PostMapping
    public Subscription create(@RequestBody Subscription subscription) {
        return subscriptionService.createSubscription(subscription);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subscription> update(@PathVariable Long id, @RequestBody Subscription subscription) {
        try {
            return ResponseEntity.ok(subscriptionService.updateSubscription(id, subscription));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
        return ResponseEntity.noContent().build();
    }
}

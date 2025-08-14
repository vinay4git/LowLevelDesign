### DEPLOYMENT NOTIFICATION SYSTEM
You are working on a deployment notification service for keeping developers informed about when their changes have been deployed.

The service should provide two interfaces, one to receive an event and another to send out a batch of notifications for any received events.

An event contains a version number, a list of authors, and a status indicating if the deployment has started, completed, or failed.
Deployment notifications should include the author and the version in which their changes were deployed.
The goal is to notify code change authors on the first time their changes are deployed successfully


```text
func handleEvent(...)

func sendNotifications()
```

```
- Send notification only on first completion of deployment.
- Notification to all author who started it and who failed for previous versions.
```
Microsoft Graph SDK for Java supports Android starting with API 26. This would be fine if it were possible to just guard the functionality using it with the usual check for Build.VERSION.SDK_INT.
But AGP requires the minSDK of a module where invokeCustom is used to be set to 26: https://issuetracker.google.com/issues/174733673#comment14
Which would not be a problem if it were possible to use a dynamic feature module with minSdk 26 in a project with minSdk 21, but this unfortunately does not work either: https://issuetracker.google.com/issues/273978125

Hence the need for this fork, which removes the offending use of invokeCustom. It forks off from the following commit https://github.com/Azure/azure-sdk-for-java/commit/d97e3e8f463b9ea241657e5004df17e79bfec609
It can be used via Jitpack: https://jitpack.io/#mtotschnig/Azure-Core/

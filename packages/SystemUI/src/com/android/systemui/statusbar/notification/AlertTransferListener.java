/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.systemui.statusbar.notification;

/**
 * Listener interface for when NotificationEntryManager needs to tell
 * NotificationGroupAlertTransferHelper things. Will eventually grow to be a general-purpose
 * listening interface for the NotificationEntryManager.
 */
public interface AlertTransferListener {
    /**
     * Called when a new notification is posted. At this point, the notification is "pending": its
     * views haven't been inflated yet and most of the system pretends like it doesn't exist yet.
     */
    void onPendingEntryAdded(NotificationData.Entry entry);

    /**
     * Called when an existing notification's views are reinflated (usually due to an update being
     * posted to that notification).
     */
    void onEntryReinflated(NotificationData.Entry entry);

    /**
     * Called when a notification has been removed (either because the user swiped it away or
     * because the developer retracted it).
     */
    void onEntryRemoved(NotificationData.Entry entry);
}

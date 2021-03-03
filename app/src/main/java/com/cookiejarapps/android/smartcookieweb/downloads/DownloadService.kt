package com.cookiejarapps.android.smartcookieweb.downloads

import com.cookiejarapps.android.smartcookieweb.R
import mozilla.components.browser.state.store.BrowserStore
import mozilla.components.feature.downloads.AbstractFetchDownloadService
import com.cookiejarapps.android.smartcookieweb.ext.components

class DownloadService : AbstractFetchDownloadService() {
    override val httpClient by lazy { components.client }
    override val store: BrowserStore by lazy { components.store }
    override val style: Style by lazy { Style(R.color.photonBlue40) }
}

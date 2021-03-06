package com.netease.openfire.plugin;

import java.io.File;

import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

import com.netease.xmpp.master.client.SyncClient;

public class MasterClientPlugin implements Plugin {
    @Override
    public void destroyPlugin() {
        // Do nothing
    }

    @Override
    public void initializePlugin(PluginManager manager, File pluginDirectory) {
        ServerSyncClient client = new ServerSyncClient(SyncClient.CLIENT_TYPE_XMPP_SERVER);
        client.setConfigPath(pluginDirectory.getAbsolutePath() + File.separator + "classes");
        client.start();
    }
}

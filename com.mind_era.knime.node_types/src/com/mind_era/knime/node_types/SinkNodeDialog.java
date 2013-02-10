package com.mind_era.knime.node_types;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;

/**
 * <code>NodeDialog</code> for the "Sink" Node.
 * Sink
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Mind Eratosthenes Kft.
 */
public class SinkNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring the Sink node.
     */
    protected SinkNodeDialog() {

    }
}


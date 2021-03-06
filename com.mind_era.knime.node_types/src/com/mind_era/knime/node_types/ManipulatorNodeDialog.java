package com.mind_era.knime.node_types;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;

/**
 * <code>NodeDialog</code> for the "Manipulator" Node.
 * Manipulator
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Mind Eratosthenes Kft.
 */
public class ManipulatorNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring Manipulator node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected ManipulatorNodeDialog() {
        super();
        
        addDialogComponent(new DialogComponentNumber(
                new SettingsModelIntegerBounded(
                    ManipulatorNodeModel.CFGKEY_COUNT,
                    ManipulatorNodeModel.DEFAULT_COUNT,
                    Integer.MIN_VALUE, Integer.MAX_VALUE),
                    "Counter:", /*step*/ 1, /*componentwidth*/ 5));
                    
    }
}


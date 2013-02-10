package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Manipulator" Node.
 * Manipulator
 *
 * @author Mind Eratosthenes Kft.
 */
public class ManipulatorNodeFactory 
        extends NodeFactory<ManipulatorNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ManipulatorNodeModel createNodeModel() {
        return new ManipulatorNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<ManipulatorNodeModel> createNodeView(final int viewIndex,
            final ManipulatorNodeModel nodeModel) {
        return new ManipulatorNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new ManipulatorNodeDialog();
    }

}


package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Unknown" Node.
 * Unknown
 *
 * @author Mind Eratosthenes Kft.
 */
public class UnknownNodeFactory 
        extends NodeFactory<UnknownNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public UnknownNodeModel createNodeModel() {
        return new UnknownNodeModel();
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
    public NodeView<UnknownNodeModel> createNodeView(final int viewIndex,
            final UnknownNodeModel nodeModel) {
        return new UnknownNodeView(nodeModel);
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
        return new UnknownNodeDialog();
    }

}


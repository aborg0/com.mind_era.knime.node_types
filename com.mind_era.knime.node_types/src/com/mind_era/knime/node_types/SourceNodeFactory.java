package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Source" Node.
 * Source
 *
 * @author Mind Eratosthenes Kft.
 */
public class SourceNodeFactory 
        extends NodeFactory<SourceNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public SourceNodeModel createNodeModel() {
        return new SourceNodeModel();
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
    public NodeView<SourceNodeModel> createNodeView(final int viewIndex,
            final SourceNodeModel nodeModel) {
        return new SourceNodeView(nodeModel);
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
        return new SourceNodeDialog();
    }

}


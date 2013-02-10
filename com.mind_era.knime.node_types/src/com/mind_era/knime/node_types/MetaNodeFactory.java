package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Meta" Node.
 * Meta
 *
 * @author Mind Eratosthenes Kft.
 */
public class MetaNodeFactory 
        extends NodeFactory<MetaNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public MetaNodeModel createNodeModel() {
        return new MetaNodeModel();
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
    public NodeView<MetaNodeModel> createNodeView(final int viewIndex,
            final MetaNodeModel nodeModel) {
        return new MetaNodeView(nodeModel);
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
        return new MetaNodeDialog();
    }

}


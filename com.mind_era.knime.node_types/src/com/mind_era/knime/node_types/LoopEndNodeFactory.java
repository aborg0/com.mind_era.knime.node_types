package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "LoopEnd" Node.
 * Loop End
 *
 * @author Mind Eratosthenes Kft.
 */
public class LoopEndNodeFactory 
        extends NodeFactory<LoopEndNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public LoopEndNodeModel createNodeModel() {
        return new LoopEndNodeModel();
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
    public NodeView<LoopEndNodeModel> createNodeView(final int viewIndex,
            final LoopEndNodeModel nodeModel) {
        return new LoopEndNodeView(nodeModel);
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
        return new LoopEndNodeDialog();
    }

}


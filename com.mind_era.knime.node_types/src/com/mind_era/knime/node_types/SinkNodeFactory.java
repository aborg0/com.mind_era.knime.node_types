package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Sink" Node.
 * Sink
 *
 * @author Mind Eratosthenes Kft.
 */
public class SinkNodeFactory 
        extends NodeFactory<SinkNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public SinkNodeModel createNodeModel() {
        return new SinkNodeModel();
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
    public NodeView<SinkNodeModel> createNodeView(final int viewIndex,
            final SinkNodeModel nodeModel) {
        return new SinkNodeView(nodeModel);
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
        return new SinkNodeDialog();
    }

}


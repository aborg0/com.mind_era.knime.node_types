package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "LoopStart" Node.
 * Loop Start
 *
 * @author Mind Eratosthenes Kft.
 */
public class LoopStartNodeFactory 
        extends NodeFactory<LoopStartNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public LoopStartNodeModel createNodeModel() {
        return new LoopStartNodeModel();
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
    public NodeView<LoopStartNodeModel> createNodeView(final int viewIndex,
            final LoopStartNodeModel nodeModel) {
        return new LoopStartNodeView(nodeModel);
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
        return new LoopStartNodeDialog();
    }

}


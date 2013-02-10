package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "QuickForm" Node.
 * QuickForm
 *
 * @author Mind Eratosthenes Kft.
 */
public class QuickFormNodeFactory 
        extends NodeFactory<QuickFormNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public QuickFormNodeModel createNodeModel() {
        return new QuickFormNodeModel();
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
    public NodeView<QuickFormNodeModel> createNodeView(final int viewIndex,
            final QuickFormNodeModel nodeModel) {
        return new QuickFormNodeView(nodeModel);
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
        return new QuickFormNodeDialog();
    }

}


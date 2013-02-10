package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Other" Node.
 * Other
 *
 * @author Mind Eratosthenes Kft.
 */
public class OtherNodeFactory 
        extends NodeFactory<OtherNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public OtherNodeModel createNodeModel() {
        return new OtherNodeModel();
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
    public NodeView<OtherNodeModel> createNodeView(final int viewIndex,
            final OtherNodeModel nodeModel) {
        return new OtherNodeView(nodeModel);
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
        return new OtherNodeDialog();
    }

}


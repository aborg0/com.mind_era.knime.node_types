package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Learner" Node.
 * Learner
 *
 * @author Mind Eratosthenes Kft.
 */
public class LearnerNodeFactory 
        extends NodeFactory<LearnerNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public LearnerNodeModel createNodeModel() {
        return new LearnerNodeModel();
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
    public NodeView<LearnerNodeModel> createNodeView(final int viewIndex,
            final LearnerNodeModel nodeModel) {
        return new LearnerNodeView(nodeModel);
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
        return new LearnerNodeDialog();
    }

}


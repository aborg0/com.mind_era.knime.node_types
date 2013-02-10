package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Predictor" Node.
 * Predictor
 *
 * @author Mind Eratosthenes Kft.
 */
public class PredictorNodeFactory 
        extends NodeFactory<PredictorNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public PredictorNodeModel createNodeModel() {
        return new PredictorNodeModel();
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
    public NodeView<PredictorNodeModel> createNodeView(final int viewIndex,
            final PredictorNodeModel nodeModel) {
        return new PredictorNodeView(nodeModel);
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
        return new PredictorNodeDialog();
    }

}


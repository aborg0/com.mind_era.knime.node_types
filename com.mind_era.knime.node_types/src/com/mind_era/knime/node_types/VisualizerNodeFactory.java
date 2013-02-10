package com.mind_era.knime.node_types;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Visualizer" Node.
 * Visualizer
 *
 * @author Mind Eratosthenes Kft.
 */
public class VisualizerNodeFactory 
        extends NodeFactory<VisualizerNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public VisualizerNodeModel createNodeModel() {
        return new VisualizerNodeModel();
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
    public NodeView<VisualizerNodeModel> createNodeView(final int viewIndex,
            final VisualizerNodeModel nodeModel) {
        return new VisualizerNodeView(nodeModel);
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
        return new VisualizerNodeDialog();
    }

}


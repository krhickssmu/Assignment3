public class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        AmazonItem product;
        Node left, right;
        boolean color;

        Node(AmazonItem product, boolean color) {
            this.product = product;
            this.color = color;
        }
    }

    private Node root;

    //insertion into tree
    public void insert(AmazonItem product) {
        root = insert(root, product);
        root.color = BLACK;
    }

    private Node insert(Node h, AmazonItem product) {
        if (h == null) return new Node(product, RED);

        int cmp = product.getProductID().compareTo(h.product.getProductID());
        if (cmp < 0) h.left = insert(h.left, product);
        else if (cmp > 0) h.right = insert(h.right, product);
        else {
            System.out.println("Error: Product with ID " + product.getProductID() + " already exists.");
            return h;
        }

        if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right)) flipColors(h);

        return h;
    }

    //search item in tree
    public AmazonItem search(String productID) {
        Node node = search(root, productID);
        if (node != null) return node.product;
        else {
            System.out.println("Product with ID " + productID + " not found.");
            return null;
        }
    }

    private Node search(Node node, String productID) {
        while (node != null) {
            int cmp = productID.compareTo(node.product.getProductID());
            if (cmp < 0) node = node.left;
            else if (cmp > 0) node = node.right;
            else return node;
        }
        return null;
    }

    private boolean isRed(Node node) {
        return node != null && node.color == RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }
}


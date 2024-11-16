public class Main {
        private RedBlackTree productTree = new RedBlackTree();

        //reading products from csv file and separting into categories
        public void loadProducts(String filename) {
            In in = new In(filename);
            while (!in.isEmpty()) {
                String line = in.readLine();

                String[] details = line.split(",");
                if (details.length >= 4 ) {
                    String productID = details[0];
                    String name = details[1];
                    String category = details[2];
                    String price=details[3];
                    AmazonItem product = new AmazonItem(productID, name, category, price);
                    productTree.insert(product);
                }
                else{

                }
            }

        }

        //search function to find products in productTree
        public void searchProduct(String productID) {
            AmazonItem product = productTree.search(productID);
            if (product != null) {
                System.out.println(product);        //outputs product
            }
        }

        public static void main(String[] args) {
            Main manager = new Main();
            manager.loadProducts("amazon-product-data.csv");

            StdOut.println("Enter product IDs to search for, or type 'exit' to quit.");

            while (true) {
                StdOut.print("Enter product ID: ");
                String userInput = StdIn.readLine().trim();        //reads user input which is a product ID

                if ("exit".equalsIgnoreCase(userInput)) {                //search exits if "exit" is typed
                    StdOut.println("Exiting the program.");
                    break;
                }
                manager.searchProduct(userInput);
            }
                //inserting new product (1st time new, 2nd time duplicate case)
            System.out.println("\nInserting new product:");
            AmazonItem newProduct = new AmazonItem("1111", "New Product", "Electronics", "$49.99");
            System.out.println(newProduct);
            manager.productTree.insert(newProduct);
            System.out.println("Inserted");
            System.out.println("\nInserting product:");
            System.out.println(newProduct);
            manager.productTree.insert(newProduct);
        }
    }



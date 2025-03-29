import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Node {
    public String name;
    public List<Node> children;

    public Node() {} // Default constructor for Jackson

    public Node(String name, Node... children) {
        this.name = name;
        this.children = Arrays.asList(children);
    }

    public void printTree(String prefix) {
        System.out.println(prefix + name);
        if (children != null) {
            for (Node child : children) {
                child.printTree(prefix + "  ");
            }
        }
    }

    public static Node loadTreeFromFile(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), Node.class);
    }

    public static void main(String[] args) {
        try {
            Node root = loadTreeFromFile("src/main/resources/tree.json");
            root.printTree("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
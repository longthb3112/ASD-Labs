package lab11.asd;

import java.util.List;
import java.util.stream.Collectors;

public class DisplayNodeVistor implements NodeVistor {
    @Override
    public void visit(Root root) {
        System.out.println("Print Root Node");
        System.out.println(root.getName());
        if(root.getChilds() != null){
            List<Composite> rightNodes = root.getChilds().stream().filter(x -> x.getSide() == SIDE.RIGHT).collect(Collectors.toList());
            List<Composite> leftNodes = root.getChilds().stream().filter(x -> x.getSide() == SIDE.LEFT).collect(Collectors.toList());
            System.out.println("RIGHT NODES:");
            for (Composite composite:rightNodes){
                System.out.println(countChild(1,composite) +" "+ composite.getName() );
            }
            System.out.println("LEFT NODES");
            for (Composite composite:leftNodes){
                System.out.println(countChild(1,composite) +" "+ composite.getName() );
            }
        }
    }

    @Override
    public void visit(Node node) {
        System.out.println("Print Node");
        System.out.println(node.getName());
        if(node.getChilds() != null){
            for (Composite composite:node.getChilds()){
                System.out.println(countChild(1,composite) +" "+ composite.getName() );
            }
        }

    }
    private int countChild(int count,Composite composite){
        if(composite.getChilds() == null || composite.getChilds().size() == 0) return count;

        if(composite.getChilds() != null && composite.getChilds().size() > 0){
            count += composite.getChilds().size();
            for(Composite composite1: composite.getChilds()){
              return countChild(count,composite1);
            }
        }
        return count;
    }
}

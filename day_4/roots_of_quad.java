import java.util.ArrayList;
class roots_of_quad {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        int root1, root2;
        ArrayList<Integer> roots = new ArrayList<>();
        double img, dis = ((b*b)-(4*a*c));
        if(dis<0) {
            roots.add(-1);
            return roots;
        }
        if(dis==0){
            img=Math.sqrt(dis);
            root1= (int)Math.ceil(((-b+img)/(2*a)));
            roots.add(root1);
            roots.add(root1);
            return roots;
            
        }
        if (dis>0){
            
        img=Math.sqrt(dis);
        root1= (int)Math.floor(((-b+img)/(2*a)));
        root2= (int)Math.floor(((-b-img)/(2*a)));
        roots.add(root1);
        roots.add(root2);
        return roots;
            
        }
        return roots;
        
    }
}

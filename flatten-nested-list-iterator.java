public class NestedIterator implements Iterator<Integer> {
    Iterator<Integer> res;
    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> list = new ArrayList<>();
        
        for (NestedInteger cur : nestedList) {
            if (cur.isInteger()) list.add(cur.getInteger());
            else {
                NestedIterator itr = new NestedIterator(cur.getList());
                while (itr.hasNext()) {
                    list.add(itr.next());
                }
            }
        }
        res = list.iterator();
    }
    
    @Override
    public Integer next() {
        return res.next();
    }
    
    @Override
    public boolean hasNext() {
        return res.hasNext();
    }
}
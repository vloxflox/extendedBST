public class OperationDebug {
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);

		System.out.println( tree.enesimoElemento(5) );

		//tree.search(4);

		//tree.remove(4);

		//tree.search(4);

	}
}
package generic;

interface ArrayOperations<P extends Comparable<P>>{
	P findMin(P[] array);
	P findMax(P[] array);
}
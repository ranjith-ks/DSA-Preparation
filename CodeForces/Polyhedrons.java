/*
Anton's favourite geometric figures are regular polyhedrons. Note that there are five kinds of regular polyhedrons:
Tetrahedron. Tetrahedron has 4 triangular faces.
Cube. Cube has 6 square faces.
Octahedron. Octahedron has 8 triangular faces.
Dodecahedron. Dodecahedron has 12 pentagonal faces.
Icosahedron. Icosahedron has 20 triangular faces.
Anton has a collection of n polyhedrons. One day he decided to know, how many faces his polyhedrons have in total. Help Anton and find this number!
Input
The first line of the input contains a single integer n (1 ≤ n ≤ 200 000) — the number of polyhedrons in Anton's collection.
Each of the following n lines of the input contains a string si — the name of the i-th polyhedron in Anton's collection. The string can look like this:
"Tetrahedron" (without quotes), if the i-th polyhedron in Anton's collection is a tetrahedron.
"Cube" (without quotes), if the i-th polyhedron in Anton's collection is a cube.
"Octahedron" (without quotes), if the i-th polyhedron in Anton's collection is an octahedron.
"Dodecahedron" (without quotes), if the i-th polyhedron in Anton's collection is a dodecahedron.
"Icosahedron" (without quotes), if the i-th polyhedron in Anton's collection is an icosahedron.
Output
Output one number — the total number of faces in all the polyhedrons in Anton's collection.
*/

import java.util.*;

public class Polyhedrons
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,res=0;
        n = sc.nextInt();
        String collections;
        for(i=0;i<n;i++)
        {
            collections = sc.next();
            if(collections.equals("Tetrahedron"))
                res += 4;
            else if(collections.equals("Cube"))
                res += 6;
            else if(collections.equals("Octahedron"))
                res += 8;
            else if(collections.equals("Dodecahedron"))
                res += 12;
            else if(collections.equals("Icosahedron"))
                res += 20;
        }
        System.out.println(res);

        sc.close();
	}
}

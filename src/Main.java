void main() {

    Scanner input = new Scanner(System.in);

    //array de preguntes
    String [] preguntes = {
            "1. Indica cual de las siguientes opciones no es un tipo primitivo en Java:",
            "2. ¿Qué extensión tienen los archivos de código fuente Java?",
            "3. ¿Cuál es la declaración correcta del método main?",
            "4. ¿Qué instrucción permite mostrar texto por pantalla y cambiar de línea?",
            "5. ¿Qué símbolo se utiliza para escribir un comentario de una sola línea?",
            "6. ¿Qué tipo de dato se utiliza para almacenar números enteros?",
            "7. ¿Qué tipo de dato almacena valores verdadero o falso?",
            "8. ¿Cuál de estas afirmaciones sobre String es correcta?",
            "9. ¿Qué palabra clave se utiliza para crear un objeto?",
            "10. ¿Qué ocurre con el tamaño de un array después de crearlo?",
            "11. ¿Cuál es el índice del primer elemento de un array?",
            "12. ¿Cómo se obtiene la longitud de un array?",
            "13. ¿Qué método permite obtener la longitud de una cadena String?",
            "14. ¿Cómo se comparan dos cadenas String por su contenido?",
            "15. ¿Qué símbolo se utiliza para asignar un valor a una variable?",
            "16. ¿Qué operador compara dos valores primitivos para comprobar si son iguales?",
            "17. ¿Qué operador representa el AND lógico?",
            "18. ¿Qué operador representa el OR lógico?",
            "19. ¿Qué operador representa la negación lógica?",
            "20. ¿Qué bucle se ejecuta al menos una vez obligatoriamente?",
            "21. ¿Qué parte de un bucle for permite actualizar el contador?",
            "22. ¿Qué hace la instrucción break?",
            "23. ¿Qué hace la instrucción continue?",
            "24. ¿Qué palabra clave indica que un método no devuelve ningún valor?",
            "25. ¿Qué es un parámetro de un método?",
            "26. ¿Qué significa la sobrecarga de métodos?",
            "27. ¿Cómo debe llamarse un constructor?",
            "28. ¿Qué tipo de retorno tiene un constructor?",
            "29. ¿Cuál es el modificador de acceso más restrictivo?",
            "30. ¿Dónde se puede acceder a un miembro protected?",
            "31. ¿Qué significa la palabra clave static?",
            "32. ¿Qué impide la palabra clave final cuando se utiliza en una variable?",
            "33. ¿Qué palabra clave se utiliza para heredar de una clase?",
            "34. ¿Qué palabra clave se utiliza para implementar una interfaz?",
            "35. ¿Qué palabra clave se utiliza para declarar una interfaz?",
            "36. ¿Cuál es la superclase de todas las clases Java?",
            "37. ¿Qué palabras clave se utilizan habitualmente para gestionar excepciones?",
            "38. ¿Qué palabra clave permite lanzar explícitamente una excepción?",
            "39. ¿Qué palabra clave declara las excepciones que puede lanzar un método?",
            "40. ¿Qué clase es la superclase de las excepciones de ejecución (RuntimeException)?",
            "41. ¿Qué palabra clave permite declarar un paquete?",
            "42. ¿Qué palabra clave permite importar otra clase o paquete?",
            "43. ¿En qué paquete se encuentra ArrayList?",
            "44. ¿Qué almacena un HashMap?",
            "45. ¿Qué tipo de colección no permite elementos duplicados?",
            "46. ¿En qué se compila el código fuente de Java?",
            "47. ¿Qué componente ejecuta el bytecode de Java?",
            "48. ¿Qué herramienta se utiliza para compilar código fuente Java?",
            "49. ¿Cuál de los siguientes es un tipo de dato primitivo?",
            "50. ¿Qué compara el operador == cuando se utiliza con referencias a objetos?"
        };
    //array de respostes
   String [][] respostes = {
           {"Int", "Char", "Boolean", "String"},
           {".class", ".java", ".jar", ".js"},
           {"public void main(String[] args)", "static public int main(String args)", "public static void main(String[] args)", "private static void main(String[] args)"},
           {"System.print()", "System.out.println()", "Console.write()", "System.display()"},
           {"//", "**", "##", "/*"},
           {"String", "boolean", "int", "char"},
           {"int", "boolean", "double", "String"},
           {"Las cadenas siempre se pueden modificar", "String es un tipo primitivo", "Las cadenas no pueden contener espacios", "Las cadenas son inmutables"},
           {"create", "object", "new", "class"},
           {"No puede cambiar", "Se duplica automáticamente", "Se convierte en cero", "Disminuye automáticamente"},
           {"1", "0", "-1", "2"},
           {"array.length", "array.size()", "array.length()", "array.count()"},
           {"size()", "count()", "length()", "getLength()"},
           {"str1 == str2", "str1.equals(str2)", "str1.compare(str2)", "str1.same(str2)"},
           {"=", "==", "!=", ":="},
           {"=", "!=", "==", "&&"},
           {"||", "!", "&", "&&"},
           {"||", "&&", "!", "=="},
           {"&&", "!", "||", "=="},
           {"for", "while", "do-while", "if"},
           {"La inicialización", "La actualización", "La condición", "El cuerpo del bucle"},
           {"Sale del bucle o switch actual", "Reinicia el programa", "Salta una iteración", "Termina únicamente el método"},
           {"Termina todo el programa", "Repite la iteración actual", "Sale del método", "Salta el resto de la iteración actual"},
           {"return", "static", "void", "null"},
           {"Una variable declarada en un método que recibe un valor", "Un constructor de clase", "Una condición de un bucle", "Un tipo de excepción"},
           {"Crear varias clases", "Utilizar únicamente varios constructores", "Repetir un método en un bucle", "Utilizar el mismo nombre de método con diferentes listas de parámetros"},
           {"El paquete", "La clase", "El método", "El objeto"},
           {"void", "int", "No tiene tipo de retorno explícito", "String"},
           {"private", "public", "protected", "static"},
           {"Solo dentro del mismo método", "Solo dentro de la misma clase", "En cualquier lugar del programa", "En el mismo paquete y en las subclases, según las reglas de acceso"},
           {"El miembro pertenece a cada objeto", "El miembro pertenece a la clase y no a cada instancia", "La variable no puede cambiar", "El método solo se puede ejecutar una vez"},
           {"Leer una variable", "Mostrar una variable", "Volver a asignarle un valor después de su inicialización", "Comparar una variable"},
           {"extends", "inherits", "implements", "super"},
           {"extends", "inherits", "interface", "implements"},
           {"class", "implements", "interface", "extends"},
           {"String", "Object", "Main", "Class"},
           {"try y catch", "if y else", "for y while", "public y private"},
           {"throws", "throw", "try", "catch"},
           {"throw", "try", "throws", "catch"},
           {"IOException", "Error", "Throwable", "RuntimeException"},
           {"package", "import", "class", "public"},
           {"package", "import", "include", "using"},
           {"java.io", "java.lang", "java.net", "java.util"},
           {"Solo valores individuales", "Solo números", "Pares de clave y valor", "Solo cadenas de texto"},
           {"Set", "List", "ArrayList", "LinkedList"},
           {"Código máquina", "Bytecode", "HTML", "SQL"},
           {"JVM", "JDK", "Compilador", "IDE"},
           {"java", "jvm", "javadoc", "javac"},
           {"String", "ArrayList", "double", "Integer"},
           {"Si los objetos tienen el mismo contenido", "Si las referencias apuntan al mismo objeto", "Si los objetos tienen el mismo nombre de clase", "Si los objetos están vacíos"}
   };

    //array de respostes correctes
   int [] corrects =  {2, 2, 3, 2, 1, 3, 2, 4, 3, 1,
                       2, 1, 3, 2, 1, 3, 4, 1, 2, 3,
                       2, 1, 4, 3, 1, 4, 2, 3, 1, 4,
                       2, 3, 1, 4, 3, 2, 1, 2, 3, 4,
                       1, 4, 3, 2, 1, 2, 1, 4, 3, 2
    };


    //fi arrays


    //inici programa

    for (int i = 0; i < preguntes.length; i++) {
        System.out.println("\n" + preguntes[i]);
        for (int q = 0; q < 4; q++) {
            System.out.println((q + 1) + ". " + respostes[i][q]);
        }
        System.out.print("La teva Resposta es: ");
        int choice = input.nextInt() - 1;

        if (choice == corrects[i]) {
            System.out.println("Correcte!");
        } else {
            System.out.println("Incorrecte. La resposta era: " + respostes[i][corrects[i]]);
        }
    }
    //final programa




}

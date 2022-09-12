
package Chap06_BulkDataOperations;

/* One of the most common things to do with a collection is to iterate over it
 * Multicore processor
 * NB! Working with threads - separate sections of your program being executed simultaneously
 * Bulk Data Operations was designed to address this issue
 * Provides operation that will be done on each collection's elements with the work spread over multiple sections
 * Object - stream, defined by stream interface
 * Stream = sequence of elements of any data type which can be processed sequentially or in parallel
 * Stream interface provides methods that let you perfom multiple operations (i.e. filtering the elements or performing an operation on each of the elements)
 * Streams used to process data; rely on use of lambda expressions 
 * Pipeline - sequence of method calls that start by creating a stream, manipulate the stream by calling methods such as filter and finally
              calling a method that does not return another stream object

@ Stream Interface (refer to table 6.1, pg 468)
------------------------------------------------
    * Contains methods, related interfaces 
    * Methods consist of:
1:  * (Intermediate operations) Ones that return other Stream objects - manipulate the stream, passes altered stream to be processed by another application
      * Filter method, argument = predicate, returns a boolean value
        - function is called once for every element in the stream and is passed a single argument the element in question
        - if method returns true, element passed on to the result stream, if false - null
      * Limit the number of elements in a stream or sort the elements of the stream
        - To sort, use comparator function
2:  Mapping Methods - convert a stream whose elements are of one type to another
                    - e.g mapToDouble method
3:  Terminal Methods - do not return another stream (i.e. collect, forEach, reduce)
4:  Aggregate methods - perform calculations on elements in the stream
    - Some return an optional data type - object that might contain a value/might not contain a value

Streams don't change the original datas structure, they only provide the result as per the pipelined methods

@ Using Parallel Streams
-------------------------------------------------
    - Two types of streams - sequential and parallel
    - Elements in a sequential stream are produced by the stream method and create streams that are processed one element after the next
    - Parallel Streams - take full advantage of multicore processors by breaking its elements into two or more smaller streams
                         performing operations on them, recombining separate streams to create final result
                       - the intermediate streams can be processed by a separte thread which can improve performance for large streams
                       - use parallelStream method instead of stream method (refer to Spell code)
                       - can't predict order in which element of the stream is processed
Optional 
 */
public class Notes {
    
}

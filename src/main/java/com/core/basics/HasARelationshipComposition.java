package com.core.basics;

public class HasARelationshipComposition {

}




/*

The new keyword: The child object is usually instantiated inside the parent's constructor or field declaration.
Private/Final: The child field is often private final to ensure it can't be swapped out or shared easily.
No "Setter": There is usually no setChild(Child c) method, as the parent is responsible for creating its own parts.




Project Example:

public class DatabaseClient {
    private final ConnectionPool pool; // Composition

    public DatabaseClient(String url) {
        // The Client creates its own Pool
        this.pool = new ConnectionPool(url);
    }
}

1. A DatabaseClient owns its ConnectionPool. If you shut down the client, the pool must be destroyed
because it has no purpose and no way to manage connections without the client configuration.

2. An Order has OrderLineItems. An "Item" on an order (e.g., "2x Blue Pens") is just a record within that specific
transaction. If the order is deleted from the system, those specific line items are deleted with it.



*/

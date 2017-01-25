# greenDAOPagination Service

### Purpose:
To get the items from dao object in pagination in single line.<br>
Example<br>
`userDAOPagination.getRecordsForPage(1);` <br>
which results the records for first page(Where is 1 is the pageNumber).

<h3>How to use:</h3>
<li>Copy the <code>GreenDAODataPaginationService.java</code> into your project</li>
<li>Call like below</li>

```java
// 10 is the items per page i want to get
 GreenDAODataPaginationService userDAOPagination = new GreenDAODataPaginationService(userDao,10,userDao.class);
            ArrayList <Object> users = userDAOPagination.getRecordsForPage(1);
            // This prints the first userID
            System.out.println(((User)users.get(0)).getUserID());
```
<code>userDAOPagination.getRecordsForPage(1); //  ==> Returns Records 1 to 10</code> <br>
<code>userDAOPagination.getRecordsForPage(2); //  ==> Returns Records 11 to 20</code> 

<image src="userDAOService.png" ></image> <br>
Basic useful feature list:

 * You can define the the number of items per page.
 * Get the items by specifying the page Number.


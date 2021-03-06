# greenDAOPagination Service

### Purpose:
This greenDAO pagination library service is to paginate through your greenDAO. You can get the items from dao object in pagination in single line.<br>
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
<h3>Example: </h3>

Lets take you have a userDAO object referring table like below <br>
<image src="userDAOService.png" ></image> <br>
Then<br>
To paginate through this table with 10 items per page<br>
<b>Step1:&nbsp;</b><code>GreenDAODataPaginationService userDAOPagination = new GreenDAODataPaginationService(userDao,10,userDao.class);</code><br>
<b>Step2:</b>
<code>userDAOPagination.getRecordsForPage(1); //  ==> Returns Records 1 to 10</code> <br>
<code>userDAOPagination.getRecordsForPage(2); //  ==> Returns Records 11 to 20</code> 
<br>
<h3>Basic useful feature list:</h3>

 <li> You can define the the number of items per page.</li>
 <li> Get the items by specifying the page Number.</li>


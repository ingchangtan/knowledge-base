# knowledge-base
### GET /users

List all users, can be searched or sorted

**Query Params**

`name` - string, will fuzzy search using `LIKE '%name%'`
`age` - number, will match exactly

**Sample Response** 

```
[
    {
        "id": 65,
        "name": "Ming Xiang",
        "age": 28
    }
]
```


| method | path | action |
|---|---|---|
| POST | /articles | create |
| PUT | /articles/{id} | edit |
| DELETE | /articles/{id} | delete | 
| GET | /acticles | show all
| GET | /acticles/state={state} | show by state
| GET | /acticles/product={product} | show by product
| GET | /acticles/user={user_id} | show by author
| GET | /acticles/title={title} | show by title
| GET | /articles/{id} | show
| GET | /acticles/published | show all published KB
| GET | /acticles/published/{id} | show published KB id



### GET /acticles/title={title}

List all the articles which search using title

**Query Params**

`title` - string, will fuzzy search using `LIKE '%title%'`


**Sample Response** 

```
[
    {
        "article_id": 65,
        "Title": "How to raise access to SFDC",
        "knowledge_Base": "Self-Help",
        "State": "Review",
        "Product":"SFDC",
        "user_id" : 1

    }
]
```

### GET /articles/{id}

List the article when search using id

**Query Params**

`id` - number, will match exactly


**Sample Response** 

```
[
    {
        "article_id": 65,
        "Title": "How to raise access to SFDC",
        "knowledge_Base": "Self-Help",
        "State": "Review",
        "Product":"SFDC",
        "user_id" : 1

    }
]
```


### GET /acticles/published

List the published articles 

**Query Params**



**Sample Response** 

```
[
    {
        "article_id": 65,
        "Title": "How to raise access to SFDC",
        "knowledge_Base": "Self-Help",
        "State": "Review",
        "Product":"SFDC",
        "user_id" : 1

    }
]
```


### GET /acticles/published/{id}

List the published articles by id

**Query Params**

`id` - number, will match exactly

**Sample Response** 

```
[
    {
        "article_id": 65,
        "Title": "How to raise access to SFDC",
        "knowledge_Base": "Self-Help",
        "State": "Review",
        "Product":"SFDC",
        "user_id" : 1

    }
]
```


### GET /articles
List all the articles, it can be search or sorted

**Query Params**

**Sample Response** 
```
[
    {
        "article_id": KB0001,
        "Title": "Hello World",
        "knowledge_base": "IT", 
        "State" : "Published", 
        "Product": "Windows 7", 
        "user_id": ooo1
    }
]
```

| GET | /acticles/state={state} | show by state

List articles with state

**Query Params**
`State` - String, with search state - 'Published, Draft"

**Sample Response** 
```
[
    {
        "article_id": KB0001,
        "Title": "Hello World",
        "knowledge_base": "IT", 
        "State" : "Published", 
        "Product": "Windows 7", 
        "user_id": ooo1
    }
]
```

| GET | /acticles/product={product} | show by product

List articles with state

**Query Params**
`Product` - String, with search 'Product"

**Sample Response** 
```
[
    {
        "article_id": KB0001,
        "Title": "Hello World",
        "knowledge_base": "IT", 
        "State" : "Published", 
        "Product": "Windows 7", 
        "user_id": ooo1
    }
]
```


| method | path | action |
|---|---|---|
| POST | /articles | create |
| PUT | /articles/{id} | edit |
| DELETE | /articles/{id} | delete |
| GET | /acticles | show all
| GET | /acticles/state={state} | show by state
| GET | /acticles/product={product} | show by product
| GET | /acticles/user={user_id} | show by author
| GET | /acticles/title={title} | show by title
| GET | /articles/{id} | show
| GET | /acticles/published | show all published KB
| GET | /acticles/published/{id} | show published KB id  

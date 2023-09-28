#include <stdio.h>
#include <stdlib.h>

typedef int StackElemType ;
typedef struct node{
    StackElemType data;
    struct node * next;
}LinkStackNode;
typedef struct {
    LinkStackNode *top;
} LinkStack;

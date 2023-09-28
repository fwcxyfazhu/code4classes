#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

typedef int StackElemType ;
typedef struct node{
    StackElemType data;
    struct node * next;
}LinkStackNode;
typedef struct {
    LinkStackNode *top;
} LinkStack;

int InitLinkStack(LinkStack *S){
    S->top=(LinkStackNode*)malloc(sizeof(LinkStackNode));
    if(S->top!=NULL){
        S->top->next=NULL;
        return TRUE;
    }
    return FALSE;
}
int push(LinkStack *S, StackElemType E){
    LinkStackNode *node=(LinkStackNode*)malloc(sizeof(LinkStackNode));
    if (node == NULL) {
        printf("内存分配失败\n");
        return FALSE;
    }
    node->data = E;
    node->next = S->top->next;
    S->top->next =node;
    return TRUE;
}
int pop(LinkStack *S, StackElemType *E){
    
    if(S->top->next==NULL){
        printf("栈空\n");
        return FALSE;
    }
    LinkStackNode *p=S->top->next;
    *E=p->data;
    S->top->next=p->next;
    free(p);
    return TRUE;
}
int main(void){
    LinkStack S;
    InitLinkStack(&S);
    for (int i=1; i<=10; i++) {
        push(&S, i);
    }
    int v;
    while (pop(&S, &v)) {
        printf("%d  ",v);
    }
}

#include <stdio.h>
#include <stdlib.h>
#define STACK_SIZE 3

typedef int ElemType;

typedef int bool;
#define TRUE 1
#define FALSE 0

typedef struct {
    ElemType elements [STACK_SIZE];
    int top;
}SeqStack;

void initStack(SeqStack *S){
    S->top=-1;
}

bool empty(SeqStack *S){
    return S->top == -1;
}
bool full(SeqStack *S){
    return S->top == (STACK_SIZE - 1);
}
bool push(SeqStack *S, ElemType e){
    if(full(S)){
        printf("Cannot push element into a full stuck!\n");
        return FALSE;
    }
    printf("push %d into stack\n",e);   
    S->elements[++S->top] = e;
}
bool pop(SeqStack *S, ElemType *e){
    if(empty(S)){
        printf("Sorry, cannot pop from a empty stack!");
        return FALSE;
    }   
    *e=S->elements[S->top--];
}

int main (void){
    SeqStack stack;
    initStack(&stack);
    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);
    push(&stack, 4);
    int v;
    if(pop(&stack, &v))printf("%d\n",v);
    if(pop(&stack, &v))printf("%d\n",v);
    if(pop(&stack, &v))printf("%d\n",v);
    if(pop(&stack, &v))printf("%d\n",v);
    return 0;
}
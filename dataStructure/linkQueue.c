#include <stdio.h>
#include <stdlib.h>

#define TRUE 1;
#define FALSE 0;

typedef int QueueElemType;

typedef struct node{
    QueueElemType data;
    struct node *next;
} LinkQueueNode;
typedef struct{
    LinkQueueNode *front;//队首
    LinkQueueNode *rear;//队尾
} LinkQueue;
int InitQueue(LinkQueue *Q){
    Q->front=(LinkQueueNode*)malloc(sizeof(LinkQueueNode));//创建伪队首节点
    if (Q->front!=NULL) {
        Q->rear=Q->front;
        Q->front->next=NULL;
        return TRUE;
    }else return FALSE;
}
int Dequeue(LinkQueue * Q,QueueElemType *x){//出队
    LinkQueueNode *p;
    if (Q->front==Q->rear) return FALSE;//队空
    p=Q->front->next;
    Q->front->next=p->next;
    if (Q->rear==p) Q->rear=Q->front;
    *x=p->data;
    free(p);
    return TRUE;
}
int Enqueue(LinkQueue *Q,QueueElemType x){//入队
    LinkQueueNode *NewNode;
    NewNode = (LinkQueueNode*)malloc(sizeof(LinkQueueNode));
    if (NewNode!=NULL) {
        NewNode->data=x;
        NewNode->next=NULL;
        Q->rear->next=NewNode;
        Q->rear=NewNode;
        return TRUE;
    }else return FALSE;
}

int main(void){
    LinkQueue Q;
    InitQueue(&Q);
    for(int i=1;i<11;i++){
        Enqueue(&Q, i);
    }
    int v;
    while (Dequeue(&Q, &v)) {
        printf("%d  ",v);
    }
    return 0;
}
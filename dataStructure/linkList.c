#include <stdio.h>
#include <stdlib.h>
typedef int ElemType;
typedef struct Node{
    ElemType data;
    struct Node * next;    
}Node, *LinkList;/* LinkList为结构指针类型 */
LinkList CreateFromHead(){
    LinkList L;
    Node *s;
    int flag=1;
    L=(LinkList)malloc(sizeof(Node));
    L->next=NULL;
    while(flag){
        char c = getchar();
        if(c!='$'){
            s=(Node*)malloc(sizeof(Node));
            s->data=c;
            s->next=L->next;
            L->next=s;

        }
        else{
            flag=0;
        }
    }
    return L;
}
void Traverse(LinkList list){
    LinkList p=list->next;
    while(p){


        printf("%c",p->data);
        p=p->next;
    } 
}
int main(void){
    LinkList list=CreateFromHead();
    Traverse(list);
    return 0;
}
#include<stdio.h>
#include<string.h>,
#include<stdlib.h>

#define STACK_SIZE 100
#define QUEUE_SIZE 100
#define SIZE 100

typedef struct Polindrom{

    char Queue[STACK_SIZE];
    int front;
    int near;
    int counter;
};
typedef struct Polindrom queue;
queue *p,*q;


typedef enum {
    true,
    false
}boolean;   
void initliaze() {
    q->front = 0;
    q->near = -1;
    q->counter = 0;
}

boolean isEmpty(){
   
    return (q->counter == 0);
}

int isFull () {
    if(q->counter == STACK_SIZE) {
        return (q->counter == STACK_SIZE); 
    }
    else {
        return q->counter;
    }
}
void enqueue() {
    int x;

    if(!isFull(q)) {
        q->near++;
        q->counter++;
        if (q->near == QUEUE_SIZE)
        {
         q->near = 0; 
        }
        q->Queue[q->near]=x;
    }
    else {
        printf("Queue Overflow\n");
         exit(-1);
     }
}

int dequeue (){

    if(!isEmpty(q)) {
       int x= p->front = q->Queue[q->near++];
        p->counter--;
        p->front++;

        if (p->front == QUEUE_SIZE)
        {
              p->front =0;
              return x;  
        }  
        
    }
    else {

        return 0;
    }
}
int main()
{





    return 0;
}

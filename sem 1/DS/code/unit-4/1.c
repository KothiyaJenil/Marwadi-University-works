#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *left;
    struct node *right;
};

struct node* createNode(int value) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct node* createTree() {
    struct node* root;
    int data;
    int choice;

    printf("\nEnter data (-1 for no node): ");
    scanf("%d", &data);

    if (data == -1)
        return NULL;

    root = createNode(data);

    printf("\nEnter left child of %d: ", data);
    root->left = createTree();

    printf("\nEnter right child of %d: ", data);
    root->right = createTree();

    return root;
}

void preorder(struct node* root) {
    if (root != NULL) {
        printf("%d ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void inorder(struct node* root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

void postorder(struct node* root) {
    if (root != NULL) {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}

    void main() {
    struct node* root = NULL;

    printf("Create the binary tree:\n");
    root = createTree();

    printf("\nPreorder Traversal: ");
    preorder(root);

    printf("\nInorder Traversal: ");
    inorder(root);

    printf("\nPostorder Traversal: ");
    postorder(root);

    getch();
}
#define  _CRT_SECURE_NO_WARNINGS  1
#include "game.h"

void InitBoard(char board[ROW][COL], int row, int col)
{
	memset(&board[0][0],' ',col*row*sizeof(board[0][0]));
}
 void DisplayBoard(char board[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			printf(" %c ", board[i][j]);
			if (j < col - 1)
				printf("|");
		}
		printf("\n");
		if (i < row - 1)
		{
			for (j = 0; j < col; j++)
			{
				printf("---");
				if (j < col - 1)
					printf("|");

			}
			printf("\n");
		}
		
		
	}
}
 void PlayerMove(char board[ROW][COL], int row, int col)
 {
	 int x = 0;
	 int y = 0;
	 printf("����ߣ�\n");
	 while (1)
	 {
		 
		 printf("���������꣺");
		 scanf("%d%d", &x, &y);
		 if (x >= 1 && x <= 3 && y >= 1 && y <= 3)
		 {
			 if (board[x - 1][y - 1] == ' ')
			 {
				 board[x - 1][y - 1] = 'X';
				 break;
			 }
			 else
			 {
				 printf("���걻ռ�ã����������룺\n");
			 }

			 
		 }
		 else
		 {
			 printf("�����������������룺\n");
		 }
	 }
 }
 void ComputerMove(char board[ROW][COL], int row, int col)
 {
	 int x = 0;
	 int y = 0;
	 printf("�����ߣ�\n");
	 while (1)
	 {
		 x = rand() % row;
		 y = rand() % col;
		 if (board[x][y] == ' ')
		 {
			 board[x][y] = '*';
			 break;
		 }

	 }
 }
 int IsFull(char board[ROW][COL], int row, int col)
 {
	 {
		 int i = 0;
		 int j = 0;
		 for (i = 0; i < row; i++)
		 {
			 for (j = 0; j < col; j++)
			 {
				 if (board[i][j] == ' ')
					 return 0;
			 }
		 }
		 return 1;
	 }
 }
 char IsWin(char board[ROW][COL], int row, int col)
 {
	 int i = 0;
	 for (i = 0; i < row; i++)
	 {
		 if (board[i][col-1] == board[i][col-2] && board[i][col-2] == board[i][col - 3] && board[i][col - 1] != ' ')
		 {
			 return board[i][col - 1];
		 }
	 }
	 for (i = 0; i < col; i++)
	 {
		 if (board[row - 1][i] == board[row - 2][i] && board[row - 2][i] == board[row - 3][i] && board[row - 1][i] != ' ')
		 {
			 return board[row - 1][i];
		 }
	 }
	 if (board[row - 3][col - 3] == board[row - 2][col - 2] && board[row - 2][col - 2] == board[row - 1][col - 1] && board[row - 1][col - 1] != ' ')
	 {
		 return board[row - 2][col - 2];
	 }
	 else if (board[row - 1][col - 3] == board[row - 2][col - 2] && board[row - 2][col - 2] == board[row - 3][col - 1] && board[row - 3][col - 1] != ' ')
	 {
		 return  board[2][ 2];

	 }
 
	 if (IsFull(board, row, col) == 1)
	 {
		 return 'Q';
	 }
	 return ' ';
 }
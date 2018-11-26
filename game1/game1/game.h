#define  _CRT_SECURE_NO_WARNINGS  1
#ifndef __GAME_H__
#define __GAME_H__
#include <Windows.h>
#include <stdlib.h>
#include <stdio.h>


#define ROW 3
#define COL 3


void InitBoard(char board[ROW][COL], int row, int col);
void DisplayBoard(char board[ROW][COL], int row, int col);
void PlayerMove(char board[ROW][COL], int row, int col);
void ComputerMove(char board[ROW][COL], int row, int col);
char IsWin(char board[ROW][COL], int row, int col);
//"x"-->玩家赢。
//"y"-->电脑赢。
// 平局。

#endif
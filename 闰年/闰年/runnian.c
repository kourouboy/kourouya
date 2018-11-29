#define  _CRT_SECURE_NO_WARNINGS  1

#include <stdio.h>
int main()
{
	int i;
	for (i = 1000; i <= 2000; i++)
	{
		if (i % 4 == 0)
		{
			if (i % 100 != 0)
			{
				printf("%d ", i);
			}

		}
	}
	system("pause");
	return 0;
}
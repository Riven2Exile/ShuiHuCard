/*************************************
	���״����
	2013/6/22
*/

#ifndef EASYPACK_H
#define EASYPACK_H

#include <stdio.h>

typedef unsigned char byte;

struct stPackCfg
{
	int nOffset;	//ƫ��
	int nSize;		//��С
};


class CEasyPack
{
public:
	CEasyPack();
	~CEasyPack();

	bool AllocCfgSize(int nSize);
	void SetCfg(int index, stPackCfg &data);

	bool WritePackFile(FILE *pFile, byte* pBuf, int nSize);

private:
	stPackCfg* m_pCfg;
	int m_nSize;
};



#endif
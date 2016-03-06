
#include "CEasyPack.h"


//////////// construtor
CEasyPack::CEasyPack()
{
	m_nSize = 0;
	m_pCfg = NULL;
}

CEasyPack::~CEasyPack()
{
	if (m_pCfg)
	{
		delete[] m_pCfg;
	}
}


/////////////////

bool CEasyPack::AllocCfgSize(int nSize)
{
	if (m_pCfg)
	{
		delete[] m_pCfg;
	}

	m_pCfg = new stPackCfg[nSize];


	if (m_pCfg)
	{
		m_nSize = nSize;
		return true;
	}
	else
	{
		m_nSize = 0;
		return false;
	}
}


void CEasyPack::SetCfg(int index, stPackCfg &data)
{
	if (m_pCfg && index < m_nSize)
	{
		m_pCfg[index] = data;
	}
}

bool CEasyPack::WritePackFile(FILE *pFile, byte* pBuf, int nSize)
{
	if(!pFile || !pBuf || nSize < 0)
		return false;

	fwrite(pBuf, 1, nSize, pFile);
	return true;
}
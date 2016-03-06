/***********************************************************************
	“ÏªÚº”/Ω‚√‹

	2013/6/22
*/


#ifndef LPR_CXOR_H
#define LPR_CXOR_H


#define FIRST_KEY_SIZE	100

typedef unsigned char byte;


class CToolXor
{
public:
	CToolXor()
	{
		m_bFirstKey = 0xbb;
		m_bLeftKey = 0xcc;
	}

	void SetfirstKey(byte bFirstKey)
	{
		m_bFirstKey = bFirstKey;
	}
	void SetLeftKey(byte bLetfKey)
	{
		m_bLeftKey = bLetfKey;
	}

	inline bool DoXor(byte *pBuf,int nSize);

private:
	byte m_bFirstKey;
	byte m_bLeftKey;
};


//////////////////////
bool CToolXor::DoXor(byte *pBuf,int nSize)
{
	if (!pBuf)
	{
		return false;
	}

	int nLeftSize = nSize - FIRST_KEY_SIZE;

	// 1. first part
	if (nSize < FIRST_KEY_SIZE)
	{
		for (int i = 0; i < nSize; ++i)
		{
			pBuf[i] ^= m_bFirstKey;
		}
		return true;
	}
	else
	{
		for ( int i = 0; i < FIRST_KEY_SIZE; ++i)
		{
			pBuf[i] ^= m_bFirstKey;
		}
	}

	// 2. letf part
	for (int i = FIRST_KEY_SIZE; i < nSize; ++i)
	{
		pBuf[i] ^= m_bLeftKey;
	}

	return true;
}



#endif
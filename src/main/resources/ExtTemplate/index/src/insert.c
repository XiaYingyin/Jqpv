#include "postgres.h"
#include "header/exti.h"

bool insertIndex(Relation rel, Datum *values, bool *isnull,
		         ItemPointer ht_ctid, Relation heapRel,
		         IndexUniqueCheck checkUnique,
		         IndexInfo *indexInfo)
{
	bool result;

    /*
        insert an index item
    */

	return result;
}

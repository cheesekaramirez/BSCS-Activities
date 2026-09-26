--1
SELECT it.itembrand,
		t.timeMonth,
		COUNT(*) NUMBER_OF_SALES,
		SUM(SALESDOLLAR) TOTAL_SALES,
		SUM(SUM(SALESDOLLAR)) OVER
		(ORDER BY it.itembrand,
		t.timemonth ROWS UNBOUNDED PRECEDING) CUMULATIVE_SALES
FROM ssitem it, sssales s,sstimedim t
WHERE it.itemID = s.itemID 
AND s.timeno = t.timeno
AND t.timeyear = 2010
GROUP BY it.itembrand, t.timemonth
ORDER BY 1,2 ;

--2
SELECT t.timeyear, 
		it.itembrand,
		COUNT(*) NUMBER_OF_SALES,
		SUM(SALESDOLLAR) TOTAL_SALES,
		SUM(SUM(SALESDOLLAR)) OVER
		(PARTITION BY t.timeyear
		ORDER BY t.timeyear, it.itembrand) CUMULATIVE_SALES
FROM ssitem it, sssales s,sstimedim t
WHERE it.itemID = s.itemID 
AND s.timeno = t.timeno
GROUP BY t.timeyear,it.itembrand
ORDER BY 1,2;

--3
SELECT *
FROM(SELECT t.timeyear,
		st.storeZip,
		st.storeCity,
		SUM(SALESDOLLAR) TOTAL_SALES,
		CUME_DIST() OVER 
		(PARTITION BY t.timeyear
		ORDER BY SUM(SALESDOLLAR) DESC) CUME_DIST_TOTALSALES
FROM sstimedim t, ssstore st, sssales s
WHERE s.storeID = st.storeID
AND s.timeno = t.timeno
GROUP BY t.timeyear,st.storeZip,st.storeCity) sq
WHERE CUME_DIST_TOTALSALES <= 0.3
ORDER BY 1,2;

--4
SELECT t.timeMonth, it.itembrand,
		COUNT(*) NUM_OF_SALES, 
		SUM(salesunits) TOTAL_UNIT_SALES,
		RATIO_TO_REPORT(SUM(salesunits))
		OVER (PARTITION BY t.timeMonth) CONTRIB_RATIO
FROM ssitem it, sssales s,sstimedim t
WHERE t.timeyear = 2011
AND s.timeNo = t.timeno
AND s.itemID = it.itemID
GROUP BY t.timeMonth,it.itembrand
ORDER BY 1,3 DESC;

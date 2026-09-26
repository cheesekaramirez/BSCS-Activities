--1
SELECT c.name,SUM(inv.extCost) AS TOTAL_EXT_COST, 
RANK () OVER (ORDER BY SUM(inv.extCost) DESC) AS RANK_EXT_COST
FROM inventory_fact inv, cust_vendor_dim c, trans_type_dim t
WHERE inv.custVendorKey = c.custVendorKey
AND inv.transTypeKey = t.transTypeKey
AND t.transTypeCodeID = 'AR'
GROUP BY c.name;

--2
SELECT c.state,c.name, SUM(inv.extCost) AS TOTAL_EXT_COST,
RANK () OVER (PARTITION BY c.state ORDER BY SUM(inv.extCost) DESC) AS RANK_EXT_COST
FROM inventory_fact inv, cust_vendor_dim c,trans_type_dim t
WHERE inv.custVendorKey = c.custVendorKey
AND inv.transTypeKey = t.transTypeKey
AND t.transTypeCodeID = 'AR'
GROUP BY c.state, c.name;

--3
SELECT c.name,COUNT(*) AS TOTAL_INV_TRANSACT, 
RANK () OVER (ORDER BY COUNT(*) DESC) AS RANK_INV_TRANSACT,
DENSE_RANK () OVER (ORDER BY COUNT(*) DESC) AS DENSE_RANK_INV_TRANSACT
FROM inventory_fact inv, cust_vendor_dim c,trans_type_dim t
WHERE inv.custVendorKey = c.custVendorKey
AND inv.transTypeKey = t.transTypeKey
AND t.transTypeCodeID = 'AR'
GROUP BY c.name;

--4
SELECT c.zip, d.calYear, d.calMonth, 
SUM(inv.extCost) AS TOTAL_EXT_COST,
SUM(SUM(inv.extCost)) OVER (ORDER BY c.zip, d.calYear, d.calMonth 
ROWS UNBOUNDED PRECEDING) AS CUME_EXT_COST
FROM inventory_fact inv, cust_vendor_dim c, date_dim d, trans_type_dim t
WHERE inv.custVendorKey = c.custVendorKey
AND inv.dateKey = d.dateKey
AND inv.transTypeKey = t.transTypeKey
AND t.transTypeCodeID = 'AR'
GROUP BY c.zip, d.calYear, d.calMonth;

--5
SELECT c.zip, d.calYear, d.calMonth,
SUM(inv.extCost) AS TOTAL_EXT_COST,
SUM(SUM(inv.extCost)) OVER (PARTITION BY c.zip, d.calYear
ORDER BY c.zip, d.calYear, d.calMonth 
ROWS UNBOUNDED PRECEDING) AS CUME_EXT_COST
FROM inventory_fact inv, cust_vendor_dim c, date_dim d,trans_type_dim t
WHERE inv.custVendorKey = c.custVendorKey
AND inv.dateKey = d.dateKey
AND inv.transTypeKey = t.transTypeKey
AND t.transTypeCodeID = 'AR'
GROUP BY c.zip, d.calYear, d.calMonth;


--6
SELECT im.shortItemID, 
SUM(inv.extCost) AS TOTAL_EXT_COST,
RATIO_TO_REPORT(SUM(inv.extCost)) OVER 
(ORDER BY SUM(inv.extCost) DESC) AS ratio_to_report
FROM inventory_fact inv, item_master_dim im, trans_type_dim t
WHERE inv.itemMasterKey = im.itemMasterKey
AND inv.transTypeKey = t.transTypeKey
AND t.transTypeCodeID = 'IA'
GROUP BY im.shortItemID
ORDER BY TOTAL_EXT_COST DESC;

--7
SELECT d.calYear,im.shortItemID,
SUM(inv.extCost) AS TOTAL_EXT_COST,
RATIO_TO_REPORT(SUM(inv.extCost)) OVER 
(PARTITION BY d.calYear ORDER BY d.calYear, SUM(inv.extCost) DESC) AS ratio_to_report
FROM inventory_fact inv, item_master_dim im, date_dim d, trans_type_dim t
WHERE inv.itemMasterKey = im.itemMasterKey
AND inv.dateKey = d.dateKey
AND inv.transTypeKey = t.transTypeKey
AND t.transTypeCodeID = 'IA'
GROUP BY d.calYear,im.shortItemID
ORDER BY d.calYear, SUM(inv.extCost) DESC;

--8
SELECT BPName,companyKey,carryingCost, RANK() OVER (ORDER BY carryingCost) rank,
PERCENT_RANK() OVER (ORDER BY carryingCost) percent_rank, 
CUME_DIST() OVER (ORDER BY carryingCost) cume_dist
FROM branch_plant_dim;

--9
SELECT *
FROM (SELECT BPName,companyKey,carryingCost, 
CUME_DIST() OVER (ORDER BY carryingCost DESC) AS carryingCost_cume_dist
FROM branch_plant_dim) cume_dist_table
WHERE carryingCost_cume_dist <= 0.15;

--10
SELECT DISTINCT inv.extCost, CUME_DIST() OVER (ORDER BY inv.extCost) AS cume_dist
FROM inventory_fact inv, cust_vendor_dim c
WHERE inv.custvendorkey = c.custvendorkey
AND c.state = 'CO';

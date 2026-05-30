# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8141.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventory_invway | pk_inventory_invway | pk_inventory_invway | char(20) | √ |
| 2 | cateincludesub | cateincludesub | cateincludesub | char(1) |
| 3 | deptincludesub | deptincludesub | deptincludesub | char(1) |
| 4 | equiporgincsub | equiporgincsub | equiporgincsub | char(1) |
| 5 | inventoryway | inventoryway | inventoryway | number(38, 0) |
| 6 | inventory_checkuser | inventory_checkuser | inventory_checkuser | varchar2(20) |  |  | '~' |
| 7 | ownerorgincsub | ownerorgincsub | ownerorgincsub | char(1) |
| 8 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 9 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 10 | pk_equiporg | pk_equiporg | pk_equiporg | varchar2(20) |  |  | '~' |
| 11 | pk_inventory | pk_inventory | pk_inventory | char(20) | √ |
| 12 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 13 | rowno | rowno | rowno | varchar2(50) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
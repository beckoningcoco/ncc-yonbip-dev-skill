# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11478.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocatelog_b | pk_allocatelog_b | pk_allocatelog_b | char(20) | √ |
| 2 | accbalance_r | accbalance_r | accbalance_r | number(28, 8) |
| 3 | allocatedate | allocatedate | allocatedate | char(19) |
| 4 | allocaterate | allocaterate | allocaterate | number(28, 8) |
| 5 | allocateresult | allocateresult | allocateresult | blob |
| 6 | allocatetime | allocatetime | allocatetime | char(19) |
| 7 | amount | amount | amount | number(28, 8) |
| 8 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 9 | base | base | base | number(38, 0) |
| 10 | leastamount | leastamount | leastamount | number(28, 8) |
| 11 | pk_allocatelog_h | pk_allocatelog_h | pk_allocatelog_h | char(20) | √ |
| 12 | pk_allocaterule_b | pk_allocaterule_b | pk_allocaterule_b | varchar2(20) |
| 13 | pk_allocate_b | pk_allocate_b | pk_allocate_b | varchar2(20) |
| 14 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 15 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 16 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | remainmoney | remainmoney | remainmoney | number(28, 8) |
| 21 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 22 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 23 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 24 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 25 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
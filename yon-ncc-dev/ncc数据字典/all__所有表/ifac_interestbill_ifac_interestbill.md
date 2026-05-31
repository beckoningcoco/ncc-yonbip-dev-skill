# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9206.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interest | pk_interest | pk_interest | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | balamount | balamount | balamount | number(28, 8) |
| 5 | begindate | begindate | begindate | char(19) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billtype | billtype | billtype | number(38, 0) |
| 9 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 10 | depositmode | depositmode | depositmode | varchar2(50) |
| 11 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 12 | enddate | enddate | enddate | char(19) |
| 13 | glcamount | glcamount | glcamount | number(28, 8) |
| 14 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 15 | glcrate | glcrate | glcrate | number(15, 8) |
| 16 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 17 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 19 | interest | interest | interest | number(28, 8) |
| 20 | offsetstate | offsetstate | offsetstate | number(38, 0) |
| 21 | olcamount | olcamount | olcamount | number(28, 8) |
| 22 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 23 | olcrate | olcrate | olcrate | number(15, 8) |
| 24 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 25 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 26 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 27 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 28 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 29 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 30 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 31 | pk_depositrate | pk_depositrate | pk_depositrate | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_interestacc | pk_interestacc | pk_interestacc | varchar2(20) |  |  | '~' |
| 34 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 38 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 39 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 40 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |
| 41 | pk_srcinterest | pk_srcinterest | pk_srcinterest | varchar2(20) |
| 42 | pk_varieties | pk_varieties | pk_varieties | varchar2(20) |  |  | '~' |
| 43 | remark | remark | remark | varchar2(50) |
| 44 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 45 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 46 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 47 | saga_status | saga_status | saga_status | number(38, 0) |
| 48 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 49 | voucherflag | voucherflag | voucherflag | char(1) |
| 50 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 51 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 52 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 53 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 54 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 55 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 56 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 57 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 58 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 59 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 60 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 61 | creationtime | creationtime | creationtime | char(19) |
| 62 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 65 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
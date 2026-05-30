# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8378.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financingcost_b | pk_financingcost_b | pk_financingcost_b | char(20) | √ |
| 2 | bearingratio | bearingratio | bearingratio | number(28, 8) |
| 3 | costproject | costproject | costproject | varchar2(20) |  |  | '~' |
| 4 | costrate | costrate | costrate | number(28, 8) |
| 5 | department | department | department | varchar2(20) |  |  | '~' |
| 6 | detailaccount | detailaccount | detailaccount | varchar2(20) |  |  | '~' |
| 7 | detailamount | detailamount | detailamount | number(28, 8) |
| 8 | glcamount | glcamount | glcamount | number(28, 8) |
| 9 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 10 | olcamount | olcamount | olcamount | number(28, 8) |
| 11 | olcrate | olcrate | olcrate | number(28, 8) |
| 12 | oppounittype | oppounittype | oppounittype | varchar2(50) |
| 13 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 14 | pk_bankaccount | pk_bankaccount | pk_bankaccount | varchar2(20) |  |  | '~' |
| 15 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 16 | pk_custsup | pk_custsup | pk_custsup | varchar2(20) |  |  | '~' |
| 17 | pk_custsupaccount | pk_custsupaccount | pk_custsupaccount | varchar2(20) |  |  | '~' |
| 18 | pk_financingcost_h | pk_financingcost_h | pk_financingcost_h | char(20) | √ |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 23 | planproject | planproject | planproject | varchar2(20) |  |  | '~' |
| 24 | rowno | rowno | rowno | varchar2(50) |
| 25 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 26 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 27 | srcbussamount | srcbussamount | srcbussamount | number(28, 8) |
| 28 | srcmodule | srcmodule | srcmodule | varchar2(50) |
| 29 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 30 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 31 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 32 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 33 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 34 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 35 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 36 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 37 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 38 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
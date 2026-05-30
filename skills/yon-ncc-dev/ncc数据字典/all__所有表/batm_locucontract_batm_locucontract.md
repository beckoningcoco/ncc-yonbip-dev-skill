# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6632.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 2 | begindate | begindate | begindate | char(19) |
| 3 | ccamount | ccamount | ccamount | number(28, 8) |
| 4 | cctype | cctype | cctype | varchar2(50) |
| 5 | contractamount | contractamount | contractamount | number(28, 8) |
| 6 | contractcode | contractcode | contractcode | varchar2(50) |
| 7 | contstatus | contstatus | contstatus | varchar2(50) |
| 8 | enddate | enddate | enddate | char(19) |
| 9 | flag1 | flag1 | flag1 | number(38, 0) |
| 10 | flag2 | flag2 | flag2 | number(38, 0) |
| 11 | flag3 | flag3 | flag3 | number(38, 0) |
| 12 | glccontractmnt | glccontractmnt | glccontractmnt | number(28, 8) |
| 13 | glcleftrepayamount | glcleftrepayamount | glcleftrepayamount | number(28, 8) |
| 14 | glcpayinterest | glcpayinterest | glcpayinterest | number(28, 8) |
| 15 | gllccontractmnt | gllccontractmnt | gllccontractmnt | number(28, 8) |
| 16 | gllcleftrepayamount | gllcleftrepayamount | gllcleftrepayamount | number(28, 8) |
| 17 | gllcpayinterest | gllcpayinterest | gllcpayinterest | number(28, 8) |
| 18 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 19 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 20 | leftrepayamount | leftrepayamount | leftrepayamount | number(28, 8) |
| 21 | olccontractmnt | olccontractmnt | olccontractmnt | number(28, 8) |
| 22 | olcleftrepayamount | olcleftrepayamount | olcleftrepayamount | number(28, 8) |
| 23 | olcpayinterest | olcpayinterest | olcpayinterest | number(28, 8) |
| 24 | payamount | payamount | payamount | number(28, 8) |
| 25 | payglcamount | payglcamount | payglcamount | number(28, 8) |
| 26 | paygllcamount | paygllcamount | paygllcamount | number(28, 8) |
| 27 | payinterest | payinterest | payinterest | number(28, 8) |
| 28 | payolcamount | payolcamount | payolcamount | number(28, 8) |
| 29 | pk_cctype | pk_cctype | pk_cctype | varchar2(50) |
| 30 | pk_creditbank | pk_creditbank | pk_creditbank | varchar2(20) |  |  | '~' |
| 31 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 32 | pk_debitorg | pk_debitorg | pk_debitorg | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | repayamount | repayamount | repayamount | number(28, 8) |
| 37 | repayglcamount | repayglcamount | repayglcamount | number(28, 8) |
| 38 | repaygllcamount | repaygllcamount | repaygllcamount | number(28, 8) |
| 39 | repayolcamount | repayolcamount | repayolcamount | number(28, 8) |
| 40 | tradefinsort | tradefinsort | tradefinsort | varchar2(50) |
| 41 | yrate | yrate | yrate | number(28, 8) |
| 42 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 43 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 44 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 45 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 46 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 47 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 48 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 49 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 50 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 51 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 52 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 53 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 54 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 55 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 56 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 57 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 58 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 59 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 60 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 61 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
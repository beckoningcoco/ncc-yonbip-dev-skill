# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9004.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | pk_version_b | pk_version_b | char(20) | √ |
| 2 | busidate | busidate | busidate | char(19) |
| 3 | exectmark | exectmark | exectmark | varchar2(50) |
| 4 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 5 | glcpayinterest | glcpayinterest | glcpayinterest | number(28, 8) |
| 6 | glcrate | glcrate | glcrate | number(28, 8) |
| 7 | glcrepayamount | glcrepayamount | glcrepayamount | number(28, 8) |
| 8 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 9 | gllcpayinterest | gllcpayinterest | gllcpayinterest | number(28, 8) |
| 10 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 11 | gllcrepayamount | gllcrepayamount | gllcrepayamount | number(28, 8) |
| 12 | initialflag | initialflag | initialflag | char(1) |
| 13 | leftrepayamount | leftrepayamount | leftrepayamount | number(28, 8) |
| 14 | loanamount | loanamount | loanamount | number(28, 8) |
| 15 | memo | memo | memo | varchar2(50) |
| 16 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 17 | olcpayinterest | olcpayinterest | olcpayinterest | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(28, 8) |
| 19 | olcrepayamount | olcrepayamount | olcrepayamount | number(28, 8) |
| 20 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 21 | payinterest | payinterest | payinterest | number(28, 8) |
| 22 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 23 | pk_execute_b_icdmc | pk_execute_b_icdmc | pk_execute_b_icdmc | char(20) |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 28 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 29 | pk_version | pk_version | pk_version | char(20) | √ |
| 30 | rate | rate | rate | number(28, 8) |
| 31 | repayamount | repayamount | repayamount | number(28, 8) |
| 32 | serialno | serialno | serialno | number(38, 0) |
| 33 | summary | summary | summary | varchar2(50) |
| 34 | unrepayintstmny | unrepayintstmny | unrepayintstmny | number(28, 8) |
| 35 | vbillno | vbillno | vbillno | varchar2(50) |
| 36 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 37 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 38 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 39 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 40 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 41 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 42 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 43 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 44 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 45 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 46 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 47 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 48 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 49 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 50 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 51 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 52 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 53 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 54 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 55 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 56 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 57 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 58 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 59 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 60 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 61 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 62 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 63 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 64 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 65 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
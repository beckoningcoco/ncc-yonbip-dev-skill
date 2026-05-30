# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9759.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_exec | pk_contract_exec | pk_contract_exec | char(20) | √ |
| 2 | busidate | busidate | busidate | char(19) |
| 3 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 4 | glcpayamount | glcpayamount | glcpayamount | number(28, 8) |
| 5 | glcpaycharge | glcpaycharge | glcpaycharge | number(28, 8) |
| 6 | glcpayinterest | glcpayinterest | glcpayinterest | number(28, 8) |
| 7 | glcrate | glcrate | glcrate | number(15, 8) |
| 8 | glcrepayamount | glcrepayamount | glcrepayamount | number(28, 8) |
| 9 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 10 | gllcpayamount | gllcpayamount | gllcpayamount | number(28, 8) |
| 11 | gllcpaycharge | gllcpaycharge | gllcpaycharge | number(28, 8) |
| 12 | gllcpayinterest | gllcpayinterest | gllcpayinterest | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 14 | gllcrepayamount | gllcrepayamount | gllcrepayamount | number(28, 8) |
| 15 | initialflag | initialflag | initialflag | char(1) |
| 16 | interest | interest | interest | number(28, 8) |
| 17 | interestflag | interestflag | interestflag | char(1) |
| 18 | leftcharge | leftcharge | leftcharge | number(28, 8) |
| 19 | leftinterest | leftinterest | leftinterest | number(28, 8) |
| 20 | leftpayamount | leftpayamount | leftpayamount | number(28, 8) |
| 21 | leftrepayamount | leftrepayamount | leftrepayamount | number(28, 8) |
| 22 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 23 | olcpayamount | olcpayamount | olcpayamount | number(28, 8) |
| 24 | olcpaycharge | olcpaycharge | olcpaycharge | number(28, 8) |
| 25 | olcpayinterest | olcpayinterest | olcpayinterest | number(28, 8) |
| 26 | olcrate | olcrate | olcrate | number(15, 8) |
| 27 | olcrepayamount | olcrepayamount | olcrepayamount | number(28, 8) |
| 28 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 29 | payamount | payamount | payamount | number(28, 8) |
| 30 | paycharge | paycharge | paycharge | number(28, 8) |
| 31 | payinterest | payinterest | payinterest | number(28, 8) |
| 32 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 33 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_srcbill | pk_srcbill | pk_srcbill | char(20) |
| 38 | repayamount | repayamount | repayamount | number(28, 8) |
| 39 | serialno | serialno | serialno | number(38, 0) |
| 40 | summary | summary | summary | varchar2(50) |
| 41 | vbillno | vbillno | vbillno | varchar2(40) |
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
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9783.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayplan | pk_repayplan | pk_repayplan | char(20) | √ |
| 2 | glcpreamount | glcpreamount | glcpreamount | number(28, 8) |
| 3 | glcpreinterest | glcpreinterest | glcpreinterest | number(28, 8) |
| 4 | glcsumamount | glcsumamount | glcsumamount | number(28, 8) |
| 5 | gllcpreamount | gllcpreamount | gllcpreamount | number(28, 8) |
| 6 | gllcpreinterest | gllcpreinterest | gllcpreinterest | number(28, 8) |
| 7 | gllcsumamount | gllcsumamount | gllcsumamount | number(28, 8) |
| 8 | olcpreamount | olcpreamount | olcpreamount | number(28, 8) |
| 9 | olcpreinterest | olcpreinterest | olcpreinterest | number(28, 8) |
| 10 | olcsumamount | olcsumamount | olcsumamount | number(28, 8) |
| 11 | operatedate | operatedate | operatedate | char(19) |
| 12 | operateflag | operateflag | operateflag | char(1) |
| 13 | paycode | paycode | paycode | varchar2(50) |
| 14 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_payplan | pk_payplan | pk_payplan | varchar2(20) |
| 19 | preamount | preamount | preamount | number(28, 8) |
| 20 | preinterest | preinterest | preinterest | number(28, 8) |
| 21 | repaycode | repaycode | repaycode | varchar2(50) |
| 22 | repaydate | repaydate | repaydate | char(19) |
| 23 | serialno | serialno | serialno | number(38, 0) |
| 24 | sumamount | sumamount | sumamount | number(28, 8) |
| 25 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 26 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 27 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 28 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 29 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 30 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 31 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 32 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 33 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 34 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
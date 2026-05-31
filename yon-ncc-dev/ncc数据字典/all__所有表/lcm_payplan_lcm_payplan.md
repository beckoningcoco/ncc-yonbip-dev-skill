# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payplan | pk_payplan | pk_payplan | char(20) | √ |
| 2 | glcpayamount | glcpayamount | glcpayamount | number(28, 8) |
| 3 | gllcpayamount | gllcpayamount | gllcpayamount | number(28, 8) |
| 4 | olcpayamount | olcpayamount | olcpayamount | number(28, 8) |
| 5 | operatedate | operatedate | operatedate | char(19) |
| 6 | operateflag | operateflag | operateflag | char(1) |
| 7 | payamount | payamount | payamount | number(28, 8) |
| 8 | paycode | paycode | paycode | varchar2(50) |
| 9 | paydate | paydate | paydate | char(19) |
| 10 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | serialno | serialno | serialno | number(38, 0) |
| 15 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 16 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 17 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 18 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 19 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 20 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 21 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 22 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 23 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 24 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
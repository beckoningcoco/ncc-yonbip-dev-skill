# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8991.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execdetail_i | pk_execdetail_i | pk_execdetail_i | char(20) | √ |
| 2 | busidate | busidate | busidate | char(19) |
| 3 | ccleftamt | ccleftamt | ccleftamt | number(28, 8) |
| 4 | ccreleaseamt | ccreleaseamt | ccreleaseamt | number(28, 8) |
| 5 | ccuseamt | ccuseamt | ccuseamt | number(28, 8) |
| 6 | glcrate | glcrate | glcrate | number(15, 8) |
| 7 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 8 | olcccreleaseamt | olcccreleaseamt | olcccreleaseamt | number(28, 8) |
| 9 | olcccuseamt | olcccuseamt | olcccuseamt | number(28, 8) |
| 10 | olcrate | olcrate | olcrate | number(15, 8) |
| 11 | onlyclueno | onlyclueno | onlyclueno | varchar2(50) |
| 12 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 13 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 14 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 15 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 16 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 17 | pk_debitbill | pk_debitbill | pk_debitbill | varchar2(50) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_incprotocol | pk_incprotocol | pk_incprotocol | varchar2(20) |  |  | '~' |
| 20 | pk_loanorg | pk_loanorg | pk_loanorg | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 23 | pk_quotaorg | pk_quotaorg | pk_quotaorg | varchar2(20) |  |  | '~' |
| 24 | pk_quotaorg_v | pk_quotaorg_v | pk_quotaorg_v | char(20) |
| 25 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 26 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(20) |
| 27 | remark | remark | remark | varchar2(181) |
| 28 | sourcesystem | sourcesystem | sourcesystem | varchar2(20) |  |  | '~' |
| 29 | updatedir | updatedir | updatedir | varchar2(50) |
| 30 | vbillno | vbillno | vbillno | varchar2(40) |
| 31 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 32 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 33 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 34 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 35 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 36 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 37 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 38 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 39 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 40 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 41 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 42 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 43 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 44 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 45 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 46 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 47 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 48 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 49 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 50 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
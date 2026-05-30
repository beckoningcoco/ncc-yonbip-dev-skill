# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12154.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chargercpt_h | pk_chargercpt_h | pk_chargercpt_h | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | busistatus | busistatus | busistatus | number(38, 0) |
| 10 | busitype | busitype | busitype | varchar2(50) |
| 11 | glctotalmnt | glctotalmnt | glctotalmnt | number(28, 8) |
| 12 | gllctotalmnt | gllctotalmnt | gllctotalmnt | number(28, 8) |
| 13 | olctotalmnt | olctotalmnt | olctotalmnt | number(28, 8) |
| 14 | paydate | paydate | paydate | char(19) |
| 15 | pk_bankacc | pk_bankacc | pk_bankacc | varchar2(20) |  |  | '~' |
| 16 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 17 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_pfbusiflow | pk_pfbusiflow | pk_pfbusiflow | varchar2(20) |  |  | '~' |
| 23 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 24 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 25 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(20) |
| 26 | remark | remark | remark | varchar2(181) |
| 27 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 28 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 29 | srcbusitype | srcbusitype | srcbusitype | varchar2(50) |
| 30 | srcmodule | srcmodule | srcmodule | varchar2(50) |
| 31 | summary | summary | summary | varchar2(181) |
| 32 | totalmnt | totalmnt | totalmnt | number(28, 8) |
| 33 | vbillno | vbillno | vbillno | varchar2(50) |
| 34 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 35 | voucherdate | voucherdate | voucherdate | char(19) |
| 36 | voucherflag | voucherflag | voucherflag | char(1) |
| 37 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 38 | vouchertime | vouchertime | vouchertime | char(19) |
| 39 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 40 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 41 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 42 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 43 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 44 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 45 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 46 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 47 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 48 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 49 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 50 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 51 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 52 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 53 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 54 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 55 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 56 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 57 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 58 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 59 | creationtime | creationtime | creationtime | char(19) |
| 60 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 63 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 64 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
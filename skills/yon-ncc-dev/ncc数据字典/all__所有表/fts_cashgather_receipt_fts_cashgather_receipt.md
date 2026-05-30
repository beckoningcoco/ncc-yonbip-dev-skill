# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashgather_receipt_h | pk_cashgather_receipt_h | pk_cashgather_receipt_h | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstatus | billstatus | billstatus | number(38, 0) |
| 5 | busioperator | busioperator | busioperator | varchar2(20) |  |  | '~' |
| 6 | dbilldate | dbilldate | dbilldate | char(19) |
| 7 | dbilltime | dbilltime | dbilltime | char(19) |
| 8 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 9 | glcamount | glcamount | glcamount | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(15, 8) |
| 11 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 13 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 14 | memo | memo | memo | varchar2(181) |
| 15 | olcamount | olcamount | olcamount | number(28, 8) |
| 16 | olcrate | olcrate | olcrate | number(15, 8) |
| 17 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 18 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 19 | pk_bankacc | pk_bankacc | pk_bankacc | varchar2(20) |  |  | '~' |
| 20 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 21 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 22 | pk_cashbankacc | pk_cashbankacc | pk_cashbankacc | varchar2(20) |  |  | '~' |
| 23 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_r | pk_org_r | pk_org_r | varchar2(20) |  |  | '~' |
| 27 | pk_org_r_v | pk_org_r_v | pk_org_r_v | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_payfinanceorg | pk_payfinanceorg | pk_payfinanceorg | varchar2(20) |  |  | '~' |
| 30 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 31 | pk_sourcebillid | pk_sourcebillid | pk_sourcebillid | char(20) |
| 32 | pk_sourcebillid_b | pk_sourcebillid_b | pk_sourcebillid_b | char(20) |
| 33 | pk_sourcebillrowid | pk_sourcebillrowid | pk_sourcebillrowid | char(20) |
| 34 | pk_srccmpbill | pk_srccmpbill | pk_srccmpbill | char(20) |
| 35 | remark | remark | remark | varchar2(200) |  |  | '~' |
| 36 | trandate | trandate | trandate | char(19) |
| 37 | trantime | trantime | trantime | char(19) |
| 38 | vbillno | vbillno | vbillno | varchar2(50) |
| 39 | vsourcebillno | vsourcebillno | vsourcebillno | varchar2(50) |
| 40 | vueserdef1 | vueserdef1 | vueserdef1 | varchar2(101) |
| 41 | vueserdef2 | vueserdef2 | vueserdef2 | varchar2(101) |
| 42 | vueserdef3 | vueserdef3 | vueserdef3 | varchar2(101) |
| 43 | vueserdef4 | vueserdef4 | vueserdef4 | varchar2(101) |
| 44 | vueserdef5 | vueserdef5 | vueserdef5 | varchar2(101) |
| 45 | vueserdef6 | vueserdef6 | vueserdef6 | varchar2(101) |
| 46 | vueserdef7 | vueserdef7 | vueserdef7 | varchar2(101) |
| 47 | vueserdef8 | vueserdef8 | vueserdef8 | varchar2(101) |
| 48 | vueserdef9 | vueserdef9 | vueserdef9 | varchar2(101) |
| 49 | vueserdef10 | vueserdef10 | vueserdef10 | varchar2(101) |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
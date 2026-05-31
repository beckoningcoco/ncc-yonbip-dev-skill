# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8412.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spepay_receipt_h | pk_spepay_receipt_h | pk_spepay_receipt_h | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstatus | billstatus | billstatus | number(38, 0) |
| 5 | dbilldate | dbilldate | dbilldate | char(19) |
| 6 | dbilltime | dbilltime | dbilltime | char(19) |
| 7 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 8 | glcamount | glcamount | glcamount | number(28, 8) |
| 9 | glcrate | glcrate | glcrate | number(15, 8) |
| 10 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 11 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 12 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 13 | memo | memo | memo | varchar2(181) |
| 14 | olcamount | olcamount | olcamount | number(28, 8) |
| 15 | olcrate | olcrate | olcrate | number(15, 8) |
| 16 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 17 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 18 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_p | pk_org_p | pk_org_p | varchar2(20) |  |  | '~' |
| 24 | pk_org_p_v | pk_org_p_v | pk_org_p_v | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 27 | pk_sourcebillid | pk_sourcebillid | pk_sourcebillid | char(20) |
| 28 | pk_sourcebillid_b | pk_sourcebillid_b | pk_sourcebillid_b | char(20) |
| 29 | pk_sourcebillrowid | pk_sourcebillrowid | pk_sourcebillrowid | char(20) |
| 30 | pk_srccmpbill | pk_srccmpbill | pk_srccmpbill | varchar2(50) |
| 31 | remark | remark | remark | varchar2(200) |  |  | '~' |
| 32 | trandate | trandate | trandate | char(19) |
| 33 | trantime | trantime | trantime | char(19) |
| 34 | vbillno | vbillno | vbillno | varchar2(50) |
| 35 | vsourcebillno | vsourcebillno | vsourcebillno | varchar2(50) |
| 36 | vueserdef1 | vueserdef1 | vueserdef1 | varchar2(101) |
| 37 | vueserdef2 | vueserdef2 | vueserdef2 | varchar2(101) |
| 38 | vueserdef3 | vueserdef3 | vueserdef3 | varchar2(101) |
| 39 | vueserdef4 | vueserdef4 | vueserdef4 | varchar2(101) |
| 40 | vueserdef5 | vueserdef5 | vueserdef5 | varchar2(101) |
| 41 | vueserdef6 | vueserdef6 | vueserdef6 | varchar2(101) |
| 42 | vueserdef7 | vueserdef7 | vueserdef7 | varchar2(101) |
| 43 | vueserdef8 | vueserdef8 | vueserdef8 | varchar2(101) |
| 44 | vueserdef9 | vueserdef9 | vueserdef9 | varchar2(101) |
| 45 | vueserdef10 | vueserdef10 | vueserdef10 | varchar2(101) |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
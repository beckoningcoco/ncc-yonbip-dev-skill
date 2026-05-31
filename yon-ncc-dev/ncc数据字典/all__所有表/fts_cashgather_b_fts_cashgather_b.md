# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8387.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashgather_b | pk_cashgather_b | pk_cashgather_b | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | busidate | busidate | busidate | char(19) |
| 4 | busioperator | busioperator | busioperator | varchar2(20) |  |  | '~' |
| 5 | busitime | busitime | busitime | char(19) |
| 6 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 7 | glcamount | glcamount | glcamount | number(28, 8) |
| 8 | glcrate | glcrate | glcrate | number(15, 8) |
| 9 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 10 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 11 | notenumber | notenumber | notenumber | varchar2(50) |
| 12 | notetype | notetype | notetype | varchar2(20) |  |  | '~' |
| 13 | olcamount | olcamount | olcamount | number(28, 8) |
| 14 | olcrate | olcrate | olcrate | number(15, 8) |
| 15 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 16 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 17 | pk_bankacc | pk_bankacc | pk_bankacc | varchar2(20) |  |  | '~' |
| 18 | pk_cashbankacc | pk_cashbankacc | pk_cashbankacc | varchar2(20) |  |  | '~' |
| 19 | pk_cashgather_h | pk_cashgather_h | pk_cashgather_h | varchar2(20) |  |  | '~' |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_payfinanceorg | pk_payfinanceorg | pk_payfinanceorg | varchar2(20) |  |  | '~' |
| 25 | pk_payfinanceorg_v | pk_payfinanceorg_v | pk_payfinanceorg_v | varchar2(20) |  |  | '~' |
| 26 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 27 | pk_sourcebillid | pk_sourcebillid | pk_sourcebillid | varchar2(20) |  |  | '~' |
| 28 | pk_sourcebillrowid | pk_sourcebillrowid | pk_sourcebillrowid | varchar2(20) |  |  | '~' |
| 29 | remark | remark | remark | varchar2(300) |
| 30 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 31 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 32 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 33 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 34 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 35 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 36 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 37 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 38 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 39 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
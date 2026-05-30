# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheringfund | pk_gatheringfund | pk_gatheringfund | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | billno | billno | billno | varchar2(50) |
| 4 | feeamount | feeamount | feeamount | number(28, 8) |
| 5 | feedirection | feedirection | feedirection | varchar2(50) |
| 6 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 7 | getmode | getmode | getmode | varchar2(30) |
| 8 | glcamount | glcamount | glcamount | number(28, 8) |
| 9 | glcfeeamount | glcfeeamount | glcfeeamount | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(15, 8) |
| 11 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 12 | gllcfeeamount | gllcfeeamount | gllcfeeamount | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 14 | isfees | isfees | isfees | char(1) |
| 15 | memo | memo | memo | varchar2(300) |
| 16 | olcamount | olcamount | olcamount | number(28, 8) |
| 17 | olcfeeamount | olcfeeamount | olcfeeamount | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 20 | pk_bankaccount_r | pk_bankaccount_r | pk_bankaccount_r | varchar2(20) |  |  | '~' |
| 21 | pk_billno | pk_billno | pk_billno | char(20) |  |  | '~' |
| 22 | pk_cashaccount_r | pk_cashaccount_r | pk_cashaccount_r | varchar2(20) |  |  | '~' |
| 23 | pk_gathering | pk_gathering | pk_gathering | char(20) | √ |
| 24 | pk_getplanitem | pk_getplanitem | pk_getplanitem | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | purpose | purpose | purpose | varchar2(300) |
| 30 | relationindex | relationindex | relationindex | number(38, 0) |
| 31 | rowno | rowno | rowno | number(38, 0) |
| 32 | transerial | transerial | transerial | varchar2(50) |
| 33 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 34 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 35 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 36 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 37 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 38 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 39 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 40 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 41 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 42 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
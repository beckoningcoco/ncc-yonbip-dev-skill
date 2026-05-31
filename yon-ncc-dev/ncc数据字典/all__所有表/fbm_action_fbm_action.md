# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8177.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_action | pk_action | pk_action | char(20) | √ |
| 2 | actioncode | actioncode | actioncode | varchar2(30) |
| 3 | actiondate | actiondate | actiondate | char(19) |
| 4 | actionperson | actionperson | actionperson | varchar2(20) |  |  | '~' |
| 5 | beginstatus | beginstatus | beginstatus | varchar2(30) |
| 6 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 7 | endstatus | endstatus | endstatus | varchar2(30) |
| 8 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 9 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(28, 8) |
| 11 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 13 | isnew | isnew | isnew | char(1) |
| 14 | keepunitname | keepunitname | keepunitname | varchar2(300) |
| 15 | money | money | money | number(28, 8) |
| 16 | note | note | note | varchar2(200) |
| 17 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(28, 8) |
| 19 | pk_bill | pk_bill | pk_bill | char(20) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_register | pk_register | pk_register | char(20) |
| 24 | serialnum | serialnum | serialnum | number(38, 0) |
| 25 | servertime | servertime | servertime | char(19) |
| 26 | vbillno | vbillno | vbillno | varchar2(50) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
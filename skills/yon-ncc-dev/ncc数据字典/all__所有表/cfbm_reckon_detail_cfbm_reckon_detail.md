# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7522.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reckon_detail | pk_reckon_detail | pk_reckon_detail | char(20) | √ |
| 2 | bill_enddate | bill_enddate | bill_enddate | char(19) |
| 3 | busidate | busidate | busidate | char(19) |
| 4 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 5 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 6 | glcrate | glcrate | glcrate | number(28, 8) |
| 7 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 8 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 9 | isliquid | isliquid | isliquid | varchar2(50) |
| 10 | liquidationdate | liquidationdate | liquidationdate | char(19) |
| 11 | money | money | money | number(28, 8) |
| 12 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 13 | olcrate | olcrate | olcrate | number(28, 8) |
| 14 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 15 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 16 | pk_fundorg_v | pk_fundorg_v | pk_fundorg_v | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 20 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 21 | reckon_direction | reckon_direction | reckon_direction | number(38, 0) |
| 22 | srcbusiness | srcbusiness | srcbusiness | number(38, 0) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
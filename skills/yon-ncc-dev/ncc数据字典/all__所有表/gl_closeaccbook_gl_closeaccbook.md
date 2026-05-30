# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8447.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closeaccbook | pk_closeaccbook | pk_closeaccbook | char(20) | √ |
| 2 | closetime | closetime | closetime | char(19) |
| 3 | closeuser | closeuser | closeuser | char(20) |
| 4 | isclose | isclose | isclose | char(1) |
| 5 | ispreclose | ispreclose | ispreclose | char(1) |
| 6 | period | period | period | varchar2(50) |
| 7 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 8 | pk_group | pk_group | pk_group | char(20) |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 11 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 12 | preclosetime | preclosetime | preclosetime | char(19) |
| 13 | precloseuser | precloseuser | precloseuser | char(20) |
| 14 | unclosetime | unclosetime | unclosetime | char(19) |
| 15 | uncloseuser | uncloseuser | uncloseuser | char(40) |
| 16 | unpreclosetime | unpreclosetime | unpreclosetime | char(19) |
| 17 | unprecloseuser | unprecloseuser | unprecloseuser | char(20) |
| 18 | year | year | year | varchar2(50) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | char(20) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | char(20) |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
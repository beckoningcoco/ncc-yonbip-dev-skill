# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12910.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxset | pk_wa_taxset | pk_wa_taxset | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | displayorder | displayorder | displayorder | number(38, 0) |
| 4 | iitemtype | iitemtype | iitemtype | number(38, 0) |
| 5 | mustitemflag | mustitemflag | mustitemflag | char(1) |
| 6 | name | name | name | varchar2(200) |
| 7 | name2 | name2 | name2 | varchar2(200) |
| 8 | name3 | name3 | name3 | varchar2(200) |
| 9 | name4 | name4 | name4 | varchar2(200) |
| 10 | name5 | name5 | name5 | varchar2(200) |
| 11 | name6 | name6 | name6 | varchar2(200) |
| 12 | pk_wa_taxsetbase | pk_wa_taxsetbase | pk_wa_taxsetbase | varchar2(100) |
| 13 | sourceformula | sourceformula | sourceformula | varchar2(250) |
| 14 | sourceformulastr | sourceformulastr | sourceformulastr | varchar2(300) |
| 15 | sourcetype | sourcetype | sourcetype | number(38, 0) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
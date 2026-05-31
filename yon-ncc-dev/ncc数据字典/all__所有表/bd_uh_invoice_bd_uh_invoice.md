# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7164.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice | pk_invoice | pk_invoice | char(20) | √ |
| 2 | itemcode | itemcode | itemcode | varchar2(50) |
| 3 | itemname | itemname | itemname | varchar2(200) |
| 4 | itemname2 | itemname2 | itemname2 | varchar2(200) |
| 5 | itemname3 | itemname3 | itemname3 | varchar2(200) |
| 6 | itemname4 | itemname4 | itemname4 | varchar2(200) |
| 7 | itemname5 | itemname5 | itemname5 | varchar2(200) |
| 8 | itemname6 | itemname6 | itemname6 | varchar2(200) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
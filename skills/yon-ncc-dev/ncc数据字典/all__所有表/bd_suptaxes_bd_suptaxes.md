# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7095.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_suptaxes | pk_suptaxes | pk_suptaxes | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | remarks | remarks | remarks | varchar2(1024) |
| 6 | suppliercode | suppliercode | suppliercode | varchar2(40) |
| 7 | suppliername | suppliername | suppliername | varchar2(300) |
| 8 | suppliername2 | suppliername2 | suppliername2 | varchar2(300) |
| 9 | suppliername3 | suppliername3 | suppliername3 | varchar2(300) |
| 10 | suppliername4 | suppliername4 | suppliername4 | varchar2(300) |
| 11 | suppliername5 | suppliername5 | suppliername5 | varchar2(300) |
| 12 | suppliername6 | suppliername6 | suppliername6 | varchar2(300) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
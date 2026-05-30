# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxrate | pk_taxrate | pk_taxrate | char(20) | √ |
| 2 | enddate | enddate | enddate | char(19) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_taxkind | pk_taxkind | pk_taxkind | char(20) | √ |
| 7 | startdate | startdate | startdate | char(19) |
| 8 | taxdigit | taxdigit | taxdigit | number(38, 0) |
| 9 | taxrate | taxrate | taxrate | number(28, 8) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
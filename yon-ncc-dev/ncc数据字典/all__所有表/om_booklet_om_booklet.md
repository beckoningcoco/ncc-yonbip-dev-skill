# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10100.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_booklet | pk_booklet | pk_booklet | char(20) | √ |
| 2 | bookletcode | bookletcode | bookletcode | varchar2(50) |
| 3 | bookletname | bookletname | bookletname | varchar2(300) |
| 4 | bookletname2 | bookletname2 | bookletname2 | varchar2(300) |
| 5 | bookletname3 | bookletname3 | bookletname3 | varchar2(300) |
| 6 | bookletname4 | bookletname4 | bookletname4 | varchar2(300) |
| 7 | bookletname5 | bookletname5 | bookletname5 | varchar2(300) |
| 8 | bookletname6 | bookletname6 | bookletname6 | varchar2(300) |
| 9 | booklet_text | booklet_text | booklet_text | blob |
| 10 | booklet_type | booklet_type | booklet_type | number(38, 0) |
| 11 | booklet_xml | booklet_xml | booklet_xml | blob |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) | √ |
| 15 | creator | creator | creator | char(20) | √ |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
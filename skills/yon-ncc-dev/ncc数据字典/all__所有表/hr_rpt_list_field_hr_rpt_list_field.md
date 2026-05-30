# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_field | pk_rpt_field | pk_rpt_field | char(20) | √ |
| 2 | fieldcode | fieldcode | fieldcode | varchar2(70) |
| 3 | fieldname | fieldname | fieldname | varchar2(384) |
| 4 | isdisplay | isdisplay | isdisplay | char(1) |
| 5 | pk_flddict | pk_flddict | pk_flddict | char(20) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_rpt_def | pk_rpt_def | pk_rpt_def | char(20) |
| 9 | showorder | showorder | showorder | number(38, 0) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | char(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | char(20) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
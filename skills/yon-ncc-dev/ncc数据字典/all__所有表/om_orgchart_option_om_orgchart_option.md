# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgchart_op | pk_orgchart_op | pk_orgchart_op | char(20) | √ |
| 2 | optionname | optionname | optionname | varchar2(128) |
| 3 | optionvalue | optionvalue | optionvalue | varchar2(200) |
| 4 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 5 | creationtime | creationtime | creationtime | char(19) |
| 6 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 9 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
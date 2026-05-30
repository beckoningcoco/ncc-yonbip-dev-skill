# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nodeuser | pk_nodeuser | pk_nodeuser | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | pk_schema | pk_schema | pk_schema | char(20) |
| 5 | pk_user | pk_user | pk_user | char(20) |
| 6 | creationtime | creationtime | creationtime | char(19) |
| 7 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 10 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
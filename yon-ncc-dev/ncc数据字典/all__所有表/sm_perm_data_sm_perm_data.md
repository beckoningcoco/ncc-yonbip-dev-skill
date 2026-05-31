# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11611.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm_config | pk_perm_config | pk_perm_config | char(20) | √ |
| 2 | datapermtype | datapermtype | datapermtype | number(38, 0) |
| 3 | operationcode | operationcode | operationcode | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | resourceid | resourceid | resourceid | varchar2(50) |
| 6 | ruleid | ruleid | ruleid | varchar2(50) |
| 7 | subjectid | subjectid | subjectid | varchar2(50) |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
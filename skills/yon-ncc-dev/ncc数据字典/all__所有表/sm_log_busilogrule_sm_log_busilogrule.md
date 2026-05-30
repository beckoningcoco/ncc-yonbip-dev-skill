# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11569.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiconfig | pk_busiconfig | pk_busiconfig | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | ismust | ismust | ismust | char(1) |
| 4 | moduleid | moduleid | moduleid | varchar2(20) |
| 5 | oper_name | oper_name | oper_name | varchar2(250) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_metadata | pk_metadata | pk_metadata | varchar2(36) |  |  | '~' |
| 8 | pk_operation | pk_operation | pk_operation | varchar2(36) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
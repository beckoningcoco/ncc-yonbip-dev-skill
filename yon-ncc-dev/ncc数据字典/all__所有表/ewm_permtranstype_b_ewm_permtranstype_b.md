# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype_b | pk_transtype_b | pk_transtype_b | char(20) | √ |
| 2 | perm_statustype | perm_statustype | perm_statustype | number(38, 0) |
| 3 | pk_permitstatus | pk_permitstatus | pk_permitstatus | varchar2(20) |  |  | '~' |
| 4 | pk_transtype | pk_transtype | pk_transtype | char(20) | √ |
| 5 | print_flag | print_flag | print_flag | char(1) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
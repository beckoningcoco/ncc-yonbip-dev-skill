# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_templaterow | pk_templaterow | pk_templaterow | char(20) | √ |
| 2 | desentity | desentity | desentity | varchar2(36) |  |  | '~' |
| 3 | fk_templaterow | fk_templaterow | fk_templaterow | varchar2(20) |  |  | '~' |
| 4 | pk_transtemplate | pk_transtemplate | pk_transtemplate | varchar2(50) |
| 5 | rowindex | rowindex | rowindex | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_processed | pk_user_processed | pk_user_processed | char(20) | √ |
| 2 | cuserid | cuserid | cuserid | varchar2(20) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | toprocesstype | toprocesstype | toprocesstype | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
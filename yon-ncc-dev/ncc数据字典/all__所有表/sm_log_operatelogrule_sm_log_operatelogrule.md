# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11573.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operateconfig | pk_operateconfig | pk_operateconfig | char(20) | √ |
| 2 | pk_funcnode | pk_funcnode | pk_funcnode | varchar2(36) |  |  | '~' |
| 3 | pk_group | pk_group | pk_group | varchar2(36) |  |  | '~' |
| 4 | syscode | syscode | syscode | varchar2(20) |
| 5 | type | type | type | varchar2(1) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
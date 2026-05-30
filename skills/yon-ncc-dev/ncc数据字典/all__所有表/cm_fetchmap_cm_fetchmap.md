# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7622.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | fetchmap | fetchmap | fetchmap | char(20) | √ |
| 2 | beditable | beditable | beditable | char(1) |
| 3 | ibilltype | ibilltype | ibilltype | number(38, 0) |
| 4 | ifetchmaptype | ifetchmaptype | ifetchmaptype | number(38, 0) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | vsourcefield | vsourcefield | vsourcefield | varchar2(101) |
| 9 | vtargetfield | vtargetfield | vtargetfield | varchar2(101) |
| 10 | vtargetfieldcode | vtargetfieldcode | vtargetfieldcode | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
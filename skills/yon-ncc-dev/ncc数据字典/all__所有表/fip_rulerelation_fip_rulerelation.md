# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rulerelation | pk_rulerelation | pk_rulerelation | char(20) | √ |
| 2 | des_billtype | des_billtype | des_billtype | varchar2(20) |  |  | '~' |
| 3 | pk_ruleregister | pk_ruleregister | pk_ruleregister | varchar2(20) |  |  | '~' |
| 4 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 5 | def1 | def1 | def1 | varchar2(50) |
| 6 | def2 | def2 | def2 | varchar2(50) |
| 7 | def3 | def3 | def3 | varchar2(50) |
| 8 | def4 | def4 | def4 | varchar2(50) |
| 9 | def5 | def5 | def5 | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
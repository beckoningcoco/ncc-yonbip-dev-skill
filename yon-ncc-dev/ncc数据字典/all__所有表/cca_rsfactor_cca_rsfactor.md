# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rsfactor | pk_rsfactor | pk_rsfactor | char(20) | √ |
| 2 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 3 | pk_allocruleset | pk_allocruleset | pk_allocruleset | varchar2(20) |
| 4 | pk_cfactorid | pk_cfactorid | pk_cfactorid | varchar2(20) |  |  | '~' |
| 5 | pk_rulesection | pk_rulesection | pk_rulesection | char(20) | √ |
| 6 | type | type | type | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
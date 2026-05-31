# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7421.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rsassitem | pk_rsassitem | pk_rsassitem | char(20) | √ |
| 2 | pk_accassitem | pk_accassitem | pk_accassitem | varchar2(20) |  |  | '~' |
| 3 | pk_allocruleset | pk_allocruleset | pk_allocruleset | varchar2(20) |
| 4 | pk_rulesection | pk_rulesection | pk_rulesection | char(20) | √ |
| 5 | type | type | type | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
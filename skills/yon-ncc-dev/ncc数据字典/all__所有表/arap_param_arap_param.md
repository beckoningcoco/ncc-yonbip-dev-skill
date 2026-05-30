# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6587.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | param_pk | param_pk | param_pk | char(20) | √ |
| 2 | param_code | param_code | param_code | varchar2(20) |
| 3 | param_name | param_name | param_name | varchar2(128) |
| 4 | param_value | param_value | param_value | char(128) |
| 5 | pk_org | pk_org | pk_org | char(20) |
| 6 | scomment | scomment | scomment | varchar2(128) |
| 7 | syscode | syscode | syscode | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
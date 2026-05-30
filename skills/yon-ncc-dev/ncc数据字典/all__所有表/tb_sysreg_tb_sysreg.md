# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysreg | pk_sysreg | pk_sysreg | char(20) | √ |
| 2 | syscode | syscode | syscode | varchar2(20) |
| 3 | sysname | sysname | sysname | varchar2(50) |
| 4 | sysregclass | sysregclass | sysregclass | varchar2(100) |
| 5 | systype | systype | systype | char(1) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
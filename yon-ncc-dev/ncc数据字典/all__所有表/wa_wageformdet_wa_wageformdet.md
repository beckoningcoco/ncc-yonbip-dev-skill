# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12918.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_wageformdet | pk_wa_wageformdet | pk_wa_wageformdet | char(20) | √ |
| 2 | ilevel | ilevel | ilevel | number(38, 0) | √ |
| 3 | nvalue | nvalue | nvalue | number(31, 8) | √ |
| 4 | pk_wa_wageform | pk_wa_wageform | pk_wa_wageform | varchar2(20) | √ |
| 5 | vformula | vformula | vformula | varchar2(1000) |
| 6 | vformulastr | vformulastr | vformulastr | varchar2(1000) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
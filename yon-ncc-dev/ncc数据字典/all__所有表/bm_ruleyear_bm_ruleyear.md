# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7362.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruleyear | pk_ruleyear | pk_ruleyear | char(20) | √ |
| 2 | avgsalary | avgsalary | avgsalary | number(31, 8) |
| 3 | effectiveyear | effectiveyear | effectiveyear | char(4) |
| 4 | lowestsalary | lowestsalary | lowestsalary | number(31, 8) |
| 5 | pk_loctrule | pk_loctrule | pk_loctrule | char(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
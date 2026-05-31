# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | code | code | code | varchar2(15) | √ |
| 2 | name | name | name | varchar2(64) |
| 3 | providerclass | providerclass | providerclass | varchar2(200) |
| 4 | traceclass | traceclass | traceclass | varchar2(200) |
| 5 | wizardclass | wizardclass | wizardclass | varchar2(200) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
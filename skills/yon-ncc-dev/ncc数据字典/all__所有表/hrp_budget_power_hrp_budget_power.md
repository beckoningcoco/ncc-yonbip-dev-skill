# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_power | pk_budget_power | pk_budget_power | char(20) | √ |
| 2 | pk_childorg | pk_childorg | pk_childorg | char(20) |
| 3 | pk_group | pk_group | pk_group | char(20) |
| 4 | pk_org | pk_org | pk_org | char(20) |
| 5 | creationtime | creationtime | creationtime | char(19) | √ |
| 6 | creator | creator | creator | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 9 | modifier | modifier | modifier | char(20) |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
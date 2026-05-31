# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8762.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | datasource | datasource | datasource | number(38, 0) |
| 2 | deptyear | deptyear | deptyear | char(4) |
| 3 | dept_version | dept_version | dept_version | number(38, 0) |
| 4 | isreleased | isreleased | isreleased | char(1) |
| 5 | period | period | period | char(2) |
| 6 | pk_budget_deptperiod | pk_budget_deptperiod | pk_budget_deptperiod | char(20) | √ |
| 7 | pk_dept | pk_dept | pk_dept | char(20) | √ |
| 8 | pk_fathermember | pk_fathermember | pk_fathermember | char(20) |
| 9 | pk_group | pk_group | pk_group | char(20) | √ |
| 10 | pk_org | pk_org | pk_org | char(20) | √ |
| 11 | pk_vid | pk_vid | pk_vid | char(20) |
| 12 | creationtime | creationtime | creationtime | char(19) | √ |
| 13 | creator | creator | creator | char(20) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | char(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
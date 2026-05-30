# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | description | description | description | varchar2(1536) |
| 3 | devorg | devorg | devorg | varchar2(20) |
| 4 | fixcondition | fixcondition | fixcondition | varchar2(2000) |
| 5 | fixquerytree | fixquerytree | fixquerytree | blob |
| 6 | layer | layer | layer | number(38, 0) |
| 7 | metaclass | metaclass | metaclass | varchar2(200) |
| 8 | model_code | model_code | model_code | varchar2(65) |
| 9 | model_name | model_name | model_name | varchar2(113) |
| 10 | node_code | node_code | node_code | varchar2(60) | √ |
| 11 | parentid | parentid | parentid | varchar2(20) |
| 12 | pk_corp | pk_corp | pk_corp | varchar2(20) | √ |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |
| 14 | resid | resid | resid | varchar2(50) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
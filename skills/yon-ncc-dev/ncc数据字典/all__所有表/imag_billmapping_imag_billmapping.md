# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9228.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mapping | pk_mapping | pk_mapping | varchar2(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(50) |
| 3 | next_mapping | next_mapping | next_mapping | varchar2(20) |
| 4 | pk_factory | pk_factory | pk_factory | varchar2(20) |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |
| 6 | servicetype | servicetype | servicetype | varchar2(50) |
| 7 | sign | sign | sign | varchar2(32) |
| 8 | transitype | transitype | transitype | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
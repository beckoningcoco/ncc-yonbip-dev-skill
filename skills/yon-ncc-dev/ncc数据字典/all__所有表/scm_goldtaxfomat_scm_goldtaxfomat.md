# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | code | code | code | varchar2(20) |
| 2 | ishead | ishead | ishead | char(1) |
| 3 | isselected | isselected | isselected | char(1) |
| 4 | name | name | name | varchar2(200) |
| 5 | pk_goldtaxformat | pk_goldtaxformat | pk_goldtaxformat | char(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 7 | showorder | showorder | showorder | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
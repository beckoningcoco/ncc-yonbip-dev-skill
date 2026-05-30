# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10985.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_templet | pk_templet | pk_templet | char(20) | √ |
| 2 | node_code | node_code | node_code | varchar2(65) | √ |
| 3 | node_name | node_name | node_name | varchar2(75) | √ |
| 4 | parent_code | parent_code | parent_code | varchar2(60) |
| 5 | pk_corp | pk_corp | pk_corp | char(20) | √ |
| 6 | printinfo | printinfo | printinfo | varchar2(1000) |
| 7 | resid | resid | resid | varchar2(30) |
| 8 | subhead | subhead | subhead | varchar2(75) |
| 9 | vdescribe | vdescribe | vdescribe | varchar2(100) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
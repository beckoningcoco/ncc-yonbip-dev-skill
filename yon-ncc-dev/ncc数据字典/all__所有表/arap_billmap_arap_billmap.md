# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6576.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billmap | pk_billmap | pk_billmap | varchar2(50) | √ |
| 2 | ismanual | ismanual | ismanual | char(1) |
| 3 | maptype | maptype | maptype | number(38, 0) |
| 4 | oldje | oldje | oldje | number(28, 8) |
| 5 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | pk_org1 | pk_org1 | pk_org1 | varchar2(20) |
| 8 | settlecurr | settlecurr | settlecurr | varchar2(20) |
| 9 | settlemoney | settlemoney | settlemoney | number(28, 8) |
| 10 | s_billid | s_billid | s_billid | varchar2(20) |
| 11 | s_billtype | s_billtype | s_billtype | varchar2(20) |
| 12 | s_itemid | s_itemid | s_itemid | varchar2(20) |
| 13 | s_system | s_system | s_system | number(38, 0) |
| 14 | s_termid | s_termid | s_termid | varchar2(20) |
| 15 | t_billid | t_billid | t_billid | varchar2(20) |
| 16 | t_billtype | t_billtype | t_billtype | varchar2(20) |
| 17 | t_itemid | t_itemid | t_itemid | varchar2(20) |
| 18 | t_termid | t_termid | t_termid | varchar2(20) |
| 19 | ybje | ybje | ybje | number(28, 8) |
| 20 | ybye | ybye | ybye | number(28, 8) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
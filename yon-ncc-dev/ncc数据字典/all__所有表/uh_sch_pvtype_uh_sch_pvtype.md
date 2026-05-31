# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12785.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schpvtype | pk_schpvtype | pk_schpvtype | char(20) | √ |
| 2 | count_limit | count_limit | count_limit | number(38, 0) |
| 3 | count_used | count_used | count_used | number(38, 0) |
| 4 | pk_group | pk_group | pk_group | varchar2(50) |
| 5 | pk_org | pk_org | pk_org | varchar2(50) |
| 6 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(50) |
| 7 | pk_sch | pk_sch | pk_sch | varchar2(50) |
| 8 | stopflag | stopflag | stopflag | char(1) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
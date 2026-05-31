# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11792.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_targetbill_b | pk_targetbill_b | pk_targetbill_b | char(20) | √ |
| 2 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |
| 3 | cmardimenid | cmardimenid | cmardimenid | varchar2(20) |
| 4 | ctargetitemid | ctargetitemid | ctargetitemid | varchar2(20) |
| 5 | nrealyearvalue | nrealyearvalue | nrealyearvalue | number(28, 8) |
| 6 | ntargetvalue | ntargetvalue | ntargetvalue | number(28, 8) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_targetbill | pk_targetbill | pk_targetbill | char(20) | √ |
| 9 | vperiod | vperiod | vperiod | varchar2(20) |
| 10 | vtargetkey | vtargetkey | vtargetkey | varchar2(60) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
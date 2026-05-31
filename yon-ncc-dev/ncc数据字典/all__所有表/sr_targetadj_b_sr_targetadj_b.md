# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11790.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_targetadj_b | pk_targetadj_b | pk_targetadj_b | char(20) | √ |
| 2 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |
| 3 | cmarsetid | cmarsetid | cmarsetid | varchar2(20) |
| 4 | ctargetitemid | ctargetitemid | ctargetitemid | varchar2(50) |
| 5 | nnewrealyearval | nnewrealyearval | nnewrealyearval | number(28, 8) |
| 6 | nnewtargetvalue | nnewtargetvalue | nnewtargetvalue | number(28, 8) |
| 7 | noldrealyearval | noldrealyearval | noldrealyearval | number(28, 8) |
| 8 | noldtargetvalue | noldtargetvalue | noldtargetvalue | number(28, 8) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_targetadj | pk_targetadj | pk_targetadj | char(20) | √ |
| 11 | vnewtargetkey | vnewtargetkey | vnewtargetkey | varchar2(50) |
| 12 | voldtargetkey | voldtargetkey | voldtargetkey | varchar2(60) |
| 13 | vperiod | vperiod | vperiod | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
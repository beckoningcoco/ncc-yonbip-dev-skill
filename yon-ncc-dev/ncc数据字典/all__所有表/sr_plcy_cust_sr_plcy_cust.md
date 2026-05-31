# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11768.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_cust | pk_plcy_cust | pk_plcy_cust | varchar2(20) | √ |
| 2 | bremoveflag | bremoveflag | bremoveflag | char(1) |
| 3 | ccustbaseclassid | ccustbaseclassid | ccustbaseclassid | varchar2(20) |
| 4 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |
| 5 | ccustsaleclassid | ccustsaleclassid | ccustsaleclassid | varchar2(20) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |
| 7 | pk_plcy | pk_plcy | pk_plcy | char(20) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
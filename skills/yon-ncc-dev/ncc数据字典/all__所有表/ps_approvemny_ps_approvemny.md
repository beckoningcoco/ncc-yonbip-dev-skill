# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10842.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approvemny | pk_approvemny | pk_approvemny | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvemny | approvemny | approvemny | number(28, 8) |
| 4 | approvenote | approvenote | approvenote | varchar2(181) |
| 5 | approver | approver | approver | char(20) |
| 6 | pk_plandetail | pk_plandetail | pk_plandetail | char(20) |
| 7 | pk_planperiod | pk_planperiod | pk_planperiod | char(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
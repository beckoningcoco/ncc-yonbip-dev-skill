# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11716.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csaleorderid | csaleorderid | csaleorderid | char(20) | √ |
| 2 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |
| 3 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |
| 4 | dbilldate | dbilldate | dbilldate | char(19) |
| 5 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |
| 8 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
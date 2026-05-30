# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12000.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | allownotleafinput | allownotleafinput | allownotleafinput | char(1) |
| 3 | dimindex | dimindex | dimindex | number(38, 0) | √ |  | 0 |
| 4 | pkcube | pkcube | pkcube | char(20) | √ |
| 5 | pkdimhier | pkdimhier | pkdimhier | char(20) | √ |
| 6 | pkdimmember | pkdimmember | pkdimmember | char(128) |
| 7 | sumflag | sumflag | sumflag | char(1) |
| 8 | sumindex | sumindex | sumindex | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
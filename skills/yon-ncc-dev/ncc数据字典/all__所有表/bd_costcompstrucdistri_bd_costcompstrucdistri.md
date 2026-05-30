# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6818.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distribute | pk_distribute | pk_distribute | char(20) | √ |
| 2 | distriorg | distriorg | distriorg | varchar2(20) |  |  | '~' |
| 3 | distriorg_v | distriorg_v | distriorg_v | varchar2(20) |  |  | '~' |
| 4 | pk_book | pk_book | pk_book | varchar2(20) |  |  | '~' |
| 5 | pk_costcompstruc | pk_costcompstruc | pk_costcompstruc | char(20) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
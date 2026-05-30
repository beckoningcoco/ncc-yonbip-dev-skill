# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7782.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batrange_b | pk_batrange_b | pk_batrange_b | char(20) | √ |
| 2 | ilevel | ilevel | ilevel | number(38, 0) |
| 3 | nrangefrom | nrangefrom | nrangefrom | number(28, 8) |
| 4 | nrangeto | nrangeto | nrangeto | number(28, 8) |
| 5 | pk_batrange | pk_batrange | pk_batrange | char(20) | √ |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | vrangename | vrangename | vrangename | varchar2(200) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
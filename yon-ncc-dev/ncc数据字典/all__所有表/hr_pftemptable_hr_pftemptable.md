# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8825.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tag | pk_tag | pk_tag | char(20) | √ |
| 2 | double1 | double1 | double1 | number(16, 4) |
| 3 | double2 | double2 | double2 | number(16, 4) |
| 4 | int1 | int1 | int1 | number(38, 0) |
| 5 | int2 | int2 | int2 | number(38, 0) |
| 6 | in_pk | in_pk | in_pk | varchar2(500) | √ |
| 7 | in_pk2 | in_pk2 | in_pk2 | varchar2(80) |
| 8 | in_pk3 | in_pk3 | in_pk3 | varchar2(80) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
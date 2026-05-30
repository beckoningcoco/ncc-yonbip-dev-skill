# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12106.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map | pk_map | pk_map | char(20) | √ |
| 2 | checkvalid | checkvalid | checkvalid | varchar2(20) |
| 3 | operator | operator | operator | varchar2(20) |
| 4 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(20) | √ |
| 5 | pk_levelvalue | pk_levelvalue | pk_levelvalue | varchar2(20) |
| 6 | pk_sysdoc | pk_sysdoc | pk_sysdoc | varchar2(40) | √ |
| 7 | pk_sysdocmember | pk_sysdocmember | pk_sysdocmember | varchar2(100) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
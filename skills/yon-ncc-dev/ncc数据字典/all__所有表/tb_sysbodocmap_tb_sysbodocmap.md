# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12101.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bomap | pk_bomap | pk_bomap | char(20) | √ |
| 2 | checkvalid | checkvalid | checkvalid | varchar2(20) |
| 3 | datacolname | datacolname | datacolname | varchar2(20) | √ |
| 4 | operator | operator | operator | varchar2(20) |
| 5 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(20) | √ |
| 6 | pk_levelvalue | pk_levelvalue | pk_levelvalue | varchar2(20) |
| 7 | pk_sysbo | pk_sysbo | pk_sysbo | varchar2(20) | √ |
| 8 | pk_sysdoc | pk_sysdoc | pk_sysdoc | varchar2(40) | √ |
| 9 | pk_sysdocmember | pk_sysdocmember | pk_sysdocmember | varchar2(100) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
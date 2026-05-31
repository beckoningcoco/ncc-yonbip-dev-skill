# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6658.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custom | pk_custom | pk_custom | char(20) | √ |
| 2 | busisys | busisys | busisys | varchar2(20) |  |  | '~' |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_levelvalue | pk_levelvalue | pk_levelvalue | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_user | pk_user | pk_user | varchar2(50) |
| 7 | ref_flag | ref_flag | ref_flag | varchar2(40) |
| 8 | value | value | value | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
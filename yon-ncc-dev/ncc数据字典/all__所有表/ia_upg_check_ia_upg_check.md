# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8985.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cupgcheckid | cupgcheckid | cupgcheckid | char(20) | √ |
| 2 | bcanignore | bcanignore | bcanignore | char(1) |
| 3 | fcheckresultflag | fcheckresultflag | fcheckresultflag | number(38, 0) |
| 4 | fchecktypeflag | fchecktypeflag | fchecktypeflag | number(38, 0) |
| 5 | fdealresultflag | fdealresultflag | fdealresultflag | number(38, 0) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
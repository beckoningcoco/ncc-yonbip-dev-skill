# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiclass_b | pk_busiclass_b | pk_busiclass_b | char(20) | √ |
| 2 | pk_busiclass | pk_busiclass | pk_busiclass | char(20) | √ |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | showflag | showflag | showflag | char(1) |  |  | 'Y' |
| 5 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 6 | transtypename | transtypename | transtypename | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
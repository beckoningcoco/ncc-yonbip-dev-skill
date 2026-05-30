# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_periodstate | pk_periodstate | pk_periodstate | char(20) | √ |
| 2 | accountmark | accountmark | accountmark | char(1) | √ |  | 'N' |
| 3 | checkflag | checkflag | checkflag | char(1) | √ |  | 'N' |
| 4 | daccountdate | daccountdate | daccountdate | char(10) |
| 5 | enableflag | enableflag | enableflag | char(1) |
| 6 | operatorid | operatorid | operatorid | char(20) |
| 7 | pk_bm_class | pk_bm_class | pk_bm_class | char(20) | √ |
| 8 | pk_bm_period | pk_bm_period | pk_bm_period | varchar2(20) | √ |
| 9 | pk_group | pk_group | pk_group | char(20) | √ |
| 10 | pk_org | pk_org | pk_org | char(20) | √ |
| 11 | recacuflag | recacuflag | recacuflag | char(1) | √ |  | 'N' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
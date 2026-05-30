# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9153.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transconfig | pk_transconfig | pk_transconfig | char(20) | √ |
| 2 | ftranstype | ftranstype | ftranstype | number(38, 0) |
| 3 | icycle | icycle | icycle | number(38, 0) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
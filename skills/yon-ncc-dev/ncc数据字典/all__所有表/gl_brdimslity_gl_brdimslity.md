# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8439.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_brmapping | pk_brmapping | pk_brmapping | char(20) | √ |
| 2 | accitemvalue | accitemvalue | accitemvalue | varchar2(20) |  |  | '~' |
| 3 | brmap | brmap | brmap | char(20) | √ |
| 4 | linenum | linenum | linenum | number(38, 0) |
| 5 | pk_brrelation | pk_brrelation | pk_brrelation | varchar2(36) |  |  | '~' |
| 6 | pk_classid | pk_classid | pk_classid | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
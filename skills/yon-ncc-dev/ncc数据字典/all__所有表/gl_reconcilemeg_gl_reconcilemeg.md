# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8537.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilemeg | pk_reconcilemeg | pk_reconcilemeg | char(20) | √ |
| 2 | isemail | isemail | isemail | char(1) |
| 3 | ismobile | ismobile | ismobile | char(1) |
| 4 | ismsgcenter | ismsgcenter | ismsgcenter | char(1) |
| 5 | pk_reconcilerule | pk_reconcilerule | pk_reconcilerule | varchar2(20) |  |  | '~' |
| 6 | pk_role | pk_role | pk_role | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
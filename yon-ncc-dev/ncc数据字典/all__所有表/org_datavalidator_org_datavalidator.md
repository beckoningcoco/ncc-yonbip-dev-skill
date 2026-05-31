# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgvalidate | pk_orgvalidate | pk_orgvalidate | varchar2(50) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | memo | memo | memo | varchar2(300) |
| 4 | pk_opertype | pk_opertype | pk_opertype | varchar2(20) |  |  | '~' |
| 5 | pk_orgtype | pk_orgtype | pk_orgtype | char(20) | √ |
| 6 | validatorclass | validatorclass | validatorclass | varchar2(100) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
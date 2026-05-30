# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10909.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiclass | pk_busiclass | pk_busiclass | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(40) | √ |
| 3 | classname | classname | classname | varchar2(100) |
| 4 | isbefore | isbefore | isbefore | char(1) | √ |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 6 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 7 | pk_businesstype | pk_businesstype | pk_businesstype | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
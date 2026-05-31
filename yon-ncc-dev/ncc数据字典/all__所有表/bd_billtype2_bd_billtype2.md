# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6768.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | classname | classname | classname | varchar2(128) | √ |
| 2 | classtype | classtype | classtype | number(38, 0) | √ |
| 3 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 4 | code | code | code | varchar2(30) |
| 5 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
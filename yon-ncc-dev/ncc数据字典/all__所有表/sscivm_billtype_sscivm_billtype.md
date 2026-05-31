# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | sscivmbilltypeid | sscivmbilltypeid | sscivmbilltypeid | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(20) |
| 3 | isatuo_invoice | isatuo_invoice | isatuo_invoice | char(2) |
| 4 | isatuo_submit | isatuo_submit | isatuo_submit | char(2) |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8384.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agentacccfg | pk_agentacccfg | pk_agentacccfg | char(20) | √ |
| 2 | billstatus | billstatus | billstatus | number(38, 0) |
| 3 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 4 | confirmer | confirmer | confirmer | varchar2(20) |  |  | '~' |
| 5 | confirmtime | confirmtime | confirmtime | char(19) |
| 6 | enablestate | enablestate | enablestate | number(38, 0) |
| 7 | isallunit | isallunit | isallunit | char(1) |
| 8 | pk_bankaccount | pk_bankaccount | pk_bankaccount | char(20) | √ |
| 9 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 11 | pk_org | pk_org | pk_org | char(20) | √ |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
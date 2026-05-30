# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11708.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lrgcashmar | pk_lrgcashmar | pk_lrgcashmar | char(20) | √ |
| 2 | carsubtypeid | carsubtypeid | carsubtypeid | varchar2(20) |  |  | '~' |
| 3 | caskunicode | caskunicode | caskunicode | char(10) |
| 4 | cchanneltypeid | cchanneltypeid | cchanneltypeid | varchar2(20) |  |  | '~' |
| 5 | ccustbaseclassid | ccustbaseclassid | ccustbaseclassid | varchar2(20) |  |  | '~' |
| 6 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 7 | customerinnercode | customerinnercode | customerinnercode | varchar2(230) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | saleorginnercode | saleorginnercode | saleorginnercode | varchar2(230) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
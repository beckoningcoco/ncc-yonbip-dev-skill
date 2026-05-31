# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccativitypriceid | ccativitypriceid | ccativitypriceid | char(20) | √ |
| 2 | ccosttypeid | ccosttypeid | ccosttypeid | varchar2(20) |  |  | '~' |
| 3 | ipriceresource | ipriceresource | ipriceresource | number(38, 0) |  |  | 1 |
| 4 | pk_convscheme | pk_convscheme | pk_convscheme | char(20) | √ |
| 5 | priceaddcoefficient | priceaddcoefficient | priceaddcoefficient | number(28, 8) |
| 6 | seqnum | seqnum | seqnum | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
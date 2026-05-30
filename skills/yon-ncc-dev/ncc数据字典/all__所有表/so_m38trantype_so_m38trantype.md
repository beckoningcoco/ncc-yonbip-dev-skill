# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | pk_trantype | pk_trantype | char(20) | √ |
| 2 | barrange | barrange | barrange | char(1) |
| 3 | bmodifyaskedqt | bmodifyaskedqt | bmodifyaskedqt | char(1) |
| 4 | bmodifydiscount | bmodifydiscount | bmodifydiscount | char(1) |
| 5 | bmodifyunaskedqt | bmodifyunaskedqt | bmodifyunaskedqt | char(1) |
| 6 | bmorerows | bmorerows | bmorerows | char(1) |
| 7 | bnofindpricehit | bnofindpricehit | bnofindpricehit | char(1) |
| 8 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 9 | faskqtrule | faskqtrule | faskqtrule | number(38, 0) |  |  | 1 |
| 10 | flargessgetqtrule | flargessgetqtrule | flargessgetqtrule | number(38, 0) |
| 11 | fmodifymny | fmodifymny | fmodifymny | number(38, 0) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |
| 13 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12878.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itemseq | pk_itemseq | pk_itemseq | char(20) | √ |
| 2 | funcode | funcode | funcode | varchar2(50) | √ |
| 3 | idisplayseq | idisplayseq | idisplayseq | number(38, 0) | √ |
| 4 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 5 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 6 | pk_user | pk_user | pk_user | varchar2(20) | √ |
| 7 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) | √ |
| 8 | pk_wa_item | pk_wa_item | pk_wa_item | varchar2(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
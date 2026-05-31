# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8866.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 2 | nassistnum | nassistnum | nassistnum | number(28, 8) |
| 3 | nnum | nnum | nnum | number(28, 8) |
| 4 | nshouldassistnum | nshouldassistnum | nshouldassistnum | number(28, 8) |
| 5 | nshouldnum | nshouldnum | nshouldnum | number(28, 8) |
| 6 | pk_instockdatal | pk_instockdatal | pk_instockdatal | char(20) | √ |
| 7 | pk_outstockdatab | pk_outstockdatab | pk_outstockdatab | char(20) | √ |
| 8 | srclid | srclid | srclid | varchar2(50) |
| 9 | vbarcode | vbarcode | vbarcode | varchar2(128) |
| 10 | vbarcodesub | vbarcodesub | vbarcodesub | varchar2(50) |
| 11 | vboxbarcode | vboxbarcode | vboxbarcode | varchar2(50) |
| 12 | vserialcode | vserialcode | vserialcode | varchar2(128) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
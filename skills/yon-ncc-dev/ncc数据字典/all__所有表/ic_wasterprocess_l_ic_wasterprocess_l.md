# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9181.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgenerallid | cgenerallid | cgenerallid | char(20) | √ |
| 2 | cgeneralbid | cgeneralbid | cgeneralbid | char(20) | √ |
| 3 | cgeneralhid | cgeneralhid | cgeneralhid | char(20) | √ |
| 4 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 5 | corpoid | corpoid | corpoid | varchar2(20) |  |  | '~' |
| 6 | corpvid | corpvid | corpvid | varchar2(20) |
| 7 | nassistnum | nassistnum | nassistnum | number(28, 8) |
| 8 | ngrossnum | ngrossnum | ngrossnum | number(28, 8) |
| 9 | nnum | nnum | nnum | number(28, 8) |
| 10 | nshouldassistnum | nshouldassistnum | nshouldassistnum | number(28, 8) |
| 11 | nshouldnum | nshouldnum | nshouldnum | number(28, 8) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_serialcode | pk_serialcode | pk_serialcode | varchar2(20) |
| 14 | vbarcode | vbarcode | vbarcode | varchar2(128) |
| 15 | vbarcodesub | vbarcodesub | vbarcodesub | varchar2(50) |
| 16 | vboxbarcode | vboxbarcode | vboxbarcode | varchar2(50) |
| 17 | vserialcode | vserialcode | vserialcode | varchar2(128) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
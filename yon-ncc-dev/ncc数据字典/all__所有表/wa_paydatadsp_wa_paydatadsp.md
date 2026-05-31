# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paydatadsp | pk_paydatadsp | pk_paydatadsp | char(20) | √ |
| 2 | bshow | bshow | bshow | char(1) | √ |
| 3 | displayseq | displayseq | displayseq | number(38, 0) |
| 4 | iswaitem | iswaitem | iswaitem | char(1) | √ |
| 5 | item_key | item_key | item_key | varchar2(50) | √ |
| 6 | pk_user | pk_user | pk_user | varchar2(20) |
| 7 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) | √ |
| 8 | type | type | type | varchar2(2) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
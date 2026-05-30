# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inv_ina_relation | pk_inv_ina_relation | pk_inv_ina_relation | char(20) | √ |
| 2 | fpqqlsh | fpqqlsh | fpqqlsh | varchar2(50) |
| 3 | isplitmerge | isplitmerge | isplitmerge | char(1) |
| 4 | pk_invoice | pk_invoice | pk_invoice | varchar2(20) |  |  | '~' |
| 5 | pk_invoicedetail | pk_invoicedetail | pk_invoicedetail | varchar2(20) |  |  | '~' |
| 6 | pk_ivappdetail | pk_ivappdetail | pk_ivappdetail | varchar2(20) |  |  | '~' |
| 7 | pk_ivapplication | pk_ivapplication | pk_ivapplication | varchar2(20) |  |  | '~' |
| 8 | rowno | rowno | rowno | varchar2(11) |
| 9 | xmje | xmje | xmje | number(28, 8) |
| 10 | xmjshj | xmjshj | xmjshj | number(28, 8) |
| 11 | xmsl | xmsl | xmsl | number(28, 8) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
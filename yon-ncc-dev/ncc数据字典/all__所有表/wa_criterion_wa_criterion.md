# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12863.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_crt | pk_wa_crt | pk_wa_crt | char(20) | √ |
| 2 | criterionvalue | criterionvalue | criterionvalue | number(31, 8) |
| 3 | max_value | max_value | max_value | number(31, 8) |  |  | 0 |
| 4 | min_value | min_value | min_value | number(31, 8) |  |  | 0 |
| 5 | pk_wa_gradever | pk_wa_gradever | pk_wa_gradever | varchar2(20) |
| 6 | pk_wa_grd | pk_wa_grd | pk_wa_grd | varchar2(20) |
| 7 | pk_wa_prmlv | pk_wa_prmlv | pk_wa_prmlv | varchar2(20) |
| 8 | pk_wa_seclv | pk_wa_seclv | pk_wa_seclv | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
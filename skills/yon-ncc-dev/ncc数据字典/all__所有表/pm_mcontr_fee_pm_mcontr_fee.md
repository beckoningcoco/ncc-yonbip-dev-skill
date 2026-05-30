# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10638.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mcontr_fee | pk_mcontr_fee | pk_mcontr_fee | char(20) | √ |
| 2 | expset_mny_curr | expset_mny_curr | expset_mny_curr | number(28, 8) |  |  | 0 |
| 3 | expset_mny_global | expset_mny_global | expset_mny_global | number(28, 8) |  |  | 0 |
| 4 | expset_mny_group | expset_mny_group | expset_mny_group | number(28, 8) |  |  | 0 |
| 5 | expset_mny_orig | expset_mny_orig | expset_mny_orig | number(28, 8) |  |  | 0 |
| 6 | memo | memo | memo | varchar2(300) |
| 7 | pk_ct_expset | pk_ct_expset | pk_ct_expset | varchar2(20) |  |  | '~' |
| 8 | pk_mar_contr | pk_mar_contr | pk_mar_contr | char(20) | √ |
| 9 | rowno | rowno | rowno | varchar2(30) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
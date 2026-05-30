# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11066.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpscheme | pk_qpscheme | pk_qpscheme | char(20) | √ |
| 2 | blatest | blatest | blatest | char(1) |
| 3 | bseal | bseal | bseal | char(1) |
| 4 | dbaseprice | dbaseprice | dbaseprice | number(28, 8) |
| 5 | dinvalidate | dinvalidate | dinvalidate | varchar2(19) |
| 6 | dvalidate | dvalidate | dvalidate | varchar2(19) |
| 7 | fcaldatetype | fcaldatetype | fcaldatetype | number(38, 0) |
| 8 | norgtype | norgtype | norgtype | number(38, 0) |
| 9 | nversion | nversion | nversion | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_qpschemebase | pk_qpschemebase | pk_qpschemebase | char(20) |
| 14 | vadjustfrmlcode | vadjustfrmlcode | vadjustfrmlcode | varchar2(996) |
| 15 | vadjustfrmlname | vadjustfrmlname | vadjustfrmlname | varchar2(996) |
| 16 | vcutfrmlcode | vcutfrmlcode | vcutfrmlcode | varchar2(996) |
| 17 | vcutfrmlname | vcutfrmlname | vcutfrmlname | varchar2(996) |
| 18 | vmemo | vmemo | vmemo | varchar2(181) |
| 19 | vschemecode | vschemecode | vschemecode | varchar2(50) |
| 20 | vschemename | vschemename | vschemename | varchar2(300) |
| 21 | vschemename2 | vschemename2 | vschemename2 | varchar2(300) |
| 22 | vschemename3 | vschemename3 | vschemename3 | varchar2(300) |
| 23 | vschemename4 | vschemename4 | vschemename4 | varchar2(300) |
| 24 | vschemename5 | vschemename5 | vschemename5 | varchar2(300) |
| 25 | vschemename6 | vschemename6 | vschemename6 | varchar2(300) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
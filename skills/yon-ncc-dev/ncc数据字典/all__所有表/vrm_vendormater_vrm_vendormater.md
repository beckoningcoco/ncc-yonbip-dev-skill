# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12847.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vendorstock | pk_vendorstock | pk_vendorstock | char(20) | √ |
| 2 | bfrozen | bfrozen | bfrozen | char(1) |
| 3 | bmainvendor | bmainvendor | bmainvendor | char(1) |
| 4 | bnocheck | bnocheck | bnocheck | char(1) |
| 5 | cqualitylevelid | cqualitylevelid | cqualitylevelid | varchar2(20) |  |  | '~' |
| 6 | deligeffectday | deligeffectday | deligeffectday | char(19) |
| 7 | feffectrange | feffectrange | feffectrange | number(38, 0) |
| 8 | iappcustomadvance | iappcustomadvance | iappcustomadvance | number(38, 0) |
| 9 | iconsignadvance | iconsignadvance | iconsignadvance | number(38, 0) |
| 10 | iloadadvance | iloadadvance | iloadadvance | number(38, 0) |
| 11 | ioutcustomadvance | ioutcustomadvance | ioutcustomadvance | number(38, 0) |
| 12 | nbatchnum | nbatchnum | nbatchnum | number(28, 8) |
| 13 | nminiordernum | nminiordernum | nminiordernum | number(28, 8) |
| 14 | norderbatchnum | norderbatchnum | norderbatchnum | number(28, 8) |
| 15 | npriority | npriority | npriority | number(38, 0) |
| 16 | nquota | nquota | nquota | number(28, 8) |
| 17 | nquotabase | nquotabase | nquotabase | number(28, 8) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_hierarchy | pk_hierarchy | pk_hierarchy | varchar2(20) |
| 20 | pk_level | pk_level | pk_level | varchar2(20) |
| 21 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |
| 22 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |  |  | '~' |
| 26 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 27 | vvendinventorycode | vvendinventorycode | vvendinventorycode | varchar2(30) |
| 28 | vvendinventoryname | vvendinventoryname | vvendinventoryname | varchar2(60) |
| 29 | vdef1 | vdef1 | vdef1 | varchar2(100) |
| 30 | vdef2 | vdef2 | vdef2 | varchar2(100) |
| 31 | vdef3 | vdef3 | vdef3 | varchar2(100) |
| 32 | vdef4 | vdef4 | vdef4 | varchar2(100) |
| 33 | vdef5 | vdef5 | vdef5 | varchar2(100) |
| 34 | vdef6 | vdef6 | vdef6 | varchar2(100) |
| 35 | vdef7 | vdef7 | vdef7 | varchar2(100) |
| 36 | vdef8 | vdef8 | vdef8 | varchar2(100) |
| 37 | vdef9 | vdef9 | vdef9 | varchar2(100) |
| 38 | vdef10 | vdef10 | vdef10 | varchar2(100) |
| 39 | vdef11 | vdef11 | vdef11 | varchar2(100) |
| 40 | vdef12 | vdef12 | vdef12 | varchar2(100) |
| 41 | vdef13 | vdef13 | vdef13 | varchar2(100) |
| 42 | vdef14 | vdef14 | vdef14 | varchar2(100) |
| 43 | vdef15 | vdef15 | vdef15 | varchar2(100) |
| 44 | vdef16 | vdef16 | vdef16 | varchar2(100) |
| 45 | vdef17 | vdef17 | vdef17 | varchar2(100) |
| 46 | vdef18 | vdef18 | vdef18 | varchar2(100) |
| 47 | vdef19 | vdef19 | vdef19 | varchar2(100) |
| 48 | vdef20 | vdef20 | vdef20 | varchar2(100) |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
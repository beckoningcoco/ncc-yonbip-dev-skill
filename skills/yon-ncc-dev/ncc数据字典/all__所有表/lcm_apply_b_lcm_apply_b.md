# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9754.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply_b | pk_apply_b | pk_apply_b | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | bitnumber | bitnumber | bitnumber | number(38, 0) |
| 4 | contractamount | contractamount | contractamount | number(28, 8) |
| 5 | contractno | contractno | contractno | varchar2(50) |
| 6 | pk_apply | pk_apply | pk_apply | char(20) | √ |
| 7 | pk_contcurrtype | pk_contcurrtype | pk_contcurrtype | varchar2(20) |  |  | '~' |
| 8 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 11 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 12 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 16 | pk_srcbillline | pk_srcbillline | pk_srcbillline | varchar2(50) |
| 17 | pk_srcheadbill | pk_srcheadbill | pk_srcheadbill | varchar2(50) |
| 18 | pk_srcheadbillline | pk_srcheadbillline | pk_srcheadbillline | varchar2(50) |
| 19 | quantity | quantity | quantity | number(28, 8) |
| 20 | srcbillbusitype | srcbillbusitype | srcbillbusitype | varchar2(50) |
| 21 | srcbilltype | srcbilltype | srcbilltype | varchar2(10) |  |  | '~' |
| 22 | srccode | srccode | srccode | varchar2(50) |
| 23 | srcheadbilltype | srcheadbilltype | srcheadbilltype | varchar2(50) |
| 24 | srcheadbusitype | srcheadbusitype | srcheadbusitype | varchar2(50) |
| 25 | unitprice | unitprice | unitprice | number(28, 8) |
| 26 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 27 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 28 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 29 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 30 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 31 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 32 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 33 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 34 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 35 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
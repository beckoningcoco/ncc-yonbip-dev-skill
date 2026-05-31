# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8039.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_actual_inv | pk_wo_actual_inv | pk_wo_actual_inv | char(20) | √ |
| 2 | bill_date | bill_date | bill_date | char(19) |
| 3 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 4 | cother_billid | cother_billid | cother_billid | varchar2(20) |
| 5 | cother_bill_bid | cother_bill_bid | cother_bill_bid | varchar2(20) |
| 6 | currrate | currrate | currrate | number(28, 8) |
| 7 | first_billbid | first_billbid | first_billbid | varchar2(20) |
| 8 | first_billid | first_billid | first_billid | varchar2(20) |
| 9 | inout_date | inout_date | inout_date | char(19) |
| 10 | link_flag | link_flag | link_flag | char(1) |
| 11 | memo | memo | memo | varchar2(200) |
| 12 | money | money | money | number(28, 8) |
| 13 | money_org | money_org | money_org | number(28, 8) |
| 14 | nassistnum | nassistnum | nassistnum | number(28, 8) |
| 15 | nnum | nnum | nnum | number(28, 8) |
| 16 | origcurrtypeid | origcurrtypeid | origcurrtypeid | varchar2(20) |  |  | '~' |
| 17 | outer_flag | outer_flag | outer_flag | char(1) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 20 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 21 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 24 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 25 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |  |  | '~' |
| 26 | pk_stordoc | pk_stordoc | pk_stordoc | varchar2(20) |  |  | '~' |
| 27 | pk_wo | pk_wo | pk_wo | char(20) | √ |
| 28 | price | price | price | number(28, 8) |
| 29 | price_org | price_org | price_org | number(28, 8) |
| 30 | retnum | retnum | retnum | number(28, 8) |
| 31 | rowno | rowno | rowno | varchar2(30) |
| 32 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 33 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 34 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 35 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 36 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 37 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 38 | src_rowno | src_rowno | src_rowno | varchar2(20) |
| 39 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 40 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 41 | def1 | def1 | def1 | varchar2(101) |
| 42 | def2 | def2 | def2 | varchar2(101) |
| 43 | def3 | def3 | def3 | varchar2(101) |
| 44 | def4 | def4 | def4 | varchar2(101) |
| 45 | def5 | def5 | def5 | varchar2(101) |
| 46 | def6 | def6 | def6 | varchar2(101) |
| 47 | def7 | def7 | def7 | varchar2(101) |
| 48 | def8 | def8 | def8 | varchar2(101) |
| 49 | def9 | def9 | def9 | varchar2(101) |
| 50 | def10 | def10 | def10 | varchar2(101) |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
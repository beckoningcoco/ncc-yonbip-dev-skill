# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10632.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mater_stock | pk_mater_stock | pk_mater_stock | char(20) | √ |
| 2 | accounted_num | accounted_num | accounted_num | number(28, 8) |
| 3 | apply_num | apply_num | apply_num | number(28, 8) |
| 4 | mater_apply_adv_num | mater_apply_adv_num | mater_apply_adv_num | number(28, 8) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | nnum | nnum | nnum | number(28, 8) |
| 7 | opl_apply_num | opl_apply_num | opl_apply_num | number(28, 8) |
| 8 | opl_pray_num | opl_pray_num | opl_pray_num | number(28, 8) |
| 9 | opl_stockback_num | opl_stockback_num | opl_stockback_num | number(28, 8) |
| 10 | opl_stockin_num | opl_stockin_num | opl_stockin_num | number(28, 8) |
| 11 | opl_stockout_num | opl_stockout_num | opl_stockout_num | number(28, 8) |
| 12 | opl_stock_num | opl_stock_num | opl_stock_num | number(28, 8) |
| 13 | opl_st_out_app_num | opl_st_out_app_num | opl_st_out_app_num | number(28, 8) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 16 | pk_materialplan | pk_materialplan | pk_materialplan | varchar2(20) |
| 17 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 18 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 22 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 23 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |  |  | '~' |
| 24 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 25 | pray_apply | pray_apply | pray_apply | number(38, 0) |
| 26 | pray_num | pray_num | pray_num | number(28, 8) |
| 27 | require_date | require_date | require_date | char(19) |
| 28 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 29 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 30 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(50) |
| 31 | saga_status | saga_status | saga_status | number(38, 0) |
| 32 | stockback_num | stockback_num | stockback_num | number(28, 8) |
| 33 | stockin_num | stockin_num | stockin_num | number(28, 8) |
| 34 | stockout_num | stockout_num | stockout_num | number(28, 8) |
| 35 | stock_apply_adv_num | stock_apply_adv_num | stock_apply_adv_num | number(28, 8) |
| 36 | stock_apply_num | stock_apply_num | stock_apply_num | number(28, 8) |
| 37 | stock_num | stock_num | stock_num | number(28, 8) |
| 38 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 39 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 40 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 41 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 42 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 43 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 44 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 45 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 46 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 47 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 48 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 49 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 50 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 51 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 52 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 53 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 54 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 55 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 56 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 57 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
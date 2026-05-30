# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7984.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_pf | pk_mtapp_pf | pk_mtapp_pf | char(20) | √ |
| 2 | busisys | busisys | busisys | varchar2(20) |  |  | '~' |
| 3 | busi_detail_pk | busi_detail_pk | busi_detail_pk | varchar2(50) |
| 4 | busi_pk | busi_pk | busi_pk | varchar2(50) |
| 5 | exe_amount | exe_amount | exe_amount | number(28, 8) |
| 6 | exe_time | exe_time | exe_time | char(19) |
| 7 | exe_user | exe_user | exe_user | varchar2(20) |  |  | '~' |
| 8 | fy_amount | fy_amount | fy_amount | number(28, 8) |
| 9 | global_exe_amount | global_exe_amount | global_exe_amount | number(28, 8) |
| 10 | global_fy_amount | global_fy_amount | global_fy_amount | number(28, 8) |
| 11 | global_pre_amount | global_pre_amount | global_pre_amount | number(28, 8) |
| 12 | group_exe_amount | group_exe_amount | group_exe_amount | number(28, 8) |
| 13 | group_fy_amount | group_fy_amount | group_fy_amount | number(28, 8) |
| 14 | group_pre_amount | group_pre_amount | group_pre_amount | number(28, 8) |
| 15 | is_adjust | is_adjust | is_adjust | char(1) |
| 16 | ma_tradetype | ma_tradetype | ma_tradetype | varchar2(50) |  |  | '~' |
| 17 | org_exe_amount | org_exe_amount | org_exe_amount | number(28, 8) |
| 18 | org_fy_amount | org_fy_amount | org_fy_amount | number(28, 8) |
| 19 | org_pre_amount | org_pre_amount | org_pre_amount | number(28, 8) |
| 20 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 21 | pk_djdl | pk_djdl | pk_djdl | varchar2(50) |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_matterapp | pk_matterapp | pk_matterapp | varchar2(20) |  |  | '~' |
| 24 | pk_mtapp_detail | pk_mtapp_detail | pk_mtapp_detail | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) |  |  | '~' |
| 27 | pre_amount | pre_amount | pre_amount | number(28, 8) |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
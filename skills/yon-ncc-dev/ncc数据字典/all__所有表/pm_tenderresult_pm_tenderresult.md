# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10721.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tenderresult | pk_tenderresult | pk_tenderresult | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | bid_opendate | bid_opendate | bid_opendate | char(19) |
| 5 | bid_winning | bid_winning | bid_winning | char(1) |
| 6 | bid_winning_mny | bid_winning_mny | bid_winning_mny | number(28, 8) |
| 7 | bid_win_content | bid_win_content | bid_win_content | varchar2(200) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | bill_code | bill_code | bill_code | varchar2(50) |
| 11 | bill_status | bill_status | bill_status | number(38, 0) |
| 12 | bill_type | bill_type | bill_type | varchar2(50) |
| 13 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 15 | memo | memo | memo | varchar2(200) |
| 16 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 17 | pk_eps | pk_eps | pk_eps | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 22 | pk_ptmfileapprove | pk_ptmfileapprove | pk_ptmfileapprove | varchar2(20) |  |  | '~' |
| 23 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 24 | project_name | project_name | project_name | varchar2(300) |
| 25 | project_name2 | project_name2 | project_name2 | varchar2(300) |
| 26 | project_name3 | project_name3 | project_name3 | varchar2(300) |
| 27 | project_name4 | project_name4 | project_name4 | varchar2(300) |
| 28 | project_name5 | project_name5 | project_name5 | varchar2(300) |
| 29 | project_name6 | project_name6 | project_name6 | varchar2(300) |
| 30 | pt_price | pt_price | pt_price | number(28, 8) |
| 31 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 32 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 33 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 34 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 35 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 36 | tech_score | tech_score | tech_score | number(28, 8) |
| 37 | top_pk_bill | top_pk_bill | top_pk_bill | varchar2(50) |
| 38 | transi_type | transi_type | transi_type | varchar2(50) |
| 39 | def1 | def1 | def1 | varchar2(101) |
| 40 | def2 | def2 | def2 | varchar2(101) |
| 41 | def3 | def3 | def3 | varchar2(101) |
| 42 | def4 | def4 | def4 | varchar2(101) |
| 43 | def5 | def5 | def5 | varchar2(101) |
| 44 | def6 | def6 | def6 | varchar2(101) |
| 45 | def7 | def7 | def7 | varchar2(101) |
| 46 | def8 | def8 | def8 | varchar2(101) |
| 47 | def9 | def9 | def9 | varchar2(101) |
| 48 | def10 | def10 | def10 | varchar2(101) |
| 49 | def11 | def11 | def11 | varchar2(101) |
| 50 | def12 | def12 | def12 | varchar2(101) |
| 51 | def13 | def13 | def13 | varchar2(101) |
| 52 | def14 | def14 | def14 | varchar2(101) |
| 53 | def15 | def15 | def15 | varchar2(101) |
| 54 | def16 | def16 | def16 | varchar2(101) |
| 55 | def17 | def17 | def17 | varchar2(101) |
| 56 | def18 | def18 | def18 | varchar2(101) |
| 57 | def19 | def19 | def19 | varchar2(101) |
| 58 | def20 | def20 | def20 | varchar2(101) |
| 59 | creationtime | creationtime | creationtime | char(19) |
| 60 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 63 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 64 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

**医疗执行_医嘱_输血记录 (uh_ex_ord_btrec / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppBTRecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6085.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btrec | 输血记录主键 | pk_btrec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmt | 医疗执行医嘱医技 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 6 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_srv | 输血项目 | pk_srv | varchar(50) |  | 字符串 (String) |
| 8 | code_srv | 输血项目编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 9 | pk_blood_abo | ABO血型 | pk_blood_abo | varchar(20) |  | 血型(自定义档案) (Defdoc-000004) |
| 10 | dt_blood_abo | ABO血型编码 | dt_blood_abo | varchar(50) |  | 字符串 (String) |
| 11 | pk_blood_rh | Rh血型 | pk_blood_rh | varchar(20) |  | RH阴性(自定义档案) (Defdoc-000005) |
| 12 | dt_blood_rh | Rh血型编码 | dt_blood_rh | varchar(50) |  | 字符串 (String) |
| 13 | btcont | 输血成分 | btcont | varchar(50) |  | 字符串 (String) |
| 14 | unit_bt | 输血量单位 | unit_bt | varchar(50) |  | 字符串 (String) |
| 15 | quan_bt | 实际输血总量 | quan_bt | decimal(14, 2) |  | 数值 (UFDouble) |
| 16 | date_bt | 实际输血日期 | date_bt | char(19) |  | 日期时间 (UFDateTime) |
| 17 | flag_btreact | 输血反应标志 | flag_btreact | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_btreact | 输血反应类型 | pk_btreact | varchar(20) |  | 输血反应类型(自定义档案) (Defdoc-030209) |
| 19 | dt_btreact | 输血反应类型编码 | dt_btreact | varchar(50) |  | 字符串 (String) |
| 20 | desc_btreact | 输血反应描述 | desc_btreact | varchar(4000) |  | 字符串 (String) |
| 21 | pk_psn_bbget | 取血人员 | pk_psn_bbget | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | name_psn_bbget | 取血人员名称 | name_psn_bbget | varchar(300) |  | 字符串 (String) |
| 23 | pk_psn_bt | 输血人员 | pk_psn_bt | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | name_psn_bt | 输血人员名称 | name_psn_bt | varchar(300) |  | 字符串 (String) |
| 25 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 26 | pk_emr | 对应医疗记录 | pk_emr | varchar(20) |  | 临床_医疗记录 (unCNEmr) |
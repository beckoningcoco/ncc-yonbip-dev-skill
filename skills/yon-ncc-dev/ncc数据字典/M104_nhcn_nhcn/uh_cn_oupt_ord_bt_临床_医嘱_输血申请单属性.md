# |<<

**临床_医嘱_输血申请单属性 (uh_cn_oupt_ord_bt / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdBTAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6034.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordbt | 医嘱输血申请单属性主键 | pk_ordbt | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | pk_diag | 当前诊断 | pk_diag | varchar(20) |  | 字符串 (String) |
| 6 | desc_diag | 当前诊断名称串 | desc_diag | varchar(256) |  | 字符串 (String) |
| 7 | aim | 输血目的 | aim | int |  | 整数 (Integer) |
| 8 | blo_trigger | 输血指针 | blo_trigger | varchar(50) |  | 字符串 (String) |
| 9 | dt_bttype | 输血性质 | dt_bttype | varchar(20) |  | 字符串 (String) |
| 10 | flag_bthist | 输血史标志 | flag_bthist | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | flag_preghist | 孕产史 | flag_preghist | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | territorial | 受血者属地 | territorial | int |  | 整数 (Integer) |
| 13 | signed_consent | 签署同意书标志 | signed_consent | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | notsign_reason | 未签署原因 | notsign_reason | varchar(50) |  | 字符串 (String) |
| 15 | flag_lab | 须检验标志 | flag_lab | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | btcont | 计划输血成分 | btcont | int |  | 整数 (Integer) |
| 17 | unit_bt | 计划输血量单位 | unit_bt | varchar(50) |  | 字符串 (String) |
| 18 | quan_bt | 计划申请输血总量 | quan_bt | decimal(28, 2) |  | 数值 (UFDouble) |
| 19 | date_bt_app | 计划输血日期 | date_bt_app | char(19) |  | 日期 (UFDate) |
| 20 | dt_blood_abo | ABO血型 | dt_blood_abo | varchar(50) |  | 字符串 (String) |
| 21 | dt_blood_rh | Rh血型 | dt_blood_rh | varchar(50) |  | 字符串 (String) |
| 22 | flag_alhist | 过敏史标志 | flag_alhist | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | flag_bp | 备血完成标志 | flag_bp | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | date_bp | 备血完成日期 | date_bp | char(19) |  | 日期 (UFDate) |
| 25 | count_bb | 备血血袋数量 | count_bb | int |  | 整数 (Integer) |
| 26 | bbnos | 备血血袋编码串 | bbnos | varchar(50) |  | 字符串 (String) |
| 27 | pk_psn_bp | 备血人员 | pk_psn_bp | varchar(20) |  | 字符串 (String) |
| 28 | name_psn_bp | 备血人员名称 | name_psn_bp | varchar(50) |  | 字符串 (String) |
| 29 | eu_status | 输血过程状态 | eu_status | int |  | 整数 (Integer) |
| 30 | note_bt | 备注 | note_bt | varchar(50) |  | 字符串 (String) |
| 31 | hgb | 当前血红蛋白 | hgb | varchar(50) |  | 字符串 (String) |
| 32 | hct | 当前红细胞压积 | hct | varchar(50) |  | 字符串 (String) |
| 33 | plt | 当前血小板 | plt | varchar(50) |  | 字符串 (String) |
| 34 | alt | 当前谷丙转氨酶 | alt | varchar(50) |  | 字符串 (String) |
| 35 | hbsag | 乙肝 | hbsag | int |  | 整数 (Integer) |
| 36 | hcv | 丙肝 | hcv | int |  | 整数 (Integer) |
| 37 | hiv | 艾滋病 | hiv | int |  | 整数 (Integer) |
| 38 | tp | 梅毒 | tp | int |  | 整数 (Integer) |
| 39 | dt_blood_rec | 受血者血型 | dt_blood_rec | varchar(50) |  | 字符串 (String) |
| 40 | blo_res | 输血反应史 | blo_res | varchar(50) |  | 字符串 (String) |
# |<<

**医疗执行_输液记录 (uh_ex_ord_tfrec / com.yonyou.yh.nhis.ex.tf.vo.ExTfRecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6108.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tfrec | 输液记录主键 | pk_tfrec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ordmt | 医疗执行 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技辅 (ordmtappmsp) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 7 | desc_ord | 医嘱内容 | desc_ord | varchar(4000) |  | 字符串 (String) |
| 8 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 9 | pk_usage | 医嘱用法 | pk_usage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 10 | pk_usagenote | 用法要求 | pk_usagenote | varchar(20) |  | 药品用法要求(自定义档案) (Defdoc-030408) |
| 11 | dt_usage | 医嘱用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 12 | dt_usagenote | 用法要求编码 | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 13 | pk_freq | 医嘱频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 14 | days_ord | 医嘱天数 | days_ord | int |  | 整数 (Integer) |
| 15 | pk_ord | 医嘱 | pk_ord | char(20) |  | 主键 (UFID) |
| 16 | pk_tf | 科室/输液室 | pk_tf | varchar(20) |  | 输液室属性 (BdTfVO) |
| 17 | pk_tfplace | 座位 | pk_tfplace | varchar(20) |  | 门诊输液座位表 (BdPlaceTfVO) |
| 18 | flag_label | 打印标签标志 | flag_label | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | time_print | 打印时间 | time_print | char(19) |  | 日期时间 (UFDateTime) |
| 20 | pk_psn_print | 登记人 | pk_psn_print | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | name_print | 登记姓名 | name_print | varchar(50) |  | 字符串 (String) |
| 22 | pk_psn_admix | 配液人 | pk_psn_admix | varchar(20) |  | 人员基本信息 (psndoc) |
| 23 | time_admix | 配液时间 | time_admix | char(19) |  | 日期时间 (UFDateTime) |
| 24 | name_admix | 配液人姓名 | name_admix | varchar(50) |  | 字符串 (String) |
| 25 | speed | 滴速 | speed | decimal(14, 2) |  | 数值 (UFDouble) |
| 26 | duration | 预计时长 | duration | decimal(14, 2) |  | 数值 (UFDouble) |
| 27 | time_begin | 开始时间 | time_begin | char(19) |  | 日期时间 (UFDateTime) |
| 28 | pk_psn_tf | 输液人 | pk_psn_tf | varchar(20) |  | 人员基本信息 (psndoc) |
| 29 | name_tf | 输液人姓名 | name_tf | varchar(50) |  | 字符串 (String) |
| 30 | time_end | 结束时间 | time_end | char(19) |  | 日期时间 (UFDateTime) |
| 31 | pk_psn_end | 结束人 | pk_psn_end | varchar(20) |  | 人员基本信息 (psndoc) |
| 32 | name_end | 结束人姓名 | name_end | varchar(50) |  | 字符串 (String) |
| 33 | flag_react | 有无输液反应 | flag_react | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | time_react | 反应时间 | time_react | char(19) |  | 日期时间 (UFDateTime) |
| 35 | desc_react | 反应描述 | desc_react | varchar(50) |  | 字符串 (String) |
| 36 | flag_inc | 加药标志 | flag_inc | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | time_inc | 加液时间 | time_inc | char(19) |  | 日期时间 (UFDateTime) |
| 38 | pk_psn_inc | 加液人 | pk_psn_inc | varchar(20) |  | 人员基本信息 (psndoc) |
| 39 | name_inc | 加液人姓名 | name_inc | varchar(50) |  | 字符串 (String) |
| 40 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 41 | eu_status | 状态 | eu_status | int |  | 整数 (Integer) |
| 42 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 62 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 63 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 64 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 65 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
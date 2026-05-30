# |<<

**静配管理 (uh_ex_dept_pd_pivas / com.yonyou.yh.nhis.ex.sdc.vo.ExPdPiVasVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6072.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpivas | 主键 | pk_pdpivas | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_exlist | 执行单主键 | pk_exlist | varchar(20) |  | 字符串 (String) |
| 5 | pk_pd | 物品 | pk_pd | varchar(20) |  | 字符串 (String) |
| 6 | pk_pv | 就诊 | pk_pv | varchar(50) |  | 字符串 (String) |
| 7 | pk_usage | 用法 | pk_usage | varchar(20) |  | 字符串 (String) |
| 8 | pk_freq | 医嘱频次 | pk_freq | varchar(20) |  | 字符串 (String) |
| 9 | quan_med | 药品用量 | quan_med | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_measdoc | 用量单位 | pk_measdoc | varchar(50) |  | 字符串 (String) |
| 11 | drip_speed | 滴速 | drip_speed | int |  | 整数 (Integer) |
| 12 | pk_dept_ap | 领药部门 | pk_dept_ap | varchar(50) |  | 字符串 (String) |
| 13 | pk_dept_admix | 配液部门 | pk_dept_admix | varchar(50) |  | 字符串 (String) |
| 14 | pk_ivbatch | 配药批次 | pk_ivbatch | varchar(50) |  | 字符串 (String) |
| 15 | barcode | 瓶签编码 | barcode | varchar(30) |  | 字符串 (String) |
| 16 | date_exec | 实际执行时间 | date_exec | char(19) |  | 日期时间 (UFDateTime) |
| 17 | flag_print | 打印标志 | flag_print | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | date_print | 打印时间 | date_print | char(19) |  | 日期时间 (UFDateTime) |
| 19 | pk_psn_print | 打印人 | pk_psn_print | varchar(20) |  | 用户 (user) |
| 20 | name_psn_print | 打印人姓名 | name_psn_print | varchar(50) |  | 字符串 (String) |
| 21 | flag_stop | 停用标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | flag_instore | 入仓标识 | flag_instore | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | date_instore | 入仓时间 | date_instore | char(19) |  | 日期时间 (UFDateTime) |
| 24 | pk_psn_instore | 入仓人 | pk_psn_instore | varchar(20) |  | 用户 (user) |
| 25 | name_psn_instore | 入仓人姓名 | name_psn_instore | varchar(50) |  | 字符串 (String) |
| 26 | flag_admix | 配液标志 | flag_admix | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | date_admix | 配液时间 | date_admix | char(19) |  | 日期时间 (UFDateTime) |
| 28 | pk_psn_admix | 配液人 | pk_psn_admix | varchar(20) |  | 用户 (user) |
| 29 | name_psn_admix | 配液人姓名 | name_psn_admix | varchar(50) |  | 字符串 (String) |
| 30 | pk_psn_chk | 配液审核人 | pk_psn_chk | varchar(20) |  | 用户 (user) |
| 31 | name_psn_chk | 审核人姓名 | name_psn_chk | varchar(50) |  | 字符串 (String) |
| 32 | flag_outstore | 出仓标识 | flag_outstore | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | date_outstore | 出仓时间 | date_outstore | char(19) |  | 日期时间 (UFDateTime) |
| 34 | pk_psn_outstore | 出仓人 | pk_psn_outstore | varchar(20) |  | 用户 (user) |
| 35 | name_psn_outstore | 出仓人姓名 | name_psn_outstore | varchar(50) |  | 字符串 (String) |
| 36 | flag_sign | 签收标志 | flag_sign | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | date_sign | 签收时间 | date_sign | char(19) |  | 日期时间 (UFDateTime) |
| 38 | pk_psn_sign | 签收人 | pk_psn_sign | varchar(20) |  | 用户 (user) |
| 39 | name_psn_sign | 签收人姓名 | name_psn_sign | varchar(50) |  | 字符串 (String) |
| 40 | sortno | 医嘱号 | sortno | varchar(50) |  | 字符串 (String) |
| 41 | sortno_parent | 父医嘱号 | sortno_parent | varchar(50) |  | 字符串 (String) |
| 42 | date_plan | 计划日期 | date_plan | char(19) |  | 日期时间 (UFDateTime) |
| 43 | desc_ord | 医嘱内容 | desc_ord | varchar(4000) |  | 字符串 (String) |
| 44 | dt_usage | 医嘱用法 | dt_usage | varchar(50) |  | 字符串 (String) |
| 45 | dt_usagenote | 医嘱要求 | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 46 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 47 | pk_pati | 患者 | pk_pati | varchar(50) |  | 字符串 (String) |
| 48 | pk_usagenote | 用法要求 | pk_usagenote | varchar(20) |  | 字符串 (String) |
| 49 | quan | 用量 | quan | int |  | 整数 (Integer) |
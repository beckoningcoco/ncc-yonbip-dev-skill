# |<<

**手术医嘱 (uh_ex_ord_op / com.yonyou.yh.nhis.ex.op.vo.ExOpＯrdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6096.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordop | 手术医嘱主键 | pk_ordop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_apply | 手术申请 | code_apply | varchar(30) |  | 字符串 (String) |
| 5 | date_entry | 开立日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 6 | pk_psn_phy | 开立医生 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | name_psn_phy | 开立医生姓名 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 8 | date_begin | 开始日期 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_srvtype | 服务类型 | pk_srvtype | varchar(50) |  | 字符串 (String) |
| 10 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 11 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 12 | groupno | 医嘱组号 | groupno | varchar(30) |  | 字符串 (String) |
| 13 | sortno | 组内序号 | sortno | int |  | 整数 (Integer) |
| 14 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 15 | desc_ord | 医嘱描述 | desc_ord | varchar(256) |  | 字符串 (String) |
| 16 | pk_usage | 用法 | pk_usage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 17 | dt_usage | 用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 18 | pk_usagenote | 用法要求 | pk_usagenote | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 19 | pk_freq | 频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 20 | price | 价格 | price | decimal(14, 2) |  | 数值 (UFDouble) |
| 21 | quan | 数量 | quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 22 | unit | 单位 | unit | varchar(50) |  | 字符串 (String) |
| 23 | days_ord | 用药天数 | days_ord | int |  | 整数 (Integer) |
| 24 | flag_self | 患者自备标志 | flag_self | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | flag_sign | 签署标志 | flag_sign | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | date_sign | 签署日期 | date_sign | char(19) |  | 日期时间 (UFDateTime) |
| 27 | flag_chk | 核对标志 | flag_chk | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | date_chk | 核对日期 | date_chk | char(19) |  | 日期时间 (UFDateTime) |
| 29 | pk_psn_chk | 核对护士 | pk_psn_chk | varchar(20) |  | 人员基本信息 (psndoc) |
| 30 | name_psn_chk | 核对护士姓名 | name_psn_chk | varchar(50) |  | 字符串 (String) |
| 31 | flag_exec | 执行标志 | flag_exec | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | date_exec | 执行时间 | date_exec | char(19) |  | 日期时间 (UFDateTime) |
| 33 | flag_stop | 停止标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | date_stop | 停止时间 | date_stop | char(19) |  | 日期时间 (UFDateTime) |
| 35 | pk_psn_stop | 停止医生 | pk_psn_stop | varchar(20) |  | 人员基本信息 (psndoc) |
| 36 | name_psn_stop | 停止医生姓名 | name_psn_stop | varchar(50) |  | 字符串 (String) |
| 37 | flag_canc | 作废标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | date_canc | 作废日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 39 | pk_psn_canc | 作废医生 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 40 | name_psn_canc | 作废医生姓名 | name_psn_canc | varchar(50) |  | 字符串 (String) |
| 41 | flag_srvset | 服务套 | flag_srvset | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 43 | flag_pres | 处方标志 | flag_pres | char(1) |  | 布尔类型 (UFBoolean) |
| 44 | pk_pres | 处方主键 | pk_pres | varchar(50) |  | 字符串 (String) |
| 45 | code_pres | 处方号码 | code_pres | varchar(30) |  | 字符串 (String) |
| 46 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 47 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 48 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 49 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
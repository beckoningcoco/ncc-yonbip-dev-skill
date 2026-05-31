# |<<

**费用申请单执行情况 (er_mtapp_pf / nc.vo.erm.matterappctrl.MtapppfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_pf | 主键 | pk_mtapp_pf | char(20) | √ | 主键 (UFID) |
| 2 | pk_matterapp | 费用申请单 | pk_matterapp | varchar(20) |  | 费用申请单 (mtapp_bill) |
| 3 | pk_mtapp_detail | 费用申请单明细 | pk_mtapp_detail | varchar(20) |  | 费用申请单明细 (mtapp_detail) |
| 4 | ma_tradetype | 费用申请单交易类型 | ma_tradetype | varchar(50) |  | 字符串 (String) |
| 5 | busisys | 业务系统 | busisys | varchar(20) |  | 模块信息 (module) |
| 6 | pk_djdl | 业务单据大类 | pk_djdl | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtype | 业务单据类型 | pk_billtype | varchar(50) |  | 单据类型 (BilltypeVO) |
| 8 | pk_tradetype | 业务交易类型 | pk_tradetype | varchar(50) |  | 单据类型 (BilltypeVO) |
| 9 | busi_pk | 业务单据pk | busi_pk | varchar(50) |  | 字符串 (String) |
| 10 | exe_user | 最后执行人 | exe_user | varchar(20) |  | 用户 (user) |
| 11 | exe_time | 最后执行时间 | exe_time | char(19) |  | 日期时间 (UFDateTime) |
| 12 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | fy_amount | 费用金额 | fy_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | org_fy_amount | 组织本币费用金额 | org_fy_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | group_fy_amount | 集团本币费用金额 | group_fy_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | global_fy_amount | 全局本币费用金额 | global_fy_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | exe_amount | 执行数 | exe_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | org_exe_amount | 组织本币执行数 | org_exe_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | group_exe_amount | 集团本币执行数 | group_exe_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | global_exe_amount | 全局本币执行数 | global_exe_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pre_amount | 预占数 | pre_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | org_pre_amount | 组织本币预占数 | org_pre_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | group_pre_amount | 集团本币预占数 | group_pre_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | global_pre_amount | 全局本币预占数 | global_pre_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | busi_detail_pk | 业务信息明细pk | busi_detail_pk | varchar(50) |  | 字符串 (String) |
| 27 | is_adjust | 是否调剂 | is_adjust | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 29 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 30 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 31 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
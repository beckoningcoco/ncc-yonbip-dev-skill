# |<<

**费用摊销过程记录 (er_expamtproc / nc.vo.erm.expamortize.ExpamtprocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expamtproc | 主键 | pk_expamtproc | char(20) | √ | 主键 (UFID) |
| 2 | pk_expamtinfo | 对应摊销信息 | pk_expamtinfo | varchar(20) |  | 费用待摊摊销信息明细 (expamtinfo_detail) |
| 3 | accperiod | 摊销会计期间 | accperiod | varchar(50) |  | 字符串 (String) |
| 4 | curr_amount | 本期摊销金额 | curr_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | total_period | 总摊销期 | total_period | int |  | 整数 (Integer) |
| 8 | total_amount | 总摊销金额 | total_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | res_period | 剩余摊销期 | res_period | int |  | 整数 (Integer) |
| 10 | res_amount | 剩余摊销金额 | res_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | start_period | 起摊会计期间 | start_period | varchar(50) |  | 字符串 (String) |
| 12 | end_period | 止摊会计期间 | end_period | varchar(50) |  | 字符串 (String) |
| 13 | bzbm | 币种 | bzbm | varchar(20) |  | 字符串 (String) |
| 14 | bbhl | 组织本币汇率 | bbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | globalbbhl | 全局本币汇率 | globalbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | groupbbhl | 集团本币汇率 | groupbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 17 | bbje | 组织本币总金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | globalbbje | 全局本币总金额 | globalbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | groupbbje | 集团本币总金额 | groupbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | res_orgamount | 组织本币剩余金额 | res_orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | res_groupamount | 集团本币剩余金额 | res_groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | res_globalamount | 全局本币剩余金额 | res_globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | accu_period | 累计摊销期数 | accu_period | int |  | 整数 (Integer) |
| 24 | accu_amount | 累计摊销金额 | accu_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | curr_orgamount | 组织本币本期金额 | curr_orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | curr_groupamount | 集团本币本期金额 | curr_groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | curr_globalamount | 全局本币本期金额 | curr_globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | accu_orgamount | 组织本币累计金额 | accu_orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | accu_groupamount | 集团本币累计金额 | accu_groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | accu_globalamount | 全局本币累计金额 | accu_globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | amortize_user | 摊销人 | amortize_user | varchar(20) |  | 用户 (user) |
| 32 | amortize_date | 摊销日期 | amortize_date | char(19) |  | 日期 (UFDate) |
| 33 | total_taxlessamount | 总无税摊销金额 | total_taxlessamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | res_taxlessamount | 剩余无税摊销金额 | res_taxlessamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | curr_taxlessamount | 本期无税摊销金额 | curr_taxlessamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | accu_taxlessamount | 累计无税摊销金额 | accu_taxlessamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 38 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 39 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 40 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
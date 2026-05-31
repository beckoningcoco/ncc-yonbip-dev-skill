# |<<

**操作员结账 (uh_bl_cc / com.yonyou.yh.nhis.bl.cc.vo.BLCashierCloseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5919.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_blcc | 操作员结账主键 | pk_blcc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cctype | 结账类型 | pk_cctype | varchar(20) |  | 字符串 (String) |
| 5 | dt_cctype | 结账类型编码 | dt_cctype | varchar(20) |  | 字符串 (String) |
| 6 | pk_psn | 操作员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | name_psn | 操作员名称 | name_psn | varchar(50) |  | 字符串 (String) |
| 8 | date_begin | 结账开始日期 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 9 | date_end | 结账结束日期 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 10 | amount | 收款总金额 | amount | decimal(14, 2) |  | 金额 (UFMoney) |
| 11 | amt_return | 退款总金额 | amt_return | decimal(14, 2) |  | 金额 (UFMoney) |
| 12 | invnos | 使用发票号串 | invnos | varchar(256) |  | 字符串 (String) |
| 13 | invcn | 发票张数 | invcn | int |  | 整数 (Integer) |
| 14 | invs_canc | 作废发票号串信息 | invs_canc | varchar(4000) |  | 字符串 (String) |
| 15 | invcn_canc | 作废发票张数 | invcn_canc | int |  | 整数 (Integer) |
| 16 | flag_canc | 结账取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | amt_st | 结算_收款 | amt_st | decimal(14, 2) |  | 金额 (UFMoney) |
| 18 | amt_st_ret | 结算_退款 | amt_st_ret | decimal(14, 2) |  | 金额 (UFMoney) |
| 19 | amt_pvprepay | 住院押金_收款 | amt_pvprepay | decimal(14, 2) |  | 金额 (UFMoney) |
| 20 | amt_pvprepay_ret | 住院押金_退款 | amt_pvprepay_ret | decimal(14, 2) |  | 金额 (UFMoney) |
| 21 | amt_piprepay | 患者预交金_收款 | amt_piprepay | decimal(14, 2) |  | 金额 (UFMoney) |
| 22 | amt_piprepay_ret | 患者预交金_退款 | amt_piprepay_ret | decimal(14, 2) |  | 金额 (UFMoney) |
| 23 | invnos_pvprepay | 住院押金收据使用号码串 | invnos_pvprepay | varchar(256) |  | 字符串 (String) |
| 24 | invnos_pvprepay_ret | 住院押金收据收回号码串 | invnos_pvprepay_ret | varchar(4000) |  | 字符串 (String) |
| 25 | invcn_pvprepay | 住院押金收据发出张数 | invcn_pvprepay | int |  | 整数 (Integer) |
| 26 | invcn_pvprepay_ret | 住院押金收据收回张数 | invcn_pvprepay_ret | int |  | 整数 (Integer) |
| 27 | date_cc | 操作员结账日期时间 | date_cc | char(19) |  | 日期时间 (UFDateTime) |
| 28 | flag_clear | 财务交割标志 | flag_clear | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | date_clear | 财务交割日期 | date_clear | char(19) |  | 日期时间 (UFDateTime) |
| 30 | pk_blcl | 财务交割 | pk_blcl | varchar(20) |  | 财务交割 (BlClVO) |
| 31 | amt_inv | 结算发票 | amt_inv | decimal(14, 2) |  | 数值 (UFDouble) |
| 32 | amt_prepay | 收预交金 | amt_prepay | decimal(14, 2) |  | 数值 (UFDouble) |
| 33 | amt_prepay_rtn | 退预交金 | amt_prepay_rtn | decimal(14, 2) |  | 数值 (UFDouble) |
| 34 | amt_ins | 医保支付 | amt_ins | decimal(14, 2) |  | 数值 (UFDouble) |
| 35 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 55 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 56 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 57 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 58 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
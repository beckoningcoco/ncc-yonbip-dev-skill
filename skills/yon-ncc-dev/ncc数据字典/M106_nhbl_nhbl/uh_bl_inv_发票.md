# |<<

**发票 (uh_bl_inv / com.yonyou.yh.nhis.bl.inv.vo.BlInvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inv | 发票主键 | pk_inv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_invcate | 票据类型 | pk_invcate | varchar(20) |  | 字符串 (String) |
| 5 | pk_invisspk | 票据包编码 | pk_invisspk | varchar(50) |  | 字符串 (String) |
| 6 | invno | 发票号 | invno | varchar(30) |  | 字符串 (String) |
| 7 | date_inv | 发票日期 | date_inv | char(19) |  | 日期时间 (UFDateTime) |
| 8 | amount | 发票总金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | amount_pati | 发票患者自付金额 | amount_pati | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_psn_inv | 发票开立人员 | pk_psn_inv | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | name_psn_inv | 发票开立人员名称 | name_psn_inv | varchar(50) |  | 字符串 (String) |
| 12 | times_prt | 发票打印次数 | times_prt | int |  | 整数 (Integer) |
| 13 | flag_canc | 发票无效标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | dt_reason_canc | 发票无效原因 | dt_reason_canc | char(20) |  | 字符串 (String) |
| 15 | dt_resion_canc | 发票无效原因new | dt_resion_canc | varchar(50) |  | 字符串 (String) |
| 16 | desc_reason_canc | 发票无效原因描述 | desc_reason_canc | varchar(256) |  | 字符串 (String) |
| 17 | desc_resion_canc | 发票无效原因描述new | desc_resion_canc | varchar(256) |  | 字符串 (String) |
| 18 | date_canc | 发票无效操作日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 19 | pk_psn_canc | 发票无效操作人员 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | name_psn_canc | 发票无效操作人员名称 | name_psn_canc | varchar(50) |  | 字符串 (String) |
| 21 | flag_blcc | 结账标志 | flag_blcc | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | pk_blcc | 结账主键 | pk_blcc | varchar(20) |  | 操作员结账 (BLCashierCloseVO) |
| 23 | flag_blcc_canc | 取消结账标志 | flag_blcc_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | pk_blcc_canc | 取消结账主键 | pk_blcc_canc | varchar(20) |  | 操作员结账 (BLCashierCloseVO) |
| 25 | note | 备注 | note | varchar(4000) |  | 字符串 (String) |
| 26 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 46 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 47 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 48 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 49 | modifier | 最后修改人 | modifier | varchar(20) |  | 字符串 (String) |
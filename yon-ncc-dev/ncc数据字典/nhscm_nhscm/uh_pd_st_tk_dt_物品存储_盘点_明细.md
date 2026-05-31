# |<<

**物品存储_盘点_明细 (uh_pd_st_tk_dt / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdSttkDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6158.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdtkdt | 物品盘点明细主键 | pk_pdtkdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_pdtkdt | 物品盘点明细主键 | pk_pdtkdt | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_pdtk | 盘点 | pk_pdtk | varchar(20) |  | 物品存储_盘点 (UhPdSttkVO) |
| 6 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |
| 7 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_measdoc_cur | 包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 计量单位 (measdoc) |
| 9 | factor_fb | 换算系数公式_主计量单位/基本单位 | factor_fb | varchar(50) |  | 字符串 (String) |
| 10 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(50) |  | 字符串 (String) |
| 11 | batchcode | 物品批号 | batchcode | varchar(50) |  | 字符串 (String) |
| 12 | date_valid | 失效日期 | date_valid | char(19) |  | 日期时间 (UFDateTime) |
| 13 | price_s | 单价_零售包装单位 | price_s | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | price_p | 成本单价 | price_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | quan_bk_cur | 账面数量_当前 | quan_bk_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | quan_bk_base | 账面数量_基本 | quan_bk_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | quan_tk_cur | 清点数量_当前 | quan_tk_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | quan_tk_base | 清点数量_基本 | quan_tk_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | diff | 帐物差额 | diff | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | reason | 差异原因 | reason | varchar(50) |  | 字符串 (String) |
| 21 | flag_st | 过账标志 | flag_st | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | pk_pdst | 过账库单 | pk_pdst | varchar(50) |  | 字符串 (String) |
| 23 | date_st | 过账日期 | date_st | char(19) |  | 日期时间 (UFDateTime) |
| 24 | pk_psn_tk | 清点人 | pk_psn_tk | varchar(20) |  | 人员基本信息 (psndoc) |
| 25 | pk_psn_appr | 批准人 | pk_psn_appr | varchar(20) |  | 人员基本信息 (psndoc) |
| 26 | date_appr | 批准日期 | date_appr | char(19) |  | 日期时间 (UFDateTime) |
| 27 | def1 | 自定义字段1 | def1 | varchar(50) |  | 字符串 (String) |
| 28 | def2 | 自定义字段2 | def2 | varchar(50) |  | 字符串 (String) |
| 29 | def3 | 自定义字段3 | def3 | varchar(50) |  | 字符串 (String) |
| 30 | def4 | 自定义字段4 | def4 | varchar(50) |  | 字符串 (String) |
| 31 | def5 | 自定义字段5 | def5 | varchar(50) |  | 字符串 (String) |
| 32 | def6 | 自定义字段6 | def6 | varchar(50) |  | 字符串 (String) |
| 33 | def7 | 自定义字段7 | def7 | varchar(50) |  | 字符串 (String) |
| 34 | def8 | 自定义字段8 | def8 | varchar(50) |  | 字符串 (String) |
| 35 | def9 | 自定义字段9 | def9 | varchar(50) |  | 字符串 (String) |
| 36 | def10 | 自定义字段10 | def10 | varchar(50) |  | 字符串 (String) |
| 37 | def11 | 自定义字段11 | def11 | varchar(50) |  | 字符串 (String) |
| 38 | def12 | 自定义字段12 | def12 | varchar(50) |  | 字符串 (String) |
| 39 | def13 | 自定义字段13 | def13 | varchar(50) |  | 字符串 (String) |
| 40 | def14 | 自定义字段14 | def14 | varchar(50) |  | 字符串 (String) |
| 41 | def15 | 自定义字段15 | def15 | varchar(50) |  | 字符串 (String) |
| 42 | def16 | 自定义字段16 | def16 | varchar(50) |  | 字符串 (String) |
| 43 | def17 | 自定义字段17 | def17 | varchar(50) |  | 字符串 (String) |
| 44 | def18 | 自定义字段18 | def18 | varchar(50) |  | 字符串 (String) |
| 45 | def19 | 自定义字段19 | def19 | varchar(50) |  | 字符串 (String) |
| 46 | def20 | 自定义字段20 | def20 | varchar(50) |  | 字符串 (String) |
| 47 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 48 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 49 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 50 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
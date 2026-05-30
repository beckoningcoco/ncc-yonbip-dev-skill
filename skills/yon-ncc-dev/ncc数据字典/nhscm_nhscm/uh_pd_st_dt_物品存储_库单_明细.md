# |<<

**物品存储_库单_明细 (uh_pd_st_dt / com.yonyou.yh.nhis.scm.uhpd.vo.ScmPdStItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdstdt | 物品库单明细主键 | pk_pdstdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 5 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | pk_measdoc_cur | 包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 计量单位 (measdoc) |
| 7 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(50) |  | 字符串 (String) |
| 8 | factor_fb | 换算系数公式_主计量单位/基本单位 | factor_fb | varchar(50) |  | 字符串 (String) |
| 9 | quan_cur | 数量_当前 | quan_cur | decimal(28, 2) |  | 数值 (UFDouble) |
| 10 | quan_base | 数量_基本 | quan_base | decimal(28, 2) |  | 数值 (UFDouble) |
| 11 | quan_issue_base | 入库已出库数量_ 基本 | quan_issue_base | decimal(28, 2) |  | 数值 (UFDouble) |
| 12 | price_p_cur | 购入单价_当前 | price_p_cur | decimal(28, 4) |  | 数值 (UFDouble) |
| 13 | disc | 实际扣率 | disc | decimal(28, 2) |  | 数值 (UFDouble) |
| 14 | price_s_cur | 零售单价_当前 | price_s_cur | decimal(28, 4) |  | 数值 (UFDouble) |
| 15 | amt_p | 购入金额 | amt_p | decimal(28, 2) |  | 数值 (UFDouble) |
| 16 | amt_s | 零售金额 | amt_s | decimal(28, 2) |  | 数值 (UFDouble) |
| 17 | batchcode | 批号 | batchcode | varchar(50) |  | 字符串 (String) |
| 18 | date_fac | 出厂日期 | date_fac | char(19) |  | 日期时间 (UFDateTime) |
| 19 | validno | 有效期 | validno | int |  | 整数 (Integer) |
| 20 | eu_validunit | 有效期单位 | eu_validunit | int |  | 有效期单位 (ValidunitEnum) |  | 0=天; |
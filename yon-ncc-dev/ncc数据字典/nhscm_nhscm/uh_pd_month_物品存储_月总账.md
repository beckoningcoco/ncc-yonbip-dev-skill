# |<<

**物品存储_月总账 (uh_pd_month / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdMonthVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6144.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdmonth | 物品月总账主键 | pk_pdmonth | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | batchcode | 物品批号 | batchcode | varchar(50) |  | 字符串 (String) |
| 5 | yearmonth | 年月 | yearmonth | varchar(10) |  | 字符串 (String) |
| 6 | pk_dept | 库存部门(地点) | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 8 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | price_p | 成本单价 | price_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | quan_bl_base | 月初结存数量_基本 | quan_bl_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | amt_bl_s | 月初余额_零售 | amt_bl_s | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | amt_bl_p | 月初余额_购入 | amt_bl_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | amt_i_base | 期间发生数量_入库_基本 | amt_i_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | amt_i_s | 期间发生金额_入库_零售 | amt_i_s | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | amt_o_base | 期间发生数量_出库_基本 | amt_o_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | amt_o_s | 期间发生金额_出库_零售 | amt_o_s | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | amt_o_p | 期间发生金额_出库_购入 | amt_o_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | amt_i_p | 期间发生金额_入库_购入 | amt_i_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | eu_status | 状态 | eu_status | int |  | 整数 (Integer) |
| 20 | def1 | 自定义字段1 | def1 | varchar(50) |  | 字符串 (String) |
| 21 | def2 | 自定义字段2 | def2 | varchar(50) |  | 字符串 (String) |
| 22 | def3 | 自定义字段3 | def3 | varchar(50) |  | 字符串 (String) |
| 23 | def4 | 自定义字段4 | def4 | varchar(50) |  | 字符串 (String) |
| 24 | def5 | 自定义字段5 | def5 | varchar(50) |  | 字符串 (String) |
| 25 | def6 | 自定义字段6 | def6 | varchar(50) |  | 字符串 (String) |
| 26 | def7 | 自定义字段7 | def7 | varchar(50) |  | 字符串 (String) |
| 27 | def8 | 自定义字段8 | def8 | varchar(50) |  | 字符串 (String) |
| 28 | def9 | 自定义字段9 | def9 | varchar(50) |  | 字符串 (String) |
| 29 | def10 | 自定义字段10 | def10 | varchar(50) |  | 字符串 (String) |
| 30 | def11 | 自定义字段11 | def11 | varchar(50) |  | 字符串 (String) |
| 31 | def12 | 自定义字段12 | def12 | varchar(50) |  | 字符串 (String) |
| 32 | def13 | 自定义字段13 | def13 | varchar(50) |  | 字符串 (String) |
| 33 | def14 | 自定义字段14 | def14 | varchar(50) |  | 字符串 (String) |
| 34 | def15 | 自定义字段15 | def15 | varchar(50) |  | 字符串 (String) |
| 35 | def16 | 自定义字段16 | def16 | varchar(50) |  | 字符串 (String) |
| 36 | def17 | 自定义字段17 | def17 | varchar(50) |  | 字符串 (String) |
| 37 | def18 | 自定义字段18 | def18 | varchar(50) |  | 字符串 (String) |
| 38 | def19 | 自定义字段19 | def19 | varchar(50) |  | 字符串 (String) |
| 39 | def20 | 自定义字段20 | def20 | varchar(50) |  | 字符串 (String) |
| 40 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 41 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 42 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 43 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
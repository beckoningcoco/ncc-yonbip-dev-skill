# |<<

**物品存储_结存 (uh_pd_bl / com.yonyou.yh.nhis.scm.pdbl.vo.ScmPdBlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6143.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdbl | 物品结存主键 | pk_pdbl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept | 库存部门(地点) | pk_dept | varchar(50) |  | 字符串 (String) |
| 5 | pk_stordoc | 仓库 | pk_stordoc | varchar(50) |  | 字符串 (String) |
| 6 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | batchcode | 物品批号 | batchcode | varchar(50) |  | 字符串 (String) |
| 8 | date_valid | 失效日期 | date_valid | char(19) |  | 日期 (UFDate) |
| 9 | price_p | 成本单价 | price_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | price_s | 单价_零售包装单位 | price_s | decimal(14, 8) |  | 数值 (UFDouble) |
| 11 | quan_base | 结存数量_基本 | quan_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 12 | reserve_base | 预留数量_基本 | reserve_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | amt_p | 成本金额 | amt_p | decimal(28, 2) |  | 数值 (UFDouble) |
| 14 | amt_s | 零售金额 | amt_s | decimal(28, 2) |  | 数值 (UFDouble) |
| 15 | flag_stop | 停用标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | enablestate | 启用状态 | enablestate | int |  | 整数 (Integer) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 37 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 38 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 39 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 40 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
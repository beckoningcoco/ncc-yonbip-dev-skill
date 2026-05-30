# |<<

**物品存储_统计_部门领用 (uh_pd_stat_sttype4 / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdStatSttype4VO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6161.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdstatsttype | 统计主键 | pk_pdstatsttype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | yearmonth | 年月 | yearmonth | char(19) |  | 日期 (UFDate) |
| 5 | pk_dept_src | 库存地点 | pk_dept_src | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_dest | 领用部门 | pk_dept_dest | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | amt_i_base | 期间发生数量_入库_基本 | amt_i_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | amt_i_s | 期间发生金额_入库_零售 | amt_i_s | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | amt_i_p | 期间发生金额_入库_购入 | amt_i_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | amt_o_base | 期间发生数量_出库_基本 | amt_o_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | amt_o_s | 期间发生金额_出库_零售 | amt_o_s | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | amt_o_p | 期间发生金额_出库_购入 | amt_o_p | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | eu_status | 状态 | eu_status | int |  | 整数 (Integer) |
| 15 | def1 | 自定义字段1 | def1 | varchar(50) |  | 字符串 (String) |
| 16 | def2 | 自定义字段2 | def2 | varchar(50) |  | 字符串 (String) |
| 17 | def3 | 自定义字段3 | def3 | varchar(50) |  | 字符串 (String) |
| 18 | def4 | 自定义字段4 | def4 | varchar(50) |  | 字符串 (String) |
| 19 | def5 | 自定义字段5 | def5 | varchar(50) |  | 字符串 (String) |
| 20 | def6 | 自定义字段6 | def6 | varchar(50) |  | 字符串 (String) |
| 21 | def7 | 自定义字段7 | def7 | varchar(50) |  | 字符串 (String) |
| 22 | def8 | 自定义字段8 | def8 | varchar(50) |  | 字符串 (String) |
| 23 | def9 | 自定义字段9 | def9 | varchar(50) |  | 字符串 (String) |
| 24 | def10 | 自定义字段10 | def10 | varchar(50) |  | 字符串 (String) |
| 25 | def11 | 自定义字段11 | def11 | varchar(50) |  | 字符串 (String) |
| 26 | def12 | 自定义字段12 | def12 | varchar(50) |  | 字符串 (String) |
| 27 | def13 | 自定义字段13 | def13 | varchar(50) |  | 字符串 (String) |
| 28 | def14 | 自定义字段14 | def14 | varchar(50) |  | 字符串 (String) |
| 29 | def15 | 自定义字段15 | def15 | varchar(50) |  | 字符串 (String) |
| 30 | def16 | 自定义字段16 | def16 | varchar(50) |  | 字符串 (String) |
| 31 | def17 | 自定义字段17 | def17 | varchar(50) |  | 字符串 (String) |
| 32 | def18 | 自定义字段18 | def18 | varchar(50) |  | 字符串 (String) |
| 33 | def19 | 自定义字段19 | def19 | varchar(50) |  | 字符串 (String) |
| 34 | def20 | 自定义字段20 | def20 | varchar(50) |  | 字符串 (String) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 38 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
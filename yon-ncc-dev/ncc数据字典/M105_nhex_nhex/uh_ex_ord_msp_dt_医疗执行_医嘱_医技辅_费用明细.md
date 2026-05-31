# |<<

**医疗执行_医嘱_医技辅_费用明细 (uh_ex_ord_msp_dt / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppMspDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6091.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordmspdt | 医技辅费用明细主键 | pk_ordmspdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmsp | 医技辅执行 | pk_ordmsp | varchar(50) |  | 字符串 (String) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_item | 收费项目 | pk_item | varchar(50) |  | 字符串 (String) |
| 7 | quan | 数量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | flag_entry | 录入标志 | flag_entry | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_org_entry | 录入机构 | pk_org_entry | varchar(50) |  | 字符串 (String) |
| 12 | pk_dept_entry | 录入科室 | pk_dept_entry | varchar(50) |  | 字符串 (String) |
| 13 | pk_psn_entry | 录入人 | pk_psn_entry | varchar(50) |  | 字符串 (String) |
| 14 | name_psn_entry | 录入人姓名 | name_psn_entry | varchar(50) |  | 字符串 (String) |
| 15 | date_entry | 录入日期 | date_entry | varchar(50) |  | 字符串 (String) |
| 16 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
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
| 37 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 38 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 39 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 40 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
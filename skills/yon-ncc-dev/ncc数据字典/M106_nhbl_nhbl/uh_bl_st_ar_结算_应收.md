# |<<

**结算_应收 (uh_bl_st_ar / com.yonyou.yh.nhis.bl.sett.vo.BLSettleARVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5952.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_star | 结算应收主键 | pk_star | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_st | 结算 | pk_st | varchar(20) |  | 结算 (BLSettleVO) |
| 5 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 6 | eu_direct | 应收方向 | eu_direct | int |  | 整数 (Integer) |
| 7 | en_direct | 应收方向new | en_direct | int |  | 整数 (Integer) |
| 8 | amt_ar | 应收金额 | amt_ar | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | amt_pay | 实收金额 | amt_pay | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | flag_cl | 结清标志 | flag_cl | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | reason_ar | 未结清原因 | reason_ar | varchar(256) |  | 字符串 (String) |
| 12 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 13 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 33 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 35 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
# |<<

**收款_付款机构 (uh_bl_pay_payer / com.yonyou.yh.nhis.bl.pay.vo.BLPayerPayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5943.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paypayer | 收款付款机构主键 | pk_paypayer | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_payer | 付款机构 | pk_payer | varchar(20) |  | 医保付款机构 (PayerVO) |
| 5 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 6 | pk_paymode | 付款方式 | pk_paymode | varchar(20) |  | 字符串 (String) |
| 7 | dt_paymode | 付款方式编码 | dt_paymode | char(20) |  | 字符串 (String) |
| 8 | amount | 付款金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | date_begin | 付款区间开始日期 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 10 | date_end | 付款区间结束日期 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 11 | invno_fi | 开立财务发票号码 | invno_fi | varchar(30) |  | 字符串 (String) |
| 12 | pk_psn_pay | 收款人 | pk_psn_pay | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | pk_dept_pay | 收款部门 | pk_dept_pay | varchar(20) |  | 组织_部门 (dept) |
| 14 | date_pay | 收款日期 | date_pay | char(19) |  | 日期时间 (UFDateTime) |
| 15 | name_psn_pay | 收款人名称 | name_psn_pay | varchar(50) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 36 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 37 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 38 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 39 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
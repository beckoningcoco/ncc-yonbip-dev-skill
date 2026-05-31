# |<<

**收付款_付款机构 (uh_bl_pay_pv_payer / com.yonyou.yh.nhis.bl.pay.vo.BLPayPvPayerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5948.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paypvpayer | 主键 | pk_paypvpayer | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_paypati | 收付款患者 | pk_paypati | varchar(20) |  | 就诊收款 (BLPayPvVO) |
| 5 | pk_payer | 付歀机构 | pk_payer | varchar(20) |  | 医保付款机构 (PayerVO) |
| 6 | amount | 收付歀金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | date_pay | 收款日期 | date_pay | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_dept_pay | 收款部门 | pk_dept_pay | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn_pay | 收款人 | pk_psn_pay | varchar(50) |  | 字符串 (String) |
| 10 | name_psn_pay | 收款人名称 | name_psn_pay | varchar(50) |  | 字符串 (String) |
| 11 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 12 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 13 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 14 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 15 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 16 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |
| 17 | def6 | def6 | def6 | varchar(50) |  | 字符串 (String) |
| 18 | def7 | def7 | def7 | varchar(50) |  | 字符串 (String) |
| 19 | def8 | def8 | def8 | varchar(50) |  | 字符串 (String) |
| 20 | def9 | def9 | def9 | varchar(50) |  | 字符串 (String) |
| 21 | def10 | def10 | def10 | varchar(50) |  | 字符串 (String) |
| 22 | def11 | def11 | def11 | varchar(50) |  | 字符串 (String) |
| 23 | def12 | def12 | def12 | varchar(50) |  | 字符串 (String) |
| 24 | def13 | def13 | def13 | varchar(50) |  | 字符串 (String) |
| 25 | def14 | def14 | def14 | varchar(50) |  | 字符串 (String) |
| 26 | def15 | def15 | def15 | varchar(50) |  | 字符串 (String) |
| 27 | def16 | def16 | def16 | varchar(50) |  | 字符串 (String) |
| 28 | def17 | def17 | def17 | varchar(50) |  | 字符串 (String) |
| 29 | def18 | def18 | def18 | varchar(50) |  | 字符串 (String) |
| 30 | def19 | def19 | def19 | varchar(50) |  | 字符串 (String) |
| 31 | def20 | def20 | def20 | varchar(50) |  | 字符串 (String) |
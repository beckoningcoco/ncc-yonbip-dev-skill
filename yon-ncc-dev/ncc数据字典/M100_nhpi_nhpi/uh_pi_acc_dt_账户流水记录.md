# |<<

**账户流水记录 (uh_pi_acc_dt / com.yonyou.yh.nhis.pi.patiaccountqry.vo.PatiAccDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6170.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accdt | 账户流水记录主键 | pk_accdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_pati | 患者账户 | pk_pati | char(20) |  | 主键 (UFID) |
| 5 | pk_pv | 患者就诊 | pk_pv | char(20) |  | 主键 (UFID) |
| 6 | date_opr | 发生日期 | date_opr | char(19) |  | 日期时间 (UFDateTime) |
| 7 | desc_opr | 业务说明 | desc_opr | varchar(50) |  | 字符串 (String) |
| 8 | amt_debit | 借方金额 | amt_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | amt_credit | 贷方金额 | amt_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | balance | 当前余额 | balance | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | code_pipay | 关联收退款记录 | code_pipay | varchar(50) |  | 字符串 (String) |
| 12 | code_cg | 关联记费编码 | code_cg | varchar(50) |  | 字符串 (String) |
| 13 | code_pvpay | 关联结算支付 | code_pvpay | varchar(50) |  | 字符串 (String) |
| 14 | pk_patiacc | 患者账户主键 | pk_patiacc | char(20) |  | 主键 (UFID) |
| 15 | pk_paypati_link | 关联预交金收款 | pk_paypati_link | varchar(50) |  | 字符串 (String) |
| 16 | eu_type | 操作类型 | eu_type | int |  | 整数 (Integer) |
| 17 | eu_direct | 方向 | eu_direct | int |  | 整数 (Integer) |
| 18 | pk_psn_pay | 收款人 | pk_psn_pay | varchar(50) |  | 字符串 (String) |
| 19 | name_psn_pay | 收款人名称 | name_psn_pay | varchar(50) |  | 字符串 (String) |
| 20 | pk_dept_pay | 收款人部门 | pk_dept_pay | varchar(50) |  | 字符串 (String) |
| 21 | pk_st | 结算主键 | pk_st | varchar(50) |  | 字符串 (String) |
| 22 | acc_consume | 账户消费标志 | acc_consume | char(1) |  | 布尔类型 (UFBoolean) |
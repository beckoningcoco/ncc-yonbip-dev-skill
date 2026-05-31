# |<<

**患者收付款门诊 (uh_bl_pay_pi / com.yonyou.yh.nhis.bl.pay.vo.BLPayPiMzVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5945.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paypati | 收款患者主键 | pk_paypati | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_pati | 患者编码 | pk_pati | char(20) |  | 主键 (UFID) |
| 5 | amt_before | 收退前金额 | amt_before | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | eu_direct | 收退方向 | eu_direct | varchar(50) |  | 字符串 (String) |
| 7 | amount | 收退款金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_paymode | 收付款主键 | pk_paymode | varchar(50) |  | 字符串 (String) |
| 9 | dt_paymode | 收付款方式编码 | dt_paymode | varchar(50) |  | 字符串 (String) |
| 10 | amt_after | 收退后金额 | amt_after | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_bankdoc | 银行 | pk_bankdoc | char(20) |  | 主键 (UFID) |
| 12 | bankno | 银行卡号 | bankno | varchar(50) |  | 字符串 (String) |
| 13 | paymodenode | 收付款方式信息 | paymodenode | varchar(50) |  | 字符串 (String) |
| 14 | date_pay | 收款日期 | date_pay | char(19) |  | 日期时间 (UFDateTime) |
| 15 | pk_org_pay | 收款机构 | pk_org_pay | char(20) |  | 主键 (UFID) |
| 16 | pk_dept_pay | 收款部门 | pk_dept_pay | char(20) |  | 主键 (UFID) |
| 17 | pk_psn_pay | 收款人 | pk_psn_pay | char(20) |  | 主键 (UFID) |
| 18 | name_psn_pay | 收款人名称 | name_psn_pay | varchar(50) |  | 字符串 (String) |
| 19 | flag_blcc | 结账标志 | flag_blcc | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | pk_blcc | 操作员结账 | pk_blcc | char(20) |  | 主键 (UFID) |
| 21 | code_rept | 收据编号 | code_rept | varchar(50) |  | 字符串 (String) |
| 22 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 23 | pk_st_link | 关联结算 | pk_st_link | varchar(50) |  | 字符串 (String) |
| 24 | pk_patiacc | 患者账户主键 | pk_patiacc | varchar(20) |  | 字符串 (String) |
| 25 | amt_remain | 本预交金余额 | amt_remain | decimal(22, 8) |  | 数值 (UFDouble) |
| 26 | valid_date | 有效期至 | valid_date | char(19) |  | 日期时间 (UFDateTime) |
| 27 | forbid_cash | 禁止提现 | forbid_cash | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | flag_link_zero | 关联清零标志 | flag_link_zero | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | pk_paypati_link | 关联预交金收退款 | pk_paypati_link | varchar(50) |  | 字符串 (String) |
| 30 | trans_code | 交易流水号 | trans_code | varchar(50) |  | 字符串 (String) |
| 31 | dt_prepay_type | 预交金类型编码 | dt_prepay_type | varchar(50) |  | 字符串 (String) |
| 32 | pk_prepay_type | 预交金类型 | pk_prepay_type | char(20) |  | 主键 (UFID) |
| 33 | dt_source | 来源编码 | dt_source | varchar(20) |  | 字符串 (String) |
| 34 | pk_source | 来源主键 | pk_source | varchar(20) |  | 字符串 (String) |
| 35 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 36 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 37 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 38 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 39 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 40 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 41 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 42 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 43 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 44 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |
| 45 | def11 | 自定义项11 | def11 | varchar(50) |  | 字符串 (String) |
| 46 | def12 | 自定义项12 | def12 | varchar(50) |  | 字符串 (String) |
| 47 | def13 | 自定义项13 | def13 | varchar(50) |  | 字符串 (String) |
| 48 | def14 | 自定义项14 | def14 | varchar(50) |  | 字符串 (String) |
| 49 | def15 | 自定义项15 | def15 | varchar(50) |  | 字符串 (String) |
| 50 | def16 | 自定义项16 | def16 | varchar(50) |  | 字符串 (String) |
| 51 | def17 | 自定义项17 | def17 | varchar(50) |  | 字符串 (String) |
| 52 | def18 | 自定义项18 | def18 | varchar(50) |  | 字符串 (String) |
| 53 | def19 | 自定义项19 | def19 | varchar(50) |  | 字符串 (String) |
| 54 | def20 | 自定义项20 | def20 | varchar(50) |  | 字符串 (String) |
| 55 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 56 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 57 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 58 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
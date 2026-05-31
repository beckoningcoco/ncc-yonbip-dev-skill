# |<<

**医保结算 (zzhp_st / com.yonyou.yh.nhis.hp.zz.vo.ZZHPStVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6405.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpst | 医保结算 | pk_hpst | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_hp | 医保类型 | pk_hp | varchar(20) |  | 字符串 (String) |
| 5 | pk_hppv | 医保就诊 | pk_hppv | varchar(20) |  | 字符串 (String) |
| 6 | code_pv | 医保就诊编码 | code_pv | char(20) |  | 主键 (UFID) |
| 7 | pk_pvtype | 就诊类别 | pk_pvtype | varchar(20) |  | 字符串 (String) |
| 8 | code_pvtype | 就诊类别编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 9 | pk_pati | 患者 | pk_pati | varchar(20) |  | 字符串 (String) |
| 10 | code_hp | 医保卡号 | code_hp | varchar(30) |  | 字符串 (String) |
| 11 | date_st | 结算日期 | date_st | char(19) |  | 日期时间 (UFDateTime) |
| 12 | amount_st | 结算金额 | amount_st | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | pk_psn_opt | 操作人 | pk_psn_opt | varchar(20) |  | 字符串 (String) |
| 14 | name_psn_opt | 操作人姓名 | name_psn_opt | varchar(50) |  | 字符串 (String) |
| 15 | code_district | 所属地区代码 | code_district | varchar(20) |  | 字符串 (String) |
| 16 | name_district | 所属地区名称 | name_district | varchar(50) |  | 字符串 (String) |
| 17 | note | 补偿信息说明 | note | varchar(50) |  | 字符串 (String) |
| 18 | flag_spec_compst | 特殊补偿标识 | flag_spec_compst | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | conut_ip | 住院次数 | conut_ip | int |  | 整数 (Integer) |
| 20 | name_male_employ | 男职工配偶姓名 | name_male_employ | varchar(50) |  | 字符串 (String) |
| 21 | code_plan | 统筹区号 | code_plan | varchar(50) |  | 字符串 (String) |
| 22 | num__business | 交易流水号 | num__business | varchar(50) |  | 字符串 (String) |
| 23 | flag_writecard | 写卡标识 | flag_writecard | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | account_year | 账户年度 | account_year | varchar(50) |  | 字符串 (String) |
| 25 | date_ipend | 写卡出院日期 | date_ipend | char(19) |  | 日期时间 (UFDateTime) |
| 26 | invoice_bl | 发票打印医保信息 | invoice_bl | varchar(500) |  | 字符串 (String) |
| 27 | flag_canc | 取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | pk_st | 对应的结算主键 | pk_st | varchar(20) |  | 字符串 (String) |
| 29 | enclosed_premium | 围保费 | enclosed_premium | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | def1 | 自定义项1 | def1 | varchar(2000) |  | 字符串 (String) |
| 31 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 50 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 51 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 52 | modifier | 修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 53 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
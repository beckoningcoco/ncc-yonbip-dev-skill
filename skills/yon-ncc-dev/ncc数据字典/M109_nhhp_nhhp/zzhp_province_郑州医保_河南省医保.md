# |<<

**郑州医保_河南省医保 (zzhp_province / com.yonyou.yh.nhis.hp.zzhp.province.vo.ZZHPProvinceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_zzhp_province | 主键 | pk_zzhp_province | char(20) | √ | 主键 (UFID) |
| 2 | scenetype | 场景类型 | scenetype | varchar(50) |  | 字符串 (String) |
| 3 | zyno | 上传给医保的住院号 | zyno | varchar(50) |  | 字符串 (String) |
| 4 | patiname | 姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 5 | patisex | 性别 | patisex | varchar(50) |  | 字符串 (String) |
| 6 | idno | 身份证号 | idno | varchar(50) |  | 字符串 (String) |
| 7 | date_birth | 出生日期 | date_birth | char(10) |  | 模糊日期 (UFLiteralDate) |
| 8 | psn_type | 人员类别 | psn_type | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 9 | medical_cate | 医疗类别 | medical_cate | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 10 | hpitem_code | 疾病编码 | hpitem_code | varchar(50) |  | 字符串 (String) |
| 11 | pk_hpitem | 医保服务疾病主键 | pk_hpitem | varchar(50) |  | 字符串 (String) |
| 12 | hpitem_name | 疾病名称 | hpitem_name | varchar(256) |  | 字符串 (String) |
| 13 | account_used | 账户使用 | account_used | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 14 | lvhos_reason | 出院原因 | lvhos_reason | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 15 | account_balance | 账户余额 | account_balance | decimal(8, 2) |  | 数值 (UFDouble) |
| 16 | medical_fee | 医疗费用累计 | medical_fee | decimal(8, 2) |  | 数值 (UFDouble) |
| 17 | cash_outlay | 现金支出累计 | cash_outlay | decimal(8, 2) |  | 数值 (UFDouble) |
| 18 | account_expense | 账户支出累计 | account_expense | decimal(8, 2) |  | 数值 (UFDouble) |
| 19 | overall_expense | 统筹支出累计 | overall_expense | decimal(8, 2) |  | 数值 (UFDouble) |
| 20 | civil_subsidies | 公务员补助支出累计 | civil_subsidies | decimal(8, 2) |  | 数值 (UFDouble) |
| 21 | own_expense | 自费累计 | own_expense | decimal(8, 2) |  | 数值 (UFDouble) |
| 22 | accumulate_self | 自理累计 | accumulate_self | decimal(8, 2) |  | 数值 (UFDouble) |
| 23 | cumulative_pay | 自付累计 | cumulative_pay | decimal(8, 2) |  | 数值 (UFDouble) |
| 24 | hospital_times | 本年住院次数 | hospital_times | varchar(50) |  | 字符串 (String) |
| 25 | chronic_code | 慢病编码 | chronic_code | varchar(50) |  | 字符串 (String) |
| 26 | bed_num | 床号 | bed_num | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 27 | inhos_state | 在院状态 | inhos_state | varchar(50) |  | 字符串 (String) |
| 28 | complications | 并发症情况 | complications | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 29 | reimburse_sign | 报销标志 | reimburse_sign | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 30 | fixed_charge | 固定费用 | fixed_charge | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 31 | pk_pv | HIS就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 32 | pvcode | 就诊编码 | pvcode | varchar(50) |  | 字符串 (String) |
| 33 | ishos_flag | 门诊住院标志 | ishos_flag | varchar(50) |  | 字符串 (String) |
| 34 | pk_hp | 医保类型 | pk_hp | varchar(50) |  | 字符串 (String) |
| 35 | isregs_flag | 登记撤销标志 | isregs_flag | varchar(50) |  | 字符串 (String) |
| 36 | regsaveswiftnum | 登记交易流水号 | regsaveswiftnum | varchar(50) |  | 字符串 (String) |
| 37 | newborn_count | 胎儿数 | newborn_count | int |  | 整数 (Integer) |
| 38 | newborn_times | 胎次 | newborn_times | int |  | 整数 (Integer) |
| 39 | birthcrt_opera | 计划生育手术(暂时不使用) | birthcrt_opera | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 40 | gestational_weeks | 孕周 | gestational_weeks | varchar(50) |  | 字符串 (String) |
| 41 | produce_mode | 生产方式 | produce_mode | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 42 | pregnancy_date | 生育或妊娠时间 | pregnancy_date | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 43 | birthopera_cate | 生育手术类别 | birthopera_cate | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 44 | birthcertificate_num | 生育证号 | birthcertificate_num | varchar(50) |  | 字符串 (String) |
| 45 | antenatal_sign | 产前检查标志 | antenatal_sign | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 46 | manid | 男配偶身份证 | manid | varchar(50) |  | 字符串 (String) |
| 47 | manname | 男配偶姓名 | manname | varchar(50) |  | 字符串 (String) |
| 48 | flag_8month | 是否8个月 | flag_8month | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | palcenum | 地区编码 | palcenum | varchar(50) |  | 字符串 (String) |
| 50 | def1 | 自定义项1 | def1 | varchar(2000) |  | 字符串 (String) |
| 51 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
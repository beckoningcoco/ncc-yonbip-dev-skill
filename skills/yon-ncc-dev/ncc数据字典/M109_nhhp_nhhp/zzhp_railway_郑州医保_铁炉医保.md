# |<<

**郑州医保_铁炉医保 (zzhp_railway / com.yonyou.yh.nhis.hp.zzhp.railway.vo.ZZHPRailwayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_zzhp_railway | 主键 | pk_zzhp_railway | char(20) | √ | 主键 (UFID) |
| 2 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 3 | pvcode | HIS就诊编码 | pvcode | varchar(50) |  | 字符串 (String) |
| 4 | icno | ic卡号 | icno | varchar2(20)(50) |  | 字符串 (String) |
| 5 | psn_code | 个人编码 | psn_code | varchar(50) |  | 字符串 (String) |
| 6 | dept_code | 单位编码 | dept_code | varchar(50) |  | 字符串 (String) |
| 7 | idno | 身份证号 | idno | varchar(50) |  | 字符串 (String) |
| 8 | patiname | 姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 9 | patisex | 性别 | patisex | varchar(50) |  | 字符串 (String) |
| 10 | date_birth | 出生日期 | date_birth | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | psn_type | 人员类别 | psn_type | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 12 | inhos_state | 在院状态 | inhos_state | int |  | 整数 (Integer) |
| 13 | last_hosname | 上次住院医院编码 | last_hosname | varchar(100) |  | 字符串 (String) |
| 14 | lvhos_date | 出院日期 | lvhos_date | char(19) |  | 日期 (UFDate) |
| 15 | inhos_diagno | 入院诊断 | inhos_diagno | varchar(50) |  | 字符串 (String) |
| 16 | medical_cate | 医疗类别 | medical_cate | varchar(20) |  | 医保对照表 (ZZHPMapVO) |
| 17 | cumulative_stand | 起伏线标准 | cumulative_stand | varchar(50) |  | 字符串 (String) |
| 18 | cumulative_pay | 起伏线自付 | cumulative_pay | varchar(50) |  | 字符串 (String) |
| 19 | annual | 年度 | annual | varchar(50) |  | 字符串 (String) |
| 20 | hospital_times | 本年住院次数 | hospital_times | varchar(50) |  | 字符串 (String) |
| 21 | account_expense | 本年账户支出累计 | account_expense | decimal(8, 2) |  | 数值 (UFDouble) |
| 22 | overall_expense | 本年统筹累计 | overall_expense | decimal(8, 2) |  | 数值 (UFDouble) |
| 23 | account_balance | 账户余额 | account_balance | decimal(8, 2) |  | 数值 (UFDouble) |
| 24 | hp_code | 医保编码 | hp_code | varchar(50) |  | 字符串 (String) |
| 25 | card_type | 住院读卡类型 | card_type | varchar(50) |  | 字符串 (String) |
| 26 | psn_opera | 经办人 | psn_opera | varchar(50) |  | 字符串 (String) |
| 27 | ishos_flag | 门诊住院标志 | ishos_flag | varchar(50) |  | 字符串 (String) |
| 28 | isregs_flag | 登记撤销标志 | isregs_flag | varchar(50) |  | 字符串 (String) |
| 29 | def1 | 自定义项1 | def1 | varchar(2000) |  | 字符串 (String) |
| 30 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
# |<<

**门诊收入明细 (hpf_clinic_income_b / nc.vo.hpf.ictf.clinic_income.ClinicIncomebVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2615.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_clinic_income_b | 门诊收入明细 | pk_clinic_income_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_mid_clinic_income | 中间表主键 | pk_mid_clinic_income | varchar(50) |  | 字符串 (String) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | dbusdate | 核算日期 | dbusdate | char(19) |  | 日期 (UFDate) |
| 5 | vincomeclass | 收入分类 | vincomeclass | varchar(50) |  | 字符串 (String) |
| 6 | vincometypecode | 收入项目编码 | vincometypecode | varchar(50) |  | 字符串 (String) |
| 7 | vincometypename | 收入项目名称 | vincometypename | varchar(100) |  | 字符串 (String) |
| 8 | pk_mid_incometype | 第三方收入项目 | pk_mid_incometype | varchar(20) |  | 来源收入项目 (incometype) |
| 9 | vchargetypecode | 收费项目编码 | vchargetypecode | varchar(50) |  | 字符串 (String) |
| 10 | vchargetypename | 收费项目名称 | vchargetypename | varchar(100) |  | 字符串 (String) |
| 11 | pk_mid_chargetype | 第三方收费项目 | pk_mid_chargetype | varchar(20) |  | 来源收费项目 (chargetype) |
| 12 | pk_chargetype | HRP收费项目 | pk_chargetype | varchar(20) |  | 会计科目 (accasoa) |
| 13 | vexedeptcode | 执行科室编码 | vexedeptcode | varchar(50) |  | 字符串 (String) |
| 14 | vexedeptname | 执行科室名称 | vexedeptname | varchar(50) |  | 字符串 (String) |
| 15 | pk_mid_exedept | 第三方执行科室 | pk_mid_exedept | varchar(20) |  | 来源科室档案 (HpcfDeptVO) |
| 16 | pk_exedept | HRP执行科室 | pk_exedept | varchar(20) |  | 组织_部门 (dept) |
| 17 | vchargercode | 收费员编码 | vchargercode | varchar(50) |  | 字符串 (String) |
| 18 | vchargername | 收费员名称 | vchargername | varchar(50) |  | 字符串 (String) |
| 19 | pk_mid_charger | 第三方收费员 | pk_mid_charger | varchar(20) |  | 收费员档案 (ChergePersonVO) |
| 20 | pk_charger | HRP收费员 | pk_charger | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | vpaywaycode | 支付方式编码 | vpaywaycode | varchar(50) |  | 字符串 (String) |
| 22 | vpaywayname | 支付方式名称 | vpaywayname | varchar(50) |  | 字符串 (String) |
| 23 | pk_mid_payway | 第三方支付方式 | pk_mid_payway | varchar(20) |  | 来源支付方式 (payway) |
| 24 | pk_payway | HRP结算方式 | pk_payway | varchar(20) |  | 结算方式 (balatype) |
| 25 | vapplydeptcode | 开单科室编码 | vapplydeptcode | varchar(50) |  | 字符串 (String) |
| 26 | vapplydeptname | 开单科室名称 | vapplydeptname | varchar(50) |  | 字符串 (String) |
| 27 | pk_mid_applydept | 第三方开单科室 | pk_mid_applydept | varchar(20) |  | 来源科室档案 (HpcfDeptVO) |
| 28 | pk_applydept | HRP开单科室 | pk_applydept | varchar(20) |  | 组织_部门 (dept) |
| 29 | vpayorgtypecode | 支付机构类别编码 | vpayorgtypecode | varchar(50) |  | 字符串 (String) |
| 30 | vpayorgtypename | 支付机构类别名称 | vpayorgtypename | varchar(50) |  | 字符串 (String) |
| 31 | pk_mid_payorgtype | 第三方支付机构类别 | pk_mid_payorgtype | varchar(20) |  | 来源支付机构类别 (payorg) |
| 32 | pk_payorgtype | HRP支付机构类别 | pk_payorgtype | varchar(20) |  | 支付机构类别(自定义档案) (Defdoc-D10308) |
| 33 | vcustcode | 客户编码 | vcustcode | varchar(50) |  | 字符串 (String) |
| 34 | vcustname | 客户名称 | vcustname | varchar(50) |  | 字符串 (String) |
| 35 | pk_mid_vcust | 第三方客户 | pk_mid_vcust | varchar(20) |  | 来源客户档案 (cust) |
| 36 | pk_cust | HRP客户 | pk_cust | varchar(20) |  | 客户基本信息 (customer) |
| 37 | pk_supp | HRP客商 | pk_supp | varchar(20) |  | 客商 (custsupplier) |
| 38 | vdoctorname | 医生名称 | vdoctorname | varchar(50) |  | 字符串 (String) |
| 39 | vdoctorcode | 医生编码 | vdoctorcode | varchar(50) |  | 字符串 (String) |
| 40 | pk_mid_doctor | 第三方医生 | pk_mid_doctor | varchar(50) |  | 字符串 (String) |
| 41 | pk_doctor_dept | HRP医生科室 | pk_doctor_dept | varchar(20) |  | 组织_部门 (dept) |
| 42 | dinprice | 进价 | dinprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nmny | 计价金额 | nmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 44 | pawpaynmny | 结算金额 | pawpaynmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 45 | acceptrefund | 收退 | acceptrefund | varchar(50) |  | 字符串 (String) |
| 46 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 47 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 76 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 77 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 78 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 79 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 80 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 81 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 82 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 83 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 84 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 85 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 86 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
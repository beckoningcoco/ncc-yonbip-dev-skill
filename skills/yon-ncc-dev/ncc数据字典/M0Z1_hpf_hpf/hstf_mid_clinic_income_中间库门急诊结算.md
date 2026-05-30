# |<<

**中间库门急诊结算 (hstf_mid_clinic_income / nc.vo.hpf.clinicincome.Midclinicincome)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2773.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mid_clinic_income | 主键 | pk_mid_clinic_income | char(20) | √ | 主键 (UFID) |
| 2 | syscode | 来源系统编码 | syscode | varchar(50) |  | 字符串 (String) |
| 3 | transtype | 交易类型 | transtype | varchar(50) |  | 字符串 (String) |
| 4 | dbusdate | 结算日期 | dbusdate | char(10) |  | 日期 (UFDate) |
| 5 | vincomeclass | 收入分类 | vincomeclass | varchar(50) |  | 字符串 (String) |
| 6 | vincometypecode | 收入项目编码 | vincometypecode | varchar(50) |  | 字符串 (String) |
| 7 | vincometypename | 收入项目名称 | vincometypename | varchar(50) |  | 字符串 (String) |
| 8 | vchargetypecode | 收费项目编码 | vchargetypecode | varchar(50) |  | 字符串 (String) |
| 9 | vchargetypename | 收费项目名称 | vchargetypename | varchar(50) |  | 字符串 (String) |
| 10 | vexedeptcode | 执行科室编码 | vexedeptcode | varchar(50) |  | 字符串 (String) |
| 11 | vexedeptname | 执行科室名称 | vexedeptname | varchar(50) |  | 字符串 (String) |
| 12 | vchargercode | 收费员编码 | vchargercode | varchar(50) |  | 字符串 (String) |
| 13 | vchargername | 收费员名称 | vchargername | varchar(50) |  | 字符串 (String) |
| 14 | vpaywaycode | 支付方式编码 | vpaywaycode | varchar(50) |  | 字符串 (String) |
| 15 | vpaywayname | 支付方式名称 | vpaywayname | varchar(50) |  | 字符串 (String) |
| 16 | vapplydeptcode | 开单科室编码 | vapplydeptcode | varchar(50) |  | 字符串 (String) |
| 17 | vapplydeptname | 开单科室名称 | vapplydeptname | varchar(50) |  | 字符串 (String) |
| 18 | nquantity | 数量 | nquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nmny | 计价金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | vpayorgtypecode | 支付机构类别编码 | vpayorgtypecode | varchar(50) |  | 字符串 (String) |
| 21 | vpayorgtypename | 支付机构类别名称 | vpayorgtypename | varchar(50) |  | 字符串 (String) |
| 22 | vcustcode | 客户编码 | vcustcode | varchar(50) |  | 字符串 (String) |
| 23 | vcustname | 客户名称 | vcustname | varchar(50) |  | 字符串 (String) |
| 24 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 25 | executedeptcodeone | 执行科室1编码 | executedeptcodeone | varchar(50) |  | 字符串 (String) |
| 26 | executedeptnameone | 执行科室1名称 | executedeptnameone | varchar(50) |  | 字符串 (String) |
| 27 | executedoctorcodeone | 执行医生1编码 | executedoctorcodeone | varchar(50) |  | 字符串 (String) |
| 28 | executedoctornameone | 执行医生1名称 | executedoctornameone | varchar(50) |  | 字符串 (String) |
| 29 | executedeptcodetwo | 执行科室2编码 | executedeptcodetwo | varchar(50) |  | 字符串 (String) |
| 30 | executedeptnametwo | 执行科室2名称 | executedeptnametwo | varchar(50) |  | 字符串 (String) |
| 31 | executedoctorcodetwo | 执行医生2编码 | executedoctorcodetwo | varchar(50) |  | 字符串 (String) |
| 32 | executedoctornametwo | 执行医生2名称 | executedoctornametwo | varchar(50) |  | 字符串 (String) |
| 33 | executedeptcodethree | 执行科室3编码 | executedeptcodethree | varchar(50) |  | 字符串 (String) |
| 34 | executedeptnamethree | 执行科室3名称 | executedeptnamethree | varchar(50) |  | 字符串 (String) |
| 35 | executedoctorcodethree | 执行医生3编码 | executedoctorcodethree | varchar(50) |  | 字符串 (String) |
| 36 | executedoctornamethree | 执行医生3名称 | executedoctornamethree | varchar(50) |  | 字符串 (String) |
| 37 | executedeptcodefour | 执行科室4编码 | executedeptcodefour | varchar(50) |  | 字符串 (String) |
| 38 | executedeptnamefour | 执行科室4名称 | executedeptnamefour | varchar(50) |  | 字符串 (String) |
| 39 | executedoctorcodefour | 执行医生4编码 | executedoctorcodefour | varchar(50) |  | 字符串 (String) |
| 40 | executedoctornamefour | 执行医生4名称 | executedoctornamefour | varchar(50) |  | 字符串 (String) |
| 41 | acceptrefund | 收退 | acceptrefund | varchar(50) |  | 字符串 (String) |
| 42 | vapplydoctorcode | 开单医生编码 | vapplydoctorcode | varchar(50) |  | 字符串 (String) |
| 43 | vapplydoctorname | 开单医生名称 | vapplydoctorname | varchar(50) |  | 字符串 (String) |
| 44 | billstype | 票据类型 | billstype | varchar(50) |  | 字符串 (String) |
| 45 | billscode | 票据ID | billscode | varchar(50) |  | 字符串 (String) |
| 46 | vpatientcode | 病人ID | vpatientcode | varchar(50) |  | 字符串 (String) |
| 47 | vpatientname | 病人名称 | vpatientname | varchar(50) |  | 字符串 (String) |
| 48 | diagnosiscode | 诊疗区编码 | diagnosiscode | varchar(50) |  | 字符串 (String) |
| 49 | diagnosisname | 诊疗区名称 | diagnosisname | varchar(50) |  | 字符串 (String) |
| 50 | medicaltype | 医保类型 | medicaltype | varchar(50) |  | 字符串 (String) |
| 51 | dinprice | 进价 | dinprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | valuationnmny | 单价 | valuationnmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | pawpaynmny | 结算金额 | pawpaynmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | fetrange | 数据类型 | fetrange | int |  | 整数 (Integer) |
| 55 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 56 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 57 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 58 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 59 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 60 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 61 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 62 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 63 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 64 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 65 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 66 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 67 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 68 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 69 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 70 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 71 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 72 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 73 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 74 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 75 | def21 | 自定义项21 | def21 | varchar(100) |  | 字符串 (String) |
| 76 | def22 | 自定义项22 | def22 | varchar(100) |  | 字符串 (String) |
| 77 | def23 | 自定义项23 | def23 | varchar(100) |  | 字符串 (String) |
| 78 | def24 | 自定义项24 | def24 | varchar(100) |  | 字符串 (String) |
| 79 | def25 | 自定义项25 | def25 | varchar(100) |  | 字符串 (String) |
| 80 | def26 | 自定义项26 | def26 | varchar(100) |  | 字符串 (String) |
| 81 | def27 | 自定义项27 | def27 | varchar(100) |  | 字符串 (String) |
| 82 | def28 | 自定义项28 | def28 | varchar(100) |  | 字符串 (String) |
| 83 | def29 | 自定义项29 | def29 | varchar(100) |  | 字符串 (String) |
| 84 | def30 | 自定义项30 | def30 | varchar(100) |  | 字符串 (String) |
| 85 | def31 | 自定义项31 | def31 | decimal(28, 8) |  | 数值 (UFDouble) |
| 86 | def32 | 自定义项32 | def32 | decimal(28, 8) |  | 数值 (UFDouble) |
| 87 | def33 | 自定义项33 | def33 | decimal(28, 8) |  | 数值 (UFDouble) |
| 88 | def34 | 自定义项34 | def34 | decimal(28, 8) |  | 数值 (UFDouble) |
| 89 | def35 | 自定义项35 | def35 | decimal(28, 8) |  | 数值 (UFDouble) |
| 90 | def36 | 自定义项36 | def36 | decimal(28, 8) |  | 数值 (UFDouble) |
| 91 | def37 | 自定义项37 | def37 | decimal(28, 8) |  | 数值 (UFDouble) |
| 92 | def38 | 自定义项38 | def38 | decimal(28, 8) |  | 数值 (UFDouble) |
| 93 | def39 | 自定义项39 | def39 | decimal(28, 8) |  | 数值 (UFDouble) |
| 94 | def40 | 自定义项40 | def40 | decimal(28, 8) |  | 数值 (UFDouble) |
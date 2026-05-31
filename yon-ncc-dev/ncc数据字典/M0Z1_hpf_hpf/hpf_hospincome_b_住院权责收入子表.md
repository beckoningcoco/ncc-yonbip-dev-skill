# |<<

**住院权责收入子表 (hpf_hospincome_b / nc.vo.hpf.hospincome.HospIncomeBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2628.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hospincome_b | 主键 | pk_hospincome_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | dbusdate | 核算日期 | dbusdate | char(19) |  | 日期 (UFDate) |
| 4 | vincomeclass | 收入分类 | vincomeclass | varchar(50) |  | 字符串 (String) |
| 5 | vchargetypecode | 收费项目编码 | vchargetypecode | varchar(50) |  | 字符串 (String) |
| 6 | vchargetypename | 收费项目名称 | vchargetypename | varchar(100) |  | 字符串 (String) |
| 7 | pk_mid_chargetype | 第三方收费项目 | pk_mid_chargetype | varchar(20) |  | 来源收费项目 (chargetype) |
| 8 | vincometypename | 收入项目名称 | vincometypename | varchar(100) |  | 字符串 (String) |
| 9 | vincometypecode | 收入项目编码 | vincometypecode | varchar(50) |  | 字符串 (String) |
| 10 | pk_mid_incometype | 第三方收入项目 | pk_mid_incometype | varchar(20) |  | 来源收入项目 (incometype) |
| 11 | vexedeptcode | 执行科室编码 | vexedeptcode | varchar(50) |  | 字符串 (String) |
| 12 | vexedeptname | 执行科室名称 | vexedeptname | varchar(50) |  | 字符串 (String) |
| 13 | pk_mid_exedept | 第三方执行科室 | pk_mid_exedept | varchar(20) |  | 来源科室档案 (HpcfDeptVO) |
| 14 | pk_exedept | HRP执行科室 | pk_exedept | varchar(20) |  | 组织_部门 (dept) |
| 15 | vapplydeptcode | 开单科室编码 | vapplydeptcode | varchar(50) |  | 字符串 (String) |
| 16 | vapplydeptname | 开单科室名称 | vapplydeptname | varchar(50) |  | 字符串 (String) |
| 17 | pk_mid_applydept | 第三方开单科室 | pk_mid_applydept | varchar(20) |  | 来源科室档案 (HpcfDeptVO) |
| 18 | pk_applydept | HRP开单科室 | pk_applydept | varchar(20) |  | 组织_部门 (dept) |
| 19 | dinprice | 进价 | dinprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nmny | 计价金额 | nmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | acceptrefund | 收退 | acceptrefund | varchar(50) |  | 字符串 (String) |
| 22 | vnote | 备注 | vnote | varchar(500) |  | 字符串 (String) |
| 23 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
# |<<

**住院预交金子表 (hpf_hospprepay_b / nc.vo.hpf.hospprepay.HospPrepayBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2630.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hosppreay_b | 主键 | pk_hosppreay_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | dbusdate | 核算日期 | dbusdate | char(19) |  | 日期 (UFDate) |
| 4 | vincomeclass | 收入分类 | vincomeclass | varchar(50) |  | 字符串 (String) |
| 5 | vpatientcode | 病人编码 | vpatientcode | varchar(50) |  | 字符串 (String) |
| 6 | vpatientname | 病人姓名 | vpatientname | varchar(50) |  | 字符串 (String) |
| 7 | pk_mid_patient | 第三方病人 | pk_mid_patient | varchar(20) |  | 病人信息 (patientinfo) |
| 8 | vchargercode | 收费员编码 | vchargercode | varchar(50) |  | 字符串 (String) |
| 9 | vchargername | 收费员名称 | vchargername | varchar(50) |  | 字符串 (String) |
| 10 | pk_mid_charger | 第三方收费员 | pk_mid_charger | varchar(20) |  | 收费员档案 (ChergePersonVO) |
| 11 | pk_charger | HRP收费员 | pk_charger | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | vpaywaycode | 支付方式编码 | vpaywaycode | varchar(50) |  | 字符串 (String) |
| 13 | vpaywayname | 支付方式名称 | vpaywayname | varchar(50) |  | 字符串 (String) |
| 14 | pk_mid_payway | 第三方支付方式 | pk_mid_payway | varchar(20) |  | 来源支付方式 (payway) |
| 15 | pk_payway | HRP结算方式 | pk_payway | varchar(20) |  | 结算方式 (balatype) |
| 16 | nmny | 金额 | nmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | acceptrefund | 收退 | acceptrefund | varchar(50) |  | 字符串 (String) |
| 18 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 19 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
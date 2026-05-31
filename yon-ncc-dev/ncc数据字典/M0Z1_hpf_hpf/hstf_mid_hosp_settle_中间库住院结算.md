# |<<

**中间库住院结算 (hstf_mid_hosp_settle / nc.vo.hpf.hospsettle.Midhospsettle)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mid_hosp_settle | 主键 | pk_mid_hosp_settle | char(20) | √ | 主键 (UFID) |
| 2 | syscode | 来源系统编码 | syscode | varchar(50) |  | 字符串 (String) |
| 3 | transtype | 交易类型 | transtype | varchar(50) |  | 字符串 (String) |
| 4 | dbusdate | 结算日期 | dbusdate | char(10) |  | 日期 (UFDate) |
| 5 | vincomeclass | 收入分类 | vincomeclass | varchar(50) |  | 字符串 (String) |
| 6 | vchargercode | 收费员编码 | vchargercode | varchar(50) |  | 字符串 (String) |
| 7 | vchargername | 收费员名称 | vchargername | varchar(50) |  | 字符串 (String) |
| 8 | vpaywaycode | 支付方式编码 | vpaywaycode | varchar(50) |  | 字符串 (String) |
| 9 | vpaywayname | 支付方式名称 | vpaywayname | varchar(50) |  | 字符串 (String) |
| 10 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vpayorgtypecode | 支付机构类别 | vpayorgtypecode | varchar(50) |  | 字符串 (String) |
| 12 | vpayorgtypename | 支付机构类别名称 | vpayorgtypename | varchar(50) |  | 字符串 (String) |
| 13 | vcustcode | 客户编码 | vcustcode | varchar(50) |  | 字符串 (String) |
| 14 | vcustname | 客户名称 | vcustname | varchar(50) |  | 字符串 (String) |
| 15 | vnote | 备注 | vnote | varchar(500) |  | 字符串 (String) |
| 16 | idateclass | 类型 | idateclass | varchar(50) |  | 字符串 (String) |
| 17 | acceptrefund | 收退 | acceptrefund | varchar(50) |  | 字符串 (String) |
| 18 | billstype | 票据类型 | billstype | varchar(50) |  | 字符串 (String) |
| 19 | billscode | 票据ID | billscode | varchar(50) |  | 字符串 (String) |
| 20 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 21 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 22 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 23 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 24 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 25 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 26 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 27 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 28 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 29 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 30 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 31 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 32 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 33 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 34 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 35 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 36 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 37 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 38 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 39 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 40 | def21 | 自定义项21 | def21 | varchar(100) |  | 字符串 (String) |
| 41 | def22 | 自定义项22 | def22 | varchar(100) |  | 字符串 (String) |
| 42 | def23 | 自定义项23 | def23 | varchar(100) |  | 字符串 (String) |
| 43 | def24 | 自定义项24 | def24 | varchar(100) |  | 字符串 (String) |
| 44 | def25 | 自定义项25 | def25 | varchar(100) |  | 字符串 (String) |
| 45 | def26 | 自定义项26 | def26 | varchar(100) |  | 字符串 (String) |
| 46 | def27 | 自定义项27 | def27 | varchar(100) |  | 字符串 (String) |
| 47 | def28 | 自定义项28 | def28 | varchar(100) |  | 字符串 (String) |
| 48 | def29 | 自定义项29 | def29 | varchar(100) |  | 字符串 (String) |
| 49 | def30 | 自定义项30 | def30 | varchar(100) |  | 字符串 (String) |
| 50 | def31 | 自定义项31 | def31 | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | def32 | 自定义项32 | def32 | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | def33 | 自定义项33 | def33 | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | def34 | 自定义项34 | def34 | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | def35 | 自定义项35 | def35 | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | def36 | 自定义项36 | def36 | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | def37 | 自定义项37 | def37 | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | def38 | 自定义项38 | def38 | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | def39 | 自定义项39 | def39 | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | def40 | 自定义项40 | def40 | decimal(28, 8) |  | 数值 (UFDouble) |
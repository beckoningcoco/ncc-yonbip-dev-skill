# |<<

**财管凭证表头 (fip_detailbook_h / nc.vo.fip.detailbook.DetailBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2231.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detailbook | 主键 | pk_detailbook | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_system | 来源系统 | pk_system | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | pk_srcbilltypeid | 来源单据类型 | pk_srcbilltypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | pk_srctradetypeid | 来源交易类型 | pk_srctradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | relationid | 来源标识 | relationid | varchar(50) |  | 字符串 (String) |
| 10 | pk_operator | 来源生效用户 | pk_operator | varchar(20) |  | 用户 (user) |
| 11 | billmoney | 来源金额 | billmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | billexplain | 来源备注 | billexplain | varchar(200) |  | 字符串 (String) |
| 13 | srcbillno | 来源单据编号 | srcbillno | varchar(20) |  | 字符串 (String) |
| 14 | billno | 单据编号 | billno | varchar(20) |  | 字符串 (String) |
| 15 | busidate | 业务日期 | busidate | char(19) |  | 日期 (UFDate) |
| 16 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 17 | pk_subjcode | 收支项目 | pk_subjcode | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 18 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 19 | supplier | 供应商 | supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 20 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | pk_deptid | 部门 | pk_deptid | varchar(20) |  | 组织_部门 (dept) |
| 22 | pk_deptid_v | 部门版本 | pk_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 23 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 24 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 25 | pk_vouchertype | 总账凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 26 | resavouchertype | 责任凭证类别 | resavouchertype | varchar(20) |  | 字符串 (String) |
| 27 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 28 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 29 | year | 会计年度 | year | char(4) |  | 字符串 (String) |
| 30 | period | 会计期间 | period | char(2) |  | 字符串 (String) |
| 31 | attachment | 附单据数 | attachment | int |  | 整数 (Integer) |
| 32 | pk_prepared | 制单人 | pk_prepared | varchar(20) |  | 用户 (user) |
| 33 | voucherkind | 凭证类型 | voucherkind | int |  | 整数 (Integer) |
| 34 | totaldebit | 借方合计 | totaldebit | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 35 | totalcredit | 贷方合计 | totalcredit | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 36 | explanation | 摘要 | explanation | varchar(400) |  | 字符串 (String) |
| 37 | totaldebitgroup | 集团借方合计 | totaldebitgroup | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 38 | totalcreditgroup | 集团贷方合计 | totalcreditgroup | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 39 | totaldebitglobal | 全局借方合计 | totaldebitglobal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 40 | totalcreditglobal | 全局贷方合计 | totalcreditglobal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 41 | modifyflag | 修改标志 | modifyflag | char(20) |  | 字符串 (String) |
| 42 | detailmodflag | 分录增删标志 | detailmodflag | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | contrastflag | 对账标志 | contrastflag | int |  | 整数 (Integer) |
| 44 | prepareddate | 制单日期 | prepareddate | char(19) |  | 日期 (UFDate) |
| 45 | postdate | 过账日期 | postdate | char(19) |  | 日期 (UFDate) |
| 46 | srcbillid | 来源单据主键 | srcbillid | varchar(50) |  | 字符串 (String) |
| 47 | pk_templateid | 转换模板主键 | pk_templateid | char(20) |  | 主键 (UFID) |
| 48 | iseffect | 生效 | iseffect | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | des_billtype | 目标单据类型 | des_billtype | varchar(20) |  | 字符串 (String) |
| 50 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
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
| 70 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 76 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 77 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 78 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 79 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 80 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 81 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 82 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 83 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 84 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 85 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 86 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 87 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 88 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 89 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 90 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 91 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 92 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 93 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 94 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 95 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 96 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 97 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 98 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 99 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |
| 100 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 101 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 102 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 103 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
# |<<

**实时凭证主体 (gl_rtvoucher / nc.vo.gl.aggvoucher.MDVoucher)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2473.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | 凭证主键 | pk_voucher | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(4) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 6 | year | 会计年度 | year | char(4) |  | 主键 (UFID) |
| 7 | period | 会计期间 | period | char(2) |  | 主键 (UFID) |
| 8 | num | 凭证编码 | num | int |  | 整数 (Integer) |
| 9 | prepareddate | 制单日期 | prepareddate | char(19) |  | 日期 (UFDate) |
| 10 | signdate | 签字日期 | signdate | char(19) |  | 日期 (UFDate) |
| 11 | checkeddate | 审核日期 | checkeddate | char(19) |  | 日期 (UFDate) |
| 12 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 13 | attachment | 附单据数 | attachment | int |  | 整数 (Integer) |
| 14 | pk_prepared | 制单人 | pk_prepared | varchar(20) |  | 用户 (user) |
| 15 | pk_checked | 审核人 | pk_checked | varchar(20) |  | 用户 (user) |
| 16 | pk_casher | 出纳 | pk_casher | varchar(20) |  | 字符串 (String) |
| 17 | pk_manager | 记账人 | pk_manager | varchar(20) |  | 字符串 (String) |
| 18 | signflag | 签字标志 | signflag | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | modifyflag | 修改标志 | modifyflag | char(20) |  | 主键 (UFID) |
| 20 | detailmodflag | 分录增删标志 | detailmodflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | discardflag | 作废标志 | discardflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | pk_system | 制单系统 | pk_system | char(20) |  | 主键 (UFID) |
| 23 | addclass | 增加接口类 | addclass | varchar(60) |  | 字符串 (String) |
| 24 | modifyclass | 修改接口类 | modifyclass | varchar(60) |  | 字符串 (String) |
| 25 | deleteclass | 删除接口类 | deleteclass | varchar(60) |  | 字符串 (String) |
| 26 | voucherkind | 凭证类型 | voucherkind | int |  | 整数 (Integer) |
| 27 | totaldebit | 账簿本币借方合计 | totaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | totalcredit | 账簿本币贷方合计 | totalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | totaldebitgroup | 集团本币借方合计 | totaldebitgroup | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | totalcreditgroup | 集团本币贷方合计 | totalcreditgroup | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | totaldebitglobal | 全局本币借方合计 | totaldebitglobal | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | totalcreditglobal | 全局本币贷方合计 | totalcreditglobal | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | explanation | 摘要 | explanation | varchar(150) |  | 字符串 (String) |
| 34 | contrastflag | 对账标志 | contrastflag | int |  | 整数 (Integer) |
| 35 | errmessage | 错误信息 | errmessage | varchar(60) |  | 字符串 (String) |
| 36 | adjustperiod | 调整期间 | adjustperiod | varchar(3) |  | 字符串 (String) |
| 37 | pk_sourcepk | 折算来源凭证PK | pk_sourcepk | char(20) |  | 主键 (UFID) |
| 38 | convertflag | 是否折算凭证标志 | convertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | offervoucher | 冲销凭证PK | offervoucher | varchar(20) |  | 字符串 (String) |
| 40 | isdifflag | 是否差异凭证 | isdifflag | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | errmessageh | 错误凭证历史信息 | errmessageh | varchar(90) |  | 字符串 (String) |
| 42 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 43 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 44 | tempsaveflag | 暂存标志 | tempsaveflag | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 46 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 47 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |
| 48 | free4 | 预留字段4 | free4 | varchar(60) |  | 字符串 (String) |
| 49 | free5 | 预留字段5 | free5 | varchar(60) |  | 字符串 (String) |
| 50 | free6 | 预留字段6 | free6 | varchar(60) |  | 字符串 (String) |
| 51 | free7 | 预留字段7 | free7 | varchar(60) |  | 字符串 (String) |
| 52 | free8 | 预留字段8 | free8 | varchar(60) |  | 字符串 (String) |
| 53 | free9 | 预留字段9 | free9 | varchar(60) |  | 字符串 (String) |
| 54 | free10 | 预留字段10 | free10 | varchar(60) |  | 字符串 (String) |
| 55 | freevalue1 | 自定义项1 | freevalue1 | varchar(200) |  | 字符串 (String) |
| 56 | freevalue2 | 自定义项2 | freevalue2 | varchar(200) |  | 字符串 (String) |
| 57 | freevalue3 | 自定义项3 | freevalue3 | varchar(200) |  | 字符串 (String) |
| 58 | freevalue4 | 自定义项4 | freevalue4 | varchar(500) |  | 字符串 (String) |
| 59 | freevalue5 | 自定义项5 | freevalue5 | varchar(500) |  | 字符串 (String) |
| 60 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 61 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 62 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 63 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
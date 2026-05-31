# |<<

**凭证 (gl_voucher / nc.vo.gl.voucher.VoucherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | 凭证主键 | pk_voucher | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) | √ | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_公司 (corp) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) | √ | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 7 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 8 | year | 会计年度 | year | char(4) | √ | 主键 (UFID) |
| 9 | period | 会计期间 | period | char(2) | √ | 主键 (UFID) |
| 10 | num | 凭证编码 | num | int | √ | 整数 (Integer) |
| 11 | prepareddate | 制单日期 | prepareddate | char(19) | √ | 日期 (UFDate) |
| 12 | pk_prepared | 制单人 | pk_prepared | varchar(20) | √ | 用户 (user) |
| 13 | signdate | 签字日期 | signdate | char(19) |  | 日期 (UFDate) |
| 14 | signflag | 签字标志 | signflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | checkeddate | 审核日期 | checkeddate | char(19) |  | 日期 (UFDate) |
| 16 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 17 | attachment | 附单据数 | attachment | int |  | 整数 (Integer) |
| 18 | pk_checked | 审核人 | pk_checked | varchar(20) |  | 用户 (user) |
| 19 | pk_casher | 出纳 | pk_casher | varchar(20) |  | 用户 (user) |
| 20 | pk_manager | 记账人 | pk_manager | varchar(20) |  | 用户 (user) |
| 21 | modifyflag | 修改标志 | modifyflag | char(20) |  | 主键 (UFID) |
| 22 | detailmodflag | 分录增删标志 | detailmodflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | discardflag | 作废标志 | discardflag | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | pk_system | 制单系统 | pk_system | char(20) |  | 主键 (UFID) |
| 25 | addclass | 增加接口类 | addclass | varchar(60) |  | 字符串 (String) |
| 26 | modifyclass | 修改接口类 | modifyclass | varchar(60) |  | 字符串 (String) |
| 27 | deleteclass | 删除接口类 | deleteclass | varchar(60) |  | 字符串 (String) |
| 28 | voucherkind | 凭证类型 | voucherkind | int |  | 整数 (Integer) |
| 29 | totaldebit | 借方合计 | totaldebit | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 30 | totalcredit | 贷方合计 | totalcredit | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 31 | explanation | 摘要 | explanation | varchar(400) |  | 字符串 (String) |
| 32 | errmessage | 错误信息 | errmessage | varchar(90) |  | 字符串 (String) |
| 33 | errmessageh | 历史错误信息 | errmessageh | varchar(90) |  | 字符串 (String) |
| 34 | adjustperiod | 调整期间 | adjustperiod | varchar(3) |  | 字符串 (String) |
| 35 | pk_sourcepk | 折算来源凭证 | pk_sourcepk | char(20) |  | 主键 (UFID) |
| 36 | convertflag | 折算凭证 | convertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | offervoucher | 冲销凭证 | offervoucher | varchar(20) |  | 字符串 (String) |
| 38 | isdifflag | 差异凭证 | isdifflag | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | totaldebitgroup | 集团借方合计 | totaldebitgroup | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 40 | totalcreditgroup | 集团贷方合计 | totalcreditgroup | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 41 | totaldebitglobal | 全局借方合计 | totaldebitglobal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 42 | totalcreditglobal | 全局贷方合计 | totalcreditglobal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 43 | tempsaveflag | 暂存标志 | tempsaveflag | char(1) |  | 布尔类型 (UFBoolean) |
| 44 | preaccountflag | 提前关账科目 | preaccountflag | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | saga_gtxid | 全局事务 | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 46 | saga_btxid | 子事务 | saga_btxid | varchar(64) |  | 字符串 (String) |
| 47 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 48 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) | 0 |
| 49 | cw_totaldebit | 财务借方合计 | cw_totaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | bug_totaldebit | 预算借方合计 | bug_totaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | cw_totalcredit | 财务贷方合计 | cw_totalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | bug_totalcredit | 预算贷方合计 | bug_totalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | acctype | 平行记账标识 | acctype | int |  | 凭证平行记账标识 (VoucherAccTypeEnum) |  | 1=全部凭证; |
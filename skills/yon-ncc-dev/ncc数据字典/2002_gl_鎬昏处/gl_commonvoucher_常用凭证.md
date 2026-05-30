# |<<

**常用凭证 (gl_commonvoucher / nc.vo.gl.commonvoucher.commonvoucher)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2369.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commonvoucher | 常用凭证标识 | pk_commonvoucher | char(20) | √ | 主键 (UFID) |
| 2 | pk_vouchertype | 凭证类别标识 | pk_vouchertype | varchar(20) |  | 常用类 (commnvclass) |
| 3 | year | 年 | year | char(4) |  | 主键 (UFID) |
| 4 | period | 期间 | period | char(2) |  | 主键 (UFID) |
| 5 | num | 凭证号 | num | int |  | 整数 (Integer) |
| 6 | prepareddate | 制单日期 | prepareddate | char(19) |  | 日期时间 (UFDateTime) |
| 7 | tallydate | 记帐日期 | tallydate | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_user | 用户标识 | pk_user | char(20) |  | 主键 (UFID) |
| 9 | ispublic | 是否公用 | ispublic | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | attachment | 附单据数 | attachment | int |  | 整数 (Integer) |
| 11 | commonsummary | 常用凭证描述 | commonsummary | char(200) |  | 主键 (UFID) |
| 12 | commoncode | 常用凭证编码 | commoncode | varchar(20) |  | 字符串 (String) |
| 13 | pk_prepared | 制单人 | pk_prepared | char(20) |  | 主键 (UFID) |
| 14 | pk_checked | 审核人 | pk_checked | char(20) |  | 主键 (UFID) |
| 15 | pk_casher | 签字人 | pk_casher | char(20) |  | 主键 (UFID) |
| 16 | pk_manager | 记账人 | pk_manager | char(20) |  | 主键 (UFID) |
| 17 | signflag | 签字标志 | signflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | modifyflag | 修改标志 | modifyflag | char(20) |  | 主键 (UFID) |
| 19 | detailmodflag | 分录修改标志 | detailmodflag | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | discardflag | 作废标志 | discardflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | pk_system | 制单系统 | pk_system | char(20) |  | 主键 (UFID) |
| 22 | addclass | 增加接口类 | addclass | varchar(60) |  | 字符串 (String) |
| 23 | modifyclass | 修改接口类 | modifyclass | varchar(60) |  | 字符串 (String) |
| 24 | deleteclass | 删除接口类 | deleteclass | varchar(60) |  | 字符串 (String) |
| 25 | voucherkind | 凭证类型 | voucherkind | int |  | 整数 (Integer) |
| 26 | totaldebit | 账簿本币借方合计 | totaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | totalcredit | 账簿本币贷方合计 | totalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | totaldebitgroup | 集团本币借方合计 | totaldebitgroup | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | totalcreditgroup | 集团本币贷方合计 | totalcreditgroup | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | totaldebitglobal | 全局本币借方合计 | totaldebitglobal | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | totalcreditglobal | 全局本币贷方合计 | totalcreditglobal | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | explanation | 摘要 | explanation | varchar(300) |  | 字符串 (String) |
| 33 | errmessage | 错误信息 | errmessage | varchar(90) |  | 字符串 (String) |
| 34 | pk_setofbook | 账簿类型 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 35 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 36 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 37 | isdifflag | 差异凭证标志 | isdifflag | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | pk_commnvclass | 常用凭证分类 | pk_commnvclass | char(20) |  | 主键 (UFID) |
| 39 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
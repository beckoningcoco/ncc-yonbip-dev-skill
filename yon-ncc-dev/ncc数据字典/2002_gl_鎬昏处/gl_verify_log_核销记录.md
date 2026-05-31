# |<<

**核销记录 (gl_verify_log / nc.vo.gl.verifylog.verifylog)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_log | 核销处理记录标识 | pk_verify_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) | √ | 字符串 (String) |
| 3 | pk_voucher | 会计凭证 | pk_voucher | char(20) |  | 主键 (UFID) |
| 4 | pk_detail | 凭证分录 | pk_detail | char(20) |  | 主键 (UFID) |
| 5 | pk_verifydetail | 核销凭证分录信息 | pk_verifydetail | char(20) |  | 主键 (UFID) |
| 6 | pk_verifyobj | 核销对象 | pk_verifyobj | varchar(20) |  | 核销对象 (verifyobj) |
| 7 | pk_verifyobj1 | 对应查询对象主键 | pk_verifyobj1 | varchar(50) |  | 字符串 (String) |
| 8 | pk_voucher1 | 对应凭证 | pk_voucher1 | char(20) |  | 主键 (UFID) |
| 9 | pk_detail1 | 对应凭证分录 | pk_detail1 | char(20) |  | 主键 (UFID) |
| 10 | pk_verifydetail1 | 对应核销凭证分录 | pk_verifydetail1 | char(20) |  | 主键 (UFID) |
| 11 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 12 | itype | 处理类型 | itype | int |  | 整数 (Integer) |
| 13 | batchno | 核销批次号 | batchno | char(20) |  | 主键 (UFID) |
| 14 | opdate | 处理日期 | opdate | char(19) |  | 日期时间 (UFDateTime) |
| 15 | operator | 处理人 | operator | char(20) |  | 主键 (UFID) |
| 16 | verifydebitamount | 借方原币处理金额 | verifydebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | verifyfracdebitamount | 借方辅币处理金额 | verifyfracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | verifylocaldebitamount | 借方本币处理金额 | verifylocaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | verifydebitquantity | 借方数量处理金额 | verifydebitquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 20 | verifycreditamount | 贷方原币处理金额 | verifycreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | verifyfraccreditamount | 贷方辅币处理金额 | verifyfraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | verifylocalcreditamount | 贷方本币处理金额 | verifylocalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | verifycreditquantity | 贷方数量处理金额 | verifycreditquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 24 | voucherdate | 凭证日期 | voucherdate | char(19) |  | 日期时间 (UFDateTime) |
| 25 | businessdate | 业务日期 | businessdate | char(19) |  | 日期时间 (UFDateTime) |
| 26 | byvoucherdate | 对应凭证日期 | byvoucherdate | char(19) |  | 日期时间 (UFDateTime) |
| 27 | bybusinessdate | 对应业务日期 | bybusinessdate | char(19) |  | 日期时间 (UFDateTime) |
| 28 | pk_org | 组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 29 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 30 | pk_accountingbook | 主体账簿 | pk_accountingbook | varchar(50) |  | 字符串 (String) |
| 31 | verifygroupdebitamount | 借方集团本币处理金额 | verifygroupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | verifyglobaldebitamount | 借方全局本币处理金额 | verifyglobaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | verifygroupcreditamount | 贷方集团本币处理金额 | verifygroupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | verifyglobalcreditamount | 贷方全局本币处理金额 | verifyglobalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | clid | 处理id | clid | int |  | 整数 (Integer) |
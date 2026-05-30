# |<<

**住院预交金线上支付发票打印记录 (uh_bl_payprtrec / nc.vo.nhbl.blpayprtrec.payprtrecVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_blpay_prtrec | 主键 | pk_blpay_prtrec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | count | 打印次数 | count | int |  | 整数 (Integer) |
| 6 | sernum | 票据编号 | sernum | varchar(50) |  | 字符串 (String) |
| 7 | amuont | 金额 | amuont | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | date_print | 打印时间 | date_print | char(19) |  | 日期 (UFDate) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
# |<<

**票据动作 (fbm_action / nc.vo.fbm.pub.action.ActionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2110.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_action | 主键 | pk_action | char(20) | √ | 主键 (UFID) |
| 2 | serialnum | 序列号 | serialnum | int |  | 整数 (Integer) |
| 3 | actioncode | 动作编码 | actioncode | varchar(30) |  | 字符串 (String) |
| 4 | billtype | 单据类型 | billtype | varchar(20) |  | 字符串 (String) |
| 5 | pk_bill | 动作单据主键 | pk_bill | char(20) |  | 主键 (UFID) |
| 6 | actionperson | 操作人 | actionperson | varchar(20) |  | 用户 (user) |
| 7 | actiondate | 操作日期 | actiondate | char(19) |  | 日期 (UFDate) |
| 8 | beginstatus | 开始状态 | beginstatus | varchar(30) |  | 字符串 (String) |
| 9 | endstatus | 结束状态 | endstatus | varchar(30) |  | 字符串 (String) |
| 10 | pk_register | 收票主键 | pk_register | char(20) |  | 主键 (UFID) |
| 11 | isnew | 是否最新动作 | isnew | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | money | 业务发生金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 14 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 15 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | keepunitname | 存放地点 | keepunitname | varchar(300) |  | 字符串 (String) |
| 18 | servertime | 操作时间 | servertime | char(19) |  | 日期 (UFDate) |
| 19 | olcmoney | 组织本币金额 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | glcmoney | 集团本币金额 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | gllcmoney | 全局本币金额 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 26 | note | 备注 | note | varchar(200) |  | 字符串 (String) |
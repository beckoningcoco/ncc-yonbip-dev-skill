# |<<

**基金实缴 (ipmfund_fundpaid / nc.vo.ipmfund.fundpaid.FundpaidVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3311.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundpaid | 基金实缴主键 | pk_fundpaid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 记录部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 记录部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 记录人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | nallpaidrate | 累计实缴比例（%） | nallpaidrate | decimal(28, 2) |  | 数值 (UFDouble) |
| 9 | nallallpaidmny | 累计实缴金额(全局本币) | nallallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ngpallpaidmny | 累计实缴金额(集团本币) | ngpallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nbaseallpaidmny | 累计实缴金额(组织本币) | nbaseallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | norigallpaidmny | 累计实缴金额(组织原币) | norigallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nallreturnedmny | 过往已退还本金(全局本币) | nallreturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ngpreturnedmny | 过往已退还本金(集团本币) | ngpreturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nbasereturnedmny | 过往已退还本金(组织本币) | nbasereturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | norigreturnedmny | 过往已退还本金(组织原币) | norigreturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nallpaidmny | 过往已实缴金额(全局本币) | nallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ngppaidmny | 过往已实缴金额(集团本币) | ngppaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nbasepaidmny | 过往已实缴金额(组织本币) | nbasepaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | norigpaidmny | 过往已实缴金额(组织原币) | norigpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nallcurrmny | 本次实缴金额(全局本币) | nallcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ngpcurrmny | 本次实缴金额(集团本币) | ngpcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nbasecurrmny | 本次实缴金额(组织本币) | nbasecurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | norigcurrmny | 本次实缴金额(组织原币) | norigcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | vpaidperiod | 实缴期次 | vpaidperiod | varchar(200) |  | 多语文本 (MultiLangText) |
| 26 | nalltargetpaymny | 基金规模(全局本币) | nalltargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ngptargetpaymny | 基金规模(集团本币) | ngptargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nbasetargetpaymny | 基金规模(组织本币) | nbasetargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | norigtargetpaymny | 基金规模(组织原币) | norigtargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 31 | dfounddate | 成立时间 | dfounddate | char(19) |  | 日期 (UFDate) |
| 32 | pk_fundlib | 基金名称 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 33 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 34 | vbillname | 单据名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 35 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 36 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |
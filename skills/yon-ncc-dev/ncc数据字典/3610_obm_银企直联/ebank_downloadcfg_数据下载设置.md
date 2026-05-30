# |<<

**数据下载设置 (ebank_downloadcfg / nc.vo.obm.ebankdownloadcfg.EbankDownloadcfgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1765.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 主键 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | useid | 用户id | useid | varchar(20) |  | 用户 (user) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 6 | bankacc | 银行账号 | bankacc | varchar(50) |  | 字符串 (String) |
| 7 | firstday | 第一次下载日期 | firstday | char(19) |  | 日期 (UFDate) |
| 8 | isdetaildownload | 是否下载交易明细 | isdetaildownload | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isbanlancedownload | 是否下载余额 | isbanlancedownload | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | ispaystatedownload | 是否下载支付状态 | ispaystatedownload | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | banktypecode | 银行类别编码 | banktypecode | varchar(40) |  | 字符串 (String) |
| 12 | detaildownloaddate | 对账单最后下载日期 | detaildownloaddate | char(19) |  | 日期时间 (UFDateTime) |
| 13 | obmdef1 | 自定义项1 | obmdef1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | obmdef2 | 自定义项2 | obmdef2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | obmdef3 | 自定义项3 | obmdef3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | obmdef4 | 自定义项4 | obmdef4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | obmdef5 | 自定义项5 | obmdef5 | varchar(101) |  | 自定义项 (Custom) |
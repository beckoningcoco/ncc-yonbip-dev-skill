# |<<

**自动下载设置子表 (ebank_download / nc.vo.obm.ebankdownload.EbankDownLoadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1763.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_download | 主键 | pk_ebank_download | char(20) | √ | 主键 (UFID) |
| 2 | billmaker | 用户id | billmaker | varchar(20) |  | 用户 (user) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本号 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | banktype | 银行类别PK | banktype | varchar(20) |  | 银行类别 (banktype) |
| 7 | pk_bankaccbas | 银行账户主户PK | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 8 | netbankkinftp | 网银适配器代码 | netbankkinftp | varchar(30) |  | 字符串 (String) |
| 9 | bankacc | 银行账户子户 | bankacc | varchar(50) |  | 字符串 (String) |
| 10 | isdetaildownload | 是否下载交易明细 | isdetaildownload | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isbanlancedownload | 是否下载余额 | isbanlancedownload | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | ispaystatedownload | 是否下载支付状态 | ispaystatedownload | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | ishuidandownload | 是否下载回单 | ishuidandownload | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | firstday | 第一次下载时间 | firstday | char(19) |  | 日期 (UFDate) |
| 15 | detaildownloaddate | 对账单最后下载日期 | detaildownloaddate | char(19) |  | 日期 (UFDate) |
| 16 | isuse | 启用状态 | isuse | varchar(1) |  | 字符串 (String) |
| 17 | banktypecode | 主办银行 | banktypecode | varchar(50) |  | 字符串 (String) |
| 18 | bankaccbas | 银行账户 | bankaccbas | varchar(50) |  | 字符串 (String) |
| 19 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 20 | obmdef1 | 自定义1 | obmdef1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | obmdef2 | 自定义2 | obmdef2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | obmdef3 | 自定义3 | obmdef3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | obmdef4 | 自定义4 | obmdef4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | obmdef5 | 自定义5 | obmdef5 | varchar(101) |  | 自定义项 (Custom) |
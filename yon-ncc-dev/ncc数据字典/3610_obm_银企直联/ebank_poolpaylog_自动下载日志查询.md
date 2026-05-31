# |<<

**自动下载日志查询 (ebank_poolpaylog / nc.vo.obm.ebankpoolautodownlogqry.EbankPoolAutoDownLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1780.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_poolpaylog | 主键 | pk_poolpaylog | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | billnum | 票据编号 | billnum | varchar(50) |  | 字符串 (String) |
| 6 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 7 | padate | 交易日期 | padate | char(19) |  | 日期 (UFDate) |
| 8 | down_date | 下载日期 | down_date | char(19) |  | 日期 (UFDate) |
| 9 | down_time | 下载时间 | down_time | char(8) |  | 时间 (UFTime) |
| 10 | downstate | 下载状态 | downstate | varchar(50) |  | 下载状态 (pooldownstate) |  | 1=交易成功; |
# |<<

**自动下载日志查询 (ebank_palog / nc.vo.obm.ebankautodownlog.EbankAutoDownLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1772.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 主键 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | pk_bankaccbas | 账户主键 | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 3 | unitname | 单位名称 | unitname | varchar(300) |  | 字符串 (String) |
| 4 | curacc | 当前账号 | curacc | varchar(50) |  | 字符串 (String) |
| 5 | bankname | 银行名称 | bankname | varchar(100) |  | 字符串 (String) |
| 6 | down_date | 下载日期 | down_date | char(19) |  | 日期 (UFDate) |
| 7 | down_time | 下载时间 | down_time | char(8) |  | 时间 (UFTime) |
| 8 | msg | 消息 | msg | varchar(300) |  | 字符串 (String) |
| 9 | patype | 交易类型 | patype | char(50) |  | 交易类型 (PaTypeEnum) |  | 0=对账单; |
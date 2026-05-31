# |<<

**影像任务信息 (imag_task / nc.vo.imag.imagtask.ImagTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_imagtask | 主键 | pk_imagtask | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 5 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 6 | billid | 单据pk | billid | varchar(20) |  | 字符串 (String) |
| 7 | scanner | 扫描人 | scanner | varchar(20) |  | 用户 (user) |
| 8 | begintime | 开始时间 | begintime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | endtime | 结束时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 11 | packingtime | 打包时间 | packingtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | posttime | 邮寄时间 | posttime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | signtime | 纸质票据签收时间 | signtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | unpackingtime | 拆包时间 | unpackingtime | char(19) |  | 日期时间 (UFDateTime) |
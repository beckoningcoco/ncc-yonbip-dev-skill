# |<<

**分布系统目录 (adp_syscatalog / nc.vo.uap.distribution.syscatalog.SysCatalogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/27.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_syscatalog | 主键 | pk_syscatalog | char(20) | √ | 主键 (UFID) |
| 2 | code | 系统编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 系统名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | parentid | 上级系统 | parentid | varchar(20) |  | 分布系统目录 (syscatalog) |
| 5 | sysadmin | 分布系统管理员 | sysadmin | varchar(50) |  | 字符串 (String) |
| 6 | sendncmessage | 发送消息中心 | sendncmessage | char(1) |  | 布尔类型 (UFBoolean) | N |
| 7 | sendmail | 邮件通知 | sendmail | char(1) |  | 布尔类型 (UFBoolean) | N |
| 8 | sendsms | 短信通知 | sendsms | char(1) |  | 布尔类型 (UFBoolean) | N |
| 9 | se_sendfailpkgfreq | 失败包重发频率(分钟) | se_sendfailpkgfreq | int |  | 整数 (Integer) |
| 10 | se_maxtrytimes | 最大重试次数 | se_maxtrytimes | int |  | 整数 (Integer) |
| 11 | allowpartlysuccess | 多传输包是否允许部分成功 | allowpartlysuccess | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | packstoreroot | 传输包存储根目录 | packstoreroot | varchar(500) |  | 字符串 (String) |
| 13 | deletedonsuccess | 处理成功后删除 | deletedonsuccess | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 14 | enablestate | 启用状态 | enablestate | int |  | 系统启用状态 (SystemEnableState) |  | 0=未启用; |